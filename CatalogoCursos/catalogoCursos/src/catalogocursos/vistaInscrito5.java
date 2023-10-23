package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class vistaInscrito5 extends javax.swing.JFrame {

    public vistaInscrito5() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseInscrito = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        botonContenido = new javax.swing.JButton();
        botonActividades = new javax.swing.JButton();
        botonAtras2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseInscrito.setBackground(new java.awt.Color(48, 48, 48));

        titulo.setBackground(new java.awt.Color(48, 48, 48));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Mercadotecnia");

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCursos/5.png"))); // NOI18N
        banner.setText("jLabel1");

        botonContenido.setBackground(new java.awt.Color(255, 255, 255));
        botonContenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonContenido.setForeground(new java.awt.Color(0, 0, 0));
        botonContenido.setText("CONTENIDO");

        botonActividades.setBackground(new java.awt.Color(255, 255, 255));
        botonActividades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonActividades.setForeground(new java.awt.Color(0, 0, 0));
        botonActividades.setText("ACTIVIDADES");

        botonAtras2.setBackground(new java.awt.Color(217, 217, 217));
        botonAtras2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        botonAtras2.setForeground(new java.awt.Color(0, 0, 0));
        botonAtras2.setText("<");

        javax.swing.GroupLayout baseInscritoLayout = new javax.swing.GroupLayout(baseInscrito);
        baseInscrito.setLayout(baseInscritoLayout);
        baseInscritoLayout.setHorizontalGroup(
            baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseInscritoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseInscritoLayout.createSequentialGroup()
                        .addComponent(botonAtras2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(335, 335, 335))
                    .addGroup(baseInscritoLayout.createSequentialGroup()
                        .addGroup(baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(baseInscritoLayout.createSequentialGroup()
                                .addComponent(botonContenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonActividades))
                            .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        baseInscritoLayout.setVerticalGroup(
            baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseInscritoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(botonAtras2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(baseInscritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonContenido)
                    .addComponent(botonActividades))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                new vistaInscrito5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel baseInscrito;
    private javax.swing.JButton botonActividades;
    private javax.swing.JButton botonAtras2;
    private javax.swing.JButton botonContenido;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
