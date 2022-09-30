
package newpackage;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Gio
 */
public class Menu extends javax.swing.JFrame {

    /** Creates new form Menu */
    public Menu() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registro1 = new javax.swing.JLabel();
        mesa = new javax.swing.JLabel();
        reservacion = new javax.swing.JLabel();
        comida = new javax.swing.JLabel();
        servicio = new javax.swing.JLabel();
        consumo = new javax.swing.JLabel();
        clienter = new javax.swing.JButton();
        clientec = new javax.swing.JButton();
        mesar = new javax.swing.JButton();
        mesac = new javax.swing.JButton();
        reservacionr = new javax.swing.JButton();
        reservacionc = new javax.swing.JButton();
        comidac = new javax.swing.JButton();
        comidar = new javax.swing.JButton();
        consumor = new javax.swing.JButton();
        consumoc = new javax.swing.JButton();
        servicior = new javax.swing.JButton();
        servicioc = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        registro1.setForeground(new java.awt.Color(0, 0, 0));
        registro1.setText("CLIENTE");
        jPanel1.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        mesa.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        mesa.setForeground(new java.awt.Color(0, 0, 0));
        mesa.setText("MESA");
        jPanel1.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        reservacion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        reservacion.setForeground(new java.awt.Color(0, 0, 0));
        reservacion.setText("RESERVACION");
        jPanel1.add(reservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        comida.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        comida.setForeground(new java.awt.Color(0, 0, 0));
        comida.setText("COMIDA");
        jPanel1.add(comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        servicio.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        servicio.setForeground(new java.awt.Color(0, 0, 0));
        servicio.setText("SERVICIO");
        jPanel1.add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        consumo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        consumo.setForeground(new java.awt.Color(0, 0, 0));
        consumo.setText("CONSUMO");
        jPanel1.add(consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        clienter.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        clienter.setText("Registro");
        clienter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienterActionPerformed(evt);
            }
        });
        jPanel1.add(clienter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        clientec.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        clientec.setText("Consulta");
        clientec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientecActionPerformed(evt);
            }
        });
        jPanel1.add(clientec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        mesar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        mesar.setText("Registro");
        mesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesarActionPerformed(evt);
            }
        });
        jPanel1.add(mesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        mesac.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        mesac.setText("Consulta");
        mesac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesacActionPerformed(evt);
            }
        });
        jPanel1.add(mesac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        reservacionr.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        reservacionr.setText("Registro");
        reservacionr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservacionrActionPerformed(evt);
            }
        });
        jPanel1.add(reservacionr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        reservacionc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        reservacionc.setText("Consulta");
        reservacionc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservacioncActionPerformed(evt);
            }
        });
        jPanel1.add(reservacionc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        comidac.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        comidac.setText("Consulta");
        comidac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidacActionPerformed(evt);
            }
        });
        jPanel1.add(comidac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        comidar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        comidar.setText("Registro");
        comidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidarActionPerformed(evt);
            }
        });
        jPanel1.add(comidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        consumor.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        consumor.setText("Registro");
        consumor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumorActionPerformed(evt);
            }
        });
        jPanel1.add(consumor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        consumoc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        consumoc.setText("Consulta");
        consumoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumocActionPerformed(evt);
            }
        });
        jPanel1.add(consumoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        servicior.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        servicior.setText("Registro");
        servicior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciorActionPerformed(evt);
            }
        });
        jPanel1.add(servicior, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        servicioc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        servicioc.setText("Consulta");
        servicioc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciocActionPerformed(evt);
            }
        });
        jPanel1.add(servicioc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        salir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/menu.png"))); // NOI18N
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

    private void clienterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienterActionPerformed
        ClienteDialog cd = new ClienteDialog(this,true);
        cd.getAgregar().setText("Agregar");
        cd.getEliminarBoton().setVisible(false);
        cd.setVisible(true);
    }//GEN-LAST:event_clienterActionPerformed

    private void mesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesarActionPerformed
        MesaDialog md = new MesaDialog(this,true);
        md.getEliminarBoton().setVisible(false);
        md.getAgregar().setText("Agregar");
        md.setVisible(true);
    }//GEN-LAST:event_mesarActionPerformed

    private void reservacionrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservacionrActionPerformed
        ReservacionDialog rd = new ReservacionDialog(this,true);
        rd.getEliminarBoton().setVisible(false);
        rd.getAgregar().setText("Agregar");
        rd.setVisible(true);
    }//GEN-LAST:event_reservacionrActionPerformed

    private void comidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidarActionPerformed
        ComidaDialog cod = new ComidaDialog(this,true);
        cod.getEliminarBoton().setVisible(false);
        cod.getAgregar().setText("Agregar");
        cod.setVisible(true);
    }//GEN-LAST:event_comidarActionPerformed

    private void consumorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumorActionPerformed
        ConsumoDialog consd = new ConsumoDialog(this,true);
        consd.setVisible(true);
    }//GEN-LAST:event_consumorActionPerformed

    private void serviciorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciorActionPerformed
        ServicioDialog sd = new ServicioDialog(this,true);
        sd.setVisible(true);
    }//GEN-LAST:event_serviciorActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void clientecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientecActionPerformed
        ConsultaClienteDialog cc = new ConsultaClienteDialog(this,true);
        cc.setVisible(true);
    }//GEN-LAST:event_clientecActionPerformed

    private void mesacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesacActionPerformed
        ConsultasMesaDialog mc = new ConsultasMesaDialog(this,true);
        mc.setVisible(true);
    }//GEN-LAST:event_mesacActionPerformed

    private void reservacioncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservacioncActionPerformed
        ConsultasReservacionDialog cr = new ConsultasReservacionDialog(this,true);
        cr.setVisible(true);
    }//GEN-LAST:event_reservacioncActionPerformed

    private void comidacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidacActionPerformed
        ConsultasComidaDialog cc = new ConsultasComidaDialog(this,true);
        cc.setVisible(true);
    }//GEN-LAST:event_comidacActionPerformed

    private void consumocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumocActionPerformed
        ConsultasConsumosDialog cc = new ConsultasConsumosDialog(this,true);
        cc.setVisible(true);
    }//GEN-LAST:event_consumocActionPerformed

    private void serviciocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciocActionPerformed
        ConsultasServiciosDialog cc = new ConsultasServiciosDialog(this,true);
        cc.setVisible(true);
    }//GEN-LAST:event_serviciocActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton clientec;
    private javax.swing.JButton clienter;
    private javax.swing.JLabel comida;
    private javax.swing.JButton comidac;
    private javax.swing.JButton comidar;
    private javax.swing.JLabel consumo;
    private javax.swing.JButton consumoc;
    private javax.swing.JButton consumor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mesa;
    private javax.swing.JButton mesac;
    private javax.swing.JButton mesar;
    private javax.swing.JLabel registro1;
    private javax.swing.JLabel reservacion;
    private javax.swing.JButton reservacionc;
    private javax.swing.JButton reservacionr;
    private javax.swing.JButton salir;
    private javax.swing.JLabel servicio;
    private javax.swing.JButton servicioc;
    private javax.swing.JButton servicior;
    // End of variables declaration//GEN-END:variables

}