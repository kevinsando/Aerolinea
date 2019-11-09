package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.awt.Color;
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
        SoloIda = new javax.swing.JRadioButton();
        idaYRegreso = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaIda = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        fechaRegreso = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Vuelo", "Tipo", "Origen", "Destino", "Fecha ida", "Fecha regreso", "Cpsto"
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
        jLabel1.setText("Compra Tiquete");

        mvd.setText("Mostrar vuelos disponibles");
        mvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvdActionPerformed(evt);
            }
        });

        SoloIda.setText("Solo ida");

        idaYRegreso.setText("Ida y regreso");

        jLabel2.setText("Tipo de vuelo:");

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        jLabel5.setText("Fecha ida:");

        fechaIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaIdaActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad de Pasajeros:");

        jLabel8.setText("Fecha regreso:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-20", "20-40", "+60" }));

        jMenu1.setText("Conozcanos");

        jCheckBoxMenuItem1.setText("Referente Institucional");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);
        jMenu1.add(jSeparator1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(Bselect))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idaYRegreso)
                                    .addComponent(SoloIda))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)
                                        .addComponent(fechaIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(mvd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoloIda)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(fechaIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idaYRegreso)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(fechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(mvd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
            this.updateTabla(control.listarVuelos2());
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
                System.out.println("VUELO: "+control.listarVuelos().get(Tabla.getSelectedRow()).toString());
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

    private void fechaIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaIdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaIdaActionPerformed
    public void setUsuario(usuario u) {
        user = u;
        if (user.getUser() != null) {
            usuario.setText("Bienvenido " + u.getUser());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bselect;
    private javax.swing.JRadioButton SoloIda;
    private javax.swing.JTable Tabla;
    private org.jdesktop.swingx.JXDatePicker fechaIda;
    private org.jdesktop.swingx.JXDatePicker fechaRegreso;
    private javax.swing.JRadioButton idaYRegreso;
    private javax.swing.JMenu ingresaAdmin;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton mvd;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void updateTabla(ArrayList<vuelo> vuelos) {
        DefaultTableModel tableModel = new DefaultTableModel();
        boolean pintar = false;
        String[] columnNames = {"Codigo de vuelo", "Tipo", "Origen", "Destino", "Fecha ida", "Fecha Regreso"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];
        String dia = "";
        if (fechaIda.getDate()!= null) {
            switch (fechaIda.getDate().getDay()) {
                case 0: {
                    dia = "Domingo";
                    break;
                }
                case 1: {
                    dia = "Lunes";
                    break;
                }
                case 2: {
                    dia = "Martes";
                    break;
                }
                case 3: {
                    dia = "Miercoles";
                    break;
                }
                case 4: {
                    dia = "Jueves";
                    break;
                }
                case 5: {
                    dia = "Viernes";
                    break;
                }
                case 6: {
                    dia = "Sabado";
                    break;
                }
                default:
                    break;
            }
        }else{
            System.out.println("error");
        }
        for (int i = 0; i < vuelos.size(); i++) {

            Columna[0] = vuelos.get(i).getCodigo();
            switch (vuelos.get(i).getTipo()) {
                case 1: {
                    Columna[1] = "Solo Ida";
                    break;
                }
                case 2: {
                    Columna[1] = "Ida y Regreso";
                    break;
                }
            }
            Columna[2] = vuelos.get(i).getOrigen();
            Columna[3] = vuelos.get(i).getDestino();
            Columna[4] = vuelos.get(i).getDiaSemana() + " " + vuelos.get(i).getHora() + ":" + vuelos.get(i).getMinutos();
            Columna[5] = vuelos.get(i).getDiaSemana() + " " + vuelos.get(i).getHoraLlegada() + ":" + vuelos.get(i).getMinutosLlegada();
            if (Integer.parseInt(vuelos.get(i).getDescuento()) > 0) {
                //VER COMO INDICAR QUE ESTÁ EN DESCUENTO

            }
            if (dia.equals("")) {
                tableModel.addRow(Columna);
            } else if (vuelos.get(i).getDiaSemana().equals(dia)) {
                tableModel.addRow(Columna);
            }

        }

        Tabla.setModel(tableModel);
    }

}
