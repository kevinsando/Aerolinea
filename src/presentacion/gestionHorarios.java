package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logicaNegocios.horario;
import logicaNegocios.ruta;

public class gestionHorarios extends javax.swing.JFrame {

    controlador control;

    public gestionHorarios() {
        initComponents();
        setDefaultCloseOperation(gestionHorarios.DISPOSE_ON_CLOSE);
    }

    public void setControl(controlador control) {
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        ruta = new javax.swing.JTextField();
        descuento = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaR = new javax.swing.JTable();
        rutas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("ID:");

        jLabel2.setText("Dia:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Descuento: ");

        jLabel6.setText("ID Ruta: ");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        jLabel7.setText("Notas: 1- Para eliminar solo es necesario ingresar el ID del horario");

        jLabel8.setText("             2-Para editar se debe digitar el ID del horario a editar y sus nuevos datos");

        jLabel9.setText("HH:MM");

        menu.setText("Menu admin");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jLabel10.setText("$");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(agregar)
                                .addGap(57, 57, 57)
                                .addComponent(editar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dia)
                                    .addComponent(id)
                                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eliminar)
                                            .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(cargar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rutas)
                                .addGap(144, 144, 144)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutas)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(editar)
                    .addComponent(eliminar))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String horas = null, minutos = null;
        if (hora.getText().length() < 5) {
            horas = hora.getText().substring(0, 1);
            minutos = hora.getText().substring(2, 4);
        } else {
            horas = hora.getText().substring(0, 2);
            minutos = hora.getText().substring(3, 5);
        }
        try {
            // TODO add your handling code here:
            control.insertarHorario(id.getText(), dia.getText(), Integer.parseInt(horas), Integer.parseInt(minutos), Integer.parseInt(precio.getText()),
                    Integer.parseInt(descuento.getText()), ruta.getText());
            this.updateTable(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            // TODO add your handling code here:
            control.modificarHorario(id.getText(), dia.getText(), ABORT, WIDTH, ERROR, Integer.parseInt(descuento.getText()), ruta.getText());
            this.updateTable(control.listarHorario());
        } catch (NoDataException | GlobalException ex) {
            Logger.getLogger(gestionHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTable(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        control.cargarAdmin();
    }//GEN-LAST:event_menuActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            // TODO add your handling code here:
            control.eliminarHorario(id.getText());
            this.updateTable(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutasActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTableRuta(control.listarRuta());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionAvion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rutasActionPerformed

    private void updateTable(ArrayList<horario> a1) {
          DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Hora","Minutos", "Precio", "Descuento","Ruta"};
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

        tabla.setModel(tableModel);
    }
    private void updateTableRuta(ArrayList<ruta> a1) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames = {"ID", "Origen", "Destino", "Duracion"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] Columna = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < a1.size(); i++) {

            Columna[0] = a1.get(i).getID();
            Columna[1] = a1.get(i).getOrigen();
            Columna[2] = a1.get(i).getDestino();
            Columna[3] = a1.get(i).getDuracion();
            tableModel.addRow(Columna);
        }

        tablaR.setModel(tableModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton cargar;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField dia;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField ruta;
    private javax.swing.JButton rutas;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaR;
    // End of variables declaration//GEN-END:variables
}
