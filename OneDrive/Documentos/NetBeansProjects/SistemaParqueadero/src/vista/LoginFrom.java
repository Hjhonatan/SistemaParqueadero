package vista;

import controlador.UsuarioControlador;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class LoginFrom extends javax.swing.JFrame {

    public LoginFrom() {
        initComponents();
        this.setTitle("Sistema de Parqueadero");
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jButton_acceder = new javax.swing.JButton();
        jPasswordField_contraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Usuario: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextField_usuario.setBackground(new java.awt.Color(153, 255, 255));
        jTextField_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usuarioActionPerformed(evt);
            }
        });
        jTextField_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_usuarioKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, 30));

        jButton_acceder.setText("Iniciar Sesion");
        jButton_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_accederActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jPasswordField_contraseña.setBackground(new java.awt.Color(153, 255, 255));
        jPasswordField_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_contraseñaActionPerformed(evt);
            }
        });
        jPasswordField_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_contraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("BIENVENIDOS AL SISTEMA DE PARQUEADERO J-A ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono.png"))); // NOI18N
        jLabel5.setText("+57 315 894 3628 ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubicacion.png"))); // NOI18N
        jLabel6.setText("Bogotá, Colombia ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estacionamiento.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 240, 190));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Desarrollado por: Jhonatan Rojas, Alejandro Bonillo y Carol Acosta");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 550, 550));

        pack();
    }//GEN-END:initComponents

    private void jTextField_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usuarioActionPerformed

    private void jButton_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_accederActionPerformed
        this.IniciarSesion();
    }//GEN-LAST:event_jButton_accederActionPerformed

    private void jPasswordField_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_contraseñaActionPerformed

    }//GEN-LAST:event_jPasswordField_contraseñaActionPerformed

    private void jTextField_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usuarioKeyPressed
       
         if(evt.getKeyCode()== evt.VK_ENTER){
            jPasswordField_contraseña.requestFocus();
        }
        
    }//GEN-LAST:event_jTextField_usuarioKeyPressed

    private void jPasswordField_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_contraseñaKeyPressed
        
        if(evt.getKeyCode()== evt.VK_ENTER){
           this.IniciarSesion(); 
        }
        
    }//GEN-LAST:event_jPasswordField_contraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_contraseña;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
//metodo para iniciar sesion 
    private void IniciarSesion() {
        if (jTextField_usuario.getText().isEmpty() && jPasswordField_contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su usuario y contraseña");

        } else {
            UsuarioControlador ControlUsuario = new UsuarioControlador();
            Usuario usuario = new Usuario();
            usuario.setUsuario(jTextField_usuario.getText().trim());
            usuario.setContraseña(jPasswordField_contraseña.getText().trim());
            if (ControlUsuario.login(usuario)) {
                System.out.println("Inicio de sesion exitoso");
                //JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
                
                MenuFrom menu = new MenuFrom();
                menu.setVisible(true);
                this.dispose();
                

            } else {
                JOptionPane.showMessageDialog(null, "usuario o conttraseña invalidos");

            }

        }
    }





}
