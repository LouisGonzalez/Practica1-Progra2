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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        panelPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Libro:", "Carnet:", "Fecha de Prestamo:", "Fecha de entrega:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPrestamos);

        panelPrestamos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 270));

        getContentPane().add(panelPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 310));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("LISTADO PRESTAMOS TOTALES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadStudent(){
        Object[][] filas;
        Entrada<Prestamo> allStudent = new Entrada<>();
        File explorador = new File(MenuPrincipal.pathPrestamo);
        DefaultTableModel model = (DefaultTableModel) tablaPrestamos.getModel();
        //
        for (String string : explorador.list()) {
            Prestamo aMostrar = allStudent.leerBin(MenuPrincipal.pathPrestamo, string, "");
            Object[] filass = {aMostrar.getaPrestar().getCodigo(),aMostrar.getQuePresta().getCarnet(),aMostrar.getFecha(),aMostrar.getfechaEntrega()};
            model.addRow(filass);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrestamos;
    private javax.swing.JTable tablaPrestamos;
    // End of variables declaration//GEN-END:variables
}
