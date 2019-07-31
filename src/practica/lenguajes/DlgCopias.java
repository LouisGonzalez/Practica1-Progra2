package practica.lenguajes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import practica.clases.Libro;
import practica.mensajes.Mensaje16;

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
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCopias.setBackground(new java.awt.Color(255, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Cantidad de copias a ser agregadas:");

        agregarCopias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_norm.png"))); // NOI18N
        agregarCopias.setBorder(null);
        agregarCopias.setBorderPainted(false);
        agregarCopias.setContentAreaFilled(false);
        agregarCopias.setFocusPainted(false);
        agregarCopias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_press.png"))); // NOI18N
        agregarCopias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_roll.png"))); // NOI18N
        agregarCopias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCopiasActionPerformed(evt);
            }
        });

        titulo.setForeground(new java.awt.Color(0, 0, 0));

        codigo.setForeground(new java.awt.Color(0, 0, 0));

        autor.setForeground(new java.awt.Color(0, 0, 0));

        copias.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelCopiasLayout = new javax.swing.GroupLayout(panelCopias);
        panelCopias.setLayout(panelCopiasLayout);
        panelCopiasLayout.setHorizontalGroup(
            panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopiasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCopiasLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCopiasLayout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(copias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCopiasLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(copiaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(agregarCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelCopiasLayout.setVerticalGroup(
            panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopiasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copiaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panelCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 180));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Datos Libro:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

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
        new Mensaje16(null, true).setVisible(true);    
        //JOptionPane.showMessageDialog(null, "Las copias han sido agregadas con exito");    
    }//GEN-LAST:event_agregarCopiasActionPerformed
    
    public void cargarDatos(){
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCopias;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField copiaLibro;
    private javax.swing.JLabel copias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelCopias;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
