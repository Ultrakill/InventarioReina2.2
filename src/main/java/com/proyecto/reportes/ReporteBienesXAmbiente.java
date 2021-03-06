/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.reportes;

import com.personal.reporteutil.ReporteUtil;
import com.proyecto.beans.Ambiente;
import com.proyecto.beans.Area;
import com.proyecto.beans.Inventario;
import com.proyecto.control.InventarioControlador;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author fesquivelc
 */
public class ReporteBienesXAmbiente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReporteBienesXAmbiente
     */
    private ReporteBienesXAmbiente() {
        initComponents();
        bindeoSalvaje();
        bindeoSalvaje2();
    }

    public static ReporteBienesXAmbiente getInstance() {
        return ReporteBienesXAmbienteHolder.INSTANCE;
    }

    private void seleccionarAmbiente() {
        DlgAmbiente dlg = new DlgAmbiente(this, true);
        ambienteSeleccionado = dlg.getSeleccionado();
        if (ambienteSeleccionado != null) {
            txtAmbiente.setText(ambienteSeleccionado.getCodigo() + " " + ambienteSeleccionado.getNombre());
            buscar();
        }

    }
    
    private Area areaSeleccionada;
    
    private void seleccionarArea() {
        DlgArea dlg = new DlgArea(this, true);
        areaSeleccionada = dlg.getSeleccionado();
        if (areaSeleccionada != null) {
            txtArea.setText(areaSeleccionada.getNombre());
            buscarXArea();
        }

    }
    
    private void buscarXArea() {
        if (areaSeleccionada!= null) {
            inventarioList2.clear();
            inventarioList2.addAll(inventarioControlador.buscarXArea(areaSeleccionada));
            tabla2.packAll();
            btnImprimirAmbiente.setEnabled(true);
        }
    }

    private void buscar() {
        if (ambienteSeleccionado != null) {
            inventarioList.clear();
            inventarioList.addAll(inventarioControlador.buscarXAmbiente(ambienteSeleccionado));
            tabla.packAll();
            btnImprimirAmbiente.setEnabled(true);
        }
    }

    private static class ReporteBienesXAmbienteHolder {

        private static final ReporteBienesXAmbiente INSTANCE = new ReporteBienesXAmbiente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimirAmbiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAmbiente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnImprimirArea = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new org.jdesktop.swingx.JXTable();

        setClosable(true);
        setTitle("Reporte de bienes");
        setToolTipText("");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 6, 0, 6, 0};
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnImprimirAmbiente.setText(" Imprimir por ambiente");
        btnImprimirAmbiente.setEnabled(false);
        btnImprimirAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirAmbienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnImprimirAmbiente);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(jPanel2, gridBagConstraints);

        jLabel2.setText("Ambiente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

        txtAmbiente.setEditable(false);
        txtAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAmbienteMouseReleased(evt);
            }
        });
        txtAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmbienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtAmbiente, gridBagConstraints);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton3, gridBagConstraints);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jTabbedPane1.addTab("Bienes por ambiente", jPanel1);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnImprimirArea.setText(" Imprimir por área");
        btnImprimirArea.setEnabled(false);
        btnImprimirArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirAreaActionPerformed(evt);
            }
        });
        jPanel4.add(btnImprimirArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        jPanel3.add(jPanel4, gridBagConstraints);

        jLabel3.setText("Área:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel3, gridBagConstraints);

        txtArea.setEditable(false);
        txtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAreaMouseReleased(evt);
            }
        });
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(txtArea, gridBagConstraints);

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jButton2, gridBagConstraints);

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jButton4, gridBagConstraints);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabla2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jScrollPane3, gridBagConstraints);

        jTabbedPane1.addTab("Bienes por área", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        seleccionarAmbiente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        buscar();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtAmbienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmbienteMouseReleased
        // TODO add your handling code here:
        seleccionarAmbiente();
    }//GEN-LAST:event_txtAmbienteMouseReleased

    private void txtAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmbienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmbienteActionPerformed

    private void btnImprimirAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirAmbienteActionPerformed
        // TODO add your handling code here:
        if (ambienteSeleccionado != null) {
            try {
                File reporte = new File("reportes/bienes_ambiente_seleccionado.jasper");
                Map mapa = new HashMap();
                mapa.put("ambiente_codigo", ambienteSeleccionado.getCodigo());
                reporteUtil.generarReporte(reporte, mapa, JOptionPane.getFrameForComponent(this));
            } catch (JRException ex) {
                Logger.getLogger(ReporteBienesXAmbiente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImprimirAmbienteActionPerformed

    private void btnImprimirAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirAreaActionPerformed
        // TODO add your handling code here:
        if (areaSeleccionada != null) {
            try {
                File reporte = new File("reportes/bienes_ambiente.jasper");
                Map mapa = new HashMap();
                mapa.put("area_id", areaSeleccionada.getId());
                reporteUtil.generarReporte(reporte, mapa, JOptionPane.getFrameForComponent(this));
            } catch (JRException ex) {
                Logger.getLogger(ReporteBienesXAmbiente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImprimirAreaActionPerformed

    private void txtAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMouseReleased
        // TODO add your handling code here:
        seleccionarArea();
    }//GEN-LAST:event_txtAreaMouseReleased

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        seleccionarArea();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        buscarXArea();
    }//GEN-LAST:event_jButton4ActionPerformed

    private final ReporteUtil reporteUtil = new ReporteUtil();
    private Ambiente ambienteSeleccionado;
    private final InventarioControlador inventarioControlador = new InventarioControlador();
    private List<Inventario> inventarioList;
    private List<Inventario> inventarioList2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirAmbiente;
    private javax.swing.JButton btnImprimirArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXTable tabla;
    private org.jdesktop.swingx.JXTable tabla2;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtArea;
    // End of variables declaration//GEN-END:variables

    private void bindeoSalvaje() {
        inventarioList = ObservableCollections.observableList(new ArrayList<Inventario>());

        JTableBinding binding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, inventarioList, tabla);
        

        BeanProperty bBien = BeanProperty.create("bien");
        BeanProperty bBienNombre = BeanProperty.create(bBien, "nombre");
        BeanProperty bClase = BeanProperty.create(BeanProperty.create(bBien, "clase"), "codigo");
        BeanProperty bSerie = BeanProperty.create("serie");
        BeanProperty bCodigoFabrica = BeanProperty.create("codigoFabrica");
        BeanProperty bEstado = BeanProperty.create("estado");

        binding.addColumnBinding(bClase).setColumnName("Clase").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bSerie).setColumnName("Serie").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bCodigoFabrica).setColumnName("Codigo de Fabrica").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bBienNombre).setColumnName("Bien").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bEstado).setColumnName("Estado").setEditable(false).setColumnClass(String.class);

        binding.bind();
    }
    
    private void bindeoSalvaje2() {
        inventarioList2 = ObservableCollections.observableList(new ArrayList<Inventario>());

        JTableBinding binding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, inventarioList2, tabla2);

        BeanProperty bBien = BeanProperty.create("bien");
        BeanProperty bBienNombre = BeanProperty.create(bBien, "nombre");
        BeanProperty bClase = BeanProperty.create(BeanProperty.create(bBien, "clase"), "codigo");
        BeanProperty bSerie = BeanProperty.create("serie");
        BeanProperty bCodigoFabrica = BeanProperty.create("codigoFabrica");
        BeanProperty bEstado = BeanProperty.create("estado");

        binding.addColumnBinding(bClase).setColumnName("Clase").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bSerie).setColumnName("Serie").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bCodigoFabrica).setColumnName("Codigo de Fabrica").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bBienNombre).setColumnName("Bien").setEditable(false).setColumnClass(String.class);
        binding.addColumnBinding(bEstado).setColumnName("Estado").setEditable(false).setColumnClass(String.class);

        binding.bind();
    }
}
