/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Membresia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class MembresiaData {
     private Connection connection = null;
    
    public MembresiaData() {
         connection = Conexion.getConexion();
         
}
     public Boolean registrarMembresia (Membresia membresia){
    Boolean flag=false;
        String sql = "INSERT INTO Membresia (id_socio, CantidadPases, fecha_inicio, fecha_fin, Costo, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, membresia.getId_socio().getId_socio());
            ps.setInt(2, membresia.getCant_pases());
            ps.setDate(3, membresia.getFecha_inicio());
            ps.setDate(4, membresia.getFecha_fin());
            ps.setBigDecimal(5, membresia.getCosto());
            ps.setBoolean(6, membresia.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {

                   membresia.setId_membresia((rs.getInt(1)));
                System.out.println("Id Membresia "+ membresia.getId_membresia());
                JOptionPane.showMessageDialog(null, "Registrado con exito."); 
                flag=true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Membresia"+ex.getMessage()); 
        }
        return flag;
    }
     
     
    public List<Membresia> obtenerMembresiasPorSocio(int idSocio) {
    List<Membresia> membresias = new ArrayList<>();
    String sql = "SELECT * FROM Membresia WHERE id_socio = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, idSocio);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Membresia membresia = new Membresia();
            membresia.setId_membresia(rs.getInt("id_membresia"));
            membresia.getId_socio();
            membresia.setCant_pases(rs.getInt("CantidadPases"));
            membresia.setFecha_inicio(rs.getDate("fecha_inicio"));
            membresia.setFecha_fin(rs.getDate("fecha_fin"));
            membresia.setCosto(rs.getBigDecimal("Costo"));
            membresia.setEstado(rs.getBoolean("estado"));
            membresias.add(membresia);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return membresias;
}
    
    public void renovarMembresia(int idMembresia) {
    String sql = "UPDATE membresia SET fecha_inicio = ?, fecha_fin = ?, estado = ? WHERE id_membresia = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        LocalDate hoy = LocalDate.now();
        statement.setDate(1, Date.valueOf(hoy));
        statement.setDate(2, Date.valueOf(hoy.plusDays(30)));
        statement.setBoolean(3, true);  // Reactivar si fue desactivada
        statement.setInt(4, idMembresia);
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public void cancelarMembresia(int idMembresia) {
    String sql = "UPDATE membresia SET estado = ? WHERE id_membresia = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setBoolean(1, false);
        statement.setInt(2, idMembresia);
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
}
