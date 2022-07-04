package co.edu.unicesar.interfaces.paneles;

import co.edu.unicesar.modelo.AudioLibro;
import co.edu.unicesar.modelo.Libro;
import co.edu.unicesar.modelo.ListaPublicacion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PanelAgregar extends javax.swing.JPanel {

    public PanelAgregar() {
        initComponents();
        
        arregloTextField = Arrays.asList(isbn,titulo,autor,costo,year,
            libro.getPaginas(),libro.getEdicion(),
            audio.getDuracion(),audio.getPeso()
        );
        
        for(JTextField caja: arregloTextField){
            caja.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent evt){
                    cajaMousePressed(evt);
                }
            });
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPanel = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        separadorIcbn = new javax.swing.JSeparator();
        separadorTitulo = new javax.swing.JSeparator();
        separadorAutor = new javax.swing.JSeparator();
        separadorYear = new javax.swing.JSeparator();
        separadorCosto = new javax.swing.JSeparator();
        autor = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JPanel();
        txtCancelar = new javax.swing.JLabel();
        eleccion = new javax.swing.JComboBox<>();
        agregado = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPanel.setBackground(new java.awt.Color(255, 255, 255));
        tituloPanel.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        tituloPanel.setText("Agregar Publicación");
        add(tituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        panelContenido.setBackground(new java.awt.Color(51, 51, 51));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorIcbn.setBackground(new java.awt.Color(255, 255, 255));
        separadorIcbn.setForeground(new java.awt.Color(255, 255, 255));
        panelContenido.add(separadorIcbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        separadorTitulo.setBackground(new java.awt.Color(255, 255, 255));
        separadorTitulo.setForeground(new java.awt.Color(255, 255, 255));
        panelContenido.add(separadorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 120, -1));

        separadorAutor.setBackground(new java.awt.Color(255, 255, 255));
        separadorAutor.setForeground(new java.awt.Color(255, 255, 255));
        panelContenido.add(separadorAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 120, -1));

        separadorYear.setBackground(new java.awt.Color(255, 255, 255));
        separadorYear.setForeground(new java.awt.Color(255, 255, 255));
        panelContenido.add(separadorYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, -1));

        separadorCosto.setBackground(new java.awt.Color(255, 255, 255));
        separadorCosto.setForeground(new java.awt.Color(255, 255, 255));
        panelContenido.add(separadorCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, -1));

        autor.setBackground(new java.awt.Color(51, 51, 51));
        autor.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        autor.setForeground(new java.awt.Color(153, 153, 153));
        autor.setText("Autor");
        autor.setBorder(null);
        panelContenido.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, -1));

        isbn.setBackground(new java.awt.Color(51, 51, 51));
        isbn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        isbn.setForeground(new java.awt.Color(153, 153, 153));
        isbn.setText("Isbn");
        isbn.setBorder(null);
        panelContenido.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, -1));

        costo.setBackground(new java.awt.Color(51, 51, 51));
        costo.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        costo.setForeground(new java.awt.Color(153, 153, 153));
        costo.setText("Costo");
        costo.setBorder(null);
        panelContenido.add(costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, -1));

        titulo.setBackground(new java.awt.Color(51, 51, 51));
        titulo.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 153, 153));
        titulo.setText("Título");
        titulo.setBorder(null);
        panelContenido.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 120, -1));

        year.setBackground(new java.awt.Color(51, 51, 51));
        year.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        year.setForeground(new java.awt.Color(153, 153, 153));
        year.setText("Año");
        year.setBorder(null);
        panelContenido.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, -1));

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCancelar.setLayout(new java.awt.GridLayout(1, 0));

        txtCancelar.setBackground(new java.awt.Color(51, 51, 51));
        txtCancelar.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        txtCancelar.setForeground(new java.awt.Color(255, 255, 255));
        txtCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCancelar.setText("Cancelar");
        txtCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCancelarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCancelarMouseEntered(evt);
            }
        });
        btnCancelar.add(txtCancelar);

        panelContenido.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, 40));

        eleccion.setBackground(new java.awt.Color(51, 51, 51));
        eleccion.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        eleccion.setForeground(new java.awt.Color(255, 255, 255));
        eleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Libro", "AudioLibro" }));
        eleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionActionPerformed(evt);
            }
        });
        panelContenido.add(eleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 40));

        agregado.setBackground(new java.awt.Color(51, 51, 51));
        panelContenido.add(agregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 740, 120));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));

        txtAgregar.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(0, 0, 0));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("Añadir");
        txtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelContenido.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 80, 40));

        add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 430));
    }// </editor-fold>//GEN-END:initComponents
    
    private void eleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionActionPerformed
        
        int numEleccion = eleccion.getSelectedIndex();
        switch (numEleccion) {
            case 1:
                
                if(audio.isVisible()){
                    audio.setVisible(false);
                }
                libro.setVisible(true);
                
                this.agregado.add(this.libro);
                this.validate();
                break;
            case 2:
                
                if(libro.isVisible()){
                    libro.setVisible(false);
                }
                audio.setVisible(true);
                
                this.agregado.add(this.audio);
                this.validate();
                break;
            case 0:
                if(libro.isVisible()){
                    libro.setVisible(false);
                    
                }else if(audio.isVisible()){
                    audio.setVisible(false);
                }
                break;
        }
    }//GEN-LAST:event_eleccionActionPerformed

    private void txtCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCancelarMouseEntered
        txtCancelar.setForeground(Color.black);
        btnCancelar.setBackground(Color.white);
    }//GEN-LAST:event_txtCancelarMouseEntered

    private void txtCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCancelarMouseExited
        txtCancelar.setForeground(Color.white);
        btnCancelar.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtCancelarMouseExited
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        for(int i = 0;i<arregloTextField.size();i++){
            if(arregloTextField.get(i).getText().equals("")){
                arregloTextField.get(i).setText(etiquetasJText[i]);
                arregloTextField.get(i).setForeground(new Color(153,153,153));
            }
        }
    }//GEN-LAST:event_formMousePressed

    private void txtAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseEntered
        this.btnAgregar.setBackground(new Color(173,216,230));
    }//GEN-LAST:event_txtAgregarMouseEntered

    private void txtAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseExited
        this.btnAgregar.setBackground(Color.white);
    }//GEN-LAST:event_txtAgregarMouseExited

    private void txtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseClicked
        int numero;
        boolean vacio = false;
        String texto;
        
        int escogido = eleccion.getSelectedIndex();
        
        switch(escogido){

            case 0:
                JOptionPane.showMessageDialog(this,"Seleccione un tipo de publicacion","Error",JOptionPane.WARNING_MESSAGE);
                break;
                
            case 1:
                
                for(int i = 0; i < arregloTextField.size()-2;i++){
                    
                    texto = arregloTextField.get(i).getText();
                    if(texto.equals(etiquetasJText[i]) || texto.equals("")){
                        vacio = true;
                    }  
                }
                
                if(vacio){
                    JOptionPane.showMessageDialog(this,"No debe haber campos vacíos","Campos vacíos",JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    
                    pLibro = new Libro();
                    
                    pLibro.setIsbn(isbn.getText());
                    pLibro.setTitulo(titulo.getText());
                    pLibro.setAutor(autor.getText());

                    try{

                        numero = Integer.parseInt(this.year.getText());
                        pLibro.setAnio(numero);

                        double precio = Double.parseDouble(this.costo.getText());
                        pLibro.setCosto(precio);

                        numero = Integer.parseInt(arregloTextField.get(5).getText());
                        pLibro.setnPaginas(numero);

                        numero = Integer.parseInt(arregloTextField.get(6).getText());
                        pLibro.setEdicion(numero);
                        
                        listaPublicacion.insertarPublicacion(pLibro);
                        TablaLibro.llenarTabla(pLibro);
                        JOptionPane.showMessageDialog(this,"Se ha añadido la publicacion correctamente",
                                "Añadido",JOptionPane.PLAIN_MESSAGE);
                        PanelAgregar.limpiar();
                        
                    }catch (NumberFormatException e){
                        
                        JOptionPane.showMessageDialog(this,"Te has equivocado escribiendo algún dato número, revisa","Dato incorrecto",JOptionPane.WARNING_MESSAGE);
                    }
                }
                break;
                
            case 2:
                
                int i = 0;
                for(JTextField caja: arregloTextField){
                    
                    if(!(caja.equals(libro.getPaginas()) || caja.equals(libro.getEdicion()))){
                        if(caja.getText().equals(etiquetasJText[i]) || caja.getText().equals("")){
                            vacio = true;
                        }
                    }
                    i++;
                }
                
                if(vacio){
                    JOptionPane.showMessageDialog(this,"No debe haber campos vacíos");
                    
                }else{
                    pAudio = new AudioLibro();
                    
                    pAudio.setIsbn(isbn.getText());
                    pAudio.setTitulo(titulo.getText());
                    pAudio.setAutor(autor.getText());
                    pAudio.setFormato(audio.getFormato());

                    try{

                        numero = Integer.parseInt(this.year.getText());
                        pAudio.setAnio(numero);

                        double precio = Double.parseDouble(this.costo.getText());
                        pAudio.setCosto(precio);
                        
                        double duracion = Double.parseDouble(audio.getDuracion().getText());
                        pAudio.setDuracion(duracion);
                        
                        double peso = Double.parseDouble(audio.getPeso().getText());
                        pAudio.setPeso(peso);
                        
                        listaPublicacion.insertarPublicacion(pAudio);
                        TablaAudioLibro.llenarTabla(pAudio);
                        JOptionPane.showMessageDialog(this,"Se ha añadido la publicacion correctamente",
                                "Añadido",JOptionPane.PLAIN_MESSAGE);
                        PanelAgregar.limpiar();
                        
                    }catch (NumberFormatException e){
                        
                        JOptionPane.showMessageDialog(this,"No has digitado el dato correcto");
                    }
                }
        }
    }//GEN-LAST:event_txtAgregarMouseClicked
    
    //Pone el texto de los JTextField como estaban inicialmente
    public static void limpiar(){
        for(int i = 0;i < arregloTextField.size(); i++){
            arregloTextField.get(i).setText(etiquetasJText[i]);
            arregloTextField.get(i).setForeground(new Color(153,153,153));
        }
    }
    private void cajaMousePressed(MouseEvent evt){
        
        for(int i = 0;i<arregloTextField.size();i++){
            
            if(evt.getSource()==arregloTextField.get(i) && 
                arregloTextField.get(i).getText().equals(etiquetasJText[i])){
                
                arregloTextField.get(i).setText("");
                arregloTextField.get(i).setForeground(Color.white);
            }
        }
        int j = 0;
        for(JTextField caja: arregloTextField){

            if(!caja.equals(evt.getSource()) && caja.getText().equals("")){
               caja.setText(etiquetasJText[j]);
                caja.setForeground(new Color(153,153,153));
            }else{
                j++;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregado;
    private javax.swing.JTextField autor;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JTextField costo;
    private javax.swing.JComboBox<String> eleccion;
    private javax.swing.JTextField isbn;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JSeparator separadorAutor;
    private javax.swing.JSeparator separadorCosto;
    private javax.swing.JSeparator separadorIcbn;
    private javax.swing.JSeparator separadorTitulo;
    private javax.swing.JSeparator separadorYear;
    private javax.swing.JTextField titulo;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JLabel txtAgregar;
    public static javax.swing.JLabel txtCancelar;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
    
    private final OpcionLibro libro = new OpcionLibro();
    private final OpcionAudio audio = new OpcionAudio();
    public static Libro pLibro;
    public static AudioLibro pAudio;
    public static ListaPublicacion listaPublicacion = new ListaPublicacion();
    
    private final static String etiquetasJText[] = {
        "Isbn","Título","Autor",
        "Costo","Año","No. Pag",
        "No. Edición","Duración","Peso"
    };
    private static List<JTextField> arregloTextField;
}
