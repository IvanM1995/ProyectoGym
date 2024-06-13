
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.ClaseData;
import Entidades.ProyectoGym.Clase;
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
    }
      
    
     private void llenarComboBoxConClases() {
        
         ClaseData cladata = new ClaseData();
        List<Clase> clases = cladata.listarClases();
        for (Clase c : clases) {
            jcClaseID.addItem(c);
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
        jtSocioID = new javax.swing.JTextField();
        jcClaseID = new javax.swing.JComboBox<>();
        jdFechaAsistencia = new com.toedter.calendar.JDateChooser();
        jcHorarioAsistencia = new javax.swing.JComboBox<>();

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 194, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Horario de Asistencia :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jbInscribir.setText("Inscribir");
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 80, 40));
        getContentPane().add(jtSocioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 125, 150, -1));

        getContentPane().add(jcClaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));
        getContentPane().add(jdFechaAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        getContentPane().add(jcHorarioAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private com.toedter.calendar.JDateChooser jdFechaAsistencia;
    private javax.swing.JTextField jtSocioID;
    // End of variables declaration//GEN-END:variables
}
