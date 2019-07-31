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
import practica.mensajes.Mensaje10;
import practica.mensajes.Mensaje11;
import practica.mensajes.Mensaje12;
import practica.mensajes.Mensaje18;
import practica.mensajes.Mensaje2;

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDevolucion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt6.setForeground(new java.awt.Color(0, 0, 0));
        txt6.setText("Q.");

        txt4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 0));

        pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_norm.png"))); // NOI18N
        pago.setBorder(null);
        pago.setBorderPainted(false);
        pago.setContentAreaFilled(false);
        pago.setFocusPainted(false);
        pago.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_press.png"))); // NOI18N
        pago.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Aceptar/acep_roll.png"))); // NOI18N
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
                .addGap(64, 64, 64)
                .addComponent(txt6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(pago)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelDevolucion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 420, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt5.setForeground(new java.awt.Color(0, 0, 102));
        txt5.setText("Dias acumulados:");

        diasAcum.setForeground(new java.awt.Color(0, 0, 0));

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Codigo del libro:");

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Carnet:");

        buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_norm.png"))); // NOI18N
        buscador.setBorder(null);
        buscador.setBorderPainted(false);
        buscador.setContentAreaFilled(false);
        buscador.setFocusPainted(false);
        buscador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_press.png"))); // NOI18N
        buscador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/botones/Comprobar/comprobar_roll.png"))); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(buscador)
                        .addGap(25, 25, 25))))
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
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diasAcum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        panelDevolucion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 200));

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Datos de Prestamo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panelDevolucion.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));

        txt3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Total a pagar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDevolucion.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 420, 50));

        getContentPane().add(panelDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        if(txt4.getText().equals("")){
            new Mensaje11(null, true).setVisible(true);          
            //JOptionPane.showMessageDialog(null, "No ha buscado una comparacion aun");
        } else {
            String fichero = MenuPrincipal.pathPrestamo+codigo.getText()+"-"+carnet.getText()+".dat";
            File file = new File(fichero);
            file.delete();
            datosDinero();
            datosLibros();
            datosEstudiante();   
            new Mensaje12(null, true).setVisible(true);          
            //JOptionPane.showMessageDialog(null, "El libro ha sido devuelto con exito");
            this.dispose();
        }
    }//GEN-LAST:event_pagoActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        if(carnet.getText().equals("") && codigo.getText().equals("")){
            new Mensaje18(null, true).setVisible(true);          
            JOptionPane.showMessageDialog(null, "Aun no ha escrito nada en los campos de busqueda");
        } else if (carnet.getText().equals("") || codigo.getText().equals("")){
            new Mensaje2(null, true).setVisible(true);      
            //JOptionPane.showMessageDialog(null, "Le falta llenar uno de los campos de busqueda");
        } else {
            String fichero = MenuPrincipal.pathPrestamo+codigo.getText()+"-"+carnet.getText()+".dat";
            File file = new File(fichero);
            if(!file.exists()){
                new Mensaje10(null, true).setVisible(true);
                //JOptionPane.showMessageDialog(null, "No existe un prestamo agregado al numero de este de carnet por el momento");
            } else {
                Entrada<Prestamo> prestamos = new Entrada<>();
                Prestamo aMostrar = prestamos.leerBin(MenuPrincipal.pathPrestamo, codigo.getText()+"-"+carnet.getText(), ".dat");
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(date); 
                Date fecha = calendario.getTime();
                System.out.println(fecha);
                Date fecha2 = aMostrar.getfechaEntrega();
                System.out.println(fecha2);
                int dias = (int) ((fecha.getTime()-fecha2.getTime())/86400000);
                int diasTotales = dias+3;
                System.out.println(diasTotales);
                System.out.println(dias);
                diasAcum.setText(Integer.toString(diasTotales));
                if(diasTotales<=3){
                    GANANCIAS_TOTALES = diasTotales*5;
                    txt4.setText(Integer.toString(GANANCIAS_TOTALES));
                } else if(diasTotales>3){
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
