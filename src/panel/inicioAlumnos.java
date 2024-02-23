/*
PANEL PRINCIPAL DONDE SE TIENE QUE ESCANEAR EL CODIGO DE BARRAS DE LAS CREDENCIALES
*/

package panel;
/**
 *
 * @author FLAKABOY
 */
public class inicioAlumnos extends javax.swing.JFrame {
    public inicioAlumnos() {
        initComponents();
        //SE COLOCA EL JFRAME EN EL CENTRO DE LA PANTALLA
        this.setLocationRelativeTo(null);
        
        //Se coloca el PlaceHolder 
       TextPrompt matri = new TextPrompt(" FAVOR DE ESCANEAR SU MATRICULA",txt_matricula);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Clases.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        panelRound1 = new Clases.PanelRound();
        img_code = new javax.swing.JLabel();
        btn_inicioManual = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        cbArea = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
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
        jLabel2.setText("CENTRO DE INFORMACION Y DOCUMENTACION");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 797, 74));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CID");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 40, 100, 74));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESCANEAR CODIGO DE BARRAS");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 230, -1, -1));
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 9, 137, 120));

        txt_matricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txt_matricula.setBorder(null);
        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });
        txt_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_matriculaKeyTyped(evt);
            }
        });
        panelRound2.add(txt_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 580, 50));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        img_code.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barcode.png"))); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(img_code, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(img_code, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 310, 160));

        btn_inicioManual.setText("INICIO MANUAL");
        btn_inicioManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioManualMouseClicked(evt);
            }
        });
        btn_inicioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioManualActionPerformed(evt);
            }
        });
        panelRound2.add(btn_inicioManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 720, 120, 30));

        btn_registro.setText("REGISTRATE");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });
        panelRound2.add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, -1, -1));

        cbArea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA DE CONSULTAS", "CENTRO DE CÓMPUTO", "SALA DE LECTURA", "SALA DE GRUPO", "SALA DE USOS MULTIPLES" }));
        panelRound2.add(cbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 290, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton1.setLabel("REALIZAR REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 240, 80));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 800, 790));

        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        img_back.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });
        jPanel1.add(img_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 210));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jPanel1.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1990, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // TODO add your handling code here:
        Principal pri = new Principal();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void btn_inicioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioManualActionPerformed

    }//GEN-LAST:event_btn_inicioManualActionPerformed

    private void btn_inicioManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioManualMouseClicked
        // REGRESA A LA PANTALLA DE INICIO MANUAL
        inicioManual iniManu = new inicioManual();
        iniManu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicioManualMouseClicked

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        //SE MUESTRA LA PANTALLA DE REGISTRO
        registro regis = new registro();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registroActionPerformed

    private void txt_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matriculaKeyTyped
        char validar = evt.getKeyChar();
        //SE HACE QUE SOLO SE PUEDAN INGRESAR NUMEROS
        if(Character.isLetter(validar)){
           getToolkit().beep();
           evt.consume();
        } 

        //Se limita el ingres de caracteres en este campo
        if(txt_matricula.getText().length() >= 10){
            evt.consume();
        }
        
        if(txt_matricula.getText().length() == 10){
            String mat = txt_matricula.getText();
        }
    }//GEN-LAST:event_txt_matriculaKeyTyped

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se hace la busqueda de los datos y se da de alta el registro en la base de datos
        
        AltasAlumnos alta = new AltasAlumnos();
        alta.altas(txt_matricula.getText(), cbArea.getSelectedItem().toString());
        
         //SE VACIA EL CAMPO DE MATRICULA PARA NUEVO REGISTRO
         txt_matricula.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioAlumnos().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inicioManual;
    private javax.swing.JButton btn_registro;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel img_code;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private Clases.PanelRound panelRound1;
    private Clases.PanelRound panelRound2;
    private javax.swing.JTextField txt_matricula;
    // End of variables declaration//GEN-END:variables

}


