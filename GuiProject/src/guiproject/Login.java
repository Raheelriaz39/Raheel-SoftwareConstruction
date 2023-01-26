
package guiproject;

import java.awt.event.ActionEvent;



public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlabelTitle = new javax.swing.JLabel();
        jL_Username = new javax.swing.JLabel();
        jL_Password = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        txt_Password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlabelTitle.setBackground(new java.awt.Color(204, 204, 204));
        JlabelTitle.setForeground(new java.awt.Color(255, 0, 0));
        JlabelTitle.setText("LOGIN  PAGE");
        JlabelTitle.setAlignmentY(10.0F);
        JlabelTitle.setMaximumSize(new java.awt.Dimension(200, 16));

        jL_Username.setBackground(new java.awt.Color(255, 255, 255));
        jL_Username.setText("Username");

        jL_Password.setText("Password");

        txt_Username.setBackground(new java.awt.Color(0, 255, 255));

        btn_Login.setBackground(new java.awt.Color(51, 0, 255));
        btn_Login.setForeground(new java.awt.Color(255, 51, 51));
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_signup.setBackground(new java.awt.Color(51, 51, 255));
        btn_signup.setForeground(new java.awt.Color(255, 51, 51));
        btn_signup.setText("Signup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_Username)
                            .addComponent(jL_Password))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Username)
                            .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btn_Login)
                        .addGap(51, 51, 51)
                        .addComponent(btn_signup)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JlabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Username)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Password)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login)
                    .addComponent(btn_signup))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        
     String a=txt_Username.getText();
     String b=txt_Password.getText();
       
     if(a.equals("student")  &&  b.equals("student"))
        {  
        new signup();
        setVisible(true);
        }/*
     else
     {
     new signup();setVisible(true);
     }
        */
        
    }//GEN-LAST:event_btn_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelTitle;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jL_Password;
    private javax.swing.JLabel jL_Username;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}

