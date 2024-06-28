
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.AsistenciaData;
import AccesoDatos.ProyectoGym.ClaseData;
import AccesoDatos.ProyectoGym.EntrenadorData;
import AccesoDatos.ProyectoGym.MembresiaData;
import AccesoDatos.ProyectoGym.SocioData;
import Entidades.ProyectoGym.Clase;
import Entidades.ProyectoGym.Socio;
import Entidades.ProyectoGym.Asistencia;
import Entidades.ProyectoGym.Entrenador;
import Entidades.ProyectoGym.Membresia;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import javax.swing.JOptionPane;


public class AsistenciaForm extends javax.swing.JInternalFrame {

    private List<Clase>clases;
        private Clase clase;
       private AsistenciaData asiData;
       private EntrenadorData entData;
      private SocioData socData;
      private MembresiaData memData;
        private ClaseData claData;
        private MembresiaData membresia;
        private Socio soc;
        private Membresia mem;
 
    
    
    
    public AsistenciaForm() {
        initComponents();
         socData = new SocioData();
         claData = new ClaseData();
         asiData = new AsistenciaData();
         memData = new MembresiaData();
         entData = new EntrenadorData();
         soc= new Socio();
         Clase clase = null;
         llenarComboBoxConClases() ;
         mem = new Membresia();
       
         
         membresia = new MembresiaData();
    }
      
    
     private void llenarComboBoxConClases() {
        
         ClaseData cladata = new ClaseData();
        List<Clase> clases = cladata.listarClases();
        for (Clase c : clases) {
            jcClaseID.addItem(c);
        }
    }
     
//         private void llenarComboBoxConSocio() {
//        
//         SocioData socdata = new SocioData();
//        List<Socio> socios = socdata.listarSocios();
//        for (Socio a : socios) {
//            jcSocioID.addItem(a);
//        }
//    }
         
     private void llenarComboBoxConMembresias(Socio socio) {

        List<Membresia> membresias = memData.obtenerMembresiasPorSocio(socio.getId_socio());
        if (membresias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el socio " + socio.toString() + " no tiene membresias activas");
            jtSocioDni.setText("");
            jtSocioString.setText("");
        } else {
            for (Membresia c : membresias) {
                jcMembresia.addItem(c);
                jtSocioString.setText(soc.toString());
            }
        }
    }

          
     
     private void InscribirAsistencia(){
       
         try{
            
              String dni = jtSocioDni.getText();
              Socio idSocio = socData.buscarSocioPorDni(dni);
              int indicec = jcClaseID.getSelectedIndex();
              Clase idClase = jcClaseID.getItemAt(indicec);
              Date fecha ;
              
              int selectedIndex = jcHorarioAsistencia.getSelectedIndex();
          

            String horarioString = jcHorarioAsistencia.getItemAt(selectedIndex);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            java.util.Date date = null;
            try {
                date = sdf.parse(horarioString);
            } catch (ParseException e) {
                e.printStackTrace();

                JOptionPane.showMessageDialog(null, "Error al parsear el horario: " + e.getMessage());
                return;
            }
             Time horario = new Time(date.getTime());
             if(jdFechaAsistencia.getDate()!= null)
             {
             fecha = new Date(jdFechaAsistencia.getDate().getTime());
             }
             else
             {
              JOptionPane.showMessageDialog(this, "Seleccione fecha para clase" );
              return;
             
             }
             
              
            Asistencia c = new Asistencia (idSocio, idClase, fecha, horario ,true);
            int in = jcMembresia.getSelectedIndex();
            
            Membresia m =jcMembresia.getItemAt(in);
            if (m == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una membresía válida.");
            return;
        }
           
            
            if( claData.ConsultaCapacidad(idClase)&& idSocio.getContador_asistencia()>0 && m.getCant_pases() > 0 && fecha.before(m.getFecha_fin()) && jdFechaAsistencia.getDate()!= null)
            {
            
            asiData.guardarAsistencia(c);
            System.out.println("Asistencia Registrada" + c);
            idSocio.getId_socio();
            soc = socData.buscarSocioPorId(idSocio.getId_socio());
            soc.setContador_asistencia(soc.getContador_asistencia()-1);
            socData.modificarSocio(soc);

             membresia.menosPases(idSocio.getId_socio());
            
            }
            else
                if
            (! claData.ConsultaCapacidad(idClase)){
            
            JOptionPane.showMessageDialog(this, "no puede inscribirse clase en su maxima capacidad" );
            
            }
                else if(idSocio.getContador_asistencia()==0)
                        {
                        
                             JOptionPane.showMessageDialog(this, "no puede inscribirse socio sin pases" );
                        
                        }
                
                     else if (m.getCant_pases() == 0) {
    JOptionPane.showMessageDialog(this, "No puede inscribirse, el socio no tiene pases en su membresía.");
                }

                            else if(jdFechaAsistencia.getDate()== null){

                                JOptionPane.showMessageDialog(this, "Seleccione fecha para clase" );

                            } else{
                            
                                
                                     JOptionPane.showMessageDialog(this, "membresia vencida" );
                            
                            }
            
            
       }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "" + ex);

        }
        
        

     
     
     
     
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jcMembresia = new javax.swing.JComboBox<>();
        jdFechaAsistencia = new com.toedter.calendar.JDateChooser();
        jcHorarioAsistencia = new javax.swing.JComboBox<>();
        jcClaseID = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtSocioDni = new javax.swing.JTextField();
        jtSocioString = new javax.swing.JTextField();
        jbBuscar = new java.awt.Button();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Gestion de Asistencias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Clase ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Membresia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Asistencia :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Horario de Asistencia :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, 40));

        jcMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMembresiaActionPerformed(evt);
            }
        });
        getContentPane().add(jcMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, -1));
        getContentPane().add(jdFechaAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, -1));

        jcHorarioAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        getContentPane().add(jcHorarioAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 150, -1));

        getContentPane().add(jcClaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 80, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Socio dni");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jtSocioDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtSocioDniFocusLost(evt);
            }
        });
        jtSocioDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSocioDniActionPerformed(evt);
            }
        });
        getContentPane().add(jtSocioDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));

        jtSocioString.setEditable(false);
        jtSocioString.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtSocioStringFocusLost(evt);
            }
        });
        jtSocioString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSocioStringActionPerformed(evt);
            }
        });
        getContentPane().add(jtSocioString, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 30));

        jbBuscar.setLabel("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        InscribirAsistencia();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMembresiaActionPerformed

    private void jtSocioDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSocioDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSocioDniActionPerformed

    private void jtSocioDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtSocioDniFocusLost
    
    }//GEN-LAST:event_jtSocioDniFocusLost

    private void jtSocioStringFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtSocioStringFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSocioStringFocusLost

    private void jtSocioStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSocioStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSocioStringActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        String dni = jtSocioDni.getText();
        soc = socData.buscarSocioPorDni(dni);
       
        if (soc != null && soc.getDni() != null) {
        llenarComboBoxConMembresias(soc);
    } else {
        JOptionPane.showMessageDialog(this, "Socio no encontrado o inactivo");
    }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private java.awt.Button jbBuscar;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Clase> jcClaseID;
    private javax.swing.JComboBox<String> jcHorarioAsistencia;
    private javax.swing.JComboBox<Membresia> jcMembresia;
    private com.toedter.calendar.JDateChooser jdFechaAsistencia;
    private javax.swing.JTextField jtSocioDni;
    private javax.swing.JTextField jtSocioString;
    // End of variables declaration//GEN-END:variables
}
