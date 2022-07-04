package co.edu.unicesar.interfaces.paneles;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Libro;
import co.edu.unicesar.persistencia.ArchivoTexto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaLibro extends javax.swing.JPanel {

    protected static DefaultTableModel dtm;
    private static final Object[] fila  = new Object[7];
    
    public TablaLibro() {
        initComponents();
        
        dtm = (DefaultTableModel) tablaLibro.getModel();
        this.cargarDatos();
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

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
    
    private void cargarDatos(){
        
        ArchivoTexto datos = new ArchivoTexto();
        
        try{
            
            for(int i = 0; i <datos.leerPublicaciones().size(); i++){
            
                String dato[] = datos.leerPublicaciones().get(i).split(";");
                
                if(dato[0].equalsIgnoreCase("L")){
                    
                    fila[0] = dato[1];
                    fila[1] = dato[2];
                    fila[2] = dato[3];
                    fila[3] = dato[5];
                    fila[4] = dato[4];
                    fila[5] = dato[6];
                    fila[6] = dato[7];
            
                    dtm.addRow(fila);  
                }
            }
        }catch(ExcepcionArchivo ae){
            JOptionPane.showMessageDialog(null, ae.getMessage(),"Error al cargar los datos",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaLibro;
    // End of variables declaration//GEN-END:variables

}
