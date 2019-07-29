package practica.lenguajes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import practica.clases.Libro;

/**
 *
 * @author luisGonzalez
 */
public class DlgCopias extends javax.swing.JDialog {
    
    Libro aMostrar;
    
    public DlgCopias(java.awt.Frame parent, boolean modal, Libro aMostrar) {
        super(parent, modal);
        initComponents();
        this.aMostrar = aMostrar;
        titulo.setText("Titulo: "+aMostrar.getTitulo());
        codigo.setText("Codigo: "+aMostrar.getCodigo());
        autor.setText("Autor: "+aMostrar.getAutor());
        copias.setText("No. Copias: "+Integer.toString(aMostrar.getCantidad()));
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCopias = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        copiaLibro = new javax.swing.JTextField();
        agregarCopias = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        copias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCopias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setText("Cantidad de copias a ser agregadas:");
        panelCopias.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));
        panelCopias.add(copiaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 30));

        agregarCopias.setText("Confirmar Cambios");
        agregarCopias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCopiasActionPerformed(evt);
            }
        });
        panelCopias.add(agregarCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));
        panelCopias.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 30));
        panelCopias.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));
        panelCopias.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 210, 30));
        panelCopias.add(copias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 210, 30));

        getContentPane().add(panelCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarCopiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCopiasActionPerformed
        try{
        Libro libro = new Libro(aMostrar.getTitulo(), aMostrar.getAutor(), aMostrar.getCodigo(), aMostrar.getCantidad()+Integer.parseInt(copiaLibro.getText()));
        ObjectOutputStream escribirObjeto = new ObjectOutputStream(new 
        FileOutputStream(MenuPrincipal.pathLibro+aMostrar.getCodigo()+".dat"));
        escribirObjeto.writeObject(libro);
        escribirObjeto.close();
        } catch(IOException ioe){            
        }
        copias.setText("No. Copias: "+Integer.toString(aMostrar.getCantidad()+Integer.parseInt(copiaLibro.getText())));
        JOptionPane.showMessageDialog(null, "Las copias han sido agregadas con exito");    
    }//GEN-LAST:event_agregarCopiasActionPerformed
    
    public void cargarDatos(){
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCopias;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField copiaLibro;
    private javax.swing.JLabel copias;
    private javax.swing.JPanel panelCopias;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
