package practica.lenguajes;
import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.clases.Prestamo;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgPrestamoLibros extends javax.swing.JDialog {
    
    Estudiante aMostrare;
    
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
        jPanel3 = new javax.swing.JPanel();
        codigoLib = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        tituloLib = new javax.swing.JLabel();
        claveLib = new javax.swing.JLabel();
        autorLib = new javax.swing.JLabel();
        cantidadLib = new javax.swing.JLabel();
        buscador = new javax.swing.JButton();
        prestarLib = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(carnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(librosPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(carnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(librosPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 130));

        codigoLib.setText("Codigo del libro:");

        buscador.setText("...");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        prestarLib.setText("Prestar");
        prestarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarLibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(claveLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoLib, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cantidadLib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(autorLib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(prestarLib)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLib, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscador))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(autorLib, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(tituloLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(claveLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadLib, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(prestarLib)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prestarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarLibActionPerformed
        if(codigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No has buscado ningun libro");
        } else if(claveLib.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No has ingresado ningun libro aun al buscador");
        } else {
            if(aMostrare.getLibrosPrestados()>=3){
                JOptionPane.showMessageDialog(null, "El estudiante ya tiene 3 prestamos justo ahora por lo que no puede hacer mas");
            } else {
                try{
                    Entrada<Libro> allBooks = new Entrada<>();
                    Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, codigo.getText(), ".dat");
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
                    ArchivosPrestamos archivo = new ArchivosPrestamos();
                    Prestamo prestamos = new Prestamo(aMostrar, aMostrare);
                    archivo.guardarPrestamo(prestamos);
                }catch(IOException ioe){
                }
            }
        }
    }//GEN-LAST:event_prestarLibActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        String fichero = MenuPrincipal.pathLibro+codigo.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "No existe este libro en la base de datos del sistema");
        } else {
            Entrada<Libro> allBooks = new Entrada<>();
            Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, codigo.getText(), ".dat");
            tituloLib.setText(aMostrar.getTitulo());
            claveLib.setText(aMostrar.getCodigo());
            autorLib.setText(aMostrar.getAutor());
            cantidadLib.setText(Integer.toString(aMostrar.getCantidad()));
        }
    }//GEN-LAST:event_buscadorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorLib;
    private javax.swing.JButton buscador;
    private javax.swing.JLabel cantidadLib;
    private javax.swing.JLabel carnet;
    private javax.swing.JLabel claveLib;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoCarrera;
    private javax.swing.JLabel codigoLib;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel librosPrestados;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton prestarLib;
    private javax.swing.JLabel tituloLib;
    // End of variables declaration//GEN-END:variables
}
