package GUI;

import java.sql.*;
import javax.swing.JOptionPane;

public class StaffLogin extends javax.swing.JFrame {

    public StaffLogin() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        passTxtFld = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePnl.setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setBackground(new java.awt.Color(255, 255, 255));
        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("Staff Login");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(titleLbl)
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameTxtFld.setText("Name");
        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });

        passTxtFld.setText("Password");
        passTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtFldActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(loginBtn))
                                        .addComponent(nameTxtFld, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passTxtFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(120, Short.MAX_VALUE)
                                .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginBtn)
                                        .addComponent(backBtn))
                                .addGap(116, 116, 116))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed

    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void passTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtFldActionPerformed

    }//GEN-LAST:event_passTxtFldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String sql = "select * from staff where username = ? and passwrd = ?";

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nameTxtFld.getText());
            stmt.setString(2,new String(passTxtFld.getPassword()));

            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Welcome " + nameTxtFld.getText(), "Login Successful", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid username/password ", "Login unsuccessful", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        StaffMenu.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Main.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton loginBtn;
    public javax.swing.JTextField nameTxtFld;
    private javax.swing.JPasswordField passTxtFld;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables
}
