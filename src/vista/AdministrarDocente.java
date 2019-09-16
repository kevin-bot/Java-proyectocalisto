
package vista;

import Controlador.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AdministrarDocente extends javax.swing.JDialog {
    Docente_administrador  myDocente_administrador;
    String opcion;
    
    public AdministrarDocente(String opcion){
            this.opcion=opcion;                    
        }
    public AdministrarDocente(java.awt.Frame parent, boolean modal,String opcion) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
          myDocente_administrador= new Docente_administrador();
          myDocente_administrador.BuscarDocenteLenarJcombo(txtcedula);
        switch (opcion) {
            case "Crear Docente":
                txtcedula.setVisible(false);
                btnBuscar.setVisible(false);
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);
                txtCedulaCrear.setVisible(true);
                
                break;  
            case "Consultar Docente":
                
                break; 
            case "Eliminar Docente":
                txtnombre.setEnabled(false);txtpassword.setEnabled(false);txteps.setEnabled(false);
                txtformacion.setEnabled(false);txtTelefono.setEnabled(false);txtDireccion.setEnabled(false);txtApellido.setEnabled(false);
                Jestrato.setEnabled(false);Jgrado.setEnabled(false);
                
                btnActualizar.setEnabled(false);
                btnguardar.setEnabled(false);
                txtCedulaCrear.setVisible(false);btnBuscar.setEnabled(false);
                
                break; 
            case "Actualizar Docente":
                btnguardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                txtCedulaCrear.setVisible(false);
                break; 
        }
       
    }

        
        
             
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        Jgrado = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Jestrato = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtformacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtcedula = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtCedulaCrear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("AGREGAR DOCENTE");

        jLabel2.setText("Cédula ");

        jLabel3.setText("Nombres");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Primer Apellido ");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        Jgrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto" }));
        Jgrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JgradoItemStateChanged(evt);
            }
        });

        jLabel9.setText("EPS ");

        txteps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtepsKeyTyped(evt);
            }
        });

        jLabel10.setText("Estrato ");

        Jestrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "Otro,¿Cuál? " }));

        jLabel11.setText("Grado ");

        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Formación Académica ");

        txtformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtformacionActionPerformed(evt);
            }
        });
        txtformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtformacionKeyTyped(evt);
            }
        });

        jLabel5.setText("Password");

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        jLabel7.setText("Telefono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel8.setText("Direccion");

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCedulaCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCrearActionPerformed(evt);
            }
        });
        txtCedulaCrear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaCrearKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedulaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Jestrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Jgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCedulaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10))
                    .addComponent(Jestrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(Jgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    login MyLogin = new login();
    private void JgradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JgradoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JgradoItemStateChanged

    private void txtformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtformacionActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(txtformacion.getText().equals("") || txtcedula.getSelectedItem().toString().equals("") || txtnombre.getText().equals("") || 
                txtApellido.getText().equals("")||txteps.getText().equals("")|| Jestrato.getSelectedItem().toString().equals("")
                ||txtpassword.getText().equals("")|| txtTelefono.getText().equals("")||txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios",null,2);
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
        Docente MyDocente= new Docente(grado, txtformacion.getText(),
                txtCedulaCrear.getText(), txtnombre.getText(),txtApellido.getText(),txteps.getText(), Jestrato.getSelectedItem().toString()
                ,txtpassword.getText(), txtTelefono.getText(),txtDireccion.getText());
        
         myDocente_administrador= new Docente_administrador();
         myDocente_administrador.Creardocente(MyDocente);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if( txtcedula.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios",null,0);
        }else{      
        
            Docente_administrador miDocente_administrador= new Docente_administrador();
               miDocente_administrador.Eliminardocentes(txtcedula.getSelectedItem().toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
           if(txtformacion.getText().equals("") || txtcedula.getSelectedItem().toString().equals("") || txtnombre.getText().equals("") || 
                txtApellido.getText().equals("")||txteps.getText().equals("")|| Jestrato.getSelectedItem().toString().equals("")
                ||txtpassword.getText().equals("")|| txtTelefono.getText().equals("")||txtDireccion.getText().equals("")){
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
        
                Docente MyDocente= new Docente(grado, txtformacion.getText(),
                        txtcedula.getSelectedItem().toString(), txtnombre.getText(),txtApellido.getText(),txteps.getText(), Jestrato.getSelectedItem().toString()
                        ,txtpassword.getText(), txtTelefono.getText(),txtDireccion.getText()); 

                myDocente_administrador = new Docente_administrador();
                
                myDocente_administrador.Actualizardocente(MyDocente);
           }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here
        MyLogin.Sololetras(evt);
        MyLogin.validarTamañoTXT(txtnombre,30, evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        MyLogin.Sololetras(evt);
        MyLogin.validarTamañoTXT(txtApellido,30, evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
    
        MyLogin.validarTamañoTXT(txtpassword,30, evt);
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtepsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtepsKeyTyped
        // TODO add your handling code here:
        MyLogin.Sololetras(evt);
        MyLogin.validarTamañoTXT(txteps,30, evt);
    }//GEN-LAST:event_txtepsKeyTyped

    private void txtformacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtformacionKeyTyped
        // TODO add your handling code here:
        MyLogin.Sololetras(evt);
        MyLogin.validarTamañoTXT(txtformacion,30, evt);
    }//GEN-LAST:event_txtformacionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        MyLogin.Solonumeros(evt);
        MyLogin.validarTamañoTXT(txtTelefono,15, evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        
        MyLogin.validarTamañoTXT(txtDireccion,30, evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        myDocente_administrador= new Docente_administrador();
           
           ArrayList<Docente> listaPersonas =myDocente_administrador.BuscarCedulaDocenteAModificar(txtcedula.getSelectedItem().toString());      
           System.out.println(" el dato que  se mada es "+txtcedula.getSelectedItem().toString());
        if (listaPersonas.size()>0) {
            System.out.println("la longitud si es mayor que cero");
   //se recorre la lista de personas asignandose cada posicion en un objeto persona
   for (int i = 0; i < listaPersonas.size(); i++) {
            Docente miDocente= new Docente();
            miDocente=listaPersonas.get(i); 
            
            txtApellido.setText(miDocente.getApellido());
            txtDireccion.setText(miDocente.getDireccion());
            txteps.setText(miDocente.getEps());
           txtpassword.setText(miDocente.getPassword());
           txtnombre.setText(miDocente.getNombre());
           txtformacion.setText(miDocente.getFormacion());
           txtTelefono.setText(miDocente.getTelefono());
           
            
           }
          }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCedulaCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCrearActionPerformed
       
    }//GEN-LAST:event_txtCedulaCrearActionPerformed

    private void txtCedulaCrearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaCrearKeyTyped
        MyLogin.Solonumeros(evt);
        MyLogin.validarTamañoTXT(txtCedulaCrear, 12, evt);
    }//GEN-LAST:event_txtCedulaCrearKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Jestrato;
    private javax.swing.JComboBox Jgrado;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedulaCrear;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JComboBox<String> txtcedula;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtformacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}

