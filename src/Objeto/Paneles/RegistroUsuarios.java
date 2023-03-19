/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Objeto.Paneles;

import Objetos.IngresoUsuarios;
import Objetos.Kioskos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 50232
 */
public class RegistroUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form RegistroUsuarios
     */
    public RegistroUsuarios() {
        initComponents();
        listausuarios.add(new IngresoUsuarios("contra","Nombre","Apellido","contra1","","","","","","",""));
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        correoT = new javax.swing.JTextField();
        apellidoT = new javax.swing.JTextField();
        nombreT = new javax.swing.JTextField();
        nacimientoT = new javax.swing.JTextField();
        sobrenombreT = new javax.swing.JTextField();
        telefonoT = new javax.swing.JTextField();
        generoT = new javax.swing.JComboBox<>();
        rolT = new javax.swing.JComboBox<>();
        nacionalidadT = new javax.swing.JComboBox<>();
        Bagregarusuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dpiT = new javax.swing.JTextField();
        subirFoto = new javax.swing.JLabel();
        subirImagen = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        contrasenaT = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setForeground(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(null);

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Ingrese correo:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Ingrese nombre:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ingrese apellido:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Ingrese Fecha de nacimiento:");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Ingrese Genero:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Ingrese Nacionalidad:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Ingrese Sobrenombre(alias):");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Ingrese Telefono:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Ingrese Rol:");

        correoT.setBackground(new java.awt.Color(255, 255, 255));
        correoT.setForeground(new java.awt.Color(0, 0, 0));

        apellidoT.setBackground(new java.awt.Color(255, 255, 255));
        apellidoT.setForeground(new java.awt.Color(0, 0, 0));

        nombreT.setBackground(new java.awt.Color(255, 255, 255));
        nombreT.setForeground(new java.awt.Color(0, 0, 0));

        nacimientoT.setBackground(new java.awt.Color(255, 255, 255));
        nacimientoT.setForeground(new java.awt.Color(0, 0, 0));

        sobrenombreT.setBackground(new java.awt.Color(255, 255, 255));
        sobrenombreT.setForeground(new java.awt.Color(0, 0, 0));

        telefonoT.setBackground(new java.awt.Color(255, 255, 255));
        telefonoT.setForeground(new java.awt.Color(0, 0, 0));

        generoT.setBackground(new java.awt.Color(255, 255, 255));
        generoT.setForeground(new java.awt.Color(0, 0, 0));
        generoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        rolT.setBackground(new java.awt.Color(255, 255, 255));
        rolT.setForeground(new java.awt.Color(0, 0, 0));
        rolT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));
        rolT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolTItemStateChanged(evt);
            }
        });
        rolT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolTActionPerformed(evt);
            }
        });

        nacionalidadT.setBackground(new java.awt.Color(255, 255, 255));
        nacionalidadT.setEditable(true);
        nacionalidadT.setForeground(new java.awt.Color(0, 0, 0));
        nacionalidadT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "Extanjerio" }));
        nacionalidadT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadTActionPerformed(evt);
            }
        });

        Bagregarusuario.setBackground(new java.awt.Color(255, 255, 153));
        Bagregarusuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Bagregarusuario.setForeground(new java.awt.Color(0, 0, 0));
        Bagregarusuario.setText("Agregar");
        Bagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarusuarioActionPerformed(evt);
            }
        });
        Bagregarusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BagregarusuarioKeyTyped(evt);
            }
        });

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("DPI");

        dpiT.setBackground(new java.awt.Color(255, 255, 255));
        dpiT.setForeground(new java.awt.Color(0, 0, 0));

        subirFoto.setBackground(new java.awt.Color(255, 255, 255));
        subirFoto.setForeground(new java.awt.Color(0, 0, 0));
        subirFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subirFoto.setPreferredSize(new java.awt.Dimension(125, 125));

        subirImagen.setBackground(new java.awt.Color(204, 255, 204));
        subirImagen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subirImagen.setForeground(new java.awt.Color(0, 0, 0));
        subirImagen.setText("Elegir imagen");
        subirImagen.setActionCommand("SubirImagen");
        subirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirImagenActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Ingrese contraseña:");

        contrasenaT.setBackground(new java.awt.Color(255, 255, 255));
        contrasenaT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contrasenaT.setForeground(new java.awt.Color(0, 0, 0));
        contrasenaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dpiT, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correoT, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(subirImagen))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(84, 84, 84)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rolT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(nacionalidadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(generoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(contrasenaT))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nacimientoT, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel3)
                                                        .addComponent(apellidoT)
                                                        .addComponent(telefonoT))))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sobrenombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bagregarusuario))))
                        .addContainerGap(70, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subirImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(subirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(contrasenaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sobrenombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacimientoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpiT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacionalidadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bagregarusuario))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BagregarusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BagregarusuarioKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_BagregarusuarioKeyTyped
String validacion="";
    private void BagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarusuarioActionPerformed
        // TODO add your handling code here:
        validacion=contrasenaT.getText();

        if(correoT.getText().isEmpty()||nombreT.getText().isEmpty()||apellidoT.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Porfavor llene todos los campos");

        }
        //falta agregarle la parte de la contraseña
        else if ((mayusculas(validacion))&&(minusculas(validacion))&&(numeros(validacion))&&(especiales(validacion))){
            //  char [] password= contrasenaT.getPassword();
            //  String contra =new  String(password);
            if (correoT.getText().endsWith("@gmail.com")) {
                //El arraylist listausuarios lo declate dentro de este panel, pero que funciona con la clase de IngresoUsuarios.

                listausuarios.add(new IngresoUsuarios(correoT.getText(),nombreT.getText(),apellidoT.getText(),contrasenaT.getText(),
                    dpiT.getText(),nacimientoT.getText(),generoT.getSelectedItem().toString(),nacionalidadT.getSelectedItem().toString(),
                    sobrenombreT.getText(),telefonoT.getText(),rolT.getSelectedItem().toString()));
            correoT.setText("");
            nombreT.setText("");
            apellidoT.setText("");
            contrasenaT.setText("");
            dpiT.setText("");
            nacimientoT.setText("");
            //genero es un ComboBox
            //nacionalidad es un ComboBox
            sobrenombreT.setText("");
            telefonoT.setText("");

        }else{JOptionPane.showMessageDialog(null,"Debera ingresar un correo el cual termino "
            + "con los siguientes caracteres al final __@gmail.com__");}
    }//GEN-LAST:event_BagregarusuarioActionPerformed
        else{ JOptionPane.showMessageDialog(null, "La contraseña debe tener mayusculas, minusculas, numeros y caracteres especiales");}
    }
    private void nacionalidadTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadTActionPerformed

    private void rolTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolTActionPerformed
        // TODO add your handling code here:
        if(rolT.getSelectedItem().equals("Kiokso")){
       // combok.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Presion de boton ");
        }

    }//GEN-LAST:event_rolTActionPerformed

    private void rolTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolTItemStateChanged
        // TODO add your handling code here:
       if(rolT.getSelectedItem().equals("Kiokso")){
       // combok.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Evento");
        } 
    }//GEN-LAST:event_rolTItemStateChanged

    
    public void fotoPreview(String origen){
        ImageIcon imageIcon = new ImageIcon(origen);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100,100, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        subirFoto.setIcon(scaledImageIcon);
        this.repaint();
    }
    private void subirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirImagenActionPerformed

        subirFoto.setPreferredSize(new Dimension(100, 100));
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File seleccionarArchivo = fileChooser.getSelectedFile();
            rutaFoto = seleccionarArchivo.getAbsolutePath();
            fotoPreview(rutaFoto);
        }
    }//GEN-LAST:event_subirImagenActionPerformed

    private void contrasenaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTActionPerformed

    
     //Metodo para mayusculas
    public static boolean mayusculas(String contra){
     for(int i=0;i<contra.length();i++){
         if(Character.isUpperCase(contra.charAt(i)))
             return true;
     }
     return false;
  }
 //Metodo para minusculas 
    public static boolean minusculas(String contra){
     for(int i=0;i<contra.length();i++){
         if(Character.isLowerCase(contra.charAt(i)))
             return true;
     }
     return false;
  }
 //Metodo para minusculas 
    public static boolean numeros(String contra){
     for(int i=0;i<contra.length();i++){
         if(Character.isDigit(contra.charAt(i)))
             return true;
     }
     return false;
  }
 //Metodo para los caracteres especiales
   public static boolean especiales(String contra){
     return contra.matches(".*[.,()\\[\\]{}!@#$%^&*+=?/<>~|`].*");
  }
 //Metodo para los caracteres especiales
   
    ArrayList  <IngresoUsuarios> datoside =new ArrayList<IngresoUsuarios>();
    
    //este pedazo de abajo no se si realmente lo uso o no 
    public ArrayList<IngresoUsuarios> setlistaide(){
    return datoside;
    }
    
    
     ArrayList  <IngresoUsuarios> listausuarios =new ArrayList<IngresoUsuarios>();
        
    public ArrayList<IngresoUsuarios> getlistausuarios(){
       return listausuarios;
    
    }
     private String rutaFoto;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregarusuario;
    private javax.swing.JTextField apellidoT;
    private javax.swing.JPasswordField contrasenaT;
    private javax.swing.JTextField correoT;
    private javax.swing.JTextField dpiT;
    private javax.swing.JComboBox<String> generoT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nacimientoT;
    private javax.swing.JComboBox<String> nacionalidadT;
    private javax.swing.JTextField nombreT;
    private javax.swing.JComboBox<String> rolT;
    private javax.swing.JTextField sobrenombreT;
    private javax.swing.JLabel subirFoto;
    private javax.swing.JButton subirImagen;
    private javax.swing.JTextField telefonoT;
    // End of variables declaration//GEN-END:variables
}
