package vista;

import Controlador.*;

public class AdministrarAulas extends javax.swing.JDialog {
    login MyLogin = new login();
    Docente_administrador myDocente_administrador= new Docente_administrador();
    
    public AdministrarAulas(java.awt.Frame parent, boolean modal,String opcion) {
        super(parent, modal);
        initComponents();
        
        switch (opcion) {
            case "Crear Aula":                 
                jId.setVisible(false);
                btnbuscar.setVisible(false);
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);                                
                break;  
            case "Consultar Aula":
                
                break; 
            case "Eliminar Aula":
                txtnombre.setEnabled(false);
                txtid.setVisible(false);
                btnbuscar.setVisible(false);
                txttamaño.setEnabled(false);                
                Jgrado.setEnabled(false);                
                btnActualizar.setEnabled(false);
                btnguardar.setEnabled(false);                                
                break; 
            case "Actualizar Aula":
                txtid.setVisible(false);
                txtnombre.setEnabled(false);
                txttamaño.setEnabled(false);
                Jgrado.setEnabled(false);
                txtid.setVisible(false);
                btnguardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                break; 
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttamaño = new javax.swing.JTextField();
        Jgrado = new javax.swing.JComboBox();
        jId = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Grado ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 104, 50, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 179, 85, 40));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 179, 96, 40));

        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 179, 103, 40));

        jLabel1.setText("ADMINISTRAR AULAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 173, 26));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 69, 67, -1));

        jLabel3.setText("Nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 61, 23));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 61, 140, -1));

        jLabel4.setText("tamaño");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 101, 57, -1));

        txttamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttamañoKeyTyped(evt);
            }
        });
        getContentPane().add(txttamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 98, 160, -1));

        Jgrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto" }));
        Jgrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JgradoItemStateChanged(evt);
            }
        });
        getContentPane().add(Jgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 101, 150, -1));

        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 60, 72, -1));

        btnbuscar.setText("buscar");
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 64, -1));

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
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

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

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

        Salon mySalon= new Salon(Integer.parseInt(txtid.getText()), txtnombre.getText(),grado,Integer.parseInt(txttamaño.getText()));

    }//GEN-LAST:event_btnguardarActionPerformed

    private void JgradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JgradoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JgradoItemStateChanged

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        // TODO add your handling code here:
        MyLogin.Solonumeros(evt);
        MyLogin.validarTamañoTXT(txtid, 10, evt);
    }//GEN-LAST:event_txtidKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        MyLogin.Sololetras(evt);MyLogin.validarTamañoTXT(txtnombre, 40, evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txttamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyTyped
        // TODO add your handling code here:
        MyLogin.Solonumeros(evt);
    }//GEN-LAST:event_txttamañoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Jgrado;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttamaño;
    // End of variables declaration//GEN-END:variables
}
