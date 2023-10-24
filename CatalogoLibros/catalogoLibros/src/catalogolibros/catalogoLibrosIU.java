/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package catalogolibros;

import com.formdev.flatlaf.FlatDarkLaf;
import database.conexion;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class catalogoLibrosIU extends javax.swing.JFrame {

    /**
     * Creates new form catalogoLibrosIU
     */
    public catalogoLibrosIU() {
        initComponents();
    }
    
    static ArrayList<String> titles;
    static ArrayList<String> img_urls;
    static Image[] image;
    static conexion jdbc;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IMG_1 = new javax.swing.JLabel();
        IMG_2 = new javax.swing.JLabel();
        IMG_3 = new javax.swing.JLabel();
        IMG_4 = new javax.swing.JLabel();
        IMG_5 = new javax.swing.JLabel();
        IMG_6 = new javax.swing.JLabel();
        TITLE_1 = new javax.swing.JLabel();
        TITLE_2 = new javax.swing.JLabel();
        TITLE_3 = new javax.swing.JLabel();
        TITLE_4 = new javax.swing.JLabel();
        TITLE_5 = new javax.swing.JLabel();
        TITLE_6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        IMG_1.setPreferredSize(new java.awt.Dimension(100, 100));

        IMG_2.setPreferredSize(new java.awt.Dimension(100, 100));

        IMG_3.setPreferredSize(new java.awt.Dimension(100, 100));

        IMG_4.setPreferredSize(new java.awt.Dimension(100, 100));

        IMG_5.setBackground(new java.awt.Color(51, 255, 51));
        IMG_5.setPreferredSize(new java.awt.Dimension(100, 100));

        IMG_6.setPreferredSize(new java.awt.Dimension(100, 100));

        TITLE_1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_1.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_1.setText(normalizeTitle(titles.get(0)));

        TITLE_2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_2.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_2.setText(normalizeTitle(titles.get(1)));

        TITLE_3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_3.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_3.setText(normalizeTitle(titles.get(2)));

        TITLE_4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_4.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_4.setText(normalizeTitle(titles.get(3)));

        TITLE_5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_5.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_5.setText(normalizeTitle(titles.get(4)));

        TITLE_6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TITLE_6.setForeground(new java.awt.Color(255, 255, 255));
        TITLE_6.setText(normalizeTitle(titles.get(5)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TITLE_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TITLE_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(TITLE_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IMG_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(IMG_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TITLE_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(TITLE_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IMG_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(IMG_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TITLE_6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TITLE_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TITLE_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMG_4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TITLE_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TITLE_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        IMG_1.setIcon(new ImageIcon(image[0]));
        IMG_2.setIcon(new ImageIcon(image[1]));
        IMG_3.setIcon(new ImageIcon(image[2]));
        IMG_4.setIcon(new ImageIcon(image[3]));
        IMG_5.setIcon(new ImageIcon(image[4]));
        IMG_6.setIcon(new ImageIcon(image[5]));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String normalizeTitle(String title){
        return "<html><p>"+title+"</p></html>";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>
        
        try{
            jdbc = new conexion();
            Connection myConn = jdbc.conctar();
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from libros");
            titles = new ArrayList<>();
            img_urls = new ArrayList<>();
            
            while(myRs.next()){
                String title = myRs.getString("TITLE");
                String img_url = myRs.getString("IMG_URL");
                if (!title.isEmpty()){
                    titles.add(title);
                    img_urls.add(img_url);
                }
            }
            
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            image = new Image[6];
            URL url;
            int i = 0;
            for (String str : img_urls){
               url = new URL(str);
               image[i] = ImageIO.read(url).getScaledInstance(100,120,Image.SCALE_SMOOTH);
               i++;
            }
        }catch(MalformedURLException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catalogoLibrosIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMG_1;
    private javax.swing.JLabel IMG_2;
    private javax.swing.JLabel IMG_3;
    private javax.swing.JLabel IMG_4;
    private javax.swing.JLabel IMG_5;
    private javax.swing.JLabel IMG_6;
    private javax.swing.JLabel TITLE_1;
    private javax.swing.JLabel TITLE_2;
    private javax.swing.JLabel TITLE_3;
    private javax.swing.JLabel TITLE_4;
    private javax.swing.JLabel TITLE_5;
    private javax.swing.JLabel TITLE_6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
