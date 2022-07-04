package co.edu.unicesar.interfaces.paneles;

import java.awt.Color;

public class PanelInicio extends javax.swing.JPanel {

    public PanelInicio() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloPrincipal = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(740, 510));
        setPreferredSize(new java.awt.Dimension(740, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloPrincipal.setFont(new java.awt.Font("Serif", 0, 50)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setText("Gestion de Libros");
        add(TituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 278, -1, -1));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicesar/interfaces/imagenes/imagenPrincipal.png"))); // NOI18N
        add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 85, 197, 181));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));

        txtSalir.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(0, 0, 0));
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalir.setText("Salir");
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSalirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSalirMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseEntered
        this.btnSalir.setBackground(new Color(173,216,230));
    }//GEN-LAST:event_txtSalirMouseEntered

    private void txtSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseExited
        this.btnSalir.setBackground(Color.white);
    }//GEN-LAST:event_txtSalirMouseExited

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtSalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables
}
