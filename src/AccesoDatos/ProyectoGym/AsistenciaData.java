/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Asistencia;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class AsistenciaData {
      private Connection conexion = null;
      private MembresiaData mb = new MembresiaData();
      private ClaseData cd = new ClaseData();
      private EntrenadorData ed = new EntrenadorData();
      
     
    public AsistenciaData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarAsistencia(Asistencia asistencia){ 
        //Falta verificar la membresia del Socio y en el caso que exista se procede a guardar la asistencia y actualizar la membresia restando la cantidad de pases.
        //Paso a seguir: 
        //Instanciar una MembresiaData
        //Usar el metodo de buscarMembresiaPorSocio.
        //Verificar a traves del metodo membresia.getCantidad_pases que la cantidad de pases sea mayor que 1.
        //Si se cumple lo anterior, se procede a guardar la asistencia, caso contrario mostrar un mensaje diciendo "No quedan pase".
        
        String sql = "INSERT INTO asistencia (id_socio, id_clase , fecha_asistencia, hora_asistencia,estado) VALUES (?,?,?,?,?) ";
       
             try{
                    java.sql.PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    
                    ps.setInt(1, asistencia.getId_socio().getId_socio());
                    ps.setInt(2, asistencia.getId_clase().getId_clase());                 
                    ps.setDate(3, asistencia.getFecha_asistencia());
                    ps.setTime(4, asistencia.getHora_asistencia());                              
                    ps.setBoolean(5, asistencia.isEstado());
                    ps.executeUpdate();
                    ResultSet rs = ps.getGeneratedKeys();
                
                    if(rs.next()){
                        asistencia.setId_asistencia(rs.getInt(1));
                        System.out.println("La asistencia de: " + asistencia.getId_socio().getNombre()+ " a " + asistencia.getId_clase().getNombre() + " fue añadida con exito");
                        JOptionPane.showMessageDialog(null,"La asistencia de: " + asistencia.getId_socio().getNombre()+ " a " + asistencia.getId_clase().getNombre() + " fue añadida con exito");
                    }
                    ps.close();
            }   catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al acceder a la columna asistencia" + ex.getMessage());

            }

    }
        //Listamos las asistencias activas
    public List<Asistencia> listarAsistencia(){
                List<Asistencia> asistencias;
                String sql = "SELECT * FROM asistencia WHERE estado = ?";
                String campo = "1";
                asistencias = busquedasDeAsistencias(sql, campo);
        return asistencias;    
    }
        
    
    public List<Asistencia>busquedasDeAsistencias(String sql, String campo){ 
                PreparedStatement ps;
                ResultSet rs;
                List<Asistencia> asist = new ArrayList<>();
            try {
                ps = conexion.prepareStatement(sql);
                ps.setString(1, campo);
                rs = ps.executeQuery();
            
            while(rs.next()){
                Asistencia asistencia = new Asistencia();
                SocioData socioData = new SocioData();
                ClaseData claseData = new ClaseData();
                asistencia.setId_asistencia(rs.getInt(1));
                asistencia.setId_socio(socioData.buscarSocioPorId(rs.getInt("id_socio")));
                asistencia.setId_clase(claseData.buscarClasePorId(rs.getInt("id_clase")));
                asistencia.setFecha_asistencia(rs.getDate("fecha_asistencia"));
                asistencia.setHora_asistencia(rs.getTime("hora_asistencia"));
                asistencia.setEstado(rs.getBoolean("estado"));
                asist.add(asistencia);
            }
                ps.close();
            
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla: "+ex.getMessage()); 
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Error  "+e.getMessage()); 
        }
            return asist;
    }
    
    public void buscarAsistenciaPorSocio(){
        
    }
   
    public void eliminarAsistencia(int id){
        String sql = "UPDATE asistencia SET estado = 0 WHERE id_asistencia = ?";
         
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "La clase se elimino con exito");
            }
            
            }catch (SQLException ex) {
            
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase");
           
        }
              
    }
    //Metodo para obtener la capacidad de una clase por medio de su ID
    public boolean CapacidadClase(int claseID) {
        String sql = "SELECT COUNT(*) Asistencia AS asistencia, capacidad FROM asistencia JOIN Clase ON Asistencia.ID_Clase = Clase.ID_Clase WHERE Asistencia.ID_Clase = ?";
        boolean capacidadDisponible = false;
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                ps.setInt(1, claseID);
        try (   ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int insc = rs.getInt("Inscritos");
                int cap = rs.getInt("Capacidad");
                capacidadDisponible = insc < cap;
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia");
    }
    return capacidadDisponible;
}
    
    
}

