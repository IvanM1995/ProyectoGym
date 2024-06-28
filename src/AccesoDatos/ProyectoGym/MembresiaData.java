/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Membresia;
import Entidades.ProyectoGym.Socio;
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
     private SocioData socData;
     private Socio soc;
    
    public MembresiaData() {
         connection = Conexion.getConexion();
         socData = new SocioData();
         soc = new Socio();
         
}
     public Boolean registrarMembresia (Membresia membresia){
    Boolean flag=false;
        String sql = "INSERT INTO `membresia`(`id_socio`, `tipo`, `fecha_inicio`, `fecha_fin`, `estado`, `Costo`, `CantidadPases`) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        int idSocio = membresia.getId_socio().getId_socio();
        
        ps.setInt(1, idSocio);
        ps.setString(2, membresia.getTipo());
        ps.setDate(3, membresia.getFecha_inicio());
        ps.setDate(4, membresia.getFecha_fin());
        ps.setBoolean(5, membresia.isEstado());
        ps.setBigDecimal(6, membresia.getCosto());
        ps.setInt(7, membresia.getCant_pases());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {

                   membresia.setId_membresia((rs.getInt(1)));
                System.out.println("Id Membresia "+ membresia.getId_membresia());
               
                soc = socData.buscarSocioPorId(idSocio);
                soc.setContador_asistencia(membresia.getCant_pases());
                socData.modificarSocio(soc);
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
    String sql = "SELECT * FROM Membresia WHERE id_socio = ?  AND estado = true";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, idSocio);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Membresia membresia = new Membresia();
            membresia.setId_membresia(rs.getInt("id_membresia"));
             Socio socio = new Socio();
            socio.setId_socio(idSocio);
            membresia.setId_socio(socio);
            membresia.setCant_pases(rs.getInt("CantidadPases"));
            membresia.setFecha_inicio(rs.getDate("fecha_inicio"));
            membresia.setFecha_fin(rs.getDate("fecha_fin"));
            membresia.setCosto(rs.getBigDecimal("Costo"));
            membresia.setEstado(rs.getBoolean("estado"));
            membresia.setTipo(rs.getString("Tipo"));
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
        LocalDate nuevaFechaFin = hoy.plusMonths(1);
        statement.setDate(1, Date.valueOf(hoy));
        statement.setDate(2, Date.valueOf(nuevaFechaFin));
        statement.setBoolean(3, true);  
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
    
    public void eliminarMembresia(int idMembresia) {
        String sql = "DELETE FROM Membresia WHERE id_membresia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idMembresia);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
     public List<Membresia> obtenerTodasLasMembresias() {
        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * FROM Membresia";
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Membresia membresia = new Membresia();
                membresia.setId_membresia(rs.getInt("id_membresia"));
                membresia.setTipo(rs.getString("tipo"));
                  int idSocio = rs.getInt("id_socio");
            Socio socio = new Socio();
            socio.setId_socio(idSocio);
            membresia.setId_socio(socio);
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
    public void actualizarMembresia(Membresia membresia) {
        String sql = "UPDATE Membresia SET id_socio = ?, CantidadPases = ?, fecha_inicio = ?, fecha_fin = ?, Costo = ?, estado = ? WHERE id_membresia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, membresia.getId_socio().getId_socio());
            statement.setInt(2, membresia.getCant_pases());
            statement.setDate(3, (membresia.getFecha_inicio()));
            statement.setDate(4, (membresia.getFecha_fin()));
            statement.setBigDecimal(5, membresia.getCosto());
            statement.setBoolean(6, membresia.isEstado());
            statement.setInt(7, membresia.getId_membresia());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado con éxito.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la membresía: " + e.getMessage());
        }
    }
    
     public List<Membresia> obtenerMembresiasPorDni(String dni) {
        Socio socio = socData.buscarSocioPorDni(dni);
        if (socio == null || socio.getDni().equals("0")) {
            JOptionPane.showMessageDialog(null, "Socio sin membresia activa");
            return new ArrayList<>();
        }
        return obtenerMembresiasPorSocio2(socio.getId_socio());
    }
     
     
      public List<Membresia> obtenerMembresiasPorSocio2(int idSocio) {
    List<Membresia> membresias = new ArrayList<>();
    String sql = "SELECT * FROM Membresia WHERE id_socio = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, idSocio);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Membresia membresia = new Membresia();
            membresia.setId_membresia(rs.getInt("id_membresia"));
             Socio socio = new Socio();
            socio.setId_socio(idSocio);
            membresia.setId_socio(socio);
            membresia.setCant_pases(rs.getInt("CantidadPases"));
            membresia.setFecha_inicio(rs.getDate("fecha_inicio"));
            membresia.setFecha_fin(rs.getDate("fecha_fin"));
            membresia.setCosto(rs.getBigDecimal("Costo"));
            membresia.setEstado(rs.getBoolean("estado"));
            membresia.setTipo(rs.getString("Tipo"));
            membresias.add(membresia);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return membresias;
}
      
      public void menosPases(int idSocio) {
        
        String sql = "UPDATE membresia SET CantidadPases = CantidadPases - 1 WHERE ID_Socio = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, idSocio);
            
            int rows = ps.executeUpdate();
            
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Se ha restado un pase correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró al socio con ID " + idSocio);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al restar un pase: " + ex.getMessage());
        }
    }
    
}


    
    

