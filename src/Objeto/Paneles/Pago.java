/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Objeto.Paneles;

import Objetos.Tarjeta;
import Objeto.VentanaPrincipal.VentanaPrincipal;
import Objetos.datoFactura;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author 50232
 */
public class Pago extends javax.swing.JPanel {

    /**
     * Creates new form Pago
     */
    public Pago() {
        initComponents();
        ComboTarjeta.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        checkCobro = new javax.swing.JCheckBox();
        checkTarjeta = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ComboTarjeta = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFact = new javax.swing.JTable();
        totalFacturar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaD2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Pago");

        checkCobro.setBackground(new java.awt.Color(255, 255, 255));
        checkCobro.setForeground(new java.awt.Color(0, 0, 0));
        checkCobro.setText("Cobro contra entrega");

        checkTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        checkTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        checkTarjeta.setText("Cobro a mi cuenta ");
        checkTarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkTarjetaItemStateChanged(evt);
            }
        });
        checkTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkTarjetaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkTarjetaMouseExited(evt);
            }
        });
        checkTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTarjetaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de facturacion");

        ComboTarjeta.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ComboTarjetaComponentAdded(evt);
            }
        });
        ComboTarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTarjetaItemStateChanged(evt);
            }
        });
        ComboTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboTarjetaMouseClicked(evt);
            }
        });
        ComboTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTarjetaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Confirmar Tipo de pago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(tablaFact);

        totalFacturar.setForeground(new java.awt.Color(0, 0, 0));
        totalFacturar.setText("//////////////////////////////");

        tablaD2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(tablaD2);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Aumento por tipo de pago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboTarjeta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkCobro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(totalFacturar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(checkTarjeta)
                        .addGap(19, 19, 19)
                        .addComponent(checkCobro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalFacturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents
String TotalFacturaFinal="";
String Tipodpago="";

    public String getTipodpago() {
        return Tipodpago;
    }

    public void setTipodpago(String Tipodpago) {
        this.Tipodpago = Tipodpago;
    }


    public String getTotalFacturaFinal() {
        return TotalFacturaFinal;
    }

    public void setTotalFacturaFinal(String TotalFacturaFinal) {
        this.TotalFacturaFinal = TotalFacturaFinal;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if(!checkCobro.isSelected()&&!checkTarjeta.isSelected()){
         JOptionPane.showMessageDialog(null, "Elija un metodo de pago");
         ComboTarjeta.setEnabled(false);
     }
        else if (checkCobro.isSelected()&&checkTarjeta.isSelected()) {
      // Ejecutar la orden si el JCheckBox está seleccionado
      JOptionPane.showMessageDialog(null, "Solo puede elegir una opcion");
     
    } 
     else if (checkCobro.isSelected()) {
      // Ejecutar la orden si el JCheckBox está seleccionado
      JOptionPane.showMessageDialog(null, "Usted eligio Pago contra Entrega, el cual tiene un recargo de Q5.00");
      Tipodpago="Pago contra Entrega";
      
      regreso=Cot.operacion+5.0;
      
      totalFacturar.setText(Double.toString(regreso));

      ComboTarjeta.setEnabled(false);
    } 
    else if(checkTarjeta.isSelected()){
      // Mostrar un mensaje si el JCheckBox no está seleccionado
      JOptionPane.showMessageDialog(null, "Su pago sera con la Tajeta, porfavor eliga ");
      ComboTarjeta.setEnabled(true);
      
      
      regreso=Cot.getOperacion();
  
      totalFacturar.setText(Double.toString(regreso));

      Tipodpago="Pago con Tarjeta";
    }
  
       
    }//GEN-LAST:event_jButton2ActionPerformed
  double regreso=0;
    double convert=0;
    public double getRegreso() {
        return regreso;
    }

    public void setRegreso(double regreso) {
        this.regreso = regreso;
    }
    
    double temporalTo=0;
   public void setlistTarjeta(ArrayList <Tarjeta> listaProductos){
        this.listaTarjeta=listaProductos;
    }

   
    ArrayList<Tarjeta> listaTarjeta=new ArrayList();
   
    
    private void ComboTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTarjetaActionPerformed
        // TODO add your handling code here: 
        
        String obtenernumero = null;
        //obtenernumero = MandarDatosListaDesplegable();
        String numeroculto="XXXX-XXXX-XXXX-"+obtenernumero.substring(12);
        ComboTarjeta.addItem(numeroculto);
           
    }//GEN-LAST:event_ComboTarjetaActionPerformed

 

    public JLabel getLabelTotal() {
        return totalFacturar;
    }

    public void setLabelTotal(JLabel labelTotal) {
        this.totalFacturar = labelTotal;
    }
    
    
    
   public void MandarDatosListaDesplegable(){
      // String numeroT="";
        ComboTarjeta.removeAllItems();
        for(int i=0; i<listaTarjeta.size();i++){
           //RegistoTarjeta temporal = new RegistoTarjeta();
            //textoProductos = textoProductos+"Producto: "+temporal.getNombre()+" -> Precio: "+temporal.getPrecio()+'\n';
           // numeroT=listaTarjeta.get(i).getNumeroTarjeta();
           String temporal=listaTarjeta.get(i).getNumeroTarjeta();
           String numero="XXXX-XXXX-XXXX-"+temporal.substring(12);
           ComboTarjeta.addItem(numero);
                        
            //System.out.println("Producto: "+temporal.getNombre()+" -> Precio: "+temporal.getPrecio());
        }   
    }

  
   
   
   /*
   tablaFact
   JTable tabla = new JTable(); // Crear una nueva tabla
DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); // Obtener el modelo de la tabla

// Cambiar el nombre de la primera columna a "Nombre"
TableColumn columna1 = tabla.getColumnModel().getColumn(0);
columna1.setHeaderValue("Nombre");

// Cambiar el nombre de la segunda columna a "Edad"
TableColumn columna2 = tabla.getColumnModel().getColumn(1);
columna2.setHeaderValue("Edad");

// Actualizar la vista de la tabla
tabla.getTableHeader().repaint();
   */
        
    private void ComboTarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTarjetaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTarjetaItemStateChanged

    private void ComboTarjetaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ComboTarjetaComponentAdded

    }//GEN-LAST:event_ComboTarjetaComponentAdded

    private void checkTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTarjetaActionPerformed
    
    }//GEN-LAST:event_checkTarjetaActionPerformed

    private void ComboTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboTarjetaMouseClicked
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_ComboTarjetaMouseClicked

    private void checkTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkTarjetaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkTarjetaMouseClicked
    
    /*
    checkBox.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.DESELECTED) {
            // Ejecuta la acción deseada si el JCheckBox ha sido deseleccionado
            // ...
        }
    }
}
    */
    
    private void checkTarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkTarjetaMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkTarjetaMouseExited

    private void checkTarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTarjetaItemStateChanged
        // TODO add your handling code here:  
    }//GEN-LAST:event_checkTarjetaItemStateChanged
