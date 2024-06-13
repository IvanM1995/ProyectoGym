/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Conexion {

    private static final String URL ="jdbc:mariadb://localhost:3306/";
    private static final String DB="gimnasio";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;

    private Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection == null){

            try {
                Class.forName("org.mariadb.jdbc.Driver"); //Cargando el Driver
                connection = DriverManager.getConnection(URL+DB+"?useLegacyDatetimeCode=false&serverTimezone=UTC"
                + "&user=" + USUARIO +"&password=" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD"+ex.getMessage());
            }catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers"+ex.getMessage());
            }

        }
     return connection;

   }


}
