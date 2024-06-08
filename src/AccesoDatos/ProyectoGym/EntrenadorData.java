/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Entrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class EntrenadorData {
     
     private Connection connection = null;
    
    public EntrenadorData(){
        connection = Conexion.getConexion();
    }
    
       public boolean guardarEntrenador (Entrenador entrenador){
        boolean flag=false;
        
        String sql = "INSERT INTO entrenador (dni,nombre, apellido, especialidad, disponibilidad, estado) VALUES (?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setString(5, entrenador.getDisponibilidad());
            ps.setBoolean(6, entrenador.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {

                entrenador.setId_entrenador((rs.getInt(1)));
                System.out.println("Entrenador id "+ entrenador.getId_entrenador());
                JOptionPane.showMessageDialog(null, "Entrenador añadido con exito."); 
                flag=true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador"+ex.getMessage()); 
        }
        return flag;
    }
       
        public void eliminarEntrenador(int id){
         
         String sql = "UPDATE entrenador SET estado = 0 WHERE 	id_entrenador = ?";
         
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Entrenador removido de la BD con exito");
            }
            
        } catch (SQLException ex) {
            
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador");
           
        }
        
        }
        public List<Entrenador>listarEntrenadores(){  

          ArrayList<Entrenador>entrenadores = new ArrayList<>();
          String sql = "SELECT  id_entrenador, dni, nombre, apellido, especialidad, disponibilidad FROM entrenador WHERE estado = 1";       
           try {

               PreparedStatement ps = connection.prepareStatement(sql);


               ResultSet rs = ps.executeQuery();


               while(rs.next())
                       {
                         Entrenador entrenador = new Entrenador(); 
                          entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                          entrenador.setDni(rs.getString("dni"));
                          entrenador.setNombre(rs.getString("nombre"));
                          entrenador.setApellido(rs.getString("apellido"));
                          entrenador.setEspecialidad(rs.getString("especialidad"));
                          entrenador.setDisponibilidad(rs.getString("disponibilidad"));
                          
                          
                          entrenador.setEstado(true); 

                          entrenadores.add(entrenador);
                       }
                           ps.close();
               }  catch (SQLException ex)  
                       {
                        JOptionPane.showMessageDialog(null,"error al acceder a la tabla Entrenador" + ex.getMessage());

                       }

           return entrenadores
                   
                   
                   
                   
                   ;

       }
        
         public void modificarEntrenador (Entrenador entrenador){
        String sql = "UPDATE entrenador SET dni = ?, nombre = ?, apellido = ?, especialidad = ?,  disponibilidad = ? WHERE id_entrenador = ?";
        PreparedStatement ps = null;
        try{           
            ps = connection.prepareStatement(sql);
            ps.setString(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setString(5, entrenador.getDisponibilidad());
            ps.setInt(5, entrenador.getId_entrenador());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El Entrenador no existe");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de entrenador"+ ex.getMessage());
        }
    }
      
          public Entrenador buscarEntrenador(String especialidad){
        Entrenador entre= null;
       String sql = "SELECT id_entrenador, dni, nombre, apellido, especialidad, disponibilidad FROM entrenador WHERE especialidad = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, especialidad);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                    {
                        Entrenador entrenador = new Entrenador(); 
                          entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                          entrenador.setDni(rs.getString("dni"));
                          entrenador.setNombre(rs.getString("nombre"));
                          entrenador.setApellido(rs.getString("apellido"));
                          entrenador.setEspecialidad(rs.getString("especialidad"));
                          entrenador.setDisponibilidad(rs.getString("disponibilidad"));
                          
                          
                          entrenador.setEstado(true);
                    
                    }
            else{
                JOptionPane.showMessageDialog(null, "entrenador inexistente");
                ps.close();
            }
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla entrenador" + ex.getMessage());
                    
                    }
        
            
                    return entre;
                    
             }
         
          public Entrenador buscarEntrenadorxID(int id){
        Entrenador entrenador = null;
       String sql = "SELECT *  FROM entrenador WHERE id_entrenador = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                    {
                       entrenador = new Entrenador(); 
                       entrenador.setId_entrenador(id);
                       entrenador.setDni(rs.getString("dni"));
                       entrenador.setApellido(rs.getString("apellido"));
                       entrenador.setNombre(rs.getString("nombre"));
                       entrenador.setEspecialidad(rs.getString("especialidad"));
                       entrenador.setDisponibilidad(rs.getString("disponibilidad"));
              
                       entrenador.setEstado(true); 
                    
                    }
            else{
                JOptionPane.showMessageDialog(null, "Alumno inexistente");
                ps.close();
            }
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla Alumno" + ex.getMessage());
                    
                    }
        
            
                    return entrenador;
                    
             }
     
       
}
