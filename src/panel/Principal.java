/*
 * PANEL PRINCIPAL DEL PROGRAMA
 */

package panel;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author flaka
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //Transparencia de botones (NO BORRAR)
        trasparenciaButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_Portada = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();
        btn_alumnos = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECH");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(38, 77, 120));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Portada.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        label_Portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jPanel1.add(label_Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 1920, 975));

        btn_admin.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btn_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        btn_admin.setText("ADMINISTRADORES");
        btn_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminMouseClicked(evt);
            }
        });
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, -1, -1));

        btn_alumnos.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btn_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        btn_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Student.png"))); // NOI18N
        btn_alumnos.setText("ALUMNOS");
        btn_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alumnosMouseClicked(evt);
            }
        });
        btn_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumnosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, -1));

        btn_inicio.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setText("INICIO");
        jPanel1.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 36, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CID");
        jLabel1.setToolTipText("");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseClicked
        // TODO add your handling code here:
        main fra = new main();
        fra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_adminMouseClicked

    private void btn_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alumnosMouseClicked
        // TODO add your handling code here:
        inicioAlumnos ini = new inicioAlumnos();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_alumnosMouseClicked

    private void btn_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alumnosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    //Adapta la imagen al tamaño del jlabel
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
        //Le da transparencia a los botones
    public void trasparenciaButton(){
        btn_admin.setOpaque(false);
        btn_admin.setContentAreaFilled(false);
        btn_admin.setBorderPainted(false);
        btn_alumnos.setOpaque(false);
        btn_alumnos.setContentAreaFilled(false);
        btn_alumnos.setBorderPainted(false);
        btn_inicio.setOpaque(false);
        btn_inicio.setContentAreaFilled(false);
        btn_inicio.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_alumnos;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Portada;
    // End of variables declaration//GEN-END:variables

}
