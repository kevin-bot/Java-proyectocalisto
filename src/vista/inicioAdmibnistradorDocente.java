
package vista;

public class inicioAdmibnistradorDocente extends javax.swing.JDialog {

    public inicioAdmibnistradorDocente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboCUN = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        JcomboCRUD_CUS = new javax.swing.JComboBox<String>();
        btnSiguiente = new javax.swing.JButton();
        btnSiguiente2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboCUN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrar docente", "Administrar estudiante", "Administrar asignaturas", "Administrar salones" }));

        jLabel1.setText("ADMINISTRADOR DOCENTE");

        JcomboCRUD_CUS.setEnabled(false);

        btnSiguiente.setText("=>");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnSiguiente2.setText("=>");
        btnSiguiente2.setEnabled(false);
        btnSiguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente2ActionPerformed(evt);
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
                            .addComponent(jComboCUN, 0, 309, Short.MAX_VALUE)
                            .addComponent(JcomboCRUD_CUS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiguiente)
                            .addComponent(btnSiguiente2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCUN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboCRUD_CUS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String seleccionCUN=jComboCUN.getSelectedItem().toString();
                JcomboCRUD_CUS.setEnabled(true);
                btnSiguiente2.setEnabled(true);
        switch (seleccionCUN){                        
            case "Administrar docente":{
                JcomboCRUD_CUS.removeAllItems();
                
                JcomboCRUD_CUS.addItem("Crear Docente");           
                JcomboCRUD_CUS.addItem("Consultar Docente");
                JcomboCRUD_CUS.addItem("Eliminar Docente");
                JcomboCRUD_CUS.addItem("Actualizar Docente");
               
                break;}
            case "Administrar estudiante":{
                JcomboCRUD_CUS.removeAllItems();
             
                JcomboCRUD_CUS.addItem("Crear Estudiante");
                JcomboCRUD_CUS.addItem("Consultar Estudiante");
                JcomboCRUD_CUS.addItem("Eliminar Estudiante");
                JcomboCRUD_CUS.addItem("Actualizar Estudiante");
                break;}
            case "Administrar asignaturas":{
                JcomboCRUD_CUS.removeAllItems();
               
                JcomboCRUD_CUS.addItem("Crear Asignatura");
                JcomboCRUD_CUS.addItem("Consultar Asignatura");
                JcomboCRUD_CUS.addItem("Eliminar Asignatura");
                JcomboCRUD_CUS.addItem("Actualizar Asignatura");
                break;}
            
            
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnSiguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente2ActionPerformed
       String selesccion2=JcomboCRUD_CUS.getSelectedItem().toString();
       switch(selesccion2){
           case "Crear Docente":{
               java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    AgregarDocente dialog = new AgregarDocente(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            //System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                }
            });
            break;
           }
           case "Consultar Docente":{
            break;
           }case "Eliminar Docente":{
            break;
           }case "Actualizar Docente":{
            break;
           }
           
           
           
           
       }
    }//GEN-LAST:event_btnSiguiente2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboCRUD_CUS;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JComboBox<String> jComboCUN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

