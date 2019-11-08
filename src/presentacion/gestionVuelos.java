package presentacion;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logicaNegocios.avion;
import logicaNegocios.horario;

public class gestionVuelos extends javax.swing.JFrame implements Observer {

    controlador control;
    boolean opcion;

    public gestionVuelos() {
        initComponents();
        opcion = false;
        horarioR.setEnabled(opcion);
        regreso.setEnabled(opcion);
        setDefaultCloseOperation(administracion.DISPOSE_ON_CLOSE);

    }

    public void setControl(controlador control) {
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horarios = new javax.swing.JButton();
        aviones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAvion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();
        horarioI = new javax.swing.JTextField();
        ida = new javax.swing.JTextField();
        regreso = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        horarioR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        horarios.setText("Mostrar Horarios");
        horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horariosActionPerformed(evt);
            }
        });

        aviones.setText("Mostrar Aviones");
        aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionesActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Horario (Ida): ");

        jLabel3.setText("ID Avion (ida):");

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

        jLabel1.setText("ID Avion (regreso):");

        jLabel4.setText("Horarios");

        jLabel5.setText("Aviones");

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

        jButton3.setText("Ingresar Vuelo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Horario (Regreso): ");

        jLabel7.setText("Codigo: ");

        jLabel8.setText("Tipo(1 solo ida, 2 ida/regreso): ");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Solo ida", "2. Ida y regreso" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(horarioR)
                            .addComponent(horarioI)
                            .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ida)
                            .addComponent(regreso)
                            .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(horarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviones)))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jButton3)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(horarioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(horarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horarios)
                            .addComponent(aviones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(198, 198, 198))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (!opcion) {
                horarioR.setText("");
                regreso.setText("");
            }
            //String horario,String horarioR, String ida, String regreso,String codigo,int tipo
            control.agregarVuelos(horarioI.getText(), horarioR.getText(), ida.getText(), regreso.getText(), codigo.getText(), Character.getNumericValue(tipo.getItemAt(tipo.getSelectedIndex()).charAt(0)));
            this.dispose();
        } catch (GlobalException | NoDataException | SQLException ex) {
            Logger.getLogger(gestionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void horariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horariosActionPerformed
        try {
            // TODO add your handling code here:
            this.updateTableHorario(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_horariosActionPerformed

    private void avionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionesActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            this.updateTableAvion(control.listarAviones());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_avionesActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        if (tipo.getSelectedIndex() == 0) {
            opcion = false;
            horarioR.setEnabled(opcion);
            regreso.setEnabled(opcion);
        } else {
            opcion = true;
            horarioR.setEnabled(opcion);
            regreso.setEnabled(opcion);
        }
    }//GEN-LAST:event_tipoActionPerformed

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
    private javax.swing.JButton aviones;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField horarioI;
    private javax.swing.JTextField horarioR;
    private javax.swing.JButton horarios;
    private javax.swing.JTextField ida;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField regreso;
    private javax.swing.JTable tablaAvion;
    private javax.swing.JTable tablaH;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        try {
            this.updateTableHorario(control.listarHorario());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.updateTableAvion(control.listarAviones());
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(gestionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
