
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.ClaseData;
import AccesoDatos.ProyectoGym.EntrenadorData;
import Entidades.ProyectoGym.Clase;
import Entidades.ProyectoGym.Entrenador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Time;



public class ClasesForm extends javax.swing.JInternalFrame {
        private List<Clase>clases;
        private Clase clase;
       
        private ClaseData claData;

   
    public ClasesForm() {
        initComponents();
         claData = new ClaseData();
         
         Clase clase = null;
         llenarComboBoxConEntrenadores() ;
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCapacidad = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtNombreClase = new javax.swing.JTextField();
        jcHorario = new javax.swing.JComboBox<>();
        jcEntrenador = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de Clases");

        jLabel2.setText("Nombre de la Clase:");

        jLabel3.setText("ID del Entrenador :");

        jLabel4.setText("Horario:");

        jLabel5.setText("Capacidad:");

        jbGuardar.setText("Añadir");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcEntrenador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(300, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(192, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(111, 111, 111)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(170, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarClase();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    private void llenarComboBoxConEntrenadores() {
        EntrenadorData entredata = new EntrenadorData();
        List<Entrenador> entrenadores = entredata.listarEntrenadores();
        for (Entrenador entrenador : entrenadores) {
            jcEntrenador.addItem(entrenador);
        }
    }
    
    
     
    private void guardarClase()
    {
    
        try{
            int index = jcEntrenador.getSelectedIndex();
                     
            Entrenador id = (jcEntrenador.getItemAt(index));
            String nombre = jtNombreClase.getText();
            
            int selectedIndex = jcHorario.getSelectedIndex();
            String Horario = jcHorario.getItemAt(selectedIndex);
            
            String horarioString = jcHorario.getItemAt(selectedIndex);
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
            int capacidad = Integer.parseInt(jtCapacidad.getText());
             
            if(nombre.isEmpty() || jtCapacidad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No debe haber campos vacios");
                return;
            
            
             }
           
            if(capacidad > 30 || !jtCapacidad.getText().matches("\\d+"))
                
            {
                 JOptionPane.showMessageDialog(null, "No debe superar los 30 caracteres y deben ser todos digitos");
                 
                 jtCapacidad.setText("");
                     return;
            }
            
            
            
            Clase c = new Clase(nombre,id,horario,capacidad,true);
            claData.guardarClase(c);
            

            
     
           
            System.out.println("clase guardada" + c);
                        limpiarCampos();
           
        }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"" + ex);
                
        }
     }
      private void limpiarCampos(){
        jtNombreClase.setText("");
        jtCapacidad.setText("");

    
    
      }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Entrenador> jcEntrenador;
    private javax.swing.JComboBox<String> jcHorario;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtNombreClase;
    // End of variables declaration//GEN-END:variables


 


}


