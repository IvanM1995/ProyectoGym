/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ProyectoGym;

import AccesoDatos.ProyectoGym.SocioData;
import Entidades.ProyectoGym.Socio;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Javi
 */
public class SocioVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form SocioVista
     */
    public SocioVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        GuardarSocio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre:");

        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido:");

        DNI.setForeground(new java.awt.Color(255, 255, 255));
        DNI.setText("DNI:");

        Edad.setForeground(new java.awt.Color(255, 255, 255));
        Edad.setText("Edad:");

        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setText("Correo:");

        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setText("Telefono:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inscripción Socio");

        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });

        textDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDniActionPerformed(evt);
            }
        });

        GuardarSocio.setText("Guardar Socio");
        GuardarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSocioActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Edad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Correo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(GuardarSocio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTelefono))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addGap(18, 18, 18)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido)
                            .addComponent(DNI)
                            .addComponent(Edad)
                            .addComponent(Correo))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellido)
                            .addComponent(textDni)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textCorreo))))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuardarSocio)
                .addGap(78, 78, 78))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNI)
                    .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo)
                    .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(GuardarSocio)
                .addGap(39, 39, 39))
        );

        ((PlainDocument) textNombre.getDocument()).setDocumentFilter(new OnlyLettersFilter());
        ((PlainDocument) textApellido.getDocument()).setDocumentFilter(new OnlyLettersFilter());
        ((PlainDocument) textDni.getDocument()).setDocumentFilter(new OnlyNumbersFilter(8));
        ((PlainDocument) textEdad.getDocument()).setDocumentFilter(new AgeFilter());
        ((PlainDocument) textTelefono.getDocument()).setDocumentFilter(new OnlyNumbersFilter(10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

    private void textDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDniActionPerformed
    public void limpiar(){
 
    textTelefono.setText("");
    textNombre.setText("");
    textApellido.setText("");
    textEdad.setText("");
    textCorreo.setText("");
    textDni.setText("");
 
 }
    private void GuardarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSocioActionPerformed
                                                
     SocioData socioData = new SocioData();
        // Validación de los datos de entrada
    String nombre = textNombre.getText();
    String apellido = textApellido.getText();
    String dni = textDni.getText();
    String edadStr = textEdad.getText();
    String correo = textCorreo.getText();
    String telefono = textTelefono.getText();

    // Validación de nombre y apellido (solo letras y espacios, no vacío)
    if (!Pattern.matches("[a-zA-Z\\s]+", nombre) || nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nombre inválido.");
        return;
    }

    if (!Pattern.matches("[a-zA-Z\\s]+", apellido) || apellido.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Apellido inválido.");
        return;
    }

    // Validación de DNI (solo números y longitud específica, por ejemplo 8 dígitos)
    if (!Pattern.matches("\\d{8}", dni)) {
        JOptionPane.showMessageDialog(this, "DNI inválido.");
        return;
    }

    // Validación de edad (solo números y un rango razonable, por ejemplo 0 a 120)
    int edad;
    try {
        edad = Integer.parseInt(edadStr);
        if (edad < 0 || edad > 120) {
            JOptionPane.showMessageDialog(this, "Edad inválida.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Edad inválida.");
        return;
    }

    // Validación de correo (formato de correo electrónico básico)
    if (!Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", correo)) {
        JOptionPane.showMessageDialog(this, "Correo inválido.");
        return;
    }

    // Validación de teléfono (solo números y longitud específica, por ejemplo 10 dígitos)
    if (!Pattern.matches("\\d{10}", telefono)) {
        JOptionPane.showMessageDialog(this, "Teléfono inválido.");
        return;

    }//GEN-LAST:event_GuardarSocioActionPerformed

    }
class OnlyLettersFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string.matches("[a-zA-Z]+")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text.matches("[a-zA-Z]+")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}

class OnlyNumbersFilter extends DocumentFilter {
    private int maxLength;

    public OnlyNumbersFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String text = fb.getDocument().getText(0, fb.getDocument().getLength());
        text += string;
        if (text.matches("\\d+") && text.length() <= maxLength) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String existingText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = existingText.substring(0, offset) + text + existingText.substring(offset + length);
        if (newText.matches("\\d+") && newText.length() <= maxLength) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}

class AgeFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string.matches("\\d{0,2}")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String existingText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = existingText.substring(0, offset) + text + existingText.substring(offset + length);
        if (newText.matches("\\d{0,2}")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Edad;
    private javax.swing.JButton GuardarSocio;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
