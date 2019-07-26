package practica.lenguajes;

/**
 *
 * @author luisGonzalez
 */
public class FrmBiblioteca extends javax.swing.JFrame {

    public FrmBiblioteca() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        estudiante = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        listado = new javax.swing.JMenuItem();
        prestamo = new javax.swing.JMenuItem();
        libros = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        biblioteca = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenu();
        prestamosMora = new javax.swing.JMenuItem();
        prestamosTotales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 24)); // NOI18N
        jLabel1.setText("BIBLIOTECA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 151, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        estudiante.setText("Estudiantes");

        jMenuItem1.setText("Agregar nuevo estudiante");
        estudiante.add(jMenuItem1);

        listado.setText("Ver listado oficial ");
        estudiante.add(listado);

        prestamo.setText("Prestar un libro");
        estudiante.add(prestamo);

        jMenuBar1.add(estudiante);

        libros.setText("Libros");

        jMenuItem2.setText("Agregar");
        libros.add(jMenuItem2);

        biblioteca.setText("Ver biblioteca");
        libros.add(biblioteca);

        jMenuBar1.add(libros);

        prestamos.setText("Prestamos");

        prestamosMora.setText("Listado de Prestamos Totales");
        prestamos.add(prestamosMora);

        prestamosTotales.setText("Listado de Prestamos con Mora");
        prestamos.add(prestamosTotales);

        jMenuBar1.add(prestamos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem biblioteca;
    private javax.swing.JMenu estudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu libros;
    private javax.swing.JMenuItem listado;
    private javax.swing.JMenuItem prestamo;
    private javax.swing.JMenu prestamos;
    private javax.swing.JMenuItem prestamosMora;
    private javax.swing.JMenuItem prestamosTotales;
    // End of variables declaration//GEN-END:variables
}
