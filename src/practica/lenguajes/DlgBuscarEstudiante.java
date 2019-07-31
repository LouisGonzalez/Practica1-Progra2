package practica.lenguajes;

import java.io.File;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.manejador.Entrada;
import practica.mensajes.Mensaje3;
import practica.mensajes.Mensaje4;

/**
 *
 * @author luisGonzalez
 */
public class DlgBuscarEstudiante extends javax.swing.JDialog {

    public DlgBuscarEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        carnetEst = new javax.swing.JTextField();
        buscador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel.add(carnetEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 20));

        buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_norm.png"))); // NOI18N
        buscador.setBorder(null);
        buscador.setBorderPainted(false);
        buscador.setContentAreaFilled(false);
        buscador.setFocusPainted(false);
        buscador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_press.png"))); // NOI18N
        buscador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_roll.png"))); // NOI18N
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        panel.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 340, 100));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Carnet Estudiante:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(txt1)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        buscarEstudiante();
    }//GEN-LAST:event_buscadorActionPerformed

    public void buscarEstudiante(){
        String fichero = MenuPrincipal.pathEstudiante+carnetEst.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            new Mensaje4(null, true).setVisible(true);          
           // JOptionPane.showMessageDialog(null, "El estudiante que usted busca no esta inscrito en este sistema");
        } else{
            Entrada<Estudiante> allStudents = new Entrada<>();
            Estudiante aMostrar = allStudents.leerBin(MenuPrincipal.pathEstudiante, carnetEst.getText(), ".dat");
            DlgPrestamoLibros prestamo = new DlgPrestamoLibros(null, true, aMostrar);
            prestamo.setVisible(true);
            this.dispose();
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField carnetEst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
