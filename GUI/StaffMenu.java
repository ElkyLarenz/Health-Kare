package GUI;

import Function.Child;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StaffMenu extends javax.swing.JFrame {
    ArrayList<Child> childList = new ArrayList<>();
    public StaffMenu() {
        String sql = "select Child_id, fName, lName, age from Child";

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {
                Child child = new Child(rs.getInt("Child_id"), rs.getString("Fname"), rs.getString("Lname"), rs.getInt("Age"));
                childList.add(child);
                /*System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Age: " + rs.getInt(4));
                */
                System.out.println(child.toString());
            }


            con.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        initComponents();
        this.setVisible(true);
        this.setResizable(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        inputBtn = new javax.swing.JButton();
        searchTxtFld = new javax.swing.JTextField();
        sortCombBox = new javax.swing.JComboBox<>();
        sortLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        displayPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentInfoTbl = new javax.swing.JTable();
        LogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePnl.setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Staff Menu");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        inputBtn.setText("Input Data");
        inputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBtnActionPerformed(evt);
            }
        });

        searchTxtFld.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchTxtFld.setText("Search");
        searchTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFldActionPerformed(evt);
            }
        });

        sortCombBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "StudentID", "First Name", "Last Name", "Age" }));
        sortCombBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortCombBoxActionPerformed(evt);
            }
        });

        sortLbl.setText("Sort By");

        saveBtn.setText("Save Data");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        /*DefaultTableModel tableModel = (DefaultTableModel) customerTable.getModel();
        tableModel.setRowCount(0);
        for (Customer customer : customerList) {
            Object rowData[] = {customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary()};
            tableModel.addRow(rowData);
        }*/

        studentInfoTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"hi", null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "StudentID", "First Name", "Last Name", "Age"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentInfoTbl);

        LogoutBtn.setText("Log Out");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayPnlLayout = new javax.swing.GroupLayout(displayPnl);
        displayPnl.setLayout(displayPnlLayout);
        displayPnlLayout.setHorizontalGroup(
                displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displayPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                        .addGroup(displayPnlLayout.createSequentialGroup()
                                                .addComponent(LogoutBtn)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        displayPnlLayout.setVerticalGroup(
                displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displayPnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sortLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortCombBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputBtn)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(searchTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(sortLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sortCombBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(inputBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        System.out.printf(childList.size() + " \n");
        for(int i = 0; i < childList.size();i++)
        {   System.out.printf("In Loop");
            Child temp = childList.get(i);
            int tempID = temp.getStudentID();
            System.out.printf(tempID + " \n");
            String tempF = temp.getFirstName();
            String tempL = temp.getLastName();
            int tempAge = temp.getAge();
            studentInfoTbl.setValueAt(tempID, i, 0);
            studentInfoTbl.setValueAt(tempF, i, 1);
            studentInfoTbl.setValueAt(tempL, i, 2);
            studentInfoTbl.setValueAt(tempAge, i, 3);


        }

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sortCombBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCombBoxActionPerformed

    }//GEN-LAST:event_sortCombBoxActionPerformed

    private void inputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBtnActionPerformed

    }//GEN-LAST:event_inputBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFldActionPerformed

    }//GEN-LAST:event_searchTxtFldActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Main.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMenu();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JPanel displayPnl;
    private javax.swing.JButton inputBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchTxtFld;
    private javax.swing.JComboBox<String> sortCombBox;
    private javax.swing.JLabel sortLbl;
    private javax.swing.JTable studentInfoTbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
