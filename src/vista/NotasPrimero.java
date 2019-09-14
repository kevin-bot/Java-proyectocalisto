/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.Estudiante;
import Controlador.Materia;
import Controlador.Nota;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */
 
   

public class NotasPrimero extends javax.swing.JDialog {

    
    Nota minota= new Nota();
    int grado=1;
    ArrayList<Estudiante>llenartabla2=minota.listaNombre();
    public NotasPrimero(java.awt.Frame parent, boolean modal,String Opcion_de_crud) {
        super(parent, modal);
        initComponents();
        minota.llenarprimero(jcbprimero,grado);
       
        switch(Opcion_de_crud){
                case "Crear nota estudiante":{
                    btnactualizar.setEnabled(false);
                    txttieliminar.setEnabled(false);
                    jcbactieliminar.setEnabled(false);
                    btneliminar.setEnabled(false);
                break;
               }
               case "Consultar nota estudiante":{
                    btnactualizar.setEnabled(false);
                    txttieliminar.setEnabled(false);
                    jcbactieliminar.setEnabled(false);
                    btneliminar.setEnabled(false);
                    btninsertarnota.setEnabled(false); 
                break;
               }case "Eliminar nota estudiante":{
                    btninsertarnota.setEnabled(false);                    
                    btnactualizar.setEnabled(false);
                    jcbactividades.setEnabled(false);                        
                    txtTI.setEnabled(false);
                    jcbnotas.setEnabled(false);                    
                break;
               }case "Actualizar Docente":{
                    btninsertarnota.setEnabled(false);                                                                                
                    txttieliminar.setEnabled(false);
                    jcbactieliminar.setEnabled(false);
                    btneliminar.setEnabled(false);
                break;
               }
        }
        
    }

    public NotasPrimero() {
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableprimero = new javax.swing.JTable();
        jcbprimero = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        btnmateriaconsultar = new javax.swing.JButton();
        btninsertarnota = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtTI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbnotas = new javax.swing.JComboBox<String>();
        jcbactividades = new javax.swing.JComboBox<String>();
        txttieliminar = new javax.swing.JTextField();
        jcbactieliminar = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableprimero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "T.I.", "Nombre del Estudiante", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Nota 5", "Nota 6", "Nota 7", "Nota 8", "Nota 9", "Nota 10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableprimero);

        jLabel1.setText("PRIMER-GRADO");

