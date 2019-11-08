package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logicaNegocios.tipoAvion;

public class gestionTipoAviones extends javax.swing.JFrame {

    controlador control;

    public gestionTipoAviones() {
        initComponents();
        setDefaultCloseOperation(usuarioA.DISPOSE_ON_CLOSE);
    }

    public void setControl(controlador control) {
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Lid = new javax.swing.JLabel();
        Lorigen = new javax.swing.JLabel();
        LCanPasajeros = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        LCanFilas = new javax.swing.JLabel();
        año = new javax.swing.JTextField();
        canPasajeros = new javax.swing.JTextField();
        canFilas = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        LModelo = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        LMarca = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        LAsientosPorFila = new javax.swing.JLabel();
        asientosPorFila = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lid.setText("ID: ");

        Lorigen.setText("Año:");

        LCanPasajeros.setText("Cantidad de Pasajeros:");

        LCanFilas.setText("Cantidad de Filas:");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Año", "Modelo", "Marca", "Cantidad Pasajeros", "Cantidad Filas", "Asientos por Fila"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("Nota : Para eliminar solo es necesario ingresa el ID de la ruta");

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        volver.setText("Menu Admin");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        LModelo.setText("Modelo:");

        LMarca.setText("Marca:");

        LAsientosPorFila.setText("Asientos por Fila:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Lorigen, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lid, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LModelo)
                                        .addComponent(LMarca))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LCanPasajeros)
                                        .addComponent(LCanFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton2)
                                    .addGap(96, 96, 96)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(canPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(canFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LAsientosPorFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(asientosPorFila)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(eliminar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(mostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrar)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LModelo)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LCanPasajeros)
                                    .addComponent(canPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LAsientosPorFila))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LMarca)
                                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LCanFilas)
                                    .addComponent(canFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asientosPorFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lid)
                                .addGap(18, 18, 18)
                                .addComponent(Lorigen)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(jButton2)
                            .addComponent(eliminar))
                        .addGap(70, 70, 70)
                        .addComponent(volver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        try {
            control.insertarTipoAvion(id.getText(), Integer.parseInt(año.getText()), modelo.getText(), marca.getText(), 
                    Integer.parseInt(canPasajeros.getText()), Integer.parseInt(canFilas.getText()), 
                    Integer.parseInt(asientosPorFila.getText()));
                    this.updateTable(control.listarTipoAvion());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionTipoAviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            control.modificarTipoAvion(id.getText(), Integer.parseInt(año.getText()), modelo.getText(), marca.getText(), 
                    Integer.parseInt(canPasajeros.getText()), Integer.parseInt(canFilas.getText()), 
                    Integer.parseInt(asientosPorFila.getText()));
            this.updateTable(control.listarTipoAvion());
        } catch (GlobalException | NoDataException  ex) {
            Logger.getLogger(gestionTipoAviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            // TODO add your handling code here:
            control.eliminarEspTipo(id.getText());
            this.updateTable(control.listarTipoAvion());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionTipoAviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTable(control.listarTipoAvion());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionTipoAviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        control.cargarAdmin();
    }//GEN-LAST:event_volverActionPerformed
private void updateTable(ArrayList<tipoAvion> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Año", "Modelo", "Marca","Cantidad Pasajeros","Cantidad Filas","Asientos por Filas"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < a1.size(); i++) {

            Columna[0] = a1.get(i).getId();
            Columna[1] = a1.get(i).getAnno();
            Columna[2] = a1.get(i).getModelo();
            Columna[3] = a1.get(i).getMarca();
            Columna[4] = a1.get(i).getCanPasajeros();
            Columna[5] = a1.get(i).getCanFilas();
            Columna[6] = a1.get(i).getAsientosFila();
            tableModel.addRow(Columna);
        }

        tabla.setModel(tableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAsientosPorFila;
    private javax.swing.JLabel LCanFilas;
    private javax.swing.JLabel LCanPasajeros;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LModelo;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lorigen;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField asientosPorFila;
    private javax.swing.JTextField año;
    private javax.swing.JTextField canFilas;
    private javax.swing.JTextField canPasajeros;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JButton mostrar;
    private javax.swing.JTable tabla;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
