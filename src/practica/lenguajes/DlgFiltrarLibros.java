package practica.lenguajes;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import practica.clases.Libro;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgFiltrarLibros extends javax.swing.JDialog {
        
    public DlgFiltrarLibros(java.awt.Frame parent, boolean modal, String valor, String valor2) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txt2.setText(valor);
        Entrada<Libro> allBooks = new Entrada<>();
        File explorador = new File(MenuPrincipal.pathLibro);
        DefaultTableModel model = (DefaultTableModel) filtroLibros.getModel();
        if(valor2.equals("Codigo")){
            for(String string: explorador.list()){
                Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, string, "");
                if(aMostrar.getCodigo().equals(valor)){
                    Object[] filas = {aMostrar.getCodigo(), aMostrar.getTitulo(), aMostrar.getAutor()};
                    model.addRow(filas);
                }
            }
        } else if(valor2.equals("Nombre")){
            for(String string: explorador.list()){
                Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, string, "");
                if(aMostrar.getTitulo().equals(valor)){
                    Object[] filas = {aMostrar.getCodigo(), aMostrar.getTitulo(), aMostrar.getAutor()};
                    model.addRow(filas);
                }
            }
        } else if(valor2.equals("Autor")){
            for(String string: explorador.list()){
                Libro aMostrar = allBooks.leerBin(MenuPrincipal.pathLibro, string, "");
                if(aMostrar.getAutor().equals(valor)){
                    Object[] filas = {aMostrar.getCodigo(), aMostrar.getTitulo(), aMostrar.getAutor()};
                    model.addRow(filas);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        filtroLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Filtro: ");

        txt2.setForeground(new java.awt.Color(0, 0, 0));

        filtroLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo:", "Nombre:", "Autor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(filtroLibros);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JTable filtroLibros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
