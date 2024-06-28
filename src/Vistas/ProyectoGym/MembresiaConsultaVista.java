/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.MembresiaData;
import AccesoDatos.ProyectoGym.SocioData;
import Entidades.ProyectoGym.Membresia;
import Entidades.ProyectoGym.Socio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javi
 */
public class MembresiaConsultaVista extends javax.swing.JInternalFrame {
    
private final MembresiaData membresiaData;
private SocioData socData = new SocioData();
private Socio soc = new Socio();
         

   public MembresiaConsultaVista() {
        initComponents();
        membresiaData = new MembresiaData();
        limpiarTabla();
      
    }
 

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        BotonSocio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonListar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonRenovar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        BotonSocio.setText("Buscar");
        BotonSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSocioActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por Dni de Socio:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultas de membresia");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listar todas las membresias:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                // Debes tener suficientes columnas para mostrar todos los datos necesarios
                // Aquí se agrega una fila con celdas vacías como ejemplo
                {null, null, null, null, null, null, null}
            },
            // Modifica el nombre de las columnas para reflejar los nuevos datos
            new String [] {
                "ID Membresía", "ID Socio", "Tipo", "Fecha Inicio", "Fecha Fin", "Costo", "Cant. Pases", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BotonListar.setText("Listar");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar Tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar Membresia");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonRenovar.setText("Renovar Membresia");
        BotonRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRenovarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese primero la busqueda de Socio para realizar alguna acción arriba");

        jDesktopPane1.setLayer(BotonSocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotonListar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotonCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotonRenovar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(29, 29, 29)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BotonSocio))
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonListar)))
                                .addGap(139, 139, 139)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(BotonRenovar)
                        .addGap(68, 68, 68)
                        .addComponent(BotonCancelar)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSocio)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BotonListar)
                    .addComponent(BotonRenovar)
                    .addComponent(BotonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////
    private void BotonSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSocioActionPerformed
 try {
        String dni = jTextField1.getText();
        buscarMembresiasPorDni(dni);
        BotonRenovar.setEnabled(true); 
//        EliminarBoton.setEnabled(true);
        BotonCancelar.setEnabled(true);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID de Socio válido.");
        BotonRenovar.setEnabled(false); 
        BotonCancelar.setEnabled(false); 
//        EliminarBoton.setEnabled(false);
    }
    }//GEN-LAST:event_BotonSocioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        int idMembresia = (int) jTable1.getValueAt(filaSeleccionada, 0); 
        int idSocio = (int)jTable1.getValueAt(filaSeleccionada, 1);
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar esta membresía?", "Confirmar cancelación", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        cancelarMembresia(idMembresia);
        soc = socData.buscarSocioPorId(idSocio);
        soc.setContador_asistencia(0);
        socData.modificarSocio(soc);
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una membresía para cancelar.");
    }
    }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRenovarActionPerformed
   int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        int idMembresia = (int) jTable1.getValueAt(filaSeleccionada, 0); 
        String dni = jTextField1.getText(); // Obtener el DNI del campo de texto
        Socio socio = socData.buscarSocioPorDni(dni);
        
        if (socio != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea renovar esta membresía?", "Confirmar renovación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                renovarMembresia(idMembresia);
               
                socio.setContador_asistencia(socio.getContador_asistencia() + (int) jTable1.getValueAt(filaSeleccionada, 6)); 
                socData.modificarSocio(socio);
                
               
                 buscarMembresiasPorDni(dni);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El Socio no existe o fue dado de baja...");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una membresía para renovar.");
    }
    }//GEN-LAST:event_BotonRenovarActionPerformed

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        cargarTodasLasMembresias();
//        EliminarBoton.setEnabled(false);
        BotonRenovar.setEnabled(false);
        BotonCancelar.setEnabled(false);
    }//GEN-LAST:event_BotonListarActionPerformed
 private void cargarTodasLasMembresias() {
        List<Membresia> membresias = membresiaData.obtenerTodasLasMembresias();
        mostrarMembresiasEnTabla(membresias);
    }

 
 
 private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    private void mostrarMembresiasEnTabla(List<Membresia> membresias) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); 

    for (Membresia membresia : membresias) {
          
        Object[] row = {
            membresia.getId_membresia(),
           (membresia.getId_socio() != null) ? membresia.getId_socio().getId_socio() : "",
            membresia.getTipo(),
            membresia.getFecha_inicio(),
            membresia.getFecha_fin(),
            membresia.getCosto(),
            membresia.getCant_pases(),
            membresia.isEstado()
        };
        model.addRow(row);
    }
    }

    
    
   
    private void buscarMembresiasPorDni(String dni) {
        List<Membresia> membresias = membresiaData.obtenerMembresiasPorDni(dni);
        mostrarMembresiasEnTabla(membresias);
    }
    
    private void eliminarMembresiaSeleccionada() {
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una membresía para eliminar.");
            return;
        }

        int idMembresia = (int) jTable1.getValueAt(filaSeleccionada, 0);

       
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar esta membresía?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
           
            eliminarMembresia(idMembresia);
        }
    }

    private void eliminarMembresia(int idMembresia) {
        
        membresiaData.eliminarMembresia(idMembresia);

      
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(jTable1.getSelectedRow());
    }
    
    private void renovarMembresia(int idMembresia) {
        String dni = jTextField1.getText();;
    membresiaData.renovarMembresia(idMembresia);
    buscarMembresiasPorDni(dni);
}
    
private void cancelarMembresia(int idMembresia) {
   String dni = jTextField1.getText();;
    membresiaData.cancelarMembresia(idMembresia);
buscarMembresiasPorDni(dni);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonRenovar;
    private javax.swing.JButton BotonSocio;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

