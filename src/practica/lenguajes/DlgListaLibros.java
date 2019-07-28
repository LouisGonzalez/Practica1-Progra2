package practica.lenguajes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.Libro;

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
        cargarTabla();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLibros = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setText("LISTADO OFICIAL LIBROS BIBLIOTECA CUNOC");
        panelLibros.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, 30));

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

        panelLibros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 220));

        getContentPane().add(panelLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void cargarTabla(){   
        dtmModel = (DefaultTableModel) tablaLibros.getModel();
        Object[] fila = new Object[dtmModel.getColumnCount()];
        for(int i=0; i<misLibros.obtenerCantidadElementos(); i++){
        try{
            Nodo<Libro> elemento = misLibros.obtenerElemento(i);
            Libro lista = elemento.obtenerContenido();
            fila[0] = lista.getCodigo();
            fila[1] = lista.getTitulo();
            fila[2] = lista.getAutor();
            fila[3] = lista.getCantidad();
            /*ObjectInputStream file = new ObjectInputStream(new FileInputStream("src/practica/Datos/Libros/"+clave.getText()+".dat"));
            Libro libros = (Libro) file.readObject();
            file.close();
            fila[0] = libros.getCodigo();
            fila[1] = libros.getTitulo();
            fila[2] = libros.getAutor();
            fila[3] = libros.getPrestados();*/
            dtmModel.addRow(fila);
            archivo.leerLibro(misLibros, lista);
        } catch(Exception ex){
            Logger.getLogger(DlgListaLibros.class.getName()).log(Level.SEVERE, null, ex);    
        }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
