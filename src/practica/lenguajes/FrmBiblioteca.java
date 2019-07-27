package practica.lenguajes;

import practica.clases.Estudiante;

/**
 *
 * @author luisGonzalez
 */
public class FrmBiblioteca extends javax.swing.JFrame {

    ArchivosEstudiantes archivos = new ArchivosEstudiantes();
    ArchivosLibros archivo2 = new ArchivosLibros();
    
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
        btnConf = new javax.swing.JMenu();
        prestamosMora1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 24)); // NOI18N
        jLabel1.setText("BIBLIOTECA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 151, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

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
        estudiante.add(prestamo);

        jMenuBar1.add(estudiante);

        libros.setText("Libros");

        jMenuItem2.setText("Agregar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
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

    private void prestamosMora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosMora1ActionPerformed
        Cargar frm = new Cargar();
        frm.setVisible(true);
        //frm.setSize(WIDTH, HEIGHT);
    }//GEN-LAST:event_prestamosMora1ActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed
    }//GEN-LAST:event_listadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DlgNuevoEstudiante estudiante = new DlgNuevoEstudiante(null, true, archivos);
        estudiante.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DlgNuevoLibro libro = new DlgNuevoLibro(null, true, archivo2);
        libro.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem biblioteca;
    private javax.swing.JMenu btnConf;
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
    private javax.swing.JMenuItem prestamosMora1;
    private javax.swing.JMenuItem prestamosTotales;
    // End of variables declaration//GEN-END:variables
}
