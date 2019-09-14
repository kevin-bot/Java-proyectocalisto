
package vista;

public class inicioDocente extends javax.swing.JDialog {
    String curso_de_docente;
    public inicioDocente(java.awt.Frame parent, boolean modal,String curso_de_docente) {
        super(parent, modal);
        initComponents();
        this.curso_de_docente=curso_de_docente;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JcomboCRUD_CUS = new javax.swing.JComboBox<String>();
        btnSiguiente2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ADMINISTRADOR DOCENTE");

        JcomboCRUD_CUS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Crear nota estudiante", "Consultar nota estudiante", "Eliminar nota estudiante", "Actualizar nota estudiante" }));

        btnSiguiente2.setText("=>");
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
                        .addComponent(JcomboCRUD_CUS, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente2))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboCRUD_CUS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*switch(selesccion2){
           case "Crear nota estudiante":{
               
            break;
           }
           case "Consultar nota estudiante":{
               
            break;
           }case "Eliminar nota estudiante":{
               
            break;
           }case "Actualizar Docente":{
               
            break;
           }}*/
    private void btnSiguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente2ActionPerformed
       String selesccion2=JcomboCRUD_CUS.getSelectedItem().toString();
              
        
           switch (curso_de_docente){
                    case "1":  
                            switch(selesccion2){
                                case "Crear nota estudiante":{
                                        AbrirInterfazPrimero("Crear nota estudiante");
                                 break;
                                }
                                case "Consultar nota estudiante":{
                                        AbrirInterfazPrimero("Consultar nota estudiante");
                                 break;
                                }case "Eliminar nota estudiante":{
                                        AbrirInterfazPrimero("Eliminar nota estudiante");
                                 break;
                                }case "Actualizar nota estudiante":{
                                        AbrirInterfazPrimero("Actualizar Docente");
                                 break;
                                }}
                            
                        break;
                    case "2": 
                            switch(selesccion2){
                                case "Crear nota estudiante":{
                                        AbrirInterfazSegundo("Crear nota estudiante");
                                 break;
                                }
                                case "Consultar nota estudiante":{
                                        AbrirInterfazSegundo("Consultar nota estudiante");
                                 break;
                                }case "Eliminar nota estudiante":{
                                        AbrirInterfazSegundo("Eliminar nota estudiante");
                                 break;
                                }case "Actualizar Docente":{
                                        AbrirInterfazSegundo("Actualizar Docente");
                                 break;
                                }}
                          
                        break;
                    case "3": 
                        switch(selesccion2){
                                case "Crear nota estudiante":{
                                        AbrirInterfaztercero("Crear nota estudiante");
                                 break;
                                }
                                case "Consultar nota estudiante":{
                                        AbrirInterfaztercero("Consultar nota estudiante");
                                 break;
                                }case "Eliminar nota estudiante":{
                                        AbrirInterfaztercero("Eliminar nota estudiante");
                                 break;
                                }case "Actualizar Docente":{
                                       AbrirInterfaztercero("Actualizar Docente");
                                 break;
                                }}
                        
                        break;
                    case "4": 
                        
                        switch(selesccion2){
                                case "Crear nota estudiante":{
                                        AbrirInterfazcuarto("Crear nota estudiante");
                                 break;
                                }
                                case "Consultar nota estudiante":{
                                        AbrirInterfazcuarto("Consultar nota estudiante");
                                 break;
                                }case "Eliminar nota estudiante":{
                                        AbrirInterfazcuarto("Eliminar nota estudiante");
                                 break;
                                }case "Actualizar Docente":{
                                       AbrirInterfazcuarto("Actualizar Docente");
                                 break;
                                }}
                        
                        break;
                    case "5":  
                        
                        switch(selesccion2){
                                case "Crear nota estudiante":{
                                        AbrirInterfazquinto("Crear nota estudiante");
                                 break;
                                }
                                case "Consultar nota estudiante":{
                                        AbrirInterfazquinto("Consultar nota estudiante");
                                 break;
                                }case "Eliminar nota estudiante":{
                                        AbrirInterfazquinto("Consultar nota estudiante");
                                 break;
                                }case "Actualizar Docente":{
                                       AbrirInterfazquinto("Actualizar Docente");
                                 break;
                                }}
                }
           
           
                               
    }//GEN-LAST:event_btnSiguiente2ActionPerformed
        
     //METODSO SE ENCARGA DE ABRIR LA INTERFAZ DE ADMINISTRACION DE DOCENTE
    public void AbrirInterfazPrimero(String Opcion_escogida){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotasPrimero dialog = new NotasPrimero(new javax.swing.JFrame(), true,Opcion_escogida);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
       }
    
    public void AbrirInterfazSegundo(String Opcion_escogida){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotasPrimero dialog = new NotasPrimero(new javax.swing.JFrame(), true,Opcion_escogida);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
       }
    public void AbrirInterfaztercero(String Opcion_escogida){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotasPrimero dialog = new NotasPrimero(new javax.swing.JFrame(), true,Opcion_escogida);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
       }
    public void AbrirInterfazcuarto(String Opcion_escogida){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotasPrimero dialog = new NotasPrimero(new javax.swing.JFrame(), true,Opcion_escogida);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
       }
    public void AbrirInterfazquinto(String Opcion_escogida){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotasPrimero dialog = new NotasPrimero(new javax.swing.JFrame(), true,Opcion_escogida);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
       }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboCRUD_CUS;
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

