package practica.lenguajes;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.mensajes.Mensaje1;
import practica.mensajes.Mensaje2;
import practica.mensajes.Mensaje3;

/**
 *
 * @author luisGonzalez
 */
public class DlgNuevoEstudiante extends javax.swing.JDialog {
    
    private ArchivosEstudiantes archivo;
    private Estudiante estudiante;
    
    public DlgNuevoEstudiante(java.awt.Frame parent, boolean modal, ArchivosEstudiantes archivo) {
        super(parent, modal);
        this.archivo = archivo;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstudiante = new javax.swing.JPanel();
        nombreEstudiante = new javax.swing.JLabel();
        carnetEstudiante = new javax.swing.JLabel();
        carreraEstudiante = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        carrera = new javax.swing.JComboBox<>();
        registroDatos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstudiante.setBackground(new java.awt.Color(255, 255, 255));

        nombreEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        nombreEstudiante.setText("Nombre:");

        carnetEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        carnetEstudiante.setText("Carnet:");

        carreraEstudiante.setForeground(new java.awt.Color(0, 0, 102));
        carreraEstudiante.setText("Carrera:");

        carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        registroDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_norm.png"))); // NOI18N
        registroDatos.setBorder(null);
        registroDatos.setBorderPainted(false);
        registroDatos.setContentAreaFilled(false);
        registroDatos.setFocusPainted(false);
        registroDatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_press.png"))); // NOI18N
        registroDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_roll.png"))); // NOI18N
        registroDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstudianteLayout = new javax.swing.GroupLayout(panelEstudiante);
        panelEstudiante.setLayout(panelEstudianteLayout);
        panelEstudianteLayout.setHorizontalGroup(
            panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstudianteLayout.createSequentialGroup()
                        .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carnetEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carreraEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panelEstudianteLayout.setVerticalGroup(
            panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carnetEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carreraEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registroDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(panelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 210));

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));

        txt4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("INGRESO DE DATOS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt4)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDatosActionPerformed
        if(txt1.getText().equals("") && txt2.getText().equals("")){
            new Mensaje1(null, true).setVisible(true);  
            //JOptionPane.showMessageDialog(null, "Debes llenar los parametros para ingresar un nuevo usuario");
        } else if(txt1.getText().equals("") || txt2.getText().equals("")){
            new Mensaje2(null, true).setVisible(true);          
            //JOptionPane.showMessageDialog(null, "Te falta llenar una de las dos casillas");
        } else {   
            if(Integer.parseInt(txt2.getText())<100000000 || Integer.parseInt(txt2.getText())>=1000000000){
                new Mensaje3(null, true).setVisible(true);
                //JOptionPane.showMessageDialog(null, "El numero de carnet del estudiante debe ser un digito de 9 cifras");
            } else {
                try {
                    Estudiante nuevo = new Estudiante(txt1.getText(), Integer.parseInt(txt2.getText()), Integer.parseInt(carrera.getSelectedItem().toString()), 0);
                    archivo.guardarEstudiante(nuevo);       
                    txt1.setText("");
                    txt2.setText("");
                } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha escrito un caracter incorrecto");
                }
            }
        }
    }//GEN-LAST:event_registroDatosActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carnetEstudiante;
    private javax.swing.JComboBox<String> carrera;
    private javax.swing.JLabel carreraEstudiante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreEstudiante;
    private javax.swing.JPanel panelEstudiante;
    private javax.swing.JButton registroDatos;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
