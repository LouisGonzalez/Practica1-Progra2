package practica.lenguajes;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import practica.clases.Dinero;
import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class FrmBiblioteca extends javax.swing.JFrame {

    ArchivosEstudiantes archivos = new ArchivosEstudiantes();
    ArchivosLibros archivo2 = new ArchivosLibros();
    private ListaLibros<Libro> misLibros = new ListaLibros<>();
    Dinero dinero;
    private final ImageIcon fondo = new ImageIcon("/home/luisitopapurey/Escritorio/Practica1 Lenguajes/Practica1Lenguajes/src/practica/imagenes/logotipo-usac-azul.jpg");
    
    
    public FrmBiblioteca(Dinero dinero) {
        initComponents();
        setLocationRelativeTo(null);       
        this.dinero = dinero;
        cargarDinero(dinero);
        Icon simbolo = new ImageIcon(fondo.getImage().getScaledInstance(fondoBib.getWidth(), fondoBib.getHeight(), Image.SCALE_DEFAULT));
        fondoBib.setIcon(simbolo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBiblioteca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        fondoBib = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        estudiante = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        listado = new javax.swing.JMenuItem();
        prestamo = new javax.swing.JMenuItem();
        pagoLib = new javax.swing.JMenuItem();
        libros = new javax.swing.JMenu();
        agregar = new javax.swing.JMenuItem();
        biblioteca = new javax.swing.JMenuItem();
        agregarCopia = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenu();
        prestamosMora = new javax.swing.JMenuItem();
        prestamosTotales = new javax.swing.JMenuItem();
        btnConf = new javax.swing.JMenu();
        prestamosMora1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("BIBLIOTECA");
        panelBiblioteca.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 38));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Capital actual:");
        jPanel1.add(txt1);

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Q.");
        jPanel1.add(txt2);

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(txt3);

        panelBiblioteca.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 220, 50));
        panelBiblioteca.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 90, 90));
        panelBiblioteca.add(fondoBib, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 590, 230));

        fondo2.setBackground(new java.awt.Color(51, 255, 51));
        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        panelBiblioteca.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        getContentPane().add(panelBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 290));

        estudiante.setText("Estudiantes");

        jMenuItem1.setText("Agregar nuevo estudiante");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        estudiante.add(jMenuItem1);

        listado.setText("Ver listado oficial ");
        listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActionPerformed(evt);
            }
        });
        estudiante.add(listado);

        prestamo.setText("Prestar un libro");
        prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoActionPerformed(evt);
            }
        });
        estudiante.add(prestamo);

        pagoLib.setText("Devolver un libro");
        pagoLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoLibActionPerformed(evt);
            }
        });
        estudiante.add(pagoLib);

        jMenuBar1.add(estudiante);

        libros.setText("Libros");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        libros.add(agregar);

        biblioteca.setText("Ver biblioteca");
        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });
        libros.add(biblioteca);

        agregarCopia.setText("Agregar copias de un libro ya existente");
        agregarCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCopiaActionPerformed(evt);
            }
        });
        libros.add(agregarCopia);

        jMenuBar1.add(libros);

        prestamos.setText("Prestamos");

        prestamosMora.setText("Listado de Prestamos Totales");
        prestamosMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosMoraActionPerformed(evt);
            }
        });
        prestamos.add(prestamosMora);

        prestamosTotales.setText("Listado de Prestamos con Mora");
        prestamos.add(prestamosTotales);

        jMenuBar1.add(prestamos);

        btnConf.setText("Configuracion");

        prestamosMora1.setText("Importar Archivo");
        prestamosMora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosMora1ActionPerformed(evt);
            }
        });
        btnConf.add(prestamosMora1);

        jMenuBar1.add(btnConf);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDinero(Dinero dinero){
        try{
            Dinero cantidad = new Dinero(dinero.getGanancias());
            ObjectOutputStream escribirDinero = new ObjectOutputStream(new
            FileOutputStream(MenuPrincipal.pathDinero+"Ganancias.dat"));
            escribirDinero.writeObject(cantidad);
            escribirDinero.close();
            txt3.setText(Integer.toString(dinero.getGanancias()));
        }catch(IOException ioe){
        }
    }
    
    private void prestamosMora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosMora1ActionPerformed
        Cargar frm = new Cargar();
        frm.setVisible(true);
        //frm.setSize(WIDTH, HEIGHT);
    }//GEN-LAST:event_prestamosMora1ActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed
        DlgListaEstudiantes listadoEst = new DlgListaEstudiantes(null, true);
        listadoEst.setVisible(true);
    }//GEN-LAST:event_listadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DlgNuevoEstudiante estudiante = new DlgNuevoEstudiante(null, true, archivos);
        estudiante.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        DlgCrearLibro libro = new DlgCrearLibro(null, true, archivo2, txt5, misLibros);
        libro.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed
        DlgListaLibros listadoLib = new DlgListaLibros(null, true, archivo2, txt5, misLibros);
        listadoLib.setVisible(true);
    }//GEN-LAST:event_bibliotecaActionPerformed

    private void agregarCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCopiaActionPerformed
        DlgNuevaCopiaLibros copia = new DlgNuevaCopiaLibros(null, true);
        copia.setVisible(true);
    }//GEN-LAST:event_agregarCopiaActionPerformed

    private void prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoActionPerformed
        DlgBuscarEstudiante buscador = new DlgBuscarEstudiante(null, true);
        buscador.setVisible(true);
    }//GEN-LAST:event_prestamoActionPerformed

    private void pagoLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoLibActionPerformed
        DlgDevolucionLibro devolucion = new DlgDevolucionLibro(null, true, txt3);
        devolucion.setVisible(true);
    }//GEN-LAST:event_pagoLibActionPerformed

    private void prestamosMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosMoraActionPerformed
        DlgPrestamosTotales prestamos = new DlgPrestamosTotales(null, true);
        prestamos.setVisible(true);
    }//GEN-LAST:event_prestamosMoraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregar;
    private javax.swing.JMenuItem agregarCopia;
    private javax.swing.JMenuItem biblioteca;
    private javax.swing.JMenu btnConf;
    private javax.swing.JMenu estudiante;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondoBib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu libros;
    private javax.swing.JMenuItem listado;
    private javax.swing.JMenuItem pagoLib;
    private javax.swing.JPanel panelBiblioteca;
    private javax.swing.JMenuItem prestamo;
    private javax.swing.JMenu prestamos;
    private javax.swing.JMenuItem prestamosMora;
    private javax.swing.JMenuItem prestamosMora1;
    private javax.swing.JMenuItem prestamosTotales;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
