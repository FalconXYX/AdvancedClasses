package ShapeProject;

import TurtleGraphics.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ShapeGui extends javax.swing.JFrame {

    Shape s;
    Pen p;

    public ShapeGui() {
        initComponents();
        SketchPadWindow w = new SketchPadWindow(400, 400);
        w.setLocation(50, 275);
        p = new StandardPen(w);
        s = new circle(0, 0, 0);

    }

    private void erase() {
        p.setColor(Color.white);
        s.draw(p);
        p.setColor(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rectb = new javax.swing.JButton();
        wheelb = new javax.swing.JButton();
        circleb = new javax.swing.JButton();
        triangleb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infotext = new javax.swing.JTextArea();
        moveb = new javax.swing.JButton();
        resizeb = new javax.swing.JButton();
        quitb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rectb.setText("Rectangle");
        rectb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbActionPerformed(evt);
            }
        });

        wheelb.setText("Wheel");
        wheelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbActionPerformed(evt);
            }
        });

        circleb.setText("Circle");
        circleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebActionPerformed(evt);
            }
        });

        triangleb.setText("Triangle");
        triangleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglebActionPerformed(evt);
            }
        });

        infotext.setColumns(20);
        infotext.setRows(5);
        jScrollPane1.setViewportView(infotext);

        moveb.setText("Move");
        moveb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebActionPerformed(evt);
            }
        });

        resizeb.setText("Resize");
        resizeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizebActionPerformed(evt);
            }
        });

        quitb.setText("Quit");
        quitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Options");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Shape Information");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("     Select Shape");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rectb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveb)
                    .addComponent(resizeb)
                    .addComponent(quitb)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wheelb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(triangleb)
                                .addGap(18, 18, 18)
                                .addComponent(circleb)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rectb)
                    .addComponent(wheelb)
                    .addComponent(circleb)
                    .addComponent(triangleb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(moveb)
                        .addGap(18, 18, 18)
                        .addComponent(resizeb)
                        .addGap(18, 18, 18)
                        .addComponent(quitb)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rectbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbActionPerformed
       erase();
        s = new rect(0, 0, 50, 60);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_rectbActionPerformed

    private void wheelbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbActionPerformed
        erase();
        s = new wheel(0, 0, 50, 6);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_wheelbActionPerformed

    private void circlebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebActionPerformed
        erase();
        s = new circle(0, 0, 50);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_circlebActionPerformed

    private void trianglebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglebActionPerformed
        erase();
        s = new triangle(0, 0, 66,66,156,16);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_trianglebActionPerformed

    private void quitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitbActionPerformed

    private void movebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebActionPerformed
        double x = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x", "0"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y", "0"));
        erase();
        s.move(x, y);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_movebActionPerformed

    private void resizebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizebActionPerformed
        double factor = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter the factor you want it changed by", "0"));
        erase();
        s.stetchBy(factor);
        s.draw(p);
        infotext.setText(s.toString());
    }//GEN-LAST:event_resizebActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShapeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circleb;
    private javax.swing.JTextArea infotext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton moveb;
    private javax.swing.JButton quitb;
    private javax.swing.JButton rectb;
    private javax.swing.JButton resizeb;
    private javax.swing.JButton triangleb;
    private javax.swing.JButton wheelb;
    // End of variables declaration//GEN-END:variables
}
