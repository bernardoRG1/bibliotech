package panel;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static panel.vistaAdmin.getConnection;



/**
 *
 * @author FLAKABOY
 */
public class vistaAdmin extends javax.swing.JFrame {
    
    
      //Conexion con DB
    public static final String URL = "jdbc:mysql://localhost:3306/bibliotech";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    static Connection con = null;
    
    
    public static Connection getConnection(){
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("CONEXION EXITOSA");
        } catch (Exception e){
            System.out.println("Error de conexion"+e);
        }
        return con;
    }//Fin de la conexion
    

    
    public vistaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //Se coloca el PlaceHolder 
       TextPrompt matri = new TextPrompt(" INGRESAR MATRÍCULA",txt_matricula);
    }
    
    //MOSTRAR DATOS DE LA TABLA
    public void mostrar (String tabla){
        String fecha, matricula, fechafin, zona, carrera;
        int num = 1;
        Connection con = null;
        String sql = "SELECT * FROM " + tabla;
        Statement st;
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        
        //SE COLOCA EL NOMBRE A LOS CAMPOS A MOSTRAR EN LA TABLA
        model.addColumn("LISTADO");
        model.addColumn("MATRÍCULA");
        model.addColumn("NOMBRE");
        model.addColumn("CARRERA");
        model.addColumn("ZONA");
        model.addColumn("FECHA");
        model.addColumn("HORA DE ENTRADA");
        visor.setModel(model);
        
        
        String [] datos = new String[7];
        try{
            con = getConnection();
            st = con.createStatement();
            
            
            //--CONVERTIMOS LOS CAMPOS EN VARIABLES STRING PARA QUE SEA MAS FACIL HACER LA CONSULTA SQL--\\
            matricula = txt_matricula.getText();
            carrera = cb_carrera.getSelectedItem().toString();
            zona = cbArea.getSelectedItem().toString();
            fecha = ((JTextField)jd_fecha.getDateEditor().getUiComponent()).getText();
            fechafin = ((JTextField)jd_fechafin.getDateEditor().getUiComponent()).getText();
            
            //CONSULTA DE DATOS DEPENDIENDO DE QUE CAMPOS CONTENGA MENDIANTE EL EMTODO DE CONSULTA
            MostrarTabla most = new MostrarTabla();
            sql = most.consulta(sql, matricula, zona, fecha, fechafin, carrera);
            
            //impresion del comando sql
            System.out.println(sql);
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                /*SE COLOCA POR QUE SE ESTA CONSULTANDO UN ARREGLO DE DATOS
                EL NUMERO DE LA IZQUIERDA INDICA LA POSICIÓN DEL DATO EN LA TABLA*/
                datos[0] = Integer.toString(num);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                model.addRow(datos);
                num++;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR INTENTELO NUEVAMENTE");
            System.err.println(e);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_back = new javax.swing.JLabel();
        panelRound2 = new Clases.PanelRound();
        txt_inicio = new javax.swing.JLabel();
        txt_inicio1 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        label_matricula = new javax.swing.JLabel();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        cbArea = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jd_fechafin = new com.toedter.calendar.JDateChooser();
        btn_export = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_carrera = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECH");
        setBackground(new java.awt.Color(60, 219, 193));
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(38, 77, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });
        jPanel1.add(img_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 200));

        panelRound2.setBackground(new java.awt.Color(47, 65, 89));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_inicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        txt_inicio.setForeground(new java.awt.Color(255, 255, 255));
        txt_inicio.setText("FIN");
        panelRound2.add(txt_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 40, 40));

        txt_inicio1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        txt_inicio1.setForeground(new java.awt.Color(255, 255, 255));
        txt_inicio1.setText("INICIO");
        panelRound2.add(txt_inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, 70, 40));

        txt_matricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
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
        panelRound2.add(txt_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 250, 40));

        label_matricula.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label_matricula.setForeground(new java.awt.Color(255, 255, 255));
        label_matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta-de-identificacion.png"))); // NOI18N
        label_matricula.setText("MATRÍCULA");
        panelRound2.add(label_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 40));

        jd_fecha.setDateFormatString("yyyy/MM/dd\n");
        jd_fecha.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        panelRound2.add(jd_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 190, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marcador-de-posicion.png"))); // NOI18N
        jLabel3.setText("ZONA");
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 110, 40));

        visor.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        visor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(visor);

        panelRound2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 1370, 450));

        cbArea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SALA DE CONSULTAS", "CENTRO DE CÓMPUTO", "SALA DE LECTURA", "SALA DE GRUPO", "SALA DE USOS MULTIPLES" }));
        panelRound2.add(cbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 300, -1));

        btn_buscar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        panelRound2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 160, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        jLabel4.setText("RANGO DE FECHA");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 220, 40));

        jd_fechafin.setDateFormatString("yyyy/MM/dd");
        jd_fechafin.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        panelRound2.add(jd_fechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 190, 40));

        btn_export.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        btn_export.setText("EXPORTAR A EXCEL");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });
        panelRound2.add(btn_export, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 280, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/graduado.png"))); // NOI18N
        jLabel2.setText("CARRERA");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        cb_carrera.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "INGENIERÍA EN TECNOLOGÍAS DE LA INFORMACIÓN", "INGENIERÍA EN BIOTECNOLOGÍA", "INGENIERÍA MECATRÓNICA", "INGENIERÍA EN ENERGÍA", "INGENIERÍA EN LOGÍSTICA Y TRANSPORTE", "LICENCIATURA EN TERAPIA FÍSICA", "INGENIERÍA EN TECNOLOGÍA AMBIENTAL", "INGENIERÍA BIOMÉDICA", "INGENIERÍA EN ANIMACIÓN Y EFECTOS VISUALES", "INGENIERÍA EN NANOTECNOLOGÍA", "LICENCIATURA EN ADMINISTRACIÓN Y GESTIÓN EMPRESARIAL", "VISITANTE", "PERSONAL ADMINISTRATIVO" }));
        panelRound2.add(cb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 570, 40));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 1420, 790));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2280, 1080));

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

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // TODO add your handling code here:
        Principal pri = new Principal();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed

    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        mostrar("registros");
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        //SE CONVIERTE EL JTABLE DE LA CONSULTA A UN ARCHIVO DE EXCEL
        if (visor.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List tb = new ArrayList();
                List nom = new ArrayList();
                tb.add(visor);
                nom.add("Registro");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    panel.Exporter e = new Exporter(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos para exportar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
 }


    }//GEN-LAST:event_btn_exportActionPerformed

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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAdmin().setVisible(true);
                
            }
        });
        
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_export;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cb_carrera;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_fecha;
    private com.toedter.calendar.JDateChooser jd_fechafin;
    private javax.swing.JLabel label_matricula;
    private Clases.PanelRound panelRound2;
    private javax.swing.JLabel txt_inicio;
    private javax.swing.JLabel txt_inicio1;
    private javax.swing.JTextField txt_matricula;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

}


