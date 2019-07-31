package practica.lenguajes;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import practica.clases.Estudiante;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgListaEstudiantes extends javax.swing.JDialog {

    public DlgListaEstudiantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        loadStudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstudiantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        panelEstudiantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelEstudiantes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 250));

        getContentPane().add(panelEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 290));

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("LISTADO OFICIAL DE ESTUDIANTES CUNOC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txt1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(txt1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadStudent(){
        Object[][] filas;
        Entrada<Estudiante> allStudent = new Entrada<>();
        File  explorador = new File(MenuPrincipal.pathEstudiante);
        DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
        //
        for (String string : explorador.list()) {
            Estudiante aMostrar = allStudent.leerBin(MenuPrincipal.pathEstudiante, string, "");
            Object[] filass = {aMostrar.getCarnet(),aMostrar.getNombre(),aMostrar.getCodigoCarrera()};
            model.addRow(filass);
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEstudiantes;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
