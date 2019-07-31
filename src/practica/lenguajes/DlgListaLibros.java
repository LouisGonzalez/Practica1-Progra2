package practica.lenguajes;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.Libro;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgListaLibros extends javax.swing.JDialog {
    
    public DefaultTableModel dtmModel;
    private ArchivosLibros archivo;
    private JLabel clave;
    private ListaLibros<Libro> misLibros;
    private String valor;
    
    
    public DlgListaLibros(java.awt.Frame parent, boolean modal, ArchivosLibros archivo, JLabel clave, ListaLibros<Libro> misLibros) {
        super(parent, modal);
        this.archivo = archivo;
        this.clave = clave;
        this.misLibros = misLibros;
        initComponents();
        leerLibros();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLibros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        a1 = new javax.swing.JLabel();
        filtrador = new javax.swing.JTextField();
        opcion = new javax.swing.JComboBox<>();
        filtrarPalabra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLibros.setBackground(new java.awt.Color(255, 255, 255));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo:", "Titulo:", "Autor:", "Copias Disp:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaLibros);

        a1.setForeground(new java.awt.Color(0, 0, 102));
        a1.setText("Filtrar:");

        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Autor" }));
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });

        filtrarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_norm.png"))); // NOI18N
        filtrarPalabra.setBorder(null);
        filtrarPalabra.setBorderPainted(false);
        filtrarPalabra.setContentAreaFilled(false);
        filtrarPalabra.setFocusPainted(false);
        filtrarPalabra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Actualizar/upd_press.png"))); // NOI18N
        filtrarPalabra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_roll.png"))); // NOI18N
        filtrarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarPalabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLibrosLayout = new javax.swing.GroupLayout(panelLibros);
        panelLibros.setLayout(panelLibrosLayout);
        panelLibrosLayout.setHorizontalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(filtrador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtrarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLibrosLayout.setVerticalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a1)
                            .addComponent(filtrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(filtrarPalabra)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 350));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("LISTADO OFICIAL LIBROS BIBLIOTECA CUNOC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txt1)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarPalabraActionPerformed
        valor = opcion.getSelectedItem().toString();
        if(valor.equals("Codigo")){
            DlgFiltrarLibros filtrar = new DlgFiltrarLibros(null, true, filtrador.getText(), valor);
            filtrar.setVisible(true);
        } else if(valor.equals("Nombre")){
            DlgFiltrarLibros filtrar = new DlgFiltrarLibros(null, true, filtrador.getText(), valor);
            filtrar.setVisible(true);    
        } else if(valor.equals("Autor")){
            DlgFiltrarLibros filtrar = new DlgFiltrarLibros(null, true, filtrador.getText(), valor);
            filtrar.setVisible(true);        
        }
    }//GEN-LAST:event_filtrarPalabraActionPerformed

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
    }//GEN-LAST:event_opcionActionPerformed

    
    
    public void leerLibros(){
        Object[][] filas;
        Entrada<Libro> libros = new Entrada<>();
        File explorador = new File(MenuPrincipal.pathLibro);
        DefaultTableModel model = (DefaultTableModel) tablaLibros.getModel();
        for(String string : explorador.list()){
            Libro aMostrar = libros.leerBin(MenuPrincipal.pathLibro, string, "");
            Object[] fila = {aMostrar.getCodigo(),aMostrar.getTitulo(),aMostrar.getAutor(),aMostrar.getCantidad()};
            model.addRow(fila);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JTextField filtrador;
    private javax.swing.JButton filtrarPalabra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
