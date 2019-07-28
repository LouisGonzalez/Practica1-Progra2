package practica.lenguajes;

/**
 *
 * @author luisGonzalez
 */
public class DlgListaEstudiantes extends javax.swing.JDialog {

    public DlgListaEstudiantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstudiantes = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstudiantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setText("LISTADO OFICIAL DE ESTUDIANTES CUNOC");
        panelEstudiantes.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, 30));

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet:", "Nombre:", "Carrera:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);

        panelEstudiantes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 230));

        getContentPane().add(panelEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEstudiantes;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
