package panel;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Image;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author FLAKABOY
 */
public class inicioManual extends javax.swing.JFrame {

     //Conexion con DB
    public static final String URL = "jdbc:mysql://localhost:3306/bibliotech";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("CONEXION EXITOSA");
        } catch (Exception e){
            System.out.println("Error de conexion"+e);
        }
        return con;
    }
    
    
    
    
    
    public inicioManual() {
        initComponents();
         
        this.setLocationRelativeTo(null);
         
        //Se coloca el PlaceHolder 
        TextPrompt matri = new TextPrompt(" Ingrese su Matricula",txt_User);
        TextPrompt nombre = new TextPrompt(" Ingrese su nombre completo",txt_nombre);
        //TextPrompt carrera = new TextPrompt(" Ingrese su carrera",txt_carrera);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Clases.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        btn_Limpiar = new javax.swing.JButton();
        btn_Listo = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        area = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_carrera = new javax.swing.JComboBox<>();
        img_back = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECH");
        setBackground(new java.awt.Color(60, 219, 193));
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(38, 77, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(47, 65, 89));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CENTRO DE INFORMACION Y DOCUMENTACIÓN");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 797, 74));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CID");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 9, 100, 74));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIO DE SESION MANUAL");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 224, -1, -1));
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 9, 131, 117));

        txt_User.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });
        txt_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UserKeyTyped(evt);
            }
        });
        panelRound2.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 308, 600, 47));

        btn_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_Limpiar.setText("Limpiar Campos");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        panelRound2.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 675, 180, 48));

        btn_Listo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_Listo.setText("Listo");
        btn_Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListoActionPerformed(evt);
            }
        });
        panelRound2.add(btn_Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 675, 105, 48));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        panelRound2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 387, 600, 47));

        area.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA DE CONSULTAS", "CENTRO DE CÓMPUTO", "SALA DE LECTURA", "SALA DE GRUPO", "SALA DE USOS MULTIPLES" }));
        panelRound2.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 590, 300, 37));

        btn_buscar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        panelRound2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 308, 129, 47));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ZONA A VISITAR");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 558, 170, -1));

        cb_carrera.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INGENIERÍA EN TECNOLOGÍAS DE LA INFORMACIÓN", "INGENIERÍA EN BIOTECNOLOGÍA", "INGENIERÍA MECATRÓNICA", "INGENIERÍA EN ENERGÍA", "INGENIERÍA EN LOGÍSTICA Y TRANSPORTE", "LICENCIATURA EN TERAPIA FÍSICA", "INGENIERÍA EN TECNOLOGÍA AMBIENTAL", "INGENIERÍA BIOMÉDICA", "INGENIERÍA EN ANIMACIÓN Y EFECTOS VISUALES", "INGENIERÍA EN NANOTECNOLOGÍA", "LICENCIATURA EN ADMINISTRACIÓN Y GESTIÓN EMPRESARIAL", "VISITANTE", "PERSONAL ADMINISTRATIVO" }));
        panelRound2.add(cb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 590, -1));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 800, 740));

        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });
        jPanel1.add(img_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, -1));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jPanel1.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1930, 1170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_UserActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // LIMPIAR CAMPOS DEL REGISTRO
        txt_User.setText("");
        //txt_carrera.setText("");
        txt_nombre.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListoActionPerformed
        AltaManual alt = new AltaManual();
        alt.manual(txt_User.getText() , txt_nombre.getText(), URL, URL);//TERMINAR DE PASAR LOS PARAMETROS PARA LA CLASE DE AltaManual
    }//GEN-LAST:event_btn_ListoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        //Accion para el boton buscar
        Connection con = null;
        
        //EN CASO DE QUE EL CASO DE MATRICULA ESTE VACIO
        if(txt_User.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR SU MATRICULA PARA AUTOCOMPLETAR LOS CAMPOS");
            return; //EN CASO DE QUE NO INGRESE DATOS SE TERMINAN LAS ACCIONES
        }
        
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM alumnos WHERE matricula = ?");
            ps.setString(1, txt_User.getText());
            
            rs =  ps.executeQuery();
           
           if(rs.next()){
               txt_User.setText(rs.getString("matricula"));
               txt_nombre.setText(rs.getString("nombre"));
           }
           else{
               JOptionPane.showMessageDialog(null, "NO EXISTE PERSONA CON ESA MATRICULA REGISTRADA");
           }
              
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // BOTON PARA REGRESAR
        inicioAlumnos ini = new inicioAlumnos();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void txt_UserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UserKeyTyped
        
        char validar = evt.getKeyChar();
        //SE HACE QUE SOLO SE PUEDAN INGRESAR NUMEROS
        if(Character.isLetter(validar)){
           getToolkit().beep();
           evt.consume();
        }
        //SE LIMITA LOS CARACTERS A INGRESAR
        if(txt_User.getText().length() >= 10){
            evt.consume();
        }
        
        if(txt_User.getText().length() == 10){
            String mat = txt_User.getText();
        }
    }//GEN-LAST:event_txt_UserKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        // SE HACE QUE SOLO SE PUEDA INGRESAR TEXTO
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

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
            java.util.logging.Logger.getLogger(inicioManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioManual().setVisible(true);
            }
        });
    }
    
    //Ajusta las imagenes al tamaño de los Jlabels
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> area;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Listo;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cb_carrera;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private Clases.PanelRound panelRound2;
    private javax.swing.JTextField txt_User;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

}


