package co.edu.unicesar.interfaces.paneles;

import co.edu.unicesar.interfaces.ventanas.TipoArchivo;
import co.edu.unicesar.modelo.ListaPublicacion;
import co.edu.unicesar.persistencia.ArchivoTexto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelConsultar extends javax.swing.JPanel {
    
    public PanelConsultar() {
        initComponents();
        this.tablaLibro = new TablaLibro();
        this.tablaAudio = new TablaAudioLibro();
        this.panelContenido.add(tablaLibro);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JPanel();
        lupa = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        tituloPanel = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        tabla1 = new javax.swing.JPanel();
        txtTabla1 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JPanel();
        txtTabla2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(680, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenido.setBackground(new java.awt.Color(51, 51, 51));
        add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 350));

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lupa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicesar/interfaces/imagenes/lupa.png"))); // NOI18N
        lupa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lupaMousePressed(evt);
            }
        });
        btnbuscar.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        panelTitulo.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 40, 30));

        buscador.setBackground(new java.awt.Color(255, 255, 255));
        buscador.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        buscador.setForeground(new java.awt.Color(0, 0, 0));
        buscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTitulo.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 30));

        tituloPanel.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        tituloPanel.setText("Consultar");
        panelTitulo.add(tituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        panelBotones.setBackground(new java.awt.Color(51, 51, 51));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setBackground(new java.awt.Color(255, 255, 255));
        tabla1.setForeground(new java.awt.Color(255, 255, 255));
        tabla1.setMinimumSize(new java.awt.Dimension(60, 21));
        tabla1.setPreferredSize(new java.awt.Dimension(60, 21));

        txtTabla1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtTabla1.setForeground(new java.awt.Color(0, 0, 0));
        txtTabla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTabla1.setText("Libro");
        txtTabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTabla1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTabla1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTabla1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout tabla1Layout = new javax.swing.GroupLayout(tabla1);
        tabla1.setLayout(tabla1Layout);
        tabla1Layout.setHorizontalGroup(
            tabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        tabla1Layout.setVerticalGroup(
            tabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBotones.add(tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 40));

        tabla2.setBackground(new java.awt.Color(255, 255, 255));
        tabla2.setForeground(new java.awt.Color(255, 255, 255));
        tabla2.setMinimumSize(new java.awt.Dimension(60, 21));

        txtTabla2.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtTabla2.setForeground(new java.awt.Color(0, 0, 0));
        txtTabla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTabla2.setText("AudioLibro");
        txtTabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTabla2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTabla2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTabla2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout tabla2Layout = new javax.swing.GroupLayout(tabla2);
        tabla2.setLayout(tabla2Layout);
        tabla2Layout.setHorizontalGroup(
            tabla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTabla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabla2Layout.setVerticalGroup(
            tabla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTabla2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBotones.add(tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setMinimumSize(new java.awt.Dimension(60, 21));

        txtEliminar.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Eliminar");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelBotones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 40));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setMinimumSize(new java.awt.Dimension(60, 21));

        txtGuardar.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(0, 0, 0));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setText("Guardar");
        txtGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGuardarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGuardarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGuardarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBotones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 740, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTabla1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla1MouseEntered
        this.tabla1.setBackground(new Color(173,216,230));
    }//GEN-LAST:event_txtTabla1MouseEntered

    private void txtTabla1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla1MouseExited
        this.tabla1.setBackground(Color.white);
    }//GEN-LAST:event_txtTabla1MouseExited

    private void txtTabla2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla2MouseEntered
        this.tabla2.setBackground(new Color(173,216,230));
    }//GEN-LAST:event_txtTabla2MouseEntered

    private void txtTabla2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla2MouseExited
        this.tabla2.setBackground(Color.white);
    }//GEN-LAST:event_txtTabla2MouseExited

    private void txtEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseEntered
        this.txtEliminar.setForeground(Color.black);
        this.btnEliminar.setBackground(Color.white);
    }//GEN-LAST:event_txtEliminarMouseEntered

    private void txtEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseExited
        this.txtEliminar.setForeground(Color.white);
        this.btnEliminar.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtEliminarMouseExited

    private void txtTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla1MouseClicked
    
        if(tablaAudio.isVisible()){
            tablaAudio.setVisible(false);
        }
        
        tablaLibro.setVisible(true);
        this.panelContenido.add(tablaLibro);
        this.validate();
    }//GEN-LAST:event_txtTabla1MouseClicked

    private void txtTabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabla2MouseClicked
        
        if(tablaLibro.isVisible()){
            this.tablaLibro.setVisible(false);
        }
        
        tablaAudio.setVisible(true);
        this.panelContenido.add(tablaAudio);
        this.validate();
    }//GEN-LAST:event_txtTabla2MouseClicked

    private void txtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseClicked
        
        if(tablaLibro.isVisible()){
            eliminarPublicacion(TablaLibro.dtm, TablaLibro.tablaLibro);
            
        }else if(tablaAudio.isVisible()){
            eliminarPublicacion(TablaAudioLibro.dtm, TablaAudioLibro.tablaAudioLibro);
        }
    }//GEN-LAST:event_txtEliminarMouseClicked

    private void lupaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMousePressed
        
        if(tablaLibro.isVisible()){
            
            this.filtrarTabla(TablaLibro.tablaLibro);
            TablaLibro.tablaLibro.setModel(TablaLibro.dtm);
            
        }else if(tablaAudio.isVisible()){
            
            this.filtrarTabla(TablaAudioLibro.tablaAudioLibro);
            TablaAudioLibro.tablaAudioLibro.setModel(TablaAudioLibro.dtm);
        }
    }//GEN-LAST:event_lupaMousePressed

    private void txtGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseClicked
        
        ListaPublicacion publicaciones = PanelAgregar.listaPublicacion;
        if(publicaciones.leerPublicaciones().isEmpty()){
            JOptionPane.showMessageDialog(this,"No hay publicaciones para registrar","Guardar",JOptionPane.WARNING_MESSAGE);
            
        }else{
            TipoArchivo guardarComo = new TipoArchivo(this, PanelAgregar.listaPublicacion.leerPublicaciones());
            guardarComo.setVisible(true);
        }
    }//GEN-LAST:event_txtGuardarMouseClicked

    private void txtGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseExited
        this.btnGuardar.setBackground(Color.white);
    }//GEN-LAST:event_txtGuardarMouseExited

    private void txtGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseEntered
        this.btnGuardar.setBackground(new Color(173,216,230));
    }//GEN-LAST:event_txtGuardarMouseEntered
    
    private void filtrarTabla(JTable datos){
        
        JTable tabla = datos;
        
        this.filtro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(filtro);
        
        String filtrar = this.buscador.getText();
        this.filtro.setRowFilter(RowFilter.regexFilter(filtrar,0));
    }
    
    private void eliminarPublicacion(DefaultTableModel modelo,JTable tabla){
        
        if(modelo.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Sin publicaciones en la tabla","Error al eliminar",
                JOptionPane.WARNING_MESSAGE);
            
        }else{
            int filas = tabla.getSelectedRows().length;
            
            if(filas == 0){
                JOptionPane.showMessageDialog(this,"No ha seleccionado ninguna publicación", 
                        "Seleccione una fila",JOptionPane.WARNING_MESSAGE);
            }else{
                
                ArchivoTexto archivoTexto = new ArchivoTexto();
                
                if(archivoTexto.getArchivo().exists()){
                    
                    for(int i = 0; i < filas;i++){
                        
                        modelo.getValueAt(tabla.getSelectedRow(),tabla.getSelectedColumn());
                        
                        tabla.getSelectedRow() ;
                        //archivoTexto.eliminar(p);
                    }
                }
                for (int i = 0; i < filas; i++) {
                    
                    modelo.removeRow(tabla.getSelectedRow());
                }
                
                this.buscador.setText("");
                this.filtrarTabla(tabla);
                
                JOptionPane.showMessageDialog(this,"Publicacion eliminada correctamente", 
                        "Operación Exitosa",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnbuscar;
    private javax.swing.JTextField buscador;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel tabla1;
    private javax.swing.JPanel tabla2;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtTabla1;
    private javax.swing.JLabel txtTabla2;
    // End of variables declaration//GEN-END:variables

    private final TablaLibro tablaLibro;
    private final TablaAudioLibro tablaAudio;
    private TableRowSorter filtro;
}
