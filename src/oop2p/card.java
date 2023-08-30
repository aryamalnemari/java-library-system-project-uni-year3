/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop2p;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class card extends javax.swing.JFrame {
    static boolean flag=false;
    static String price;
    static int Billnum;
    private static Formatter output;
    private static Scanner input=new Scanner(System.in);
    private Connection con ;
    private PreparedStatement st ; 
   private ResultSet rs;
    final String DEFAULT_QUERY =  "SELECT booktitle, bookID, yaer,section, branch, typeofbook, autor, price,rating FROM  books";
     
      
    public card() {
        initComponents();
        openDB();
    }
    public void setbillno(int Billnum,String price){
           // uu.setText(u);
              this.Billnum=Billnum;
              this.price=price;
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cardno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        cvc = new javax.swing.JTextField();
        ye = new javax.swing.JComboBox<>();
        mo = new javax.swing.JComboBox<>();
        checkoutButton = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop2p/card.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 200, 130));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Card Number: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Name on Card:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("CVC:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("Expiration Date:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        cardno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnoActionPerformed(evt);
            }
        });
        cardno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardnoKeyTyped(evt);
            }
        });
        jPanel1.add(cardno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, 20));

        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, 30));

        cvc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cvc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvcKeyTyped(evt);
            }
        });
        jPanel1.add(cvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 60, 20));

        ye.setBackground(new java.awt.Color(239, 239, 229));
        ye.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028" }));
        ye.setSelectedIndex(-1);
        ye.setToolTipText("year");
        ye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeActionPerformed(evt);
            }
        });
        jPanel1.add(ye, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        mo.setBackground(new java.awt.Color(233, 233, 224));
        mo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mo.setSelectedIndex(-1);
        mo.setToolTipText("month");
        mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moActionPerformed(evt);
            }
        });
        jPanel1.add(mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 50, -1));

        checkoutButton.setBackground(new java.awt.Color(250, 250, 241));
        checkoutButton.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        checkoutButton.setText("Check Out");
        checkoutButton.setToolTipText("");
        checkoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(checkoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, -1));

        cancelButton1.setBackground(new java.awt.Color(250, 250, 241));
        cancelButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        cancelButton1.setText("Cancel");
        cancelButton1.setToolTipText("");
        cancelButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Card Information ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeActionPerformed

        //showAllBooks();

        // TODO add your handling code here:
    }//GEN-LAST:event_yeActionPerformed

    private void moActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        if (cardno.getText().trim().isEmpty() &&cvc.getText().trim().isEmpty()&&name.getText().trim().isEmpty()&&mo.getSelectedIndex()==-1&&ye.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(null,"Please Fill Your Card Information","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
         
       else if(cardno.getText().trim().isEmpty())
       
            JOptionPane.showMessageDialog(null, "Please Enter your card number","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        else if(cvc.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill Your CVC number","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
       else  if (name.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill Card Holder name","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else if(mo.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(null, "Please choose Expiration Month","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else if(ye.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(null, "Please choose Expiration Year","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
         else if(cardno.getText().trim().length()!=16)
            {
                 JOptionPane.showMessageDialog(null, "Your Card number Length is Not valid","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
           else   if(cvc.getText().trim().length()!=3)
            {
                 JOptionPane.showMessageDialog(null, "Your CVC number length is Not Valid,Please make sure it's 3 Digits","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
     
            else{
       
            JOptionPane.showMessageDialog(null, "Payment confirmed!, The Amount: "+price+" has been withdrawn from your Card");
        
        
        BoughtBill b= new BoughtBill();
//          if(cardno.getText().length()<16){
//              JOptionPane.showMessageDialog(null, "The Card number is invalid","Error",JOptionPane.ERROR_MESSAGE);
//          }
//          else if (cvc.getText().length()!=3) {
//            JOptionPane.showMessageDialog(null, "The CVC is invalid, Please Enter 3 numbers","Error",JOptionPane.ERROR_MESSAGE);
//          }
//          else {
          
          b.BoughtBill(Billnum);
          b.setVisible(true);
          this.setVisible(false);
        // loadCart();
      //JFCart c=new JFCart();
      
         //  if(new JFCart().getBorrowDate().contains(" ") || new JFCart().getReturnDate().contains(" ") ){
      // new  BorrowdBill().setVisible(true);
       // this.setVisible(false);}
       //    else {
       //  new BillJFrame().setVisible(true);
       // this.setVisible(false);
       // }
        
           }  

    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
           this.setVisible(false);
           new JFCart().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void cardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnoActionPerformed

    private void cardnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnoKeyTyped
     char c=evt.getKeyChar();
     
    if(!Character.isDigit(c)){
        evt.consume();
        
    }
        if(cardno.getText().trim().length()==16||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
        evt.consume();
        flag=true;
        }

// TODO add your handling code here:
    }//GEN-LAST:event_cardnoKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
     

        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
    char c=evt.getKeyChar();
    if(!(Character.isAlphabetic(c)|| (Character.isWhitespace(c))||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
        
        flag=true;
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void cvcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvcKeyTyped
     char c=evt.getKeyChar();
     if(!Character.isDigit(c)){
         evt.consume();
     }
     if(cvc.getText().trim().length()==3||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
         evt.consume();
         flag=true;
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_cvcKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        card c =new card();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new card().setVisible(true);
            }
        });
    }
    
    public void openDB(){
       try{
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop", "root", "123456aryamSs");
           st= con.prepareStatement(DEFAULT_QUERY);
          //String DEFAULT_QUERY =  "SELECT booktitle, bookID, yaer,secction, branch, typeofbook, autor, price,rating FROM  books";
          rs=st.executeQuery(DEFAULT_QUERY);
            
            
            
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
       }
   }
    public void addRecord(){
        try{
            
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop", "root", "123456aryamSs");
            st= con.prepareStatement("SELECT username FROM reader WHERE readerID=20");
          // st.setString(1, new ReaderSignup().getID() );
          rs= st.executeQuery();}
        catch(SQLException e){
            e.printStackTrace();
        }
    }
public void closeDB(){
       try{
           rs.close();
           st.close();
           con.close();
           
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
   }
//public void openFile(){
//    try{
//        
//    }
//}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton1;
    private javax.swing.JTextField cardno;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JTextField cvc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mo;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> ye;
    // End of variables declaration//GEN-END:variables
}
