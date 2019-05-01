
package GUI;

import GUI.*;
import java.awt.Color;

public class ChildMenu extends javax.swing.JFrame {

    public ChildMenu() {


        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        displayPnl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPnl = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        studtIDLbl = new javax.swing.JLabel();
        attemptBtn = new javax.swing.JButton();
        attptSelecttLbl = new javax.swing.JLabel();
        phyAggBtn = new javax.swing.JButton();
        phyAggSelectLbl = new javax.swing.JLabel();
        sevAggBtn = new javax.swing.JButton();
        sevAggSelectLbl = new javax.swing.JLabel();
        elopeBtn = new javax.swing.JButton();
        elopeSelectLbl = new javax.swing.JLabel();
        profPic = new javax.swing.JLabel();
        displayPnl = new javax.swing.JPanel();
        confirmBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        mainPnl = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        attemptAggPnl = new javax.swing.JPanel();
        attemptAggLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attemptAggTbl = new javax.swing.JTable();
        phyAggPnl = new javax.swing.JPanel();
        phyAggLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        phyAggTbl = new javax.swing.JTable();
        sevAggPnl = new javax.swing.JPanel();
        sevAggLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sevAggTbl = new javax.swing.JTable();
        elopePnl = new javax.swing.JPanel();
        elopeLbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        elopeTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPnl.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(44, 62, 80));
        nameLbl.setText("Name");

        studtIDLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studtIDLbl.setForeground(new java.awt.Color(127, 140, 141));
        studtIDLbl.setText("StudentID");

        attemptBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        attemptBtn.setForeground(new java.awt.Color(44, 62, 80));
        attemptBtn.setText("Attempted Aggression");
        attemptBtn.setContentAreaFilled(false);
        attemptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attemptBtn.setFocusable(false);
        attemptBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        attemptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptBtnActionPerformed(evt);
            }
        });

        attptSelecttLbl.setBackground(new java.awt.Color(0, 0, 0));
        attptSelecttLbl.setOpaque(true);

        phyAggBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        phyAggBtn.setForeground(new java.awt.Color(44, 62, 80));
        phyAggBtn.setText("Physical Aggression");
        phyAggBtn.setContentAreaFilled(false);
        phyAggBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phyAggBtn.setFocusable(false);
        phyAggBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        phyAggBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phyAggBtnActionPerformed(evt);
            }
        });

        phyAggSelectLbl.setBackground(new java.awt.Color(255, 255, 255));
        phyAggSelectLbl.setOpaque(true);

        sevAggBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        sevAggBtn.setForeground(new java.awt.Color(44, 62, 80));
        sevAggBtn.setText("Severe Aggression");
        sevAggBtn.setContentAreaFilled(false);
        sevAggBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sevAggBtn.setFocusable(false);
        sevAggBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        sevAggBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevAggBtnActionPerformed(evt);
            }
        });

        sevAggSelectLbl.setBackground(new java.awt.Color(255, 255, 255));
        sevAggSelectLbl.setOpaque(true);
        sevAggSelectLbl.setPreferredSize(new java.awt.Dimension(100, 0));

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

        elopeSelectLbl.setBackground(new java.awt.Color(255, 255, 255));
        elopeSelectLbl.setOpaque(true);
        elopeSelectLbl.setPreferredSize(new java.awt.Dimension(100, 0));

        profPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profPic.setText("Profile Picture");

        javax.swing.GroupLayout menuPnlLayout = new javax.swing.GroupLayout(menuPnl);
        menuPnl.setLayout(menuPnlLayout);
        menuPnlLayout.setHorizontalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPnlLayout.createSequentialGroup()
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(profPic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(studtIDLbl)))
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attemptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(attptSelecttLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phyAggBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phyAggSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sevAggBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sevAggSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elopeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(elopeSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPnlLayout.setVerticalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(5, 5, 5)
                        .addComponent(studtIDLbl))
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(profPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addComponent(attemptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(attptSelecttLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPnlLayout.createSequentialGroup()
                        .addComponent(phyAggBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(phyAggSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                            .addComponent(elopeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(elopeSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                            .addComponent(sevAggBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(sevAggSelectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

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

        mainPnl.setPreferredSize(new java.awt.Dimension(920, 274));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(920, 274));

        attemptAggPnl.setPreferredSize(new java.awt.Dimension(920, 274));

        attemptAggLbl.setBackground(new java.awt.Color(0, 0, 0));
        attemptAggLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attemptAggLbl.setForeground(new java.awt.Color(255, 255, 255));
        attemptAggLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attemptAggLbl.setText("Attempted Aggression");
        attemptAggLbl.setOpaque(true);

        attemptAggTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3:00 ", null, null, null},
                {"3:30", null, null, null},
                {"4:00", null, null, null},
                {"4:30", null, null, null},
                {"5:00", null, null, null},
                {"5:30", null, null, null},
                {"6:00", null, null, null},
                {"6:30", null, null, null},
                {"7:00", null, null, null},
                {"7:30", null, null, null},
                {"8:00", null, null, null},
                {"8:30", null, null, null},
                {"9:00", null, null, null}
            },
            new String [] {
                "Time", "Amount", "Location", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attemptAggTbl);

        javax.swing.GroupLayout attemptAggPnlLayout = new javax.swing.GroupLayout(attemptAggPnl);
        attemptAggPnl.setLayout(attemptAggPnlLayout);
        attemptAggPnlLayout.setHorizontalGroup(
            attemptAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attemptAggLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        attemptAggPnlLayout.setVerticalGroup(
            attemptAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attemptAggPnlLayout.createSequentialGroup()
                .addComponent(attemptAggLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        phyAggPnl.setPreferredSize(new java.awt.Dimension(920, 274));

        phyAggLbl.setBackground(new java.awt.Color(0, 0, 0));
        phyAggLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phyAggLbl.setForeground(new java.awt.Color(255, 255, 255));
        phyAggLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phyAggLbl.setText("Physical Aggression");
        phyAggLbl.setOpaque(true);

        phyAggTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3:00 ", null, null, null},
                {"3:30", null, null, null},
                {"4:00", null, null, null},
                {"4:30", null, null, null},
                {"5:00", null, null, null},
                {"5:30", null, null, null},
                {"6:00", null, null, null},
                {"6:30", null, null, null},
                {"7:00", null, null, null},
                {"7:30", null, null, null},
                {"8:00", null, null, null},
                {"8:30", null, null, null},
                {"9:00", null, null, null}
            },
            new String [] {
                "Time", "Amount", "Location", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(phyAggTbl);

        javax.swing.GroupLayout phyAggPnlLayout = new javax.swing.GroupLayout(phyAggPnl);
        phyAggPnl.setLayout(phyAggPnlLayout);
        phyAggPnlLayout.setHorizontalGroup(
            phyAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phyAggLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        phyAggPnlLayout.setVerticalGroup(
            phyAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phyAggPnlLayout.createSequentialGroup()
                .addComponent(phyAggLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        sevAggPnl.setPreferredSize(new java.awt.Dimension(920, 274));

        sevAggLbl.setBackground(new java.awt.Color(0, 0, 0));
        sevAggLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sevAggLbl.setForeground(new java.awt.Color(255, 255, 255));
        sevAggLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sevAggLbl.setText("Severe Aggression");
        sevAggLbl.setOpaque(true);

        sevAggTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3:00 ", null, null, null},
                {"3:30", null, null, null},
                {"4:00", null, null, null},
                {"4:30", null, null, null},
                {"5:00", null, null, null},
                {"5:30", null, null, null},
                {"6:00", null, null, null},
                {"6:30", null, null, null},
                {"7:00", null, null, null},
                {"7:30", null, null, null},
                {"8:00", null, null, null},
                {"8:30", null, null, null},
                {"9:00", null, null, null}
            },
            new String [] {
                "Time", "Amount", "Location", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(sevAggTbl);

        javax.swing.GroupLayout sevAggPnlLayout = new javax.swing.GroupLayout(sevAggPnl);
        sevAggPnl.setLayout(sevAggPnlLayout);
        sevAggPnlLayout.setHorizontalGroup(
            sevAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sevAggLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        sevAggPnlLayout.setVerticalGroup(
            sevAggPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sevAggPnlLayout.createSequentialGroup()
                .addComponent(sevAggLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        elopePnl.setPreferredSize(new java.awt.Dimension(920, 274));

        elopeLbl.setBackground(new java.awt.Color(0, 0, 0));
        elopeLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        elopeLbl.setForeground(new java.awt.Color(255, 255, 255));
        elopeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elopeLbl.setText("Elopement");
        elopeLbl.setOpaque(true);

        elopeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3:00 ", null, null, null},
                {"3:30", null, null, null},
                {"4:00", null, null, null},
                {"4:30", null, null, null},
                {"5:00", null, null, null},
                {"5:30", null, null, null},
                {"6:00", null, null, null},
                {"6:30", null, null, null},
                {"7:00", null, null, null},
                {"7:30", null, null, null},
                {"8:00", null, null, null},
                {"8:30", null, null, null},
                {"9:00", null, null, null}
            },
            new String [] {
                "Time", "Amount", "Location", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(elopeTbl);

        javax.swing.GroupLayout elopePnlLayout = new javax.swing.GroupLayout(elopePnl);
        elopePnl.setLayout(elopePnlLayout);
        elopePnlLayout.setHorizontalGroup(
            elopePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elopeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        elopePnlLayout.setVerticalGroup(
            elopePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elopePnlLayout.createSequentialGroup()
                .addComponent(elopeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(attemptAggPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(phyAggPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sevAggPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(elopePnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(attemptAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(phyAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sevAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(elopePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(attemptAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(phyAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sevAggPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(elopePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPnlLayout = new javax.swing.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout displayPnlLayout = new javax.swing.GroupLayout(displayPnl);
        displayPnl.setLayout(displayPnlLayout);
        displayPnlLayout.setHorizontalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(displayPnlLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(758, 758, 758)
                        .addComponent(confirmBtn)))
                .addGap(50, 50, 50))
        );
        displayPnlLayout.setVerticalGroup(
            displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(displayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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
                .addGap(0, 0, 0)
                .addComponent(displayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attemptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptBtnActionPerformed
       attptSelecttLbl.setBackground(new Color(0,0,0));
       phyAggSelectLbl.setBackground(new Color(255,255,255));
       sevAggSelectLbl.setBackground(new Color(255,255,255));
       elopeSelectLbl.setBackground(new Color(255,255,255));
       
       initialDisp();
       attemptAggPnl.setVisible(true);
       phyAggPnl.setVisible(false);
       sevAggPnl.setVisible(false);
       elopePnl.setVisible(false);
       displayPnl.repaint();
       displayPnl.revalidate();
    }//GEN-LAST:event_attemptBtnActionPerformed

    private void phyAggBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phyAggBtnActionPerformed
       attptSelecttLbl.setBackground(new Color(255,255,255));
       phyAggSelectLbl.setBackground(new Color(0,0,0));
       sevAggSelectLbl.setBackground(new Color(255,255,255));
       elopeSelectLbl.setBackground(new Color(255,255,255));
       
       initialDisp();
       attemptAggPnl.setVisible(false);
       phyAggPnl.setVisible(true);
       sevAggPnl.setVisible(false);
       elopePnl.setVisible(false);
       displayPnl.repaint();
       displayPnl.revalidate();
    }//GEN-LAST:event_phyAggBtnActionPerformed

    private void sevAggBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevAggBtnActionPerformed
       attptSelecttLbl.setBackground(new Color(255,255,255));
       phyAggSelectLbl.setBackground(new Color(255,255,255));
       sevAggSelectLbl.setBackground(new Color(0,0,0));
       elopeSelectLbl.setBackground(new Color(255,255,255));
       
       initialDisp();
       attemptAggPnl.setVisible(false);
       phyAggPnl.setVisible(false);
       sevAggPnl.setVisible(true);
       elopePnl.setVisible(false);
       displayPnl.repaint();
       displayPnl.revalidate();
    }//GEN-LAST:event_sevAggBtnActionPerformed

    private void elopeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elopeBtnActionPerformed
       attptSelecttLbl.setBackground(new Color(255,255,255));
       phyAggSelectLbl.setBackground(new Color(255,255,255));
       sevAggSelectLbl.setBackground(new Color(255,255,255));
       elopeSelectLbl.setBackground(new Color(0,0,0));
       
       initialDisp();
       attemptAggPnl.setVisible(false);
       phyAggPnl.setVisible(false);
       sevAggPnl.setVisible(false);
       elopePnl.setVisible(true);
       displayPnl.repaint();
       displayPnl.revalidate();
    }//GEN-LAST:event_elopeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StaffMenu.main(new String[] {});
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmBtnActionPerformed

    public void initialDisp(){
        displayPnl.setVisible(true);
        displayPnl.removeAll();
        displayPnl.repaint();
        displayPnl.revalidate();
        displayPnl.add(confirmBtn);
        displayPnl.add(backBtn);
        displayPnl.add(mainPnl);
    }
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChildMenu();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attemptAggLbl;
    private javax.swing.JPanel attemptAggPnl;
    private javax.swing.JTable attemptAggTbl;
    private javax.swing.JButton attemptBtn;
    private javax.swing.JLabel attptSelecttLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel displayPnl;
    private javax.swing.JButton elopeBtn;
    private javax.swing.JLabel elopeLbl;
    private javax.swing.JPanel elopePnl;
    private javax.swing.JLabel elopeSelectLbl;
    private javax.swing.JTable elopeTbl;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton phyAggBtn;
    private javax.swing.JLabel phyAggLbl;
    private javax.swing.JPanel phyAggPnl;
    private javax.swing.JLabel phyAggSelectLbl;
    private javax.swing.JTable phyAggTbl;
    private javax.swing.JLabel profPic;
    private javax.swing.JButton sevAggBtn;
    private javax.swing.JLabel sevAggLbl;
    private javax.swing.JPanel sevAggPnl;
    private javax.swing.JLabel sevAggSelectLbl;
    private javax.swing.JTable sevAggTbl;
    private javax.swing.JLabel studtIDLbl;
    // End of variables declaration//GEN-END:variables
}
