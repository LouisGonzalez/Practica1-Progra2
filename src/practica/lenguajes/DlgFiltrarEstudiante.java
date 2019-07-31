package practica.lenguajes;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import practica.clases.Estudiante;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgFiltrarEstudiante extends javax.swing.JDialog {

    public DlgFiltrarEstudiante(java.awt.Frame parent, boolean modal, String valor, String valor2) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        palabraFiltrada.setText(valor);
        Entrada<Estudiante> allStudent = new Entrada<>();
        File explorador = new File(MenuPrincipal.pathEstudiante);
        DefaultTableModel model = (DefaultTableModel) tablaFiltro.getModel();
        if(valor2.equals("Carnet")){
            for(String string : explorador.list()){
                Estudiante aMostrar = allStudent.leerBin(MenuPrincipal.pathEstudiante, string, "");
                if(aMostrar.getCarnet()==Integer.parseInt(valor)){
                    Object[] filass = {aMostrar.getCarnet(),aMostrar.getNombre(),aMostrar.getCodigoCarrera()};
                    model.addRow(filass);
                }
            }
        } else if(valor2.equals("Nombre")){
            for(String string : explorador.list()){
                Estudiante aMostrar = allStudent.leerBin(MenuPrincipal.pathEstudiante, string, "");
                if(aMostrar.getNombre().equals(valor)){
                    Object[] filass = {aMostrar.getCarnet(),aMostrar.getNombre(),aMostrar.getCodigoCarrera()};
                    model.addRow(filass);
                }
            }
        } else if(valor2.equals("Carrera")){
            for(String string : explorador.list()){
                Estudiante aMostrar = allStudent.leerBin(MenuPrincipal.pathEstudiante, string, "");
                if(aMostrar.getCodigoCarrera()==Integer.parseInt(valor)){
                    Object[] filass = {aMostrar.getCarnet(),aMostrar.getNombre(),aMostrar.getCodigoCarrera()};
                    model.addRow(filass);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        palabraFiltrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFiltro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Filtro: ");

        palabraFiltrada.setForeground(new java.awt.Color(0, 0, 0));

        tablaFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet:", "Nombre:", "Codigo de Carrera:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFiltro);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(palabraFiltrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(palabraFiltrada, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel palabraFiltrada;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaFiltro;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
