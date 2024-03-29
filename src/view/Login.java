/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;

/**
 *
 * @author davidpuchana
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
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

        jPanel_container = new javax.swing.JPanel();
        jL_logoDerecha = new javax.swing.JLabel();
        jL_password = new javax.swing.JLabel();
        jL_iniciarSesion = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jL_logo = new javax.swing.JLabel();
        jL_user = new javax.swing.JLabel();
        jPanel_inicio = new javax.swing.JPanel();
        jL_inicio = new javax.swing.JLabel();
        jPanel_topBar = new javax.swing.JPanel();
        jL_exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel_container.setBackground(new java.awt.Color(233, 226, 208));
        jPanel_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_logoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_img.jpg"))); // NOI18N
        jL_logoDerecha.setText("jLabel1");
        jPanel_container.add(jL_logoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 390, 550));

        jL_password.setFont(new java.awt.Font("Forum", 1, 24)); // NOI18N
        jL_password.setForeground(new java.awt.Color(110, 87, 115));
        jL_password.setText("CONTRASEÑA");
        jL_password.setToolTipText("");
        jPanel_container.add(jL_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 150, -1));

        jL_iniciarSesion.setFont(new java.awt.Font("Forum", 1, 24)); // NOI18N
        jL_iniciarSesion.setForeground(new java.awt.Color(110, 87, 115));
        jL_iniciarSesion.setText("INICIAR SESIÓN");
        jPanel_container.add(jL_iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));

        jTextField_user.setBackground(new java.awt.Color(233, 226, 208));
        jTextField_user.setFont(new java.awt.Font("Roboto Condensed Light", 0, 15)); // NOI18N
        jTextField_user.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_user.setText("Ingrese su usuario (email)");
        jTextField_user.setBorder(null);
        jTextField_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_userMousePressed(evt);
            }
        });
        jTextField_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_userActionPerformed(evt);
            }
        });
        jPanel_container.add(jTextField_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 30));

        jPasswordField_password.setBackground(new java.awt.Color(233, 226, 208));
        jPasswordField_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_password.setText("********");
        jPasswordField_password.setBorder(null);
        jPasswordField_password.setCaretColor(new java.awt.Color(102, 102, 102));
        jPasswordField_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField_passwordMousePressed(evt);
            }
        });
        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });
        jPanel_container.add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_container.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 260, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_container.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 260, 10));

        jL_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_img.png"))); // NOI18N
        jPanel_container.add(jL_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jL_user.setFont(new java.awt.Font("Forum", 1, 24)); // NOI18N
        jL_user.setForeground(new java.awt.Color(110, 87, 115));
        jL_user.setText("USUARIO");
        jPanel_container.add(jL_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, -1));

        jPanel_inicio.setBackground(new java.awt.Color(212, 93, 121));
        jPanel_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_inicioMouseExited(evt);
            }
        });

        jL_inicio.setBackground(new java.awt.Color(233, 226, 208));
        jL_inicio.setFont(new java.awt.Font("Forum", 1, 24)); // NOI18N
        jL_inicio.setForeground(new java.awt.Color(233, 226, 208));
        jL_inicio.setText("INICIO");

        javax.swing.GroupLayout jPanel_inicioLayout = new javax.swing.GroupLayout(jPanel_inicio);
        jPanel_inicio.setLayout(jPanel_inicioLayout);
        jPanel_inicioLayout.setHorizontalGroup(
            jPanel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inicioLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jL_inicio)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel_inicioLayout.setVerticalGroup(
            jPanel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_inicio)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel_container.add(jPanel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 170, 40));

        jPanel_topBar.setBackground(new java.awt.Color(233, 226, 208));
        jPanel_topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_topBarMouseDragged(evt);
            }
        });
        jPanel_topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_topBarMousePressed(evt);
            }
        });

        jL_exit.setBackground(new java.awt.Color(233, 226, 208));
        jL_exit.setFont(new java.awt.Font("Forum", 1, 28)); // NOI18N
        jL_exit.setForeground(new java.awt.Color(110, 87, 115));
        jL_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_exit.setText("X");
        jL_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_exit.setOpaque(true);
        jL_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jL_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_topBarLayout = new javax.swing.GroupLayout(jPanel_topBar);
        jPanel_topBar.setLayout(jPanel_topBarLayout);
        jPanel_topBarLayout.setHorizontalGroup(
            jPanel_topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_topBarLayout.createSequentialGroup()
                .addComponent(jL_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 804, Short.MAX_VALUE))
        );
        jPanel_topBarLayout.setVerticalGroup(
            jPanel_topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_container.add(jPanel_topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_userActionPerformed

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void jPanel_topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_topBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_topBarMousePressed

    private void jPanel_topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_topBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);                
    }//GEN-LAST:event_jPanel_topBarMouseDragged

    private void jL_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jL_exitMouseClicked

    private void jL_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseEntered
        jL_exit.setBackground(new Color(212,93,121));
    }//GEN-LAST:event_jL_exitMouseEntered

    private void jL_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseExited
        jL_exit.setBackground(new Color(233,226,208));
    }//GEN-LAST:event_jL_exitMouseExited

    private void jPanel_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_inicioMouseEntered
        jPanel_inicio.setBackground(new Color(234,144,133));                
    }//GEN-LAST:event_jPanel_inicioMouseEntered

    private void jPanel_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_inicioMouseExited
        jPanel_inicio.setBackground(new Color(212,93,121));                
    }//GEN-LAST:event_jPanel_inicioMouseExited

    private void jTextField_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_userMousePressed
        if(jTextField_user.getText().equals("Ingrese su usuario (email)")){
            jTextField_user.setText("");
            jTextField_user.setForeground(new Color(110,87,115));
        }
        if(String.valueOf(jPasswordField_password.getPassword()).isEmpty()){
            jPasswordField_password.setText("********");    
            jPasswordField_password.setForeground(new Color(102,102,102));
        }
                        
    }//GEN-LAST:event_jTextField_userMousePressed

    private void jPasswordField_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_passwordMousePressed
        if(String.valueOf(jPasswordField_password.getPassword()).equals("********")){
            jPasswordField_password.setText("");        
            jPasswordField_password.setForeground(new Color(110,87,115));
        }
        
        if(jTextField_user.getText().isEmpty()){
            jTextField_user.setText("Ingrese su usuario (email)");
            jTextField_user.setForeground(new Color(102,102,102));
        }        
    }//GEN-LAST:event_jPasswordField_passwordMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_exit;
    private javax.swing.JLabel jL_iniciarSesion;
    private javax.swing.JLabel jL_inicio;
    private javax.swing.JLabel jL_logo;
    private javax.swing.JLabel jL_logoDerecha;
    private javax.swing.JLabel jL_password;
    private javax.swing.JLabel jL_user;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_inicio;
    private javax.swing.JPanel jPanel_topBar;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
