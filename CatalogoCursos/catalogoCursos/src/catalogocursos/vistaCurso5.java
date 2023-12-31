package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class vistaCurso5 extends javax.swing.JFrame {

    public vistaCurso5() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        baseCatalogo = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        botonInscrito5 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        contenidoDescripcion = new javax.swing.JLabel();
        divisionUno = new javax.swing.JPanel();
        requisitos = new javax.swing.JLabel();
        contenidoRequisitos = new javax.swing.JLabel();
        divisionDos = new javax.swing.JPanel();
        duracion = new javax.swing.JLabel();
        cotenidoDuracion = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        baseCatalogo.setBackground(new java.awt.Color(48, 48, 48));

        botonAtras.setBackground(new java.awt.Color(217, 217, 217));
        botonAtras.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(0, 0, 0));
        botonAtras.setText("<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonInscrito5.setBackground(new java.awt.Color(217, 217, 217));
        botonInscrito5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonInscrito5.setForeground(new java.awt.Color(0, 0, 0));
        botonInscrito5.setText("¿Estas inscrito?");
        botonInscrito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscrito5ActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(48, 48, 48));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("<html>Mercadotecnia<html>");

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCursos/5.png"))); // NOI18N
        banner.setText("jLabel1");

        descripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        descripcion.setText("DESCRIPCIÓN");

        contenidoDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contenidoDescripcion.setText("<html>Conocer las necesidades de los<p>clientes, diseñar productos y<p>servicios atractivos y comunicar<p>el valor a los consumidores.<html>");

        divisionUno.setBackground(new java.awt.Color(250, 255, 0));
        divisionUno.setForeground(new java.awt.Color(250, 255, 0));
        divisionUno.setPreferredSize(new java.awt.Dimension(5, 145));
        divisionUno.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout divisionUnoLayout = new javax.swing.GroupLayout(divisionUno);
        divisionUno.setLayout(divisionUnoLayout);
        divisionUnoLayout.setHorizontalGroup(
            divisionUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        divisionUnoLayout.setVerticalGroup(
            divisionUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        requisitos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        requisitos.setForeground(new java.awt.Color(255, 255, 255));
        requisitos.setText("REQUISITOS");

        contenidoRequisitos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contenidoRequisitos.setText("<html>* NO cursar más de 4 cursos<p>* Tener un correo valido<p>* Habilidades blandas<html>");

        divisionDos.setBackground(new java.awt.Color(250, 255, 0));
        divisionDos.setForeground(new java.awt.Color(250, 255, 0));
        divisionDos.setPreferredSize(new java.awt.Dimension(5, 145));

        javax.swing.GroupLayout divisionDosLayout = new javax.swing.GroupLayout(divisionDos);
        divisionDos.setLayout(divisionDosLayout);
        divisionDosLayout.setHorizontalGroup(
            divisionDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        divisionDosLayout.setVerticalGroup(
            divisionDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        duracion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duracion.setForeground(new java.awt.Color(255, 255, 255));
        duracion.setText("DURACIÓN");

        cotenidoDuracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cotenidoDuracion.setText("<html>* 4 meses<html>");

        javax.swing.GroupLayout baseCatalogoLayout = new javax.swing.GroupLayout(baseCatalogo);
        baseCatalogo.setLayout(baseCatalogoLayout);
        baseCatalogoLayout.setHorizontalGroup(
            baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseCatalogoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(baseCatalogoLayout.createSequentialGroup()
                                .addComponent(descripcion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(contenidoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(divisionUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requisitos)
                            .addComponent(contenidoRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(divisionDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(duracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cotenidoDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81))
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(baseCatalogoLayout.createSequentialGroup()
                                .addComponent(botonAtras)
                                .addGap(218, 218, 218)
                                .addComponent(titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonInscrito5))
                            .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        baseCatalogoLayout.setVerticalGroup(
            baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseCatalogoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(botonAtras)
                    .addComponent(botonInscrito5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addComponent(duracion)
                        .addGap(18, 18, 18)
                        .addComponent(cotenidoDuracion))
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addComponent(descripcion)
                        .addGap(18, 18, 18)
                        .addComponent(contenidoDescripcion))
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addComponent(requisitos)
                        .addGap(18, 18, 18)
                        .addComponent(contenidoRequisitos))
                    .addComponent(divisionUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
        vistaCatalogo catalogo = new vistaCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonInscrito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscrito5ActionPerformed
        this.dispose();
        formularioInscrito formulario = new formularioInscrito();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonInscrito5ActionPerformed

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
                new vistaCurso5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel baseCatalogo;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonInscrito5;
    private javax.swing.JLabel contenidoDescripcion;
    private javax.swing.JLabel contenidoRequisitos;
    private javax.swing.JLabel cotenidoDuracion;
    private javax.swing.JLabel descripcion;
    private javax.swing.JPanel divisionDos;
    private javax.swing.JPanel divisionUno;
    private javax.swing.JLabel duracion;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel requisitos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
