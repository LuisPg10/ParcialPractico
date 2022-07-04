package co.edu.unicesar.interfaces.paneles;

import javax.swing.JTextField;

public class OpcionLibro extends javax.swing.JPanel {

    public OpcionLibro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edicion = new javax.swing.JTextField();
        paginas = new javax.swing.JTextField();
        separadorEdicion = new javax.swing.JSeparator();
        separadorPag = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(740, 120));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edicion.setBackground(new java.awt.Color(51, 51, 51));
        edicion.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        edicion.setForeground(new java.awt.Color(153, 153, 153));
        edicion.setText("No. Edición");
        edicion.setBorder(null);
        add(edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        paginas.setBackground(new java.awt.Color(51, 51, 51));
        paginas.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        paginas.setForeground(new java.awt.Color(153, 153, 153));
        paginas.setText("No. Pag");
        paginas.setBorder(null);
        add(paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, -1));

        separadorEdicion.setBackground(new java.awt.Color(255, 255, 255));
        separadorEdicion.setForeground(new java.awt.Color(255, 255, 255));
        add(separadorEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        separadorPag.setBackground(new java.awt.Color(255, 255, 255));
        separadorPag.setForeground(new java.awt.Color(255, 255, 255));
        add(separadorPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getEdicion(){return this.edicion;}
    public JTextField getPaginas(){return this.paginas;}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edicion;
    private javax.swing.JTextField paginas;
    private javax.swing.JSeparator separadorEdicion;
    private javax.swing.JSeparator separadorPag;
    // End of variables declaration//GEN-END:variables
}
