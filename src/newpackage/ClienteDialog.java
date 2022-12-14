/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Gio
 */
public class ClienteDialog extends javax.swing.JDialog {

    /**
     * Creates new form ClienteDialog
     */
    public ClienteDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        nombretext = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        direcciontext = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        telefonotext = new javax.swing.JTextField();
        agregar = new javax.swing.JToggleButton();
        eliminarBoton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        nombretext.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        nombretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretextActionPerformed(evt);
            }
        });
        jPanel1.add(nombretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 30));

        direccion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setText("Direccion:");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        direcciontext.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(direcciontext, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 30));

        telefono.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setText("Telefono:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        telefonotext.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(telefonotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 260, 30));

        agregar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        eliminarBoton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        eliminarBoton.setText("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Cliente.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretextActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (nombretext.getText().equals("") || direcciontext.equals("") || telefonotext.equals("")) {
            JOptionPane.showMessageDialog(this, "No todos los campos estan llenos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                dtoCliente.setNombre(nombretext.getText());
                dtoCliente.setDireccion(direcciontext.getText());
                dtoCliente.setTelefono(telefonotext.getText());
                if (agregar.getText().equals("Agregar")) {
                    dtaCliente.append(dtoCliente);
                    JOptionPane.showMessageDialog(this, "Cliente " + dtoCliente.getNombre()
                            + " registrado.", "Listo", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    dtaCliente.update(dtoCliente);
                    JOptionPane.showMessageDialog(this, "Cliente " + dtoCliente.getNombre()
                            + " modificado.", "Listo", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cliente " + dtoCliente.getNombre()
                            + " registrado.", "Listo", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
            }
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        try {
            dtaCliente.delete(dtoCliente);
            JOptionPane.showMessageDialog(this, "Cliente " + dtoCliente.getNombre()
                            + " eliminado.", "Listo", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Este Cliente tiene una Reservaci??n, no se puede elminar", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteDialog dialog = new ClienteDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JButton getEliminarBoton() {
        return eliminarBoton;
    }

    public void setEliminarBoton(JButton eliminarBoton) {
        this.eliminarBoton = eliminarBoton;
    }

    public JTextField getDirecciontext() {
        return direcciontext;
    }

    public void setDirecciontext(JTextField direcciontext) {
        this.direcciontext = direcciontext;
    }

    public JTextField getNombretext() {
        return nombretext;
    }

    public void setNombretext(JTextField nombretext) {
        this.nombretext = nombretext;
    }

    public JTextField getTelefonotext() {
        return telefonotext;
    }

    public void setTelefonotext(JTextField telefonotext) {
        this.telefonotext = telefonotext;
    }

    public JToggleButton getAgregar() {
        return agregar;
    }

    public void setTextAgregar(String text) {
        agregar.setText(text);
    }

    public void setClienteDTO(ClienteDTO dto) {
        dtoCliente = dto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregar;
    private javax.swing.JLabel background;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direcciontext;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombretext;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonotext;
    // End of variables declaration//GEN-END:variables
    public ClienteDAO dtaCliente = new ClienteDAO();
    public ClienteDTO dtoCliente = new ClienteDTO();

}
