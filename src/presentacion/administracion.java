package presentacion;

import control.controlador;
import java.awt.Color;
import javax.swing.JOptionPane;

public class administracion extends javax.swing.JFrame {

    controlador control;

    public administracion() {
        initComponents();
        gRutas.setEnabled(false);
        gTipoAviones.setEnabled(false);
        gHorarios.setEnabled(false);
        gVuelos.setEnabled(false);
        aviones.setEnabled(false);
        setDefaultCloseOperation(administracion.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelU = new javax.swing.JLabel();
        LabelC = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        gRutas = new javax.swing.JButton();
        gHorarios = new javax.swing.JButton();
        gTipoAviones = new javax.swing.JButton();
        pprincipal = new javax.swing.JButton();
        aviones = new javax.swing.JButton();
        gVuelos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelU.setText("Usuario: ");

        LabelC.setText("Contraseña: ");

        enviar.setText("Entrar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        error.setText(" ");

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        gRutas.setText("Gestion Rutas");
        gRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gRutasActionPerformed(evt);
            }
        });

        gHorarios.setText("Gestion Horarios");
        gHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gHorariosActionPerformed(evt);
            }
        });

        gTipoAviones.setText("Gestion Tipo Aviones");
        gTipoAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gTipoAvionesActionPerformed(evt);
            }
        });

        pprincipal.setText("Pagina Principal");
        pprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pprincipalActionPerformed(evt);
            }
        });

        aviones.setText("Gestion Aviones");
        aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionesActionPerformed(evt);
            }
        });

        gVuelos.setText("Gestion Vuelos");
        gVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gVuelosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pprincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelU)
                                .addGap(31, 31, 31)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(LabelC)
                                .addGap(18, 18, 18)
                                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(enviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gTipoAviones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aviones, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gRutas)
                                .addGap(18, 18, 18)
                                .addComponent(gHorarios)
                                .addGap(18, 18, 18)
                                .addComponent(gVuelos)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelU)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelC)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gRutas)
                            .addComponent(gHorarios)
                            .addComponent(gVuelos))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gTipoAviones)
                        .addComponent(aviones)))
                .addGap(18, 18, 18)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(pprincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (usuario.getText().equals("") || contraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar todos los espacios",
                    "Error", JOptionPane.WARNING_MESSAGE);
            LabelU.setForeground(Color.red);
            LabelC.setForeground(Color.red);
        } else {
            if ((usuario.getText().equals("admin")) && (contraseña.getText().equals("admin"))) {
                gRutas.setEnabled(true);
                gTipoAviones.setEnabled(true);
                gHorarios.setEnabled(true);
                aviones.setEnabled(true);
                gVuelos.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecto",
                        "Error", JOptionPane.WARNING_MESSAGE);
                LabelU.setForeground(Color.red);
                LabelC.setForeground(Color.red);
            }

        }
    }//GEN-LAST:event_enviarActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void gRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gRutasActionPerformed
        // TODO add your handling code here:
        control.gestionRutas();
    }//GEN-LAST:event_gRutasActionPerformed

    private void gTipoAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gTipoAvionesActionPerformed
        // TODO add your handling code here:
        control.gestionTipoAviones();
    }//GEN-LAST:event_gTipoAvionesActionPerformed

    private void gHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gHorariosActionPerformed
        // TODO add your handling code here:
        control.gestionHorarios();
    }//GEN-LAST:event_gHorariosActionPerformed

    private void pprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pprincipalActionPerformed
        // TODO add your handling code here:
        control.iniciar();
    }//GEN-LAST:event_pprincipalActionPerformed

    private void avionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionesActionPerformed
        // TODO add your handling code here:
        control.gestionAvion();
    }//GEN-LAST:event_avionesActionPerformed

    private void gVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gVuelosActionPerformed
        // TODO add your handling code here:
        control.gestionVuelos();
    }//GEN-LAST:event_gVuelosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelC;
    private javax.swing.JLabel LabelU;
    private javax.swing.JButton aviones;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel error;
    private javax.swing.JButton gHorarios;
    private javax.swing.JButton gRutas;
    private javax.swing.JButton gTipoAviones;
    private javax.swing.JButton gVuelos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pprincipal;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    public void setControl(controlador aThis) {
        control = aThis;
    }
}
