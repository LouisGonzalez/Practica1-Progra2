package practica.lenguajes;

import javax.swing.JOptionPane;
import practica.clases.Estudiante;

/**
 *
 * @author luisGonzalez
 */
public class DlgNuevoEstudiante extends javax.swing.JDialog {
    
    private ArchivosEstudiantes archivo;
    private Estudiante estudiante;
    
    public DlgNuevoEstudiante(java.awt.Frame parent, boolean modal, ArchivosEstudiantes archivo) {
        super(parent, modal);
        this.archivo = archivo;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstudiante = new javax.swing.JPanel();
        nombreEstudiante = new javax.swing.JLabel();
        carnetEstudiante = new javax.swing.JLabel();
        carreraEstudiante = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        registroDatos = new javax.swing.JButton();
        carrera = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstudiante.setText("Nombre:");
        panelEstudiante.add(nombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 30));

        carnetEstudiante.setText("Carnet:");
        panelEstudiante.add(carnetEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 30));

        carreraEstudiante.setText("Carrera:");
        panelEstudiante.add(carreraEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 30));
        panelEstudiante.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 20));
        panelEstudiante.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, -1));

        registroDatos.setText("Ingresar");
        registroDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroDatosActionPerformed(evt);
            }
        });
        panelEstudiante.add(registroDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 190, 100, 30));

        carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria", "Medicina", "Derecho", "Arquitectura", "Administracion" }));
        panelEstudiante.add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        getContentPane().add(panelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDatosActionPerformed
        try {
            Estudiante nuevo = new Estudiante(txt1.getText(), Integer.parseInt(txt2.getText()), carrera.getSelectedItem().toString());
            archivo.guardarEstudiante(nuevo);       
            txt1.setText("");
            txt2.setText("");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ha escrito un caracter incorrecto");
        }
    }//GEN-LAST:event_registroDatosActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carnetEstudiante;
    private javax.swing.JComboBox<String> carrera;
    private javax.swing.JLabel carreraEstudiante;
    private javax.swing.JLabel nombreEstudiante;
    private javax.swing.JPanel panelEstudiante;
    private javax.swing.JButton registroDatos;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
