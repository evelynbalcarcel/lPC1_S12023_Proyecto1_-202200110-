/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Objeto.Paneles;
import Objeto.Paneles.PrincipalAdmin;


public class login extends javax.swing.JPanel {

    /**
     * Creates new form login
     */
    private boolean usuarioValido=false;
    public void setUsuariovalido(boolean usuarioValido){
    this.usuarioValido=usuarioValido;
    }
    
    public boolean getUsuarioValido(){
    return usuarioValido;
    }
    
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Plogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Autentificación = new javax.swing.JTextField();
        contrasenaT = new javax.swing.JPasswordField();
        usuarioT = new javax.swing.JTextField();

        Plogin.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Correo electronico:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        Autentificación.setBackground(new java.awt.Color(0, 0, 0));
        Autentificación.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        Autentificación.setForeground(new java.awt.Color(255, 0, 0));
        Autentificación.setText("Autentificación");
        Autentificación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutentificaciónActionPerformed(evt);
            }
        });

        contrasenaT.setBackground(new java.awt.Color(255, 255, 255));
        contrasenaT.setForeground(new java.awt.Color(0, 0, 0));
        contrasenaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTActionPerformed(evt);
            }
        });

        usuarioT.setBackground(new java.awt.Color(255, 255, 255));
        usuarioT.setForeground(new java.awt.Color(0, 0, 0));
        usuarioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PloginLayout = new javax.swing.GroupLayout(Plogin);
        Plogin.setLayout(PloginLayout);
        PloginLayout.setHorizontalGroup(
            PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Autentificación)
            .addGroup(PloginLayout.createSequentialGroup()
                .addGroup(PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PloginLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contrasenaT, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PloginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioT)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PloginLayout.setVerticalGroup(
            PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PloginLayout.createSequentialGroup()
                .addComponent(Autentificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuarioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Plogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Plogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTActionPerformed

    private void usuarioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTActionPerformed

    private void AutentificaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutentificaciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutentificaciónActionPerformed
   PrincipalAdmin principalA=new PrincipalAdmin();
   public String getUsuario(){
   return Autentificación.getText();
   }
   /*
      public String getMensajeDeSesion(){
   return mensajedesesion.getText();}
   */

   
   public String getClave(){
   char [] password= contrasenaT.getPassword();
   return new String(password);
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autentificación;
    private javax.swing.JPanel Plogin;
    private javax.swing.JPasswordField contrasenaT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usuarioT;
    // End of variables declaration//GEN-END:variables
}