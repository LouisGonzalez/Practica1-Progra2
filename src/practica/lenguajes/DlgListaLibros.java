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
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLibros.setBackground(new java.awt.Color(255, 255, 255));
        panelLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelLibros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 220));

        getContentPane().add(panelLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 280));

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
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
