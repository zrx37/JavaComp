/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tienda;

import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class Tienda1 extends javax.swing.JFrame {
    int cantidad = 0;
    double precio = 0;
    double precios[]={0.84,3.45,1.45,1.85,410.41,369.00,379.00,679.00,510.00,385.00,283.99,357.00,34.46,1928.00,829.00,275.00,53.99,62.99};
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    DefaultTableModel modelo=new DefaultTableModel();  
    
    /**
     * Creates new form Tienda1
     */
    public Tienda1() {
        initComponents();
        this.setTitle("TIENDA");
        modelo.addColumn("CARACTERÍSTICAS");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
    }
     public String[]datos(String datos){
        String[]informacion=new String[18];
        if(datos.equalsIgnoreCase("COMPONENTES")){
            informacion[0]="RESISTOR";
            informacion[1]="INDUCTOR";
            informacion[2]="DIODO";
            informacion[3]="TRANSISTOR";
        }
        if(datos.equalsIgnoreCase("ORDENADORES")){
            informacion[4]="MAC";
            informacion[5]="ACER";
            informacion[6]="YOGA";
            informacion[7]="HP";            
        }
        if(datos.equalsIgnoreCase("MÓVILES Y TELEFONÍA")){
            informacion[8]="IPHONE 12";
            informacion[9]="SAMSUNG GALAXY S20";
            informacion[10]="XIAOMI 11 LITE";          
        }
        if(datos.equalsIgnoreCase("TV AUDIO Y FOTO")){
            informacion[11]="LG UHD TV";
            informacion[12]="JBL HIFI TUNE 510BT";
            informacion[13]="CANON EOS R5 + RF";
          
        }
        if(datos.equalsIgnoreCase("CONSOLAS Y VIDEOJUEGOS")){
            informacion[14]="PS 5";
            informacion[15]="XBOX SERIES S";
            informacion[16]="FIFA 22";
            informacion[17]="GT 7";            
        }
        return informacion;  
    
    }
    
    
     
     
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PRODUCTO");

        jLabel2.setText("CANTIDAD");

        jLabel3.setText("PRECIO");

        jLabel4.setText("IMPORTE");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR CATEGORÍA", "COMPONENTES", "ORDENADORES", "MÓVILES Y TELEFONÍA", "TV AUDIO Y FOTO", "CONSOLAS Y VIDEOJUEGOS" }));
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        jLabel5.setText("CATEGORÍA");

        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        btnAgregar.setText("AÑADIR A CARRITO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("INFORMACION SOBRE EL PRODUCTO");

        lblImporte.setText("0,00 $");

        lblPrecio.setText("0,00 $");
        lblPrecio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblPrecioPropertyChange(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblProductosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jLabel7.setText("IMPORTE TOTAL");

        jLabel8.setText("5 $ gastos de envío");

        jLabel9.setText("SUBTOTAL");

        jLabel10.setText("IVA");

        lblTotal.setText("0.00$");

        lblIva.setText("0.00$");

        lblSubtotal.setText("0.00$");
        lblSubtotal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                lblSubtotalCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(17, 17, 17)
                                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(22, 22, 22)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jLabel10)
                            .addGap(142, 142, 142)
                            .addComponent(lblIva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jLabel7)
                            .addGap(73, 73, 73)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel5))
                                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1)
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addComponent(jLabel3)
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(lblPrecio)))
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(lblSubtotal))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(lblIva))
                    .addGap(4, 4, 4)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel7))
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
       if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cboCategoria.getSelectedIndex()>0){
                this.cboProducto.setModel(new DefaultComboBoxModel(this.datos(this.cboCategoria.getSelectedItem().toString())));
            }
       }
    }//GEN-LAST:event_cboCategoriaItemStateChanged

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
       calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Venta venta = new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setDescripcion(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if(!buscarVenta(venta)){
            listaVentas.add(venta);
        }   
        actualizarTabla();
        borrarVenta();
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lblPrecioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblPrecioPropertyChange
        
    }//GEN-LAST:event_lblPrecioPropertyChange

    private void tblProductosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblProductosAncestorAdded
        actualizarTabla();
        
    }//GEN-LAST:event_tblProductosAncestorAdded

    private void lblSubtotalCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblSubtotalCaretPositionChanged
        double subtotal = 0;
        lblSubtotal.setText(aMoneda(subtotal));
    }//GEN-LAST:event_lblSubtotalCaretPositionChanged

    private void calcularPrecio(){
        precio = precios [cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
    }
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0+" $";
    }
    
    public boolean buscarVenta(Venta nueva){
        for (Venta v : listaVentas){
            if(v.getId()==nueva.getId()){
               int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
               v.setCantidad(nuevaCantidad);
               v.setImporte(v.getPrecio()*nuevaCantidad);
               return true;
            }
        }
        return false;
    }
    
    public void borrarVenta(){
        precio=0;
        cantidad=1;
        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();
    }
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        double subtotal=0;
        for (Venta v : listaVentas){
            Object x[] = new Object[4];
            x[0]=v.getDescripcion();
            x[1]=aMoneda(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=aMoneda(v.getImporte());
            subtotal+=v.getImporte();
            modelo.addRow(x);
        }
        double iva = subtotal*0.21;
        double total = subtotal + iva +5;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        tblProductos.setModel(modelo);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tienda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboProducto;
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
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
