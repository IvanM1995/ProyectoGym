
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.ClaseData;
import AccesoDatos.ProyectoGym.SocioData;
import Entidades.ProyectoGym.Clase;
import Entidades.ProyectoGym.Socio;
import java.util.List;


public class AsistenciaForm extends javax.swing.JInternalFrame {

    private List<Clase>clases;
        private Clase clase;
       
        private ClaseData claData;
    
    
    
    public AsistenciaForm() {
        initComponents();
        claData = new ClaseData();
         
         Clase clase = null;
         llenarComboBoxConClases() ;
         llenarComboBoxConSocio();
    }
      
    
     private void llenarComboBoxConClases() {
        
         ClaseData cladata = new ClaseData();
        List<Clase> clases = cladata.listarClases();
        for (Clase c : clases) {
            jcClaseID.addItem(c);
        }
    }
     
         private void llenarComboBoxConSocio() {
        
         SocioData socdata = new SocioData();
        List<Socio> socios = socdata.listarSocios();
        for (Socio a : socios) {
            jcSocioID.addItem(a);
        }
    }
     
     
     private void InscribirAsistencia(){
//     
//        try{
            
              int indices = jcSocioID.getSelectedIndex();
              Socio idSocio = jcSocioID.getItemAt(indices);
              int indice = jcClaseID.getSelectedIndex();
              Clase idClase = jcClaseID.getItemAt(indice);
        
        
        
        
        
//        
//        }
     
     
     
     
     
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
        jcSocioID = new javax.swing.JComboBox<>();
        jdFechaAsistencia = new com.toedter.calendar.JDateChooser();
        jcHorarioAsistencia = new javax.swing.JComboBox<>();
        jcClaseID = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Gestion de Asistencias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Clase ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 62, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Socio ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Asistencia :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Horario de Asistencia :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 80, 40));

        getContentPane().add(jcSocioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, -1));
        getContentPane().add(jdFechaAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));

        jcHorarioAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        getContentPane().add(jcHorarioAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 140, -1));

        getContentPane().add(jcClaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        InscribirAsistencia();
    }//GEN-LAST:event_jbInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<Clase> jcClaseID;
    private javax.swing.JComboBox<String> jcHorarioAsistencia;
    private javax.swing.JComboBox<Socio> jcSocioID;
    private com.toedter.calendar.JDateChooser jdFechaAsistencia;
    // End of variables declaration//GEN-END:variables
}
