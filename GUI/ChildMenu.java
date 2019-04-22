
package GUI;

public class ChildMenu extends javax.swing.JFrame {

    public ChildMenu() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPnl = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        birthLbl = new javax.swing.JLabel();
        attemptBtn = new javax.swing.JButton();
        attemptLbl = new javax.swing.JLabel();
        confimBtn = new javax.swing.JButton();
        confimLbl = new javax.swing.JLabel();
        severeBtn = new javax.swing.JButton();
        severeLbl = new javax.swing.JLabel();
        elopeBtn = new javax.swing.JButton();
        elopeLbl = new javax.swing.JLabel();
        profPic = new javax.swing.JLabel();
        displayPnl = new javax.swing.JPanel();
        selectedLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        confirmBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPnl.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(44, 62, 80));
        nameLbl.setText("Name");

        birthLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthLbl.setForeground(new java.awt.Color(127, 140, 141));
        birthLbl.setText("Birthday");

        attemptBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        attemptBtn.setForeground(new java.awt.Color(44, 62, 80));
        attemptBtn.setText("Attempted");
        attemptBtn.setContentAreaFilled(false);
        attemptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attemptBtn.setFocusable(false);
        attemptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptBtnActionPerformed(evt);
            }
        });

        attemptLbl.setBackground(new java.awt.Color(0, 0, 0));
        attemptLbl.setOpaque(true);

        confimBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        confimBtn.setForeground(new java.awt.Color(44, 62, 80));
        confimBtn.setText("Confim");
        confimBtn.setContentAreaFilled(false);
        confimBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confimBtn.setFocusable(false);
        confimBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        confimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confimBtnActionPerformed(evt);
            }
        });

        confimLbl.setBackground(new java.awt.Color(255, 255, 255));
        confimLbl.setOpaque(true);

        severeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        severeBtn.setForeground(new java.awt.Color(44, 62, 80));
        severeBtn.setText("Severe");
        severeBtn.setContentAreaFilled(false);
        severeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        severeBtn.setFocusable(false);
        severeBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        severeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                severeBtnActionPerformed(evt);
            }
        });

        severeLbl.setBackground(new java.awt.Color(255, 255, 255));
        severeLbl.setOpaque(true);
        severeLbl.setPreferredSize(new java.awt.Dimension(100, 0));

        elopeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        elopeBtn.setForeground(new java.awt.Color(44, 62, 80));
        elopeBtn.setText("Elopement");
        elopeBtn.setContentAreaFilled(false);
        elopeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elopeBtn.setFocusable(false);
        elopeBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        elopeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elopeBtnActionPerformed(evt);
            }
        });

        elopeLbl.setBackground(new java.awt.Color(255, 255, 255));
        elopeLbl.setOpaque(true);
        elopeLbl.setPreferredSize(new java.awt.Dimension(100, 0));

        profPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profPic.setText("Profile Picture");

        javax.swing.GroupLayout menuPnlLayout = new javax.swing.GroupLayout(menuPnl);
        menuPnl.setLayout(menuPnlLayout);
        menuPnlLayout.setHorizontalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attemptLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(attemptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confimLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(severeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(severeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elopeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(elopeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addComponent(profPic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(birthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        menuPnlLayout.setVerticalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(5, 5, 5)
                        .addComponent(birthLbl))
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(profPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attemptBtn)
                    .addComponent(confimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attemptLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confimLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                        .addComponent(severeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(severeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                        .addComponent(elopeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(elopeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        selectedLbl.setBackground(new java.awt.Color(0, 0, 0));
        selectedLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectedLbl.setForeground(new java.awt.Color(255, 255, 255));
        selectedLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedLbl.setText("Attempted Physical Aggression");
        selectedLbl.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Mon", "Tues", "Weds", "Thurs", "Fri", "Sat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        confirmBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayPnlLayout = new javax.swing.GroupLayout(displayPnl);
        displayPnl.setLayout(displayPnlLayout);
        displayPnlLayout.setHorizontalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPnlLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(displayPnlLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addComponent(selectedLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        displayPnlLayout.setVerticalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(selectedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attemptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptBtnActionPerformed
       
    }//GEN-LAST:event_attemptBtnActionPerformed

    private void confimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confimBtnActionPerformed
       
    }//GEN-LAST:event_confimBtnActionPerformed

    private void severeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_severeBtnActionPerformed
       
    }//GEN-LAST:event_severeBtnActionPerformed

    private void elopeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elopeBtnActionPerformed
       
    }//GEN-LAST:event_elopeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StaffMenu.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmBtnActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChildMenu();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attemptBtn;
    private javax.swing.JLabel attemptLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel birthLbl;
    private javax.swing.JButton confimBtn;
    private javax.swing.JLabel confimLbl;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel displayPnl;
    private javax.swing.JButton elopeBtn;
    private javax.swing.JLabel elopeLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel profPic;
    private javax.swing.JLabel selectedLbl;
    private javax.swing.JButton severeBtn;
    private javax.swing.JLabel severeLbl;
    // End of variables declaration//GEN-END:variables
}
