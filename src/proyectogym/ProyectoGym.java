/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogym;

import AccesoDatos.ProyectoGym.ClaseData;
import AccesoDatos.ProyectoGym.Conexion;
import Entidades.ProyectoGym.Entrenador;
import java.sql.Connection;

/**
 *
 * @author Ivan
 */
public class ProyectoGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Connection connection = Conexion.getConexion();
        
        
       //      EntrenadorData ed = new EntrenadorData();
//      Entrenador e = new Entrenador( "36746323" , "Josue","Molina","Musculacion","16:30",true);
//      Entrenador f = new Entrenador( "34746323" , "Josue","Molina","BodyCombat","16:30",true);
//       Entrenador g = new Entrenador( "33746323" , "Josue","Molina","Natacion","16:30",true);        
//       Entrenador h = new Entrenador( "32746323" , "Josue","Molina","Musculacion","16:30",true);
//     
//       EntrenadorData ef = new EntrenadorData();
//       ef.guardarEntrenador(e);
//       ef.guardarEntrenador(f);
//       ef.guardarEntrenador(g);
//       ef.guardarEntrenador(h);
       
//
//    
//               
//       EntrenadorData ef = new EntrenadorData();
//       ef.eliminarEntrenador(20);
//        EntrenadorData ef = new EntrenadorData();
//          Entrenador r = new Entrenador( );
//        
//       r = ef.buscarEntrenadorxID(21);
//        System.out.println(r);
//
//        EntrenadorData ef = new EntrenadorData();
//        List<Entrenador> le = new ArrayList<>();
//        
//        le = ef.buscarEntrenador("Natacion");
//        
//        for(Entrenador e : le)
//        {
//            System.out.println(e);
//        
//        }
//
//              EntrenadorData ef = new EntrenadorData();
//        List<Entrenador> le = new ArrayList<>();
//        
//        le = ef.buscarEntrenadorxApellido("Molina");
//        
//        for(Entrenador e : le)
//        {
//            System.out.println(e);
//        
//        }
         
//        EntrenadorData ef = new EntrenadorData();
//        List<Entrenador> le = new ArrayList<>();
//        
//        le = ef.buscarEntrenadorxDisponibilidad("16:30");
//        for(Entrenador e : le)
//        {
//            System.out.println(e);
//        
//        }
//         
//    boolean resultadoGuardado = socioData.guardarSocio(nuevoSocio);
//
//    
//    if (resultadoGuardado) {
//        System.out.println("El socio ha sido guardado con éxito.");
//    } else {
//        System.out.println("Hubo un error al guardar el socio.");
//        return; // Salir del programa si hay un error al guardar el socio
//    }
//
//    
//    int idNuevoSocio = nuevoSocio.getId_socio();
//
//    
//    Date fechaInicio = new Date(2024, 5, 5);
//    Date fechaFin = new Date(fechaInicio.getTime() + (30L * 24 * 60 * 60 * 1000));

//    
//    Membresia nuevaMembresia = new Membresia(nuevoSocio, 12, fechaInicio, fechaFin, new BigDecimal("299.99"), true);
//
//    
//    MembresiaData membresiaData = new MembresiaData();
//    boolean resultadoMembresia = membresiaData.registrarMembresia(nuevaMembresia);
//
//   
//    if (resultadoMembresia) {
//        System.out.println("La membresía ha sido registrada con éxito para el socio ID: " + idNuevoSocio);
//    } else {
//        System.out.println("Hubo un error al registrar la membresía para el socio ID: " + idNuevoSocio);
//    }
//   
//   
//MembresiaData mem = new MembresiaData();
// 
//    for (Membresia membresia : mem.obtenerMembresiasPorSocio(1)) {
//        System.out.println( "Membresias numero " +membresia.getId_membresia()+ ": " + "Desde " + membresia.getFecha_inicio() + " hasta "+ membresia.getFecha_fin());
//     
//    }
//    
//    
// MembresiaData membresiaData = new MembresiaData();
//
//  
//    int idMembresiaRenovar = 1;
//
//   
//   membresiaData.renovarMembresia(idMembresiaRenovar);
//
//    
//    int idMembresiaCancelar = 4; 
//
//    
//    membresiaData.cancelarMembresia(idMembresiaCancelar);
//
//    
//
//    
     //ClaseData buscarClase = new ClaseData();
//      for(Clase clase:nuevaClase.listarClases()){
//          System.out.println(clase.getId_clase());
//          System.out.println(clase.getNombre());
//          System.out.println(clase.getHorario());
//          System.out.println("");
//      }

  Entrenador nuevoEntrenador = new Entrenador();
//       nuevoEntrenador = ed.buscarEntrenadorxID(1);
        
        // Entrenador entrenadorMusc = new Entrenador( "36746323" , "Josue","Molina","Musculacion","16:30",true);
//         Entrenador entrenadorboduCombat = new Entrenador( "34746323" , "Josue","Molina","BodyCombat","16:30",true);
//         Entrenador entrenadorNatac = new Entrenador( "33746323" , "Josue","Molina","Natacion","16:30",true);
//         Entrenador entrenadorBodyJump = new Entrenador( "32746323" , "Josue","Molina","Musculacion","16:30",true);
//         ed.guardarEntrenador(entrenadorboduCombat);
//         ed.guardarEntrenador(entrenadorNatac);
         //ed.guardarEntrenador(entrenadorMusc);
         //ed.guardarEntrenador(entrenadorBodyJump);
        ClaseData nuevaClase = new ClaseData();
////
//     Clase musculacion = new Clase ("musculacion",nuevoEntrenador, LocalTime.of(16,30),15,true );
//     Clase bodycombat = new Clase ("bodycombat",nuevoEntrenador, LocalTime.of(10,00),15,true );
//     Clase natacion = new Clase ("natacion",nuevoEntrenador, LocalTime.of(15,45),15,true );
//     Clase bodyjump = new Clase ("bodyjump",nuevoEntrenador, LocalTime.of(13,20),15,true );
      //Clase pilates = new Clase ("Pilates", nuevoEntrenador,LocalTime.of(16, 00),10,true);
//       nuevaClase.guardarClase(natacion);
//       nuevaClase.guardarClase(bodycombat);
//       nuevaClase.guardarClase(bodyjump);
//       nuevaClase.guardarClase(musculacion);
     //nuevaClase.eliminarClase(3);
     //nuevaClase.buscarClasesPorNombre(Yoga);
////     
//     for(Clase clase:nuevaClase.listarClasesPorNombre("natacion")){
//         
//          System.out.println(clase);
//          System.out.println(clase.getNombre());
//          System.out.println(clase.getId_entrenador());
//          System.out.println(clase.getHorario());
//          System.out.println(clase.getCapacidad());
//          System.out.println("");
//         
         
     }
   
//      for(Clase clase:nuevaClase.listarClases()){
//         
//          System.out.println(clase);
//          System.out.println(clase.getNombre());
//          System.out.println(clase.getId_entrenador());
//          System.out.println(clase.getHorario());
//          System.out.println(clase.getCapacidad());
//          System.out.println("");
////         
//         
//     }
    }
    

