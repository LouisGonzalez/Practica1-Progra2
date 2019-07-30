package practica.lenguajes;

import java.io.File;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.manejador.Entrada;

/**
 *
 * @author luisGonzalez
 */
public class DlgBuscarEstudiante extends javax.swing.JDialog {

    public DlgBuscarEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        carnetEst = new javax.swing.JTextField();
        buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setText("Carnet Estudiante:");
        panel.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 30));
        panel.add(carnetEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 38, 160, 20));

        buscador.setText("Buscar");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        panel.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, 30));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        buscarEstudiante();
    }//GEN-LAST:event_buscadorActionPerformed

    public void buscarEstudiante(){
        String fichero = MenuPrincipal.pathEstudiante+carnetEst.getText()+".dat";
        File file = new File(fichero);
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "El estudiante que usted busca no esta inscrito en este sistema");
        } else{
            Entrada<Estudiante> allStudents = new Entrada<>();
            Estudiante aMostrar = allStudents.leerBin(MenuPrincipal.pathEstudiante, carnetEst.getText(), ".dat");
            JOptionPane.showMessageDialog(null, "El estudiante ha sido encontrado con exito");
            DlgPrestamoLibros prestamo = new DlgPrestamoLibros(null, true, aMostrar);
            prestamo.setVisible(true);
            this.dispose();
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField carnetEst;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
