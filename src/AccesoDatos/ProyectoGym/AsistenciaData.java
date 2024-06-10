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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class AsistenciaData {
      private Connection conexion = null;
      
     
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
       
                    LocalTime hora_asistencia = asistencia.getHora_asistencia();
                    ps.setDate(3, asistencia.getFecha_asistencia());
                     
                    
                    
                    if(hora_asistencia!=null){
                        ps.setTime(4, Time.valueOf( hora_asistencia));
                    }else{
                        ps.setNull(4, java.sql.Types.TIME);        
                    }
                               
                    ps.setBoolean(5, asistencia.isEstado());
                    ps.executeUpdate();
                    ResultSet rs = ps.getGeneratedKeys();
                
                    if(rs.next()){
                        asistencia.setId_asistencia(rs.getInt(1));
                        System.out.println("La asistencia de: " + asistencia.getId_socio().getNombre()+ " a " + asistencia.getId_clase().getNombre() + " fue añadida con exito");
                        JOptionPane.showMessageDialog(null,"La asistencia de: " + asistencia.getId_socio().getNombre()+ " a " + asistencia.getId_clase().getNombre() + " fue añadida con exito");
                    }
                ps.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al acceder a la columna asistencia" + ex.getMessage());

            }

    }
    public void buscarAsistenciaPorSocio(){
        
    }
    public void buscarAsistenciaPorClase(){
    }
    public void eliminarAsistencia(){
    }
    
    
}

