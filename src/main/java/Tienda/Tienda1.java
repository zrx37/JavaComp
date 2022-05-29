
package Tienda;

import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class Tienda1 extends javax.swing.JFrame {

    int cantidad = 0;
    double precio = 0;
    double precios[]={0.84,3.45,1.45,1.85,410.41,369.00,379.00,679.00,510.00,385.00,283.99,357.00,34.46,1928.00,829.00,275.00,53.99,62.99};
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    DefaultTableModel modelo=new DefaultTableModel();  
  
    public Tienda1() {
        initComponents();
        this.setTitle("TIENDA");
        //Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/nombredelaimagen.png"));
        //this.setIconImage(icono);
        
        //Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/nombredelaimagen.png"));
        //this.setLocationRelativeTo(null);
        //labelLogo.setIcon(new ImageIcon(icono.getScaledInstance(labelLogo.getWidth(), labeLogo.getHeight(), image.SCALE_SMOOTH)));
        //this.setSize(700, 800);  
        modelo.addColumn("CARACTERÍSTICAS");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");    
        actualizarTabla();
        
        calcularPrecio();
          
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 130, 80));

        jLabel1.setText("PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setText("CANTIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setText("IMPORTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

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
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, 40));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 25, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel5.setText("CATEGORÍA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 30));

        btnAgregar.setText("AÑADIR A CARRITO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 150, 120));

        jLabel6.setText("INFORMACION SOBRE EL PRODUCTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        lblImporte.setText("0,00 $");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 20));

        lblPrecio.setText("0,00 $");
        lblPrecio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblPrecioPropertyChange(evt);
            }
        });
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 274, 150, -1));

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
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabel7.setText("IMPORTE TOTAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        jLabel8.setText("5 $ gastos de envío");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jLabel9.setText("SUBTOTAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 100, -1));

        jLabel10.setText("IVA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        lblTotal.setText("0.00$");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 516, 80, 20));

        lblIva.setText("0.00$");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 60, -1));

        lblSubtotal.setText("0.00$");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
      calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
            if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cboCategoria.getSelectedIndex()>0){
                this.cboProducto.setModel(new DefaultComboBoxModel(this.datos(this.cboCategoria.getSelectedItem().toString())));
            }
            
            
        }
    }//GEN-LAST:event_cboCategoriaItemStateChanged

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void lblPrecioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblPrecioPropertyChange
        calcularPrecio();
            
    }//GEN-LAST:event_lblPrecioPropertyChange

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
        listaVentas.add(venta);
        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
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
    
    public void calcularPrecio(){
        precio = precios [cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
    }
    
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0+" $";
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
        

    

