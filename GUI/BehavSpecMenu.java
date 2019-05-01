package GUI;

public class BehavSpecMenu extends javax.swing.JFrame {

    /** Creates new form StaffMenu */
    public BehavSpecMenu() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        menuPnl = new javax.swing.JPanel();
        getDataBtn = new javax.swing.JButton();
        getDataLbl = new javax.swing.JLabel();
        viewDataLbl = new javax.swing.JLabel();
        viewDataBtn = new javax.swing.JButton();
        analyzDataBtn = new javax.swing.JButton();
        analyzDataLbl = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        displayPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePnl.setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Behavorial Specialist Menu");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(titleLbl)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        menuPnl.setBackground(new java.awt.Color(255, 255, 255));

        getDataBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        getDataBtn.setForeground(new java.awt.Color(44, 62, 80));
        getDataBtn.setText("Get Data");
        getDataBtn.setContentAreaFilled(false);
        getDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getDataBtn.setFocusable(false);
        getDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataBtnActionPerformed(evt);
            }
        });

        getDataLbl.setBackground(new java.awt.Color(0, 0, 0));
        getDataLbl.setOpaque(true);

        viewDataLbl.setBackground(new java.awt.Color(255, 255, 255));
        viewDataLbl.setOpaque(true);

        viewDataBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        viewDataBtn.setForeground(new java.awt.Color(44, 62, 80));
        viewDataBtn.setText("View Data");
        viewDataBtn.setContentAreaFilled(false);
        viewDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewDataBtn.setFocusable(false);
        viewDataBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        viewDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataBtnActionPerformed(evt);
            }
        });

        analyzDataBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        analyzDataBtn.setForeground(new java.awt.Color(44, 62, 80));
        analyzDataBtn.setText("Analyze Data");
        analyzDataBtn.setContentAreaFilled(false);
        analyzDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analyzDataBtn.setFocusable(false);
        analyzDataBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        analyzDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzDataBtnActionPerformed(evt);
            }
        });

        analyzDataLbl.setBackground(new java.awt.Color(255, 255, 255));
        analyzDataLbl.setOpaque(true);

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

        javax.swing.GroupLayout menuPnlLayout = new javax.swing.GroupLayout(menuPnl);
        menuPnl.setLayout(menuPnlLayout);
        menuPnlLayout.setHorizontalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(analyzDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(analyzDataLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewDataLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(getDataLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPnlLayout.setVerticalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                .addComponent(getDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(viewDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(analyzDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(analyzDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout displayPnlLayout = new javax.swing.GroupLayout(displayPnl);
        displayPnl.setLayout(displayPnlLayout);
        displayPnlLayout.setHorizontalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        displayPnlLayout.setVerticalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataBtnActionPerformed

    }//GEN-LAST:event_getDataBtnActionPerformed

    private void viewDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataBtnActionPerformed

    }//GEN-LAST:event_viewDataBtnActionPerformed

    private void analyzDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzDataBtnActionPerformed
        
    }//GEN-LAST:event_analyzDataBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        Main.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BehavSpecMenu();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzDataBtn;
    private javax.swing.JLabel analyzDataLbl;
    private javax.swing.JPanel displayPnl;
    private javax.swing.JButton getDataBtn;
    private javax.swing.JLabel getDataLbl;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JButton viewDataBtn;
    private javax.swing.JLabel viewDataLbl;
    // End of variables declaration//GEN-END:variables

}
