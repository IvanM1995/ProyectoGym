/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Clase;
import Entidades.ProyectoGym.Entrenador;
import Entidades.ProyectoGym.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class ClaseData {
     private Connection con = null;
    private SocioData sd = new SocioData();
    private EntrenadorData ed = new EntrenadorData();
  
    
    public ClaseData(){
        con = Conexion.getConexion();
    }
    
    public void guardarClase(Clase clase){
        
        String sql = "INSERT INTO clase (nombre,id_entrenador,horario,capacidad,estado) VALUE(?,?,?,?,?)";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        System.out.println(clase.getNombre());
         ps.setString(1, clase.getNombre());
        ps.setInt(2, clase.getId_entrenador().getId_entrenador());
       
        LocalTime horario = clase.getHorario();
        if(horario!=null){
           ps.setTime(3, Time.valueOf(horario));
        }else{
            ps.setNull(3, java.sql.Types.TIME);
        }
        ps.setInt(4, clase.getCapacidad());
        ps.setBoolean(5, clase.isEstado());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            clase.setId_clase(rs.getInt(1));
            System.out.println("La clase :" + clase.getNombre()+"fue añadida con exito");
            JOptionPane.showMessageDialog(null,"Clase ID : " + clase.getId_clase());
        }
        ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la columna clase" + ex.getMessage());
            
        }
      }
    
    public List<Clase>listarClasesPorNombre( String nombre){
        ArrayList<Clase> nombreClases = new ArrayList<>();
        String sql = "SELECT * FROM clase WHERE nombre LIKE ? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
           ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
                Clase clase = new Clase();
               clase.setId_clase(rs.getInt("id_clase"));
               clase.setNombre(rs.getString("nombre"));
               clase.setId_entrenador(ed.buscarEntrenadorxID(rs.getInt("id_entrenador")));
               clase.setHorario(rs.getTime("horario").toLocalTime());
               clase.setCapacidad(rs.getInt("capacidad"));
               clase.setEstado(true);
               
               nombreClases.add(clase);
           }
           }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null,"Error al acceder a la tabla  " + ex.getMessage());
                   }
            return nombreClases ;
    }
    
    
    public List<Clase>listarClases(){
        ArrayList<Clase>clases = new ArrayList<>();
        String sql = "SELECT * FROM clase WHERE estado = 1";
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        
           
           
           while(rs.next()){
                Entrenador ent = new Entrenador();
                Clase clase = new Clase();
               clase.setId_clase(rs.getInt("id_clase"));
               clase.setNombre(rs.getString("nombre"));
               clase.setId_entrenador(ed.buscarEntrenadorxID(rs.getInt("id_entrenador")));
               clase.setHorario(rs.getTime("horario").toLocalTime());
               clase.setCapacidad(rs.getInt("capacidad"));
               clase.setEstado(true);
               
               clases.add(clase);
           }

    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al acceder a la taba clase");
    
    }
    return clases;
    
  }
 
    
    public void eliminarClase(int id){
        String sql = "UPDATE clase SET estado = 0 WHERE id_clase = ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "La clase se elimino con exito");
            }
            
        } catch (SQLException ex) {
            
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase");
           
        }
              
     }
    
    public void inscribirSocioAunaClase(Socio insc , Clase cls){
       
        
        String sql = "INSERT INTO clase (id_socio,id_clase) VALUES (?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
     
            
              
           //socn.setId_socio(rs.getInt("id_socio"));
           
           ps.setInt(1,insc.getId_socio());
            ps.setInt(2,cls.getId_clase());

           int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Socio añadido con exito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla clase");
        }
    }
    
     
    public Clase buscarClasePorId(int id){
        Clase claseEncontrada = new Clase();
        String sql = "SELECT * FROM clase WHERE id_clase LIKE ? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
           ResultSet rs = ps.executeQuery();
            
           if(rs.next()){
                
               claseEncontrada.setId_clase(rs.getInt("id_clase"));
               claseEncontrada.setNombre(rs.getString("nombre"));
               claseEncontrada.setId_entrenador(ed.buscarEntrenadorxID(rs.getInt("id_entrenador")));
               claseEncontrada.setHorario(rs.getTime("horario").toLocalTime());
               claseEncontrada.setCapacidad(rs.getInt("capacidad"));
               claseEncontrada.setEstado(true);
               
              
           }
           }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null,"Error al acceder a la tabla  " + ex.getMessage());
                   }
            return claseEncontrada ;
    }
    
}
