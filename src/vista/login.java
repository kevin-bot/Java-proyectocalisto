
package vista;

import Controlador.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcedula = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        btnconsultar.setText("INGRESAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALISTO");

        jLabel2.setText("Cedula");

        jLabel3.setText("Contraseña");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtcedula)
                            .addComponent(jLabel3)
                            .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    public void Sololetras(KeyEvent evt){            
            
            char caracterIngresado=evt.getKeyChar();
            
             if(Character.isLetter(caracterIngresado) || evt.getKeyChar()==32){
             }else{                    
                    evt.consume();
              }
        } 
    public void Solonumeros(KeyEvent evt){            
            char caracter=evt.getKeyChar();
            
             if(Character.isDigit(caracter)){
             }else{                    
                    evt.consume();
              }
        } 
    
    public void validarTamañoTXT(javax.swing.JTextField txtCampo,int EscribirHasta,KeyEvent evt){
      
        if (txtCampo.getText().length()<=EscribirHasta) {     
            
        }else{
            evt.consume();
        }
    }
    
    public void ValidartamañoPass(char [] campoContraseña,KeyEvent evt){        
         String contraseña="";
         
         for (int i = 0; i < campoContraseña.length; i++) {
                     contraseña+=campoContraseña[i];                        
            }   
         if(contraseña.length()<10){
         }else{evt.consume();}
    }
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        System.out.println(""+txtpassword.getPassword().toString());
       if(txtcedula.getText().equals("") || txtpassword.getPassword().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios",null,2);
       }else{System.out.println("puedes entrar");}
        
        
        
        
        Usuario Myusuario=new Usuario();
        /*
        if(Myusuario.realizar_login(txtcedula.getText(),txtpassword.getText())){
            System.out.println("el usuario si existe");
        }else {
            System.out.println("el usuario no existe");
        }*/
        
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        //VALIDAR SOLO NUMEROS EN EL CAMPO
            Solonumeros(evt);
            validarTamañoTXT(txtcedula,10, evt);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        //VALIDAR TAÑANO DEL PASSWORD
        ValidartamañoPass(txtpassword.getPassword(), evt);
    }//GEN-LAST:event_txtpasswordKeyTyped

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
