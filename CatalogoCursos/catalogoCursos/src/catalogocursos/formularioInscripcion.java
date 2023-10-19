package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class formularioInscripcion extends javax.swing.JFrame {

    public formularioInscripcion() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseFormulario = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        labelCI = new javax.swing.JLabel();
        campoCI = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        labelCurso = new javax.swing.JLabel();
        campoCursos = new javax.swing.JComboBox<>();
        botonInscribirse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        baseFormulario.setBackground(new java.awt.Color(48, 48, 48));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre completo");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));

        labelCI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCI.setForeground(new java.awt.Color(255, 255, 255));
        labelCI.setText("Nombre completo");

        campoCI.setBackground(new java.awt.Color(255, 255, 255));
        campoCI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoCI.setForeground(new java.awt.Color(0, 0, 0));

        labelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo electrónico");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));

        labelCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCurso.setForeground(new java.awt.Color(255, 255, 255));
        labelCurso.setText("Seleccione un curso");

        campoCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonInscribirse.setBackground(new java.awt.Color(255, 255, 255));
        botonInscribirse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(0, 0, 0));
        botonInscribirse.setText("I N S C R I B I R S E");

        javax.swing.GroupLayout baseFormularioLayout = new javax.swing.GroupLayout(baseFormulario);
        baseFormulario.setLayout(baseFormularioLayout);
        baseFormularioLayout.setHorizontalGroup(
            baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseFormularioLayout.createSequentialGroup()
                .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseFormularioLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCurso)
                            .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCorreo)
                                .addComponent(labelCI)
                                .addComponent(labelNombre)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(campoCI, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(campoNombre)
                                .addComponent(campoCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(baseFormularioLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(botonInscribirse)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        baseFormularioLayout.setVerticalGroup(
            baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseFormularioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelCI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonInscribirse)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //Ccambiamos el LookAndFell de la ventana
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseFormulario;
    private javax.swing.JButton botonInscribirse;
    private javax.swing.JTextField campoCI;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JComboBox<String> campoCursos;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
