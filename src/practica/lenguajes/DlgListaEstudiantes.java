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

        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setText("LISTADO OFICIAL DE ESTUDIANTES CUNOC");
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
