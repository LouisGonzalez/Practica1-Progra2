package practica.lenguajes;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica.clases.Dinero;
import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.clases.Prestamo;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgDevolucionLibro extends javax.swing.JDialog {

    private Date date = new Date();
    private int GANANCIAS_TOTALES;
    private JLabel montoTotal;
    
    public DlgDevolucionLibro(java.awt.Frame parent, boolean modal, JLabel txt3) {
        super(parent, modal);
        this.montoTotal = txt3;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDevolucion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt3 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        pago = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        diasAcum = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        carnet = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDevolucion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt3.setText("Total a pagar:");

        txt6.setText("Q.");

        pago.setText("Confirmar Pago");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelDevolucion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 420, -1));

        txt5.setText("Dias acumulados:");

        txt2.setText("Codigo del libro:");

        txt1.setText("Carnet:");

        buscador.setText("Buscar");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diasAcum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diasAcum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        panelDevolucion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 420, 200));

        getContentPane().add(panelDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        if(txt4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No ha buscado una comparacion aun");
        } else {
            String fichero = MenuPrincipal.pathPrestamo+codigo.getText()+"-"+carnet.getText()+".dat";
            File file = new File(fichero);
            file.delete();
            datosDinero();
            datosLibros();
            datosEstudiante();   
            JOptionPane.showMessageDialog(null, "El libro ha sido devuelto con exito");
            this.dispose();
        }
    }//GEN-LAST:event_pagoActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        if(carnet.getText().equals("") && codigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Aun no ha escrito nada en los campos de busqueda");
        } else if (carnet.getText().equals("") || codigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Le falta llenar uno de los campos de busqueda");
        } else {
            String fichero = MenuPrincipal.pathPrestamo+codigo.getText()+"-"+carnet.getText()+".dat";
            File file = new File(fichero);
            if(!file.exists()){
                JOptionPane.showMessageDialog(null, "No existe un prestamo agregado al numero de este de carnet por el momento");
            } else {
                Entrada<Prestamo> prestamos = new Entrada<>();
                Prestamo aMostrar = prestamos.leerBin(MenuPrincipal.pathPrestamo, codigo.getText()+"-"+carnet.getText(), ".dat");
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(date);
                Date fecha = calendario.getTime();
                Date fecha2 = aMostrar.getfechaEntrega();
                int dias = (int) ((fecha.getTime()-fecha2.getTime())/86400000);
                int diasTotales = dias+4;
                diasAcum.setText(Integer.toString(diasTotales));
                if(diasTotales<4){
                    GANANCIAS_TOTALES = diasTotales*5;
                    txt4.setText(Integer.toString(GANANCIAS_TOTALES));
                } else if(diasTotales>=4){
                    GANANCIAS_TOTALES = (diasTotales*5) + (dias*5) + 5;
                    txt4.setText(Integer.toString(GANANCIAS_TOTALES));
                }
            }
        }
        
        
    }//GEN-LAST:event_buscadorActionPerformed
    
    private void datosEstudiante(){
        try{
            Entrada<Estudiante> estudiante = new Entrada<>();
            Estudiante aDar = estudiante.leerBin(MenuPrincipal.pathEstudiante, carnet.getText(), ".dat");
            Estudiante pagoLibros = new Estudiante(aDar.getNombre(), aDar.getCarnet(), aDar.getCodigoCarrera(), aDar.getLibrosPrestados()-1);
            ObjectOutputStream escribirEstudiante = new ObjectOutputStream(new
            FileOutputStream(MenuPrincipal.pathEstudiante+carnet.getText()+".dat"));
            escribirEstudiante.writeObject(pagoLibros);
            escribirEstudiante.close();
        } catch(IOException ioe){            
        }
    }
    
    private void datosLibros(){
        try{
            Entrada<Libro> libros = new Entrada<>();
            Libro aDevolver = libros.leerBin(MenuPrincipal.pathLibro, codigo.getText(), ".dat");
            Libro ingresoLibros = new Libro(aDevolver.getTitulo(), aDevolver.getAutor(), aDevolver.getCodigo(), aDevolver.getCantidad()+1);
            ObjectOutputStream escribirLibro = new ObjectOutputStream(new
            FileOutputStream(MenuPrincipal.pathLibro+codigo.getText()+".dat"));
            escribirLibro.writeObject(ingresoLibros);
            escribirLibro.close();                
        }catch(IOException ioe){
        }
    }
    
    private void datosDinero(){
        try{
            Entrada<Dinero> nuevo = new Entrada<>();
            Dinero aPagar = nuevo.leerBin(MenuPrincipal.pathDinero, "Ganancias", ".dat");
            Dinero dinero = new Dinero(aPagar.getGanancias()+Integer.parseInt(txt4.getText()));
            ObjectOutputStream escribirDinero = new ObjectOutputStream(new
            FileOutputStream(MenuPrincipal.pathDinero+"Ganancias.dat"));
            escribirDinero.writeObject(dinero);
            escribirDinero.close();
            montoTotal.setText(Integer.toString(aPagar.getGanancias()+Integer.parseInt(txt4.getText())));
        }catch(IOException ioe){
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField carnet;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel diasAcum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pago;
    private javax.swing.JPanel panelDevolucion;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    // End of variables declaration//GEN-END:variables
}
