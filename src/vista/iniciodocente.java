/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author hacker
 */
public class iniciodocente extends javax.swing.JDialog {

    /**
     * Creates new form iniciodocente
     */
    public iniciodocente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboCUN = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        JcomboCRUD_CUS = new javax.swing.JComboBox<>();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboCUN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrar Estudiante", "Administrar notas estudiantes" }));

        jLabel1.setText("DOCENTE");

        JcomboCRUD_CUS.setEnabled(false);

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JcomboCRUD_CUS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboCUN, 0, 351, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboCUN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(JcomboCRUD_CUS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String seleccionCUN=jComboCUN.getSelectedItem().toString();
        switch (seleccionCUN){
            case "Administrar Estudiante":{

                JcomboCRUD_CUS.removeAllItems();
                JcomboCRUD_CUS.setEnabled(true);
                JcomboCRUD_CUS.addItem("Consultar Estudiante");
                JcomboCRUD_CUS.addItem("Consultar Rendimiento Estudiante");
                break;}
            case "Administrar notas estudiantes":{
                JcomboCRUD_CUS.removeAllItems();
                JcomboCRUD_CUS.setEnabled(true);
                JcomboCRUD_CUS.addItem("Crear Nota Estudiante");
                JcomboCRUD_CUS.addItem("Consultar Nota Estudiante");
                JcomboCRUD_CUS.addItem("Eliminar Nota Estudiante");
                JcomboCRUD_CUS.addItem("Actualizar Nota Estudiante");
                break;}
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboCRUD_CUS;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> jComboCUN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}