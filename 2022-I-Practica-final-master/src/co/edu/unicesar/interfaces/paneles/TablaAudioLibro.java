package co.edu.unicesar.interfaces.paneles;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.AudioLibro;
import co.edu.unicesar.persistencia.ArchivoTexto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaAudioLibro extends javax.swing.JPanel {
    
    protected static DefaultTableModel dtm;
    private static Object[] fila  = new Object[8];
    
    public TablaAudioLibro() {
        initComponents();
        
        dtm = (DefaultTableModel) tablaAudioLibro.getModel();
        this.cargarDatos();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAudioLibro = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));

        tablaAudioLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idbn", "Titulo", "Autor", "Costo", "Año", "Formato", "Peso", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAudioLibro.setPreferredSize(new java.awt.Dimension(450, 80));
        tablaAudioLibro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaAudioLibro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void llenarTabla(AudioLibro audiolibro){
        
        fila[0] = audiolibro.getIsbn();
        fila[1] = audiolibro.getTitulo();
        fila[2] = audiolibro.getAutor();
        fila[3] = audiolibro.getCosto();
        fila[4] = audiolibro.getAnio();
        fila[5] = audiolibro.getFormato();
        fila[6] = audiolibro.getPeso();
        fila[7] = audiolibro.getDuracion();
        
        dtm.addRow(fila);
    }
    
     private void cargarDatos(){
        
        ArchivoTexto datos = new ArchivoTexto();
        
        try{
            
            for(int i = 0; i <datos.leerPublicaciones().size(); i++){
            
                String dato[] = datos.leerPublicaciones().get(i).split(";");
                
                if(dato[0].equalsIgnoreCase("A")){
                    
                    fila[0] = dato[1];
                    fila[1] = dato[2];
                    fila[2] = dato[3];
                    fila[3] = dato[5];
                    fila[4] = dato[4];
                    fila[5] = dato[6];
                    fila[6] = dato[7];
                    fila[7] = dato[8];
                    
                    dtm.addRow(fila);  
                }
            }
        }catch(ExcepcionArchivo ae){
            JOptionPane.showMessageDialog(null, ae.getMessage(),"Error al cargar los datos",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaAudioLibro;
    // End of variables declaration//GEN-END:variables
}
