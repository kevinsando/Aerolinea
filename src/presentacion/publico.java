package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logicaNegocios.modelo;
import logicaNegocios.usuario;
import logicaNegocios.vuelo;

public class publico extends javax.swing.JFrame {

    controlador control;
    modelo model;
    usuario user;

    public void setControl(controlador control) {
        this.control = control;
    }

    public void setModel(modelo model) {
        this.model = model;
    }

    public controlador getControl() {
        return control;
    }

    public modelo getModel() {
        return model;
    }

    public publico() {
        initComponents();
        // Tabla.setVisible(false);
        Tabla.getTableHeader().setReorderingAllowed(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Bselect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mvd = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        ingresaAdmin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Avion Ida", "Avion Regreso", "Horario Ida", "Horario Regreso"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        Bselect.setText("Seleccionar");
        Bselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BselectActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aerolinea JuanDi");

        mvd.setText("Mostrar vuelos disponibles");
        mvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvdActionPerformed(evt);
            }
        });

        jMenu1.setText("Conozcanos");

        jCheckBoxMenuItem1.setText("Referente Institucional");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setText("Historia");
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Contactenos");

        jCheckBoxMenuItem3.setText("Contacto");
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acceder a mi cuenta");

        jCheckBoxMenuItem4.setText("Cuenta");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem4);

        jMenuBar1.add(jMenu3);

        ingresaAdmin.setText("Administrador");

        jMenuItem1.setText("Ingresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ingresaAdmin.add(jMenuItem1);

        jMenuBar1.add(ingresaAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(305, 305, 305)
                            .addComponent(mvd))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(349, 349, 349)
                            .addComponent(Bselect))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(mvd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bselect)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed

    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        control.login();
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void mvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvdActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTabla(control.listarVuelos());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(publico.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Tabla.setVisible(true);
    }//GEN-LAST:event_mvdActionPerformed

    private void BselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BselectActionPerformed
        // TODO add your handling code here:
        if (user == null) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no iniciado",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            ArrayList<vuelo> vuelos;
            try {
                control.llenarReservaAsientos(control.listarVuelos().get(Tabla.getSelectedRow()));
                control.reservarAsientos();
            } catch (GlobalException | NoDataException ex) {
                Logger.getLogger(publico.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_BselectActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        control.cargarAdmin();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void setUsuario(usuario u) {
        user = u;
        if (user.getUser() != null) {
            usuario.setText("Bienvenido " + u.getUser());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bselect;
    private javax.swing.JTable Tabla;
    private javax.swing.JMenu ingresaAdmin;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mvd;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void updateTabla(ArrayList<vuelo> vuelos) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"Codigo", "Tipo", "Avion Ida", "Avion Regreso", "Horario Ida", "Horario Regreso"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {

            Columna[0] = vuelos.get(i).getCodigo();
            Columna[1] = vuelos.get(i).getTipo();
            Columna[2] = vuelos.get(i).getAvionIda();
            Columna[3] = vuelos.get(i).getAvionRegreso();
            Columna[4] = vuelos.get(i).getHorarioIda();
            Columna[5] = vuelos.get(i).getHorarioRegreso();
            tableModel.addRow(Columna);
        }

        Tabla.setModel(tableModel);
    }

}
