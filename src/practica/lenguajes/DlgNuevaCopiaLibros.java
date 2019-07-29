package practica.lenguajes;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica.clases.Libro;
import practica.manejador.Entrada;
import practica.manejador.Salida;

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
        jLabel1 = new javax.swing.JLabel();
        claveLibro = new javax.swing.JTextField();
        buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Escriba el codigo del libro a buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 30));
        jPanel1.add(claveLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 130, 30));

        buscador.setText("Buscar");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        jPanel1.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 90, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        buscarLibro();
        
    }//GEN-LAST:event_buscadorActionPerformed

    public void buscarLibro(){
        String fichero = MenuPrincipal.pathLibro+claveLibro.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "No existe este libro en la base de datos del sistema");
        } else {
            Entrada<Libro> allBooks = new Entrada<>();
            Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, claveLibro.getText(), ".dat");           
            JOptionPane.showMessageDialog(null, "El libro ha sido encontrado con exito");
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
    // End of variables declaration//GEN-END:variables
}
