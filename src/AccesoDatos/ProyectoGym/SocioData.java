/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Socio;
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
public class SocioData {
     private Connection con = null;
 
    public SocioData() {
        con = Conexion.getConexion();
    }
    
    public boolean guardarSocio(Socio socio){
        Boolean flag=false;
        PreparedStatement ps;
        String sql = "INSERT INTO socio (dni, nombre, apellido, edad, correo, telefono, cont_asistencia, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setInt(7, socio.getContador_asistencia());
            ps.setBoolean(8, socio.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                socio.setId_socio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripto!"); 
                flag=true;
            }
            ps.close();
        }catch(SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al guardar el socio: "+ ex.getMessage());
           
        }
        return flag;
    }
    
    
    public Socio buscarSocioPorId(int id){
        Socio socio = new Socio();
        ResultSet rs;
        PreparedStatement ps;
        String sql = "SELECT * FROM socio WHERE id_socio = ? AND estado = 1";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                socio.setId_socio(rs.getInt(1));
                socio.setDni(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setContador_asistencia(rs.getInt("cont_asistencia"));
            }else{
                JOptionPane.showMessageDialog(null, "El Socio no existe o fue dado de baja...");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio: "+ex.getMessage()); 
        }
    return socio;
    }
  
    public List<Socio> listarSocios(){
        PreparedStatement ps;
        ResultSet rs;
         String sql = "SELECT * FROM socio WHERE estado = 1";
        List<Socio> socios = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            while(rs.next()){
                Socio socio = new Socio();
                socio.setId_socio(rs.getInt(1));
                socio.setDni(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setContador_asistencia(rs.getInt("cont_asistencia"));
                socio.setEstado(true);
                socios.add(socio);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla: "+ex.getMessage()); 
        }
        return socios;
    }
    
     public void modificarSocio(Socio socio){
        PreparedStatement ps;
        String sql = "UPDATE socio SET (dni, nombre, apellido, edad, correo, telefono, cont_asistencia) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?) WHERE id_socio = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setInt(7, socio.getContador_asistencia());
            ps.setInt(8, socio.getId_socio());
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, "Exitoso"); 
    
            }else{
                 JOptionPane.showMessageDialog(null, "Erro en actulizacion de datos del Socio: ");
            }
            ps.close();
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Actualización de datps fallida!\n ");    
        }
    }
     
    public void eliminarSocio(int id){ 
        SocioData socioABuscar = new SocioData();
        Socio socio;
        PreparedStatement ps; 
        try {
            socio = socioABuscar.buscarSocioPorId(id);
            String sql = "UPDATE socio SET estado = 0 WHERE id_socio = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if(fila==1){
               JOptionPane.showMessageDialog(null, "ELIMINADO"); 
            }
            ps.close();
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el Socio ID: "); 
        }    
    }
    
}