        btnmateriaconsultar.setText("Materia a consultar");
        btnmateriaconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmateriaconsultarActionPerformed(evt);
            }
        });

        btninsertarnota.setText("INSERTAR NOTA");
        btninsertarnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarnotaActionPerformed(evt);
            }
        });

        btnactualizar.setText("ACTUALIZAR NOTA");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR NOTA");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("TI");

        jcbnotas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jcbactividades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nota1", "nota2", "nota3", "nota4", "nota5", "nota6", "nota7", "nota8", "nota9", "nota10" }));
        jcbactividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbactividadesActionPerformed(evt);
            }
        });

        txttieliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttieliminarActionPerformed(evt);
            }
        });

        jcbactieliminar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nota1", "nota2", "nota3", "nota4", "nota5", "nota6", "nota7", "nota8", "nota9", "nota10" }));
        jcbactieliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbactieliminarActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota");

        jLabel4.setText("Actividad");

        jLabel5.setText("TI");

        jLabel6.setText("Actividad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(459, 459, 459)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(jButton1)
                            .addGap(87, 87, 87)
                            .addComponent(jcbprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(910, 910, 910)
                            .addComponent(btnmateriaconsultar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(btninsertarnota)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(txtTI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jcbnotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jcbactividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnactualizar)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txttieliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbactieliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btneliminar))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jcbprimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnmateriaconsultar)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btninsertarnota))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbnotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbactividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttieliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jcbactieliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar))))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmateriaconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmateriaconsultarActionPerformed
        // TODO add your handling code here:                
      ArrayList<Materia>llenartabla=minota.llenartablamateria(tranformarAsignatura());
      llenarjlist(llenartabla);
    }//GEN-LAST:event_btnmateriaconsultarActionPerformed

    private void btninsertarnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarnotaActionPerformed
        // TODO add your handling code here:
        if(txtTI.getText().equals("")){JOptionPane.showMessageDialog(null, "Por favor ingrese el documento del estudiante");
        }else{
        Object nota=jcbnotas.getSelectedItem();
        String TI= txtTI.getText();
        Object actividad= jcbactividades.getSelectedItem();
                
        minota.insertarnota(nota, TI, actividad, tranformarAsignatura());
         ArrayList<Materia>llenartabla=minota.llenartablamateria(tranformarAsignatura());
      
        llenarjlist(llenartabla);
         jcbactividades.setSelectedIndex(0);
        jcbnotas.setSelectedIndex(0);
        txtTI.setText("");
        }
    }//GEN-LAST:event_btninsertarnotaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
         if(txttieliminar.getText().equals("")){JOptionPane.showMessageDialog(null, "Por favor ingrese el documento del estudiante");
        }else{
         String TI= txttieliminar.getText();
        Object actividad= jcbactieliminar.getSelectedItem();               
        minota.eliminarnota(actividad, TI, tranformarAsignatura());
         ArrayList<Materia>llenartabla=minota.llenartablamateria(tranformarAsignatura());
      
        llenarjlist(llenartabla);
        txttieliminar.setText("");
        jcbactieliminar.setSelectedIndex(0);
         }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarjlist();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
         if(txtTI.getText().equals("")){JOptionPane.showMessageDialog(null, "Por favor ingrese el documento del estudiante");
        }else{
         Object nota=jcbnotas.getSelectedItem();
        String TI= txtTI.getText();
        Object actividad= jcbactividades.getSelectedItem();        
        minota.actualizarnota(nota, TI, actividad, tranformarAsignatura());
         ArrayList<Materia>llenartabla=minota.llenartablamateria(tranformarAsignatura());
      
        llenarjlist(llenartabla);
        jcbactividades.setSelectedIndex(0);
        jcbnotas.setSelectedIndex(0);
        txtTI.setText("");
         }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jcbactividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbactividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbactividadesActionPerformed

    private void txttieliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttieliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttieliminarActionPerformed

    private void jcbactieliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbactieliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbactieliminarActionPerformed

   
    public void limpiarjlist(){
      
         for(int j= 0; j<jTableprimero.getModel().getRowCount(); j++)
        {
            for(int i= 0; i<12; i++)
            {
                switch(i)
                {
                    case 0:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 1:
                    
                    {
                         jTableprimero.setValueAt("", j, i);
                         break;
                         
                    }
                    case 2:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 3:
                    {
                       jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 4:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 5:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 6:
                    {
                         jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 7:
                    {
                         jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 8:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 9:
                    {
                        jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 10:
                    {
                         jTableprimero.setValueAt("", j, i);
                        break;
                    }
                    case 11:
                    {
                         jTableprimero.setValueAt("", j, i);
                        break;
                    }
                }
            }
         
        }
          
    }
    public void llenarjlist(ArrayList<Materia>llenartabla)
    {
        limpiarjlist();
        int j=0;
        while(j<llenartabla.size())
        {
            for(int i= 0; i<12; i++)
            {
                switch(i)
                {
                    case 0:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getTI(), j, i);
                        break;
                    }
                    case 1:
                    
                    {
                         jTableprimero.setValueAt(llenartabla.get(j).getNombre(), j, i);
                         break;
                         
                    }
                    case 2:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getNota1(), j, i);
                        break;
                    }
                    case 3:
                    {
                       jTableprimero.setValueAt(llenartabla.get(j).getNota2(), j, i);
                        break;
                    }
                    case 4:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getNota3(), j, i);
                        break;
                    }
                    case 5:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getNota4(), j, i);
                        break;
                    }
                    case 6:
                    {
                         jTableprimero.setValueAt(llenartabla.get(j).getNota5(), j, i);
                        break;
                    }
                    case 7:
                    {
                         jTableprimero.setValueAt(llenartabla.get(j).getNota6(), j, i);
                        break;
                    }
                    case 8:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getNota7(), j, i);
                        break;
                    }
                    case 9:
                    {
                        jTableprimero.setValueAt(llenartabla.get(j).getNota8(), j, i);
                        break;
                    }
                    case 10:
                    {
                         jTableprimero.setValueAt(llenartabla.get(j).getNota9(), j, i);
                        break;
                    }
                    case 11:
                    {
                         jTableprimero.setValueAt(llenartabla.get(j).getNota10(), j, i);
                        break;
                    }
                }
            }
           j++;
        }
                
    }
     public void llenarjlist3()
    {
        int j=0;
        while(j<llenartabla2.size())
        {
            for(int i= 0; i<10; i++)
            {
                switch(i)
                {
                    case 0:
                    {
                        jTableprimero.setValueAt(llenartabla2.get(j).getNombre(), j, i);
                        break;
                    }
                    
                }
            }
           j++;
        }
                
    }
    
                
    
        //METODO QUE SE ENCARGA DE TRANSFORMAR LAS ASIGNATURAS CON ESPACIO A SIN ESPACIO
     
     public String tranformarAsignatura(){
         String Asignatura="";
         switch (jcbprimero.getSelectedItem().toString()){
             
                 case "Español" :
                     Asignatura="español";
                 break;
                 case "Matematicas" :
                 Asignatura="matematicas";
                 break;
                 case "Ciencias Naturales" :
                 Asignatura="cienciasnaturales";
                 break;
                 case "Artistica" :
                 Asignatura="artistica";
                 break;
                 case "Educacion Fisica" :
                 Asignatura="educacionfisica";
                 break;
                 case "Ingles" :
                 Asignatura="ingles";
                 break;
                 case "Lecto escritura" :
                 Asignatura="lectoescritura";
                 break;
                 case "Etica y Valores" :
                 Asignatura="eticayvalores";
                 break;
                  case "Religion" :
                 Asignatura="religion";
                 break;
                     
                  case "Ciencias Sociales" :
                 Asignatura="cienciassociales"; 
                 break;
                 default: JOptionPane.showMessageDialog(null, "Por favor seleccione una asignatura");
                                             
         }
         return  Asignatura;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertarnota;
    private javax.swing.JButton btnmateriaconsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableprimero;
    private javax.swing.JComboBox<String> jcbactieliminar;
    private javax.swing.JComboBox<String> jcbactividades;
    private javax.swing.JComboBox<String> jcbnotas;
    private javax.swing.JComboBox<String> jcbprimero;
    private javax.swing.JTextField txtTI;
    private javax.swing.JTextField txttieliminar;
    // End of variables declaration//GEN-END:variables
}
