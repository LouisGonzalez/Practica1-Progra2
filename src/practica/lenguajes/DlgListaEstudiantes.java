package practica.lenguajes;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.Estudiante;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgListaEstudiantes extends javax.swing.JDialog {
    
    private String valor;

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
        filtrador = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        opcion = new javax.swing.JComboBox<>();
        filtrarPalabra = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstudiantes.setBackground(new java.awt.Color(255, 255, 255));

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

        filtrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtradorActionPerformed(evt);
            }
        });

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Filtrar:");

        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnet", "Nombre", "Carrera" }));

        filtrarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_norm.png"))); // NOI18N
        filtrarPalabra.setBorder(null);
        filtrarPalabra.setBorderPainted(false);
        filtrarPalabra.setContentAreaFilled(false);
        filtrarPalabra.setFocusPainted(false);
        filtrarPalabra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_press.png"))); // NOI18N
        filtrarPalabra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_roll.png"))); // NOI18N
        filtrarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarPalabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstudiantesLayout = new javax.swing.GroupLayout(panelEstudiantes);
        panelEstudiantes.setLayout(panelEstudiantesLayout);
        panelEstudiantesLayout.setHorizontalGroup(
            panelEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudiantesLayout.createSequentialGroup()
                .addGroup(panelEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstudiantesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEstudiantesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtrador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtrarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstudiantesLayout.setVerticalGroup(
            panelEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudiantesLayout.createSequentialGroup()
                .addGroup(panelEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstudiantesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2)
                            .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEstudiantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filtrarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 350));

        panel.setBackground(new java.awt.Color(102, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("LISTADO OFICIAL DE ESTUDIANTES CUNOC");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txt1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(txt1)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtradorActionPerformed
    }//GEN-LAST:event_filtradorActionPerformed

    private void filtrarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarPalabraActionPerformed
        valor = opcion.getSelectedItem().toString();
        if(valor.equals("Carnet")){
            DlgFiltrarEstudiante filtro = new DlgFiltrarEstudiante(null, true, filtrador.getText(), valor);
            filtro.setVisible(true);
        } else if(valor.equals("Nombre")){
            DlgFiltrarEstudiante filtro = new DlgFiltrarEstudiante(null, true, filtrador.getText(), valor);
            filtro.setVisible(true);
        } else if(valor.equals("Carrera")){
            DlgFiltrarEstudiante filtro = new DlgFiltrarEstudiante(null, true, filtrador.getText(), valor);
            filtro.setVisible(true);
        }
        
    }//GEN-LAST:event_filtrarPalabraActionPerformed

    
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
    private javax.swing.JTextField filtrador;
    private javax.swing.JButton filtrarPalabra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelEstudiantes;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
