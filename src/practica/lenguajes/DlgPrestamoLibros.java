package practica.lenguajes;
import java.io.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.clases.Prestamo;
import practica.manejador.Entrada;
import java.util.Date;
import practica.mensajes.Mensaje19;
import practica.mensajes.Mensaje20;
import practica.mensajes.Mensaje5;
import practica.mensajes.Mensaje6;
import practica.mensajes.Mensaje8;
import practica.mensajes.Mensaje9;

/**
 *
 * @author luisGonzalez
 */
public class DlgPrestamoLibros extends javax.swing.JDialog {
    
    Estudiante aMostrare;
    Date date = new Date();
    private final int PLAZO_DIAS = 3;
    
    public DlgPrestamoLibros(java.awt.Frame parent, boolean modal, Estudiante aMostrar) {
        super(parent, modal);
        initComponents();
        this.aMostrare = aMostrar;
        carnet.setText(Integer.toString(aMostrar.getCarnet()));
        codigoCarrera.setText(Integer.toString(aMostrar.getCodigoCarrera()));
        nombre.setText(aMostrar.getNombre());
        librosPrestados.setText(Integer.toString(aMostrar.getLibrosPrestados()));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        carnet = new javax.swing.JLabel();
        codigoCarrera = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        librosPrestados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codigoLib = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        tituloLib = new javax.swing.JLabel();
        claveLib = new javax.swing.JLabel();
        autorLib = new javax.swing.JLabel();
        cantidadLib = new javax.swing.JLabel();
        buscador = new javax.swing.JButton();
        prestarLib = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        carnet.setForeground(new java.awt.Color(0, 0, 0));

        codigoCarrera.setForeground(new java.awt.Color(0, 0, 0));

        nombre.setForeground(new java.awt.Color(0, 0, 0));

        librosPrestados.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Carnet:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Codigo de Carrera:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Libros prestados actualmente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codigoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(carnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(librosPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carnet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(librosPrestados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        codigoLib.setForeground(new java.awt.Color(0, 0, 102));
        codigoLib.setText("Codigo del libro:");

        tituloLib.setForeground(new java.awt.Color(0, 0, 0));

        claveLib.setForeground(new java.awt.Color(0, 0, 0));

        autorLib.setForeground(new java.awt.Color(0, 0, 0));

        cantidadLib.setForeground(new java.awt.Color(0, 0, 0));

        buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Actualizar/upd_norm.png"))); // NOI18N
        buscador.setBorder(null);
        buscador.setBorderPainted(false);
        buscador.setContentAreaFilled(false);
        buscador.setFocusPainted(false);
        buscador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Actualizar/upd_press.png"))); // NOI18N
        buscador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Actualizar/upd_roll.png"))); // NOI18N
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        prestarLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_norm.png"))); // NOI18N
        prestarLib.setBorder(null);
        prestarLib.setBorderPainted(false);
        prestarLib.setContentAreaFilled(false);
        prestarLib.setFocusPainted(false);
        prestarLib.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_press.png"))); // NOI18N
        prestarLib.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Guardar/save_roll.png"))); // NOI18N
        prestarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarLibActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Titulo:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Autor:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Codigo:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("No. Copias en biblioteca");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(claveLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoLib, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadLib, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorLib, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(prestarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLib, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorLib, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prestarLib)
                            .addComponent(jLabel8))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(claveLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 510, 190));

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setForeground(new java.awt.Color(51, 255, 51));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Datos Estudiante:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 40));

        jPanel5.setBackground(new java.awt.Color(51, 255, 51));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Datos Libro:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 510, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prestarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarLibActionPerformed
        if(codigo.getText().equals("")){
              new Mensaje6(null, true).setVisible(true);    
            //JOptionPane.showMessageDialog(null, "No has buscado ningun libro");
        } else if(claveLib.getText().equals("")){
            new Mensaje19(null, true).setVisible(true);           
            //JOptionPane.showMessageDialog(null, "No has ingresado ningun libro aun al buscador");
        } else {
            if(aMostrare.getLibrosPrestados()>=3){
                new Mensaje9(null, true).setVisible(true);            
                //JOptionPane.showMessageDialog(null, "El estudiante ya tiene 3 prestamos justo ahora por lo que no puede hacer mas");
            } else {
                try{                    
                    Entrada<Libro> allBooks = new Entrada<>();
                    Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, codigo.getText(), ".dat");
                    if(aMostrar.getCantidad()<=0){
                        new Mensaje20(null, true).setVisible(true);          
                        //JOptionPane.showMessageDialog(null, "Lo sentimos, no hay copias disponibles de este libro por el momento");
                    } else {
                        Libro libro = new Libro(aMostrar.getTitulo(), aMostrar.getAutor(), aMostrar.getCodigo(), aMostrar.getCantidad()-1);
                        ObjectOutputStream escribirObjeto = new ObjectOutputStream(new 
                        FileOutputStream(MenuPrincipal.pathLibro+aMostrar.getCodigo()+".dat"));
                        escribirObjeto.writeObject(libro);
                        escribirObjeto.close();
                        Estudiante estudiante = new Estudiante(aMostrare.getNombre(), aMostrare.getCarnet(), aMostrare.getCodigoCarrera(), aMostrare.getLibrosPrestados()+1);
                        ObjectOutputStream escribirEstudiante = new ObjectOutputStream(new
                        FileOutputStream(MenuPrincipal.pathEstudiante+aMostrare.getCarnet()+".dat"));
                        escribirEstudiante.writeObject(estudiante);
                        escribirEstudiante.close();
                        Calendar calendario = Calendar.getInstance();
                        Calendar calendario2 = Calendar.getInstance();
                        calendario2.setTime(date);
                        calendario.setTime(date);
                        calendario.add(Calendar.DAY_OF_YEAR, PLAZO_DIAS);
                        ArchivosPrestamos archivo = new ArchivosPrestamos();
                        Prestamo prestamos = new Prestamo(aMostrar, aMostrare, calendario2.getTime(), calendario.getTime());
                        archivo.guardarPrestamo(prestamos);
                       new Mensaje8(null, true).setVisible(true);                
                        //JOptionPane.showMessageDialog(null, "Libro prestado con exito");
                        this.dispose();
                    }
                }catch(IOException ioe){
                }
            }
        }
    }//GEN-LAST:event_prestarLibActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        String fichero = MenuPrincipal.pathLibro+codigo.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            new Mensaje5(null, true).setVisible(true);          
            //JOptionPane.showMessageDialog(null, "No existe este libro en la base de datos del sistema");
        } else {
            Entrada<Libro> allBooks = new Entrada<>();
            Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, codigo.getText(), ".dat");
            tituloLib.setText(aMostrar.getTitulo());
            claveLib.setText(aMostrar.getCodigo());
            autorLib.setText(aMostrar.getAutor());
            cantidadLib.setText(Integer.toString(aMostrar.getCantidad()));
        }
    }//GEN-LAST:event_buscadorActionPerformed
    
    public Date sumarDias(Date fecha, int dias){
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.add(Calendar.DAY_OF_YEAR, dias);
        return calendario.getTime();
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorLib;
    private javax.swing.JButton buscador;
    private javax.swing.JLabel cantidadLib;
    private javax.swing.JLabel carnet;
    private javax.swing.JLabel claveLib;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoCarrera;
    private javax.swing.JLabel codigoLib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel librosPrestados;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton prestarLib;
    private javax.swing.JLabel tituloLib;
    // End of variables declaration//GEN-END:variables
}