double verdaderoTotal=0;

    public double getVerdaderoTotal() {
        return verdaderoTotal;
    }

    public void setVerdaderoTotal(double verdaderoTotal) {
        this.verdaderoTotal = verdaderoTotal;
    }
String cadena22="";

    public String getCadena() {
        return cadena22;
    }
    public void setCadena(String cadena) {
        this.cadena22 = cadena;
    }
                                         
 public static String generarCadena() {
        String primerosCinco = "IPC1C";
        String ultimosCinco = generarCadenaAleatoria(5);
        return primerosCinco + ultimosCinco;
    }
    
    public static String generarCadenaAleatoria(int longitud) {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int indice = rnd.nextInt(caracteresPermitidos.length());
            sb.append(caracteresPermitidos.charAt(indice));
            caracteresPermitidos = caracteresPermitidos.substring(0, indice) + caracteresPermitidos.substring(indice + 1);
        }
        return sb.toString();
    }

    
// datoFactura df=new datoFactura();
    Cotizacion Cot=new Cotizacion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboTarjeta;
    private javax.swing.JCheckBox checkCobro;
    private javax.swing.JCheckBox checkTarjeta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTable tablaD2;
    public javax.swing.JTable tablaFact;
    private javax.swing.JLabel totalFacturar;
    // End of variables declaration//GEN-END:variables

    public class totalFacturar {

        public static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public totalFacturar() {
        }
    }
}
