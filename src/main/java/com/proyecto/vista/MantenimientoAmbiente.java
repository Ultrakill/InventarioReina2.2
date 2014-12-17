/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista;

import com.proyecto.beans.Ambiente;
import com.proyecto.beans.Area;
import com.proyecto.control.AbstractControlador;
import com.proyecto.control.AmbienteControlador;
import com.proyecto.control.AreaControlador;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.apache.commons.beanutils.BeanUtils;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Documentos
 */
public class MantenimientoAmbiente extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoAmbiente
     */
    private static MantenimientoAmbiente instancia;

    public MantenimientoAmbiente() {
        initComponents();
        cargarComboArea();
        listar();

        FormularioUtil.activarComponente(panelDatos, false);
        FormularioUtil.activarComponente(panelOpciones, true);
        FormularioUtil.activarComponente(panelGuardar, false);
    }

    public static MantenimientoAmbiente getInstancia() {
        if (instancia == null) {
            instancia = new MantenimientoAmbiente();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblambientes = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        responsableLabel = new javax.swing.JLabel();
        empleadoField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        btntipo = new javax.swing.JButton();
        responsableLabel1 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox();
        panelOpciones = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelGuardar = new javax.swing.JPanel();
        btnguardar1 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenimiento de Ambientes");

        jLabel1.setText("Buscar: ");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jLabel2.setText("Lista de ambientes:");

        tblambientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblambientes);

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 10))); // NOI18N
        panelDatos.setToolTipText("");

        idLabel.setText("Código: ");

        nombreLabel.setText("Nombre:");

        responsableLabel.setText("Responsable:");

        btntipo.setText("...");
        btntipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntipoActionPerformed(evt);
            }
        });

        responsableLabel1.setText("Área:");

        cmbArea.setEditable(true);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(nombreLabel)
                    .addComponent(responsableLabel)
                    .addComponent(responsableLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nombreField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                            .addComponent(empleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btntipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsableLabel)
                    .addComponent(empleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsableLabel1)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 10))); // NOI18N
        panelOpciones.setToolTipText("");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelGuardar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnguardar1.setText("Guardar");
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGuardarLayout = new javax.swing.GroupLayout(panelGuardar);
        panelGuardar.setLayout(panelGuardarLayout);
        panelGuardarLayout.setHorizontalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        panelGuardarLayout.setVerticalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.NUEVO;
        ambienteControlador.prepararCrear();

        FormularioUtil.activarComponente(panelOpciones, false);
        FormularioUtil.activarComponente(panelGuardar, true);
        FormularioUtil.activarComponente(panelDatos, true);
        idField.requestFocusInWindow();
        cmbArea.removeAllItems();
        cargarComboArea();

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.ELIMINAR;
        if (tblambientes.getSelectedRow() != -1) {

            Integer codigo = tblambientes.getSelectedRow();

            Ambiente ambiente = ambienteControlador.buscarPorId(lista.get(codigo).getCodigo());

            if (ambiente != null) {
                if (JOptionPane.showConfirmDialog(null, "¿Desea Eliminar la Ambiente?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    int[] filas = tblambientes.getSelectedRows();
                    for (int i = 0; i < filas.length; i++) {
                        Ambiente ambiente2 = lista.get(filas[0]);
                        lista.remove(ambiente2);
                        ambienteControlador.setSeleccionado(ambiente2);
                        ambienteControlador.accion(accion);
                    }
                    if (ambienteControlador.accion(accion) == 3) {
                        JOptionPane.showMessageDialog(null, "Ambiente eliminada correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Ambiente no eliminada", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ambiente no eliminado", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Ambiente", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        // TODO add your handling code here:
        lista.clear();
        lista.addAll(ambienteControlador.buscarXNombreXCodigo(txtbuscar.getText().toUpperCase()));
        

    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.MODIFICAR;
        int fila = this.tblambientes.getSelectedRow();
        if (fila != -1) {
            FormularioUtil.activarComponente(panelDatos, true);
            FormularioUtil.activarComponente(panelOpciones, false);
            FormularioUtil.activarComponente(panelGuardar, true);

            accion = AbstractControlador.MODIFICAR;
            ambienteControlador.setSeleccionado(lista.get(fila));
            Ambiente ambiente = ambienteControlador.getSeleccionado();
            try {
                idField.setText(BeanUtils.getProperty(ambiente, "codigo"));
                nombreField.setText(BeanUtils.getProperty(ambiente, "nombre"));
                empleadoField.setText(BeanUtils.getProperty(ambiente, "empleado"));

                cmbArea.setSelectedItem(ambiente.getArea());

            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                Logger.getLogger(MantenimientoClase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Ambiente", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btntipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntipoActionPerformed
        // TODO add your handling code here:
        DlgEmpleadoBusqueda empleadoDialogo = new DlgEmpleadoBusqueda(this);
        
        if (ambienteControlador.getSeleccionado() == null) {
            Ambiente contratoProv = new Ambiente();
            ambienteControlador.setSeleccionado(contratoProv);
        }
        this.ambienteControlador.getSeleccionado().setEmpleado(empleadoDialogo.getEmpleado());
        this.empleadoField.setText(this.ambienteControlador.getSeleccionado().getEmpleado().getNombres().toUpperCase() + ", "
                + this.ambienteControlador.getSeleccionado().getEmpleado().getApellidoPaterno().toUpperCase() + " "
                + this.ambienteControlador.getSeleccionado().getEmpleado().getApellidoMaterno().toUpperCase());
    }//GEN-LAST:event_btntipoActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        // TODO add your handling code here:
        List<Integer> array = new ArrayList();
        array.add(FormularioUtil.Validar(FormularioUtil.TipoValidacion.NUMERO, this.nombreField, "Nombre"));
        array.add(FormularioUtil.Validar(FormularioUtil.TipoValidacion.NUMERO, this.empleadoField, "Responsable"));
        
        FormularioUtil.validar2(array);

        if (FormularioUtil.error) {
            JOptionPane.showMessageDialog(null, FormularioUtil.mensaje, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
            FormularioUtil.mensaje = "";
            FormularioUtil.error = false;
        } else {
            String palabra = "";
            String palabra2 = "";
            if (accion == 1) {
                palabra = "registrar";
                palabra2 = "registrado";

                if (JOptionPane.showConfirmDialog(null, "¿Desea " + palabra + " el Ambiente?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ambienteControlador.getSeleccionado().setCodigo(idField.getText().toUpperCase());
                    ambienteControlador.getSeleccionado().setNombre(nombreField.getText().toUpperCase());

                    Area area = (Area) cmbArea.getSelectedItem();
                    ambienteControlador.getSeleccionado().setArea(area);

                    ambienteControlador.accion(accion);
                    lista.add(ambienteControlador.getSeleccionado());

                    if (accion == 1) {
                        JOptionPane.showMessageDialog(null, "Ambiente " + palabra2 + " correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
                        FormularioUtil.limpiarComponente(panelDatos);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ambiente no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    FormularioUtil.limpiarComponente(panelDatos);
                    JOptionPane.showMessageDialog(null, "Ambiente no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            } else if (accion == 2) {
                palabra = "modificar";
                palabra2 = "modificado";

                if (JOptionPane.showConfirmDialog(null, "¿Desea " + palabra + " el Ambiente?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    if (accion == 2) {
                        JOptionPane.showMessageDialog(null, "Ambiente " + palabra2 + " correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);

                        lista.clear();
                        ambienteControlador.getSeleccionado().setCodigo(idField.getText().toUpperCase());
                        ambienteControlador.getSeleccionado().setNombre(nombreField.getText().toUpperCase());
                        Area area = (Area) cmbArea.getSelectedItem();
                        ambienteControlador.getSeleccionado().setArea(area);

                        ambienteControlador.accion(accion);
                        listar();

                        FormularioUtil.limpiarComponente(panelDatos);

                    } else {
                        JOptionPane.showMessageDialog(null, "Ambiente no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    FormularioUtil.limpiarComponente(panelDatos);
                    JOptionPane.showMessageDialog(null, "Ambiente no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            }

            FormularioUtil.activarComponente(panelOpciones, true);
            FormularioUtil.activarComponente(panelGuardar, false);
            FormularioUtil.activarComponente(panelDatos, false);
        }
    }//GEN-LAST:event_btnguardar1ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        FormularioUtil.activarComponente(panelDatos, false);
        FormularioUtil.limpiarComponente(panelDatos);
        FormularioUtil.activarComponente(panelOpciones, true);
        FormularioUtil.activarComponente(panelGuardar, false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lista.clear();
        lista.addAll(this.ambienteControlador.buscarXNombre(txtbuscar.getText().toUpperCase()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private int accion;
    private List<Ambiente> lista;
    private final AmbienteControlador ambienteControlador = new AmbienteControlador();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btntipo;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JTextField empleadoField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelGuardar;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JLabel responsableLabel;
    private javax.swing.JLabel responsableLabel1;
    private javax.swing.JTable tblambientes;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        lista = ambienteControlador.buscarTodos();
        lista = ObservableCollections.observableList(lista);
        
        JTableBinding binding = SwingBindings.createJTableBinding(UpdateStrategy.READ, lista, tblambientes);

        BeanProperty bId = BeanProperty.create("codigo");
        BeanProperty bNombre = BeanProperty.create("nombre");
        BeanProperty bResponsable = BeanProperty.create("empleado");
        BeanProperty bArea = BeanProperty.create("area");

        binding.addColumnBinding(bId).setColumnName("CODIGO").setEditable(false);
        binding.addColumnBinding(bNombre).setColumnName("NOMBRE").setEditable(false);
        binding.addColumnBinding(bResponsable).setColumnName("RESPONSABLE").setEditable(false);
        binding.addColumnBinding(bArea).setColumnName("AREA").setEditable(false);

        binding.bind();

    }

    private void cargarComboArea() {
        AreaControlador ac = new AreaControlador();
        List<Area> area = ac.buscarTodos();
        cmbArea.setModel(new DefaultComboBoxModel(area.toArray()));
        AutoCompleteDecorator.decorate(this.cmbArea);
    }
}
