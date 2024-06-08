/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos.ProyectoGym;

import Entidades.ProyectoGym.Asistencia;
import java.sql.Connection;

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
    }
    public void buscarAsistenciaPorSocio(){
    }
    public void buscarAsistenciaPorClase(){
    }
    public void eliminarAsistencia(){
    }
    
    
}
