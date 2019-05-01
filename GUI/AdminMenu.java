package GUI;

import java.awt.Color;

public class AdminMenu extends javax.swing.JFrame {

    /** Creates new form StaffMenu */
    public AdminMenu() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        displayPnl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        menuPnl = new javax.swing.JPanel();
        viewUsersLbl = new javax.swing.JLabel();
        viewUsersBtn = new javax.swing.JButton();
        manageBtn = new javax.swing.JButton();
        manageLbl = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        addUserLbl = new javax.swing.JLabel();
        addUserBtn = new javax.swing.JButton();
        lblNews = new javax.swing.JLabel();
        lblNews1 = new javax.swing.JLabel();
        lblNews2 = new javax.swing.JLabel();
        displayPnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        choiceComBox = new javax.swing.JComboBox<>();
        displayPnl2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cityTxtFld = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        contactTxtFld = new javax.swing.JTextField();
        addyLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        addEmplyBtn = new javax.swing.JButton();
        workIDTxtFld = new javax.swing.JTextField();
        contactLbl = new javax.swing.JLabel();
        emailTxtFld = new javax.swing.JTextField();
        workIDLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        addyTxtFld = new javax.swing.JTextField();
        passTxtFld = new javax.swing.JTextField();
        passLbl = new javax.swing.JLabel();
        credLbl = new javax.swing.JLabel();
        CredTxtFld = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        contactTxtFld1 = new javax.swing.JTextField();
        dobLbl = new javax.swing.JLabel();
        addyLbl1 = new javax.swing.JLabel();
        contactLbl1 = new javax.swing.JLabel();
        addStudentBtn = new javax.swing.JButton();
        ageTxtFld = new javax.swing.JTextField();
        dobTxtFld = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        nameTxtFld1 = new javax.swing.JTextField();
        addyTxtFld1 = new javax.swing.JTextField();
        studentIDTxtFld = new javax.swing.JTextField();
        studentLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePnl.setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Admin Menu");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        menuPnl.setBackground(new java.awt.Color(255, 255, 255));

        viewUsersLbl.setBackground(new java.awt.Color(255, 255, 255));
        viewUsersLbl.setOpaque(true);

        viewUsersBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        viewUsersBtn.setForeground(new java.awt.Color(44, 62, 80));
        viewUsersBtn.setText("View Users");
        viewUsersBtn.setContentAreaFilled(false);
        viewUsersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewUsersBtn.setFocusable(false);
        viewUsersBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        viewUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersBtnActionPerformed(evt);
            }
        });

        manageBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        manageBtn.setForeground(new java.awt.Color(44, 62, 80));
        manageBtn.setText("Management");
        manageBtn.setContentAreaFilled(false);
        manageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBtn.setFocusable(false);
        manageBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });

        manageLbl.setBackground(new java.awt.Color(255, 255, 255));
        manageLbl.setOpaque(true);

        logOutBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(44, 62, 80));
        logOutBtn.setText("Log Out");
        logOutBtn.setContentAreaFilled(false);
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.setFocusable(false);
        logOutBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        addUserLbl.setBackground(new java.awt.Color(255, 255, 255));
        addUserLbl.setOpaque(true);

        addUserBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(44, 62, 80));
        addUserBtn.setText("Add User");
        addUserBtn.setContentAreaFilled(false);
        addUserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUserBtn.setFocusable(false);
        addUserBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPnlLayout = new javax.swing.GroupLayout(menuPnl);
        menuPnl.setLayout(menuPnlLayout);
        menuPnlLayout.setHorizontalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(manageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewUsersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewUsersLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addUserLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPnlLayout.setVerticalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addUserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(viewUsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewUsersLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(manageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        lblNews.setBackground(new java.awt.Color(255, 255, 255));
        lblNews.setOpaque(true);

        lblNews1.setBackground(new java.awt.Color(255, 255, 255));
        lblNews1.setOpaque(true);

        lblNews2.setBackground(new java.awt.Color(255, 255, 255));
        lblNews2.setOpaque(true);

        displayPnl.setPreferredSize(new java.awt.Dimension(490, 477));

        jPanel2.setPreferredSize(new java.awt.Dimension(490, 477));

        choiceComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Student" }));

        jPanel1.setPreferredSize(new java.awt.Dimension(490, 410));

        cityTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtFldActionPerformed(evt);
            }
        });

        emailLbl.setText("Email:");

        contactTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTxtFldActionPerformed(evt);
            }
        });

        addyLbl.setText("Address:");

        cityLbl.setText("City:");

        addEmplyBtn.setText("Add Employee");

        workIDTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workIDTxtFldActionPerformed(evt);
            }
        });

        contactLbl.setText("Contact:");

        emailTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFldActionPerformed(evt);
            }
        });

        workIDLbl.setText("WorkID");

        nameLbl.setText("Name:");

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });

        addyTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addyTxtFldActionPerformed(evt);
            }
        });

        passTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtFldActionPerformed(evt);
            }
        });

        passLbl.setText("Password:");

        credLbl.setText("Credential:");

        CredTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CredTxtFldActionPerformed(evt);
            }
        });

        jPanel3.setPreferredSize(new java.awt.Dimension(490, 410));

        contactTxtFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTxtFld1ActionPerformed(evt);
            }
        });

        dobLbl.setText("Date of Birth:");

        addyLbl1.setText("Address:");

        contactLbl1.setText("Contact:");

        addStudentBtn.setText("Add Student");

        ageTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFldActionPerformed(evt);
            }
        });

        dobTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtFldActionPerformed(evt);
            }
        });

        ageLbl.setText("Age:");

        nameLbl1.setText("Name:");

        nameTxtFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFld1ActionPerformed(evt);
            }
        });

        addyTxtFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addyTxtFld1ActionPerformed(evt);
            }
        });

        studentIDTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDTxtFldActionPerformed(evt);
            }
        });

        studentLbl.setText("StudentID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(contactLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addyLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addyTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dobLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dobTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ageLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(studentLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nameLbl1)
                        .addGap(71, 71, 71)
                        .addComponent(nameTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl1)
                    .addComponent(nameTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentLbl)
                    .addComponent(studentIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dobTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addyLbl1)
                    .addComponent(addyTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLbl1)
                    .addComponent(contactTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(addStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(credLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CredTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contactLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cityLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addyLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(emailLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(workIDLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(workIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(71, 71, 71)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addEmplyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLbl)
                    .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workIDLbl)
                    .addComponent(workIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credLbl)
                    .addComponent(CredTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addyLbl)
                    .addComponent(addyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl)
                    .addComponent(cityTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLbl)
                    .addComponent(contactTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(addEmplyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout displayPnl2Layout = new javax.swing.GroupLayout(displayPnl2);
        displayPnl2.setLayout(displayPnl2Layout);
        displayPnl2Layout.setHorizontalGroup(
            displayPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(displayPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayPnl2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        displayPnl2Layout.setVerticalGroup(
            displayPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(displayPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayPnl2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(choiceComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choiceComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout displayPnlLayout = new javax.swing.GroupLayout(displayPnl);
        displayPnl.setLayout(displayPnlLayout);
        displayPnlLayout.setHorizontalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayPnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        displayPnlLayout.setVerticalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayPnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNews2))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 350, Short.MAX_VALUE)
                    .addComponent(lblNews)
                    .addGap(0, 350, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 350, Short.MAX_VALUE)
                    .addComponent(lblNews1)
                    .addGap(0, 350, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(lblNews2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 291, Short.MAX_VALUE)
                    .addComponent(lblNews)
                    .addGap(0, 292, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 291, Short.MAX_VALUE)
                    .addComponent(lblNews1)
                    .addGap(0, 292, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        Main.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        addUserLbl.setBackground(new Color(255,255,255));
        manageLbl.setBackground(new Color(0,0,0));
        viewUsersLbl.setBackground(new Color(255,255,255));
        
        initialDisp();
        displayPnl.add(jPanel2);
        displayPnl.repaint();
        displayPnl.revalidate();
        
    }//GEN-LAST:event_manageBtnActionPerformed

    private void viewUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersBtnActionPerformed
        addUserLbl.setBackground(new Color(255,255,255));
        manageLbl.setBackground(new Color(255,255,255));
        viewUsersLbl.setBackground(new Color(0,0,0));
        
        initialDisp();
    }//GEN-LAST:event_viewUsersBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        addUserLbl.setBackground(new Color(0,0,0));
        manageLbl.setBackground(new Color(255,255,255));
        viewUsersLbl.setBackground(new Color(255,255,255));
        
        initialDisp();
        displayPnl.add(jPanel2);
        displayPnl.repaint();
        displayPnl.revalidate();
        
        
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void cityTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTxtFldActionPerformed

    private void contactTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtFldActionPerformed

    private void workIDTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workIDTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workIDTxtFldActionPerformed

    private void emailTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtFldActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void addyTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addyTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addyTxtFldActionPerformed

    private void passTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtFldActionPerformed

    private void CredTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CredTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CredTxtFldActionPerformed

    private void contactTxtFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtFld1ActionPerformed

    private void ageTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFldActionPerformed

    private void dobTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTxtFldActionPerformed

    private void nameTxtFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFld1ActionPerformed

    private void addyTxtFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addyTxtFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addyTxtFld1ActionPerformed

    private void studentIDTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDTxtFldActionPerformed

    public void initialDisp(){
        displayPnl.setVisible(true);
        displayPnl.removeAll();
        displayPnl.repaint();
        displayPnl.revalidate();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CredTxtFld;
    private javax.swing.JButton addEmplyBtn;
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JLabel addUserLbl;
    private javax.swing.JLabel addyLbl;
    private javax.swing.JLabel addyLbl1;
    private javax.swing.JTextField addyTxtFld;
    private javax.swing.JTextField addyTxtFld1;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtFld;
    private javax.swing.JComboBox<String> choiceComBox;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxtFld;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JLabel contactLbl1;
    private javax.swing.JTextField contactTxtFld;
    private javax.swing.JTextField contactTxtFld1;
    private javax.swing.JLabel credLbl;
    private javax.swing.JPanel displayPnl;
    private javax.swing.JPanel displayPnl2;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTxtFld;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNews;
    private javax.swing.JLabel lblNews1;
    private javax.swing.JLabel lblNews2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton manageBtn;
    private javax.swing.JLabel manageLbl;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JTextField nameTxtFld1;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTxtFld;
    private javax.swing.JTextField studentIDTxtFld;
    private javax.swing.JLabel studentLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JButton viewUsersBtn;
    private javax.swing.JLabel viewUsersLbl;
    private javax.swing.JLabel workIDLbl;
    private javax.swing.JTextField workIDTxtFld;
    // End of variables declaration//GEN-END:variables

}
