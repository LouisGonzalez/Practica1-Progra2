package practica.lenguajes;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import practica.clases.Estudiante;
import practica.clases.Prestamo;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgPrestamosTotales extends javax.swing.JDialog {

    public DlgPrestamosTotales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        loadStudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrestamos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Libro:", "Carnet:", "Fecha de Prestamo:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPrestamos);

        panelPrestamos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 430, 210));

        jLabel1.setText("LISTADO PRESTAMOS TOTALES");
        panelPrestamos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 30));

        getContentPane().add(panelPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadStudent(){
        Object[][] filas;
        Entrada<Prestamo> allStudent = new Entrada<>();
        File  explorador = new File(MenuPrincipal.pathPrestamo);
        DefaultTableModel model = (DefaultTableModel) tablaPrestamos.getModel();
        //
        for (String string : explorador.list()) {
            Prestamo aMostrar = allStudent.leerBin(MenuPrincipal.pathPrestamo, string, "");
            Object[] filass = {aMostrar.getaPrestar().getCodigo(),aMostrar.getQuePresta().getCarnet()};
            model.addRow(filass);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrestamos;
    private javax.swing.JTable tablaPrestamos;
    // End of variables declaration//GEN-END:variables
}
