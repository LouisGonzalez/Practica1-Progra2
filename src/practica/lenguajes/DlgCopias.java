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
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
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

        a1.setForeground(new java.awt.Color(0, 0, 153));
        a1.setText("Titulo:");

        a2.setForeground(new java.awt.Color(0, 0, 102));
        a2.setText("Autor:");

        a3.setForeground(new java.awt.Color(0, 0, 102));
        a3.setText("Codigo:");

        a4.setForeground(new java.awt.Color(0, 0, 102));
        a4.setText("No. de Copias:");

        javax.swing.GroupLayout panelCopiasLayout = new javax.swing.GroupLayout(panelCopias);
        panelCopias.setLayout(panelCopiasLayout);
        panelCopiasLayout.setHorizontalGroup(
            panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopiasLayout.createSequentialGroup()
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelCopiasLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCopiasLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(copiaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(agregarCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCopiasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelCopiasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        panelCopiasLayout.setVerticalGroup(
            panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopiasLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1)
                    .addComponent(a2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a3)
                    .addComponent(a4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(copiaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregarCopias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 200));

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
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
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
