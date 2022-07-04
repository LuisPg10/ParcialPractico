package co.edu.unicesar.interfaces.paneles;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class OpcionAudio extends javax.swing.JPanel {

    public OpcionAudio() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peso = new javax.swing.JTextField();
        separadorPeso = new javax.swing.JSeparator();
        separadorDuracion = new javax.swing.JSeparator();
        duracion = new javax.swing.JTextField();
        opcionesAudio = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(410, 50));
        setPreferredSize(new java.awt.Dimension(740, 120));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peso.setBackground(new java.awt.Color(51, 51, 51));
        peso.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        peso.setForeground(new java.awt.Color(153, 153, 153));
        peso.setText("Peso");
        peso.setBorder(null);
        add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 120, -1));

        separadorPeso.setBackground(new java.awt.Color(255, 255, 255));
        separadorPeso.setForeground(new java.awt.Color(255, 255, 255));
        add(separadorPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 120, -1));

        separadorDuracion.setBackground(new java.awt.Color(255, 255, 255));
        separadorDuracion.setForeground(new java.awt.Color(255, 255, 255));
        add(separadorDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 120, -1));

        duracion.setBackground(new java.awt.Color(51, 51, 51));
        duracion.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        duracion.setForeground(new java.awt.Color(153, 153, 153));
        duracion.setText("Duración");
        duracion.setBorder(null);
        add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 120, -1));

        opcionesAudio.setBackground(new java.awt.Color(51, 51, 51));
        opcionesAudio.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        opcionesAudio.setForeground(new java.awt.Color(255, 255, 255));
        opcionesAudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mp3", "ogg", "wav", "avi", "flv" }));
        add(opcionesAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    public JTextField getDuracion(){return this.duracion;}
    public JTextField getPeso(){return this.peso;}
    
    public String getFormato(){
        
        return (String) opcionesAudio.getSelectedItem();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duracion;
    private javax.swing.JComboBox<String> opcionesAudio;
    private javax.swing.JTextField peso;
    private javax.swing.JSeparator separadorDuracion;
    private javax.swing.JSeparator separadorPeso;
    // End of variables declaration//GEN-END:variables
}
