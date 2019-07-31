package practica.lenguajes;
import java.io.*;
import javax.swing.JLabel;
import practica.clases.Libro;
import practica.manejador.Entrada;
import practica.mensajes.Mensaje5;

/**
 *
 * @author luisGonzalez
 */
public class DlgNuevaCopiaLibros extends javax.swing.JDialog {
    
    ArchivosLibros archivo;
    
    public DlgNuevaCopiaLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        claveLibro = new javax.swing.JTextField();
        buscador = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(claveLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 20));

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
        jPanel1.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 90));

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Escriba el codigo del libro a buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        buscarLibro();
        
    }//GEN-LAST:event_buscadorActionPerformed

    public void buscarLibro(){
        String fichero = MenuPrincipal.pathLibro+claveLibro.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            new Mensaje5(null, true).setVisible(true);          
            //JOptionPane.showMessageDialog(null, "No existe este libro en la base de datos del sistema");
        } else {
            Entrada<Libro> allBooks = new Entrada<>();
            Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, claveLibro.getText(), ".dat");            
            this.dispose();
            DlgCopias nuevo = new DlgCopias(null, true, aMostrar);
            nuevo.setVisible(true);
        }            
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField claveLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
