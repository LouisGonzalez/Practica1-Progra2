package practica.lenguajes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica.clases.Libro;

/**
 *
 * @author luisGonzalez
 */
public class DlgCrearLibro extends javax.swing.JDialog {
    
    private ArchivosLibros archivo;
    private String codigo[] = new String[6];
    private JLabel txt5;
    private ListaLibros<Libro> misLibros;
    
    public DlgCrearLibro(java.awt.Frame parent, boolean modal, ArchivosLibros archivo, JLabel txt5, ListaLibros<Libro> misLibros) {
        super(parent, modal);
        this.archivo = archivo;
        this.misLibros = misLibros;
        this.txt5 = txt5;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLibro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        autorLibro = new javax.swing.JLabel();
        codigoLibro = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        a1 = new javax.swing.JComboBox<>();
        a2 = new javax.swing.JComboBox<>();
        a3 = new javax.swing.JComboBox<>();
        a4 = new javax.swing.JComboBox<>();
        a5 = new javax.swing.JComboBox<>();
        a6 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        copiasTotales = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Titulo:");
        panelLibro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 20));

        autorLibro.setText("Autor:");
        panelLibro.add(autorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 20));

        codigoLibro.setText("Codigo:");
        panelLibro.add(codigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 20));
        panelLibro.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 270, -1));
        panelLibro.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 270, -1));

        a1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        panelLibro.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, -1));

        a2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        panelLibro.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 40, -1));

        a3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        panelLibro.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, -1));

        a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        panelLibro.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 40, -1));

        a5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        panelLibro.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 40, -1));

        a6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        panelLibro.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelLibro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, 30));

        copiasTotales.setText("Copias:");
        panelLibro.add(copiasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));
        panelLibro.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, -1));

        getContentPane().add(panelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
      
    }//GEN-LAST:event_a5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        codigo[0] = a1.getSelectedItem().toString();
        codigo[1] = a2.getSelectedItem().toString();
        codigo[2] = a3.getSelectedItem().toString();
        codigo[3] = a4.getSelectedItem().toString();
        codigo[4] = a5.getSelectedItem().toString();
        codigo[5] = a6.getSelectedItem().toString();
        txt5.setText(codigo[0]+codigo[1]+codigo[2]+"-"+codigo[3]+codigo[4]+codigo[5]); 
        try{          
            if(Integer.parseInt(txt3.getText())==0 || txt3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No se puede agregar un libro si no hay ninguna copia de el");
            } else {                 
                Libro libros = new Libro(txt1.getText(), txt2.getText(), codigo[0]+codigo[1]+codigo[2]+"-"+codigo[3]+codigo[4]+codigo[5], Integer.parseInt(txt3.getText()));
                archivo.guardarLibro(libros, misLibros);
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");       
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha escrito un caracter incorrecto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JLabel getTxt5() {
        return txt5;
    }

    public void setTxt5(JLabel txt5) {
        this.txt5 = txt5;
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a1;
    private javax.swing.JComboBox<String> a2;
    private javax.swing.JComboBox<String> a3;
    private javax.swing.JComboBox<String> a4;
    private javax.swing.JComboBox<String> a5;
    private javax.swing.JComboBox<String> a6;
    private javax.swing.JLabel autorLibro;
    private javax.swing.JLabel codigoLibro;
    private javax.swing.JLabel copiasTotales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelLibro;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
