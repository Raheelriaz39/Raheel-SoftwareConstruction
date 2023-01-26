/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abc
 */
public class Details_of_Donar extends javax.swing.JFrame {

    
    
    public Details_of_Donar() {
    
         try{
               // Class.forName("con.mysql.jdbc.Driver");

           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood donation system","root","");
           Statement s = conn.createStatement();
           //s.executeUpdate("select *  from  donor");
           
           
           
           
         ResultSet rs=s.executeQuery("select * from donor ");
         while(rs.next())
         {
         rs.getString(1)=txt_name.setText(t);
         rs.getString(2)=txt_Contact.setText(t);
         rs.getString(3)=txt_Blood.setText(t);
         rs.getString(4)=txt_address.setText(t);
         
         }
         
         conn.close();
           System.exit(0);
        }
        catch(Exception e)
        { System.out.println(e);  }   
    
    
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTitle = new javax.swing.JLabel();
        JL_Name = new javax.swing.JLabel();
        JL_contact = new javax.swing.JLabel();
        JL_Blood = new javax.swing.JLabel();
        JL_Address = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        txt_Blood = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        JTitle.setBackground(new java.awt.Color(255, 255, 153));
        JTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JTitle.setText("These are Details of  Blood Donor");

        JL_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_Name.setText("Name");

        JL_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_contact.setText("Contact");

        JL_Blood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_Blood.setText("Blood_Group");

        JL_Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_Address.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_Name)
                        .addGap(95, 95, 95)
                        .addComponent(txt_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_contact)
                            .addComponent(JL_Blood)
                            .addComponent(JL_Address))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address)
                            .addComponent(txt_Contact)
                            .addComponent(txt_Blood))))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_contact)
                    .addComponent(txt_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_Blood)
                    .addComponent(txt_Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Address)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details_of_Donar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Address;
    private javax.swing.JLabel JL_Blood;
    private javax.swing.JLabel JL_Name;
    private javax.swing.JLabel JL_contact;
    private javax.swing.JLabel JTitle;
    private javax.swing.JTextField txt_Blood;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
