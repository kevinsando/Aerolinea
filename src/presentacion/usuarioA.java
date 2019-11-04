package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logicaNegocios.modelo;
import logicaNegocios.usuario;

public class usuarioA extends javax.swing.JFrame {

    controlador control;
    modelo model;

    public usuarioA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelU = new javax.swing.JLabel();
        LabelC = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelU.setText("Usuario: ");

        LabelC.setText("Contraseña:");

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel3.setText("¿Aún no tienes Cuenta?");

        crear.setText("Crear una");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelU)
                                .addComponent(LabelC))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(contraseña)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(enviar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(crear)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelU)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelC)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enviar)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(crear))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        control.newCuenta();
    }//GEN-LAST:event_crearActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (!usuario.getText().equals("") && !contraseña.getText().equals("")) {
            try {
                // TODO add your handling code here:
                usuario aux = control.buscarUsuario(usuario.getText(), contraseña.getText());
                if (usuario != null) {
                    control.iniciar();
                    control.setUsuarioInicio(aux);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecto",
                            "Error", JOptionPane.WARNING_MESSAGE);
                    LabelU.setForeground(Color.red);
                    LabelC.setForeground(Color.red);
                }

            } catch (GlobalException | NoDataException | SQLException ex) {
                Logger.getLogger(usuarioA.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar todos los espacios",
                    "Error", JOptionPane.WARNING_MESSAGE);
            if (usuario.getText().equals("")) {
                LabelU.setForeground(Color.red);
                LabelC.setForeground(Color.BLACK);
            } else {
                LabelC.setForeground(Color.red);
                LabelU.setForeground(Color.BLACK);
            }
        }

    }//GEN-LAST:event_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelC;
    private javax.swing.JLabel LabelU;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton crear;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    public void setModelo(modelo model) {
        this.model = model;
    }

    public void setControl(controlador c) {
        this.control = c;
    }
}
