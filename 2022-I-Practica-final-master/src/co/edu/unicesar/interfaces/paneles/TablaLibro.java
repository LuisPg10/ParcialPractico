package co.edu.unicesar.interfaces.paneles;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.interfaces.ventanas.TipoArchivo;
import co.edu.unicesar.modelo.Libro;
import co.edu.unicesar.modelo.Publicacion;
import co.edu.unicesar.persistencia.Archivo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaLibro extends javax.swing.JPanel {

    protected static DefaultTableModel dtm;
    private static final Object[] fila  = new Object[7];
    
    public TablaLibro() {
        initComponents();
        
        dtm = (DefaultTableModel) tablaLibro.getModel();
    }
    
    MouseAdapter eventoEliminar = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt){
            
        }
    };
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibro = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));

        tablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idbn", "Titulo", "Autor", "Costo", "Año", "No. Edición", "No. Pág"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLibro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLibro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public static void llenarTabla(Libro libro){
        
        
        fila[0] = libro.getIsbn();
        fila[1] = libro.getTitulo();
        fila[2] = libro.getAutor();
        fila[3] = libro.getCosto();
        fila[4] = libro.getAnio();
        fila[5] = libro.getEdicion();
        fila[6] = libro.getnPaginas();

        dtm.addRow(fila);
    }
    
    public void cargarDatos(){
        
        Archivo datos = TipoArchivo.archivo;
        
        try{
            
            List<Publicacion> dato = datos.leerPublicaciones();
            
            for(int i = 0; i <dato.size(); i++){
                Publicacion publicacion = dato.get(i);
                formatoFilas(publicacion);
            }
            
        }catch(ExcepcionArchivo ae){
            JOptionPane.showMessageDialog(null, ae.getMessage(),"Error al cargar los datos",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    private void formatoFilas(Publicacion publicacion){
        
        String formatoDato[] = publicacion.getDataStringFormat().split(";");
        
        if(formatoDato[0].equalsIgnoreCase("L")){

            fila[0] = formatoDato[1];
            fila[1] = formatoDato[2];
            fila[2] = formatoDato[3];
            fila[3] = formatoDato[5];
            fila[4] = formatoDato[4];
            fila[5] = formatoDato[6];
            fila[6] = formatoDato[7];
            
            dtm.addRow(fila);  
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaLibro;
    // End of variables declaration//GEN-END:variables

}
