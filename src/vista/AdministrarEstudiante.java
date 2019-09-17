
package vista;

import Controlador.Docente;
import Controlador.Docente_administrador;
import Controlador.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class AdministrarEstudiante extends javax.swing.JDialog {

    Docente_administrador myDocente_administrador=new Docente_administrador();
    public AdministrarEstudiante(java.awt.Frame parent, boolean modal,String opcion) {
        super(parent, modal);
        initComponents();
        myDocente_administrador.BuscarEstudianteLenarJcombo(JtiEliminar);
         this.setLocationRelativeTo(null);
                
        switch (opcion) {
            case "Crear Estudiante":
                JtiEliminar.setVisible(false);
                btnbuscar.setVisible(false);
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);                
                break;  
            case "Consultar Estudiante":
                txtnombre.setEnabled(false);txteps.setEnabled(false);txtapellido.setEnabled(false);
                Jestrato.setEnabled(false);Jgrado.setEnabled(false);
                
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnguardar.setEnabled(false);
                break; 
            case "Eliminar Estudiante":
                txtTI.setVisible(false);
                btnbuscar.setVisible(false);
                txtnombre.setEnabled(false);txteps.setEnabled(false);txtapellido.setEnabled(false);
                Jestrato.setEnabled(false);Jgrado.setEnabled(false);
                
                btnActualizar.setEnabled(false);
                btnguardar.setEnabled(false);
                
                
                break; 
            case "Actualizar Estudiante":
                txtTI.setVisible(false);
                btnguardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                
                break; 
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        Jgrado = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Jestrato = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        JtiEliminar = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADMINISTRAR ESTUDIANTE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 173, 26));

        jLabel2.setText("Tarjeta de Identidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 55, 124, 41));

        txtTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIActionPerformed(evt);
            }
        });
        getContentPane().add(txtTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 65, 160, -1));

        jLabel3.setText("Nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 50, 23));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 184, -1));

        jLabel4.setText("Primer Apellido ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 102, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));

        Jgrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto" }));
        Jgrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JgradoItemStateChanged(evt);
            }
        });
        getContentPane().add(Jgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        jLabel9.setText("EPS ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 50, -1));
        getContentPane().add(txteps, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 160, -1));

        jLabel10.setText("Estrato ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 40, -1));

        Jestrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "Otro,¿Cuál? " }));
        getContentPane().add(Jestrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, -1));

        jLabel11.setText("Grado ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 102, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 193, 85, 40));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 193, 96, 40));

        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 193, 103, 40));

        getContentPane().add(JtiEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, 30));

        btnbuscar.setText("jButton1");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIActionPerformed

    private void JgradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JgradoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JgradoItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            myDocente_administrador.EliminarEstudiante(JtiEliminar.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String grado="";
        if(txtnombre.getText().equals("") || txtapellido.getText().equals("")||txteps.getText().equals("")|| Jestrato.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios",null,0);
        }else{
        switch(Jgrado.getSelectedItem().toString()){
            case "Primero": grado="1";
            break;
            case "Segundo": grado="2";
            break;
            case "Tercero": grado="3";
            break;
            case "Cuarto": grado="4";
            break;
            case "Quinto": grado="5";
            break;
                        
        }
            Estudiante myEstudiante= new Estudiante(JtiEliminar.getSelectedItem().toString(),txtnombre.getText(),txtapellido.getText(),txteps.getText(),Jestrato.getSelectedItem().toString(),grado) ;            
            myDocente_administrador.ActualizarEstudiante(myEstudiante);
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(txtTI.getText().equals("")||txtnombre.getText().equals("") || txtapellido.getText().equals("")||txteps.getText().equals("")|| Jestrato.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios",null,0);    
        }else{
        
        
        String grado="";
        switch(Jgrado.getSelectedItem().toString()){
            case "Primero": grado="1";
            break;
            case "Segundo": grado="2";
            break;
            case "Tercero": grado="3";
            break;
            case "Cuarto": grado="4";
            break;
            case "Quinto": grado="5";
            break;
        }
        
        Estudiante myEstudiante= new Estudiante(txtTI.getText(), txtnombre.getText(), txtapellido.getText(), txteps.getText(),Jestrato.getSelectedItem().toString(),grado);
        Docente_administrador myDocente_administrador= new Docente_administrador();
        myDocente_administrador.CrearEstudiante(myEstudiante);
            }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
            ArrayList<Estudiante> listaPersonas =myDocente_administrador.BuscarTIEstudianteAModificar(JtiEliminar.getSelectedItem().toString());      
           //System.out.println(" el dato que  se mada es "+t.getSelectedItem().toString());
        if (listaPersonas.size()>0) {
            System.out.println("la longitud si es mayor que cero");
   //se recorre la lista de personas asignandose cada posicion en un objeto persona
   for (int i = 0; i < listaPersonas.size(); i++) {
            Estudiante miEstudiante= new Estudiante();
            miEstudiante=listaPersonas.get(i); 
            
            txtapellido.setText(miEstudiante.getApellido());            
            txteps.setText(miEstudiante.getEps());           
           txtnombre.setText(miEstudiante.getNombre());                      
           }
          }
    }//GEN-LAST:event_btnbuscarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Jestrato;
    private javax.swing.JComboBox Jgrado;
    private javax.swing.JComboBox<String> JtiEliminar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtTI;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
