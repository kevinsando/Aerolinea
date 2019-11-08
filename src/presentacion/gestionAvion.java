package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logicaNegocios.avion;
import logicaNegocios.horario;
import logicaNegocios.ruta;
import logicaNegocios.tipoAvion;

public class gestionAvion extends javax.swing.JFrame {

    controlador control;

    public gestionAvion() {
        initComponents();
        setDefaultCloseOperation(gestionAvion.DISPOSE_ON_CLOSE);

    }

    public void setControl(controlador control) {
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaR = new javax.swing.JTable();
        rutas = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaA = new javax.swing.JTable();
        Taviones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avion = new javax.swing.JTextField();
        horario = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAvion = new javax.swing.JTable();
        aviones = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ruta: ");

        tablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Origen", "Destino", "Duracion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaR);

        rutas.setText("Mostrar Rutas");
        rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutasActionPerformed(evt);
            }
        });

        jLabel2.setText("ID: ");

        tablaA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaA);

        Taviones.setText("Mostrar Tipo Aviones");
        Taviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TavionesActionPerformed(evt);
            }
        });

        tablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Hora", "Precio", "Descuento", "Ruta"
            }
        ));
        jScrollPane1.setViewportView(tablaH);

        jButton1.setText("Mostrar Horarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Horario: ");

        jLabel4.setText("Avion: ");

        insertar.setText("Insertar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tablaAvion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Horario", "Ruta", "Avion"
            }
        ));
        jScrollPane4.setViewportView(tablaAvion);

        aviones.setText("Mostrar Aviones");
        aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionesActionPerformed(evt);
            }
        });

        jButton2.setText("Menu Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(Taviones))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(rutas)
                                .addGap(210, 210, 210)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(aviones))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(avion)
                                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actualizar)
                                .addGap(50, 50, 50)
                                .addComponent(eliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Taviones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(avion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(actualizar)
                                .addComponent(insertar)))))
                .addGap(9, 9, 9)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TavionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TavionesActionPerformed
        try {
            // TODO add your handling code here:

            this.updateTableTipoAvion(control.listarTipoAvion());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_TavionesActionPerformed

    private void rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutasActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTableRuta(control.listarRuta());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rutasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTableHorario(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        try {
            // TODO add your handling code here:
            control.ingresarAvion(id.getText(), horario.getText(), ruta.getText(), avion.getText());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insertarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            // TODO add your handling code here:
            control.eliminarAvion(id.getText());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try {
            // TODO add your handling code here:
            control.modificarAvion(id.getText(), horario.getText(), ruta.getText(), avion.getText());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void avionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionesActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTableAvion(control.listarAviones());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_avionesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        control.cargarAdmin();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void updateTableRuta(ArrayList<ruta> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Origen", "Destino", "Duracion"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < a1.size(); i++) {

            Columna[0] = a1.get(i).getID();
            Columna[1] = a1.get(i).getOrigen();
            Columna[2] = a1.get(i).getDestino();
            Columna[3] = Integer.toString(a1.get(i).getDuracionH())+':'+Integer.toString(a1.get(i).getDuracionM());
            tableModel.addRow(Columna);
        }

        tablaR.setModel(tableModel);
    }

    private void updateTableTipoAvion(ArrayList<tipoAvion> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Año", "Modelo", "Marca", "Cantidad Pasajeros", "Cantidad Filas", "Asientos por Filas"};
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

        tablaA.setModel(tableModel);
    }

    private void updateTableHorario(ArrayList<horario> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Hora", "Minutos", "Precio", "Descuento", "Ruta"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i).toString());
            System.out.println(a1.get(i).getRuta());
            Columna[0] = a1.get(i).getId();
            Columna[1] = a1.get(i).getHora();
            Columna[2] = a1.get(i).getMinutos();
            Columna[3] = a1.get(i).getPrecio();
            Columna[4] = a1.get(i).getDescuento();
            Columna[5] = a1.get(i).getRuta();
            tableModel.addRow(Columna);
        }

        tablaH.setModel(tableModel);
    }

    private void updateTableAvion(ArrayList<avion> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Horario", "Ruta", "Avion"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < a1.size(); i++) {
            Columna[0] = a1.get(i).getID();
            Columna[1] = a1.get(i).getIdHorario();
            Columna[2] = a1.get(i).getIdRuta();
            Columna[3] = a1.get(i).getIdentificadorAv();
            tableModel.addRow(Columna);
        }

        tablaAvion.setModel(tableModel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Taviones;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField avion;
    private javax.swing.JButton aviones;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField horario;
    private javax.swing.JTextField id;
    private javax.swing.JButton insertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField ruta;
    private javax.swing.JButton rutas;
    private javax.swing.JTable tablaA;
    private javax.swing.JTable tablaAvion;
    private javax.swing.JTable tablaH;
    private javax.swing.JTable tablaR;
    // End of variables declaration//GEN-END:variables
}
