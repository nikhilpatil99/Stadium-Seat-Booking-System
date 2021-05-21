package Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class AdminHome extends javax.swing.JFrame 
{
    String str="";
    public AdminHome() 
    {
        initComponents(); 
        jLabel1.setText("Hello "+Admin.name);
         try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from stadium";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addFoodItemButton = new javax.swing.JButton();
        showBookingButton = new javax.swing.JButton();
        howStadiumButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        showUsersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        homeButton1 = new javax.swing.JButton();
        howStadiumButton1 = new javax.swing.JButton();
        howStadiumButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitlePanel.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel.setPreferredSize(new java.awt.Dimension(1045, 120));

        TitleLabel.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Stadium Seat Booking System");
        TitleLabel.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addFoodItemButton.setText("ShowFoodOrders");
        addFoodItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodItemButtonActionPerformed(evt);
            }
        });

        showBookingButton.setText("ShowBookings");
        showBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingButtonActionPerformed(evt);
            }
        });

        howStadiumButton.setText("ShowStadiumInfo");
        howStadiumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howStadiumButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        showUsersButton.setText("ShowUsersInfo");
        showUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUsersButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Hello ");

        homeButton1.setText("ShowEvents");
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });

        howStadiumButton1.setText("Add Match");
        howStadiumButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howStadiumButton1ActionPerformed(evt);
            }
        });

        howStadiumButton2.setText("Edit Match");
        howStadiumButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howStadiumButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(howStadiumButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showUsersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFoodItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(howStadiumButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(howStadiumButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howStadiumButton)
                    .addComponent(homeButton1)
                    .addComponent(showUsersButton)
                    .addComponent(jLabel1)
                    .addComponent(addFoodItemButton)
                    .addComponent(showBookingButton)
                    .addComponent(howStadiumButton1)
                    .addComponent(howStadiumButton2)
                    .addComponent(logoutButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void addFoodItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodItemButtonActionPerformed
        try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from food_order";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_addFoodItemButtonActionPerformed

    private void showBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookingButtonActionPerformed
        try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from booking";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_showBookingButtonActionPerformed

    private void howStadiumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howStadiumButtonActionPerformed
        try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from stadium";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_howStadiumButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JOptionPane.showMessageDialog(null,"You have logged out successfully!");
        this.dispose();        
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void showUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUsersButtonActionPerformed
         try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from users";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   

    }//GEN-LAST:event_showUsersButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
            try{
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from sportevent";
            PreparedStatement pstmt = con.prepareStatement(str);            
            ResultSet rs = pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void howStadiumButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howStadiumButton1ActionPerformed
        AddMatch addMatch = new AddMatch();
        addMatch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_howStadiumButton1ActionPerformed

    private void howStadiumButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howStadiumButton2ActionPerformed
        EditMatch editMatch = new EditMatch();
        editMatch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_howStadiumButton2ActionPerformed
    
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHome().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton addFoodItemButton;
    private javax.swing.JButton homeButton1;
    private javax.swing.JButton howStadiumButton;
    private javax.swing.JButton howStadiumButton1;
    private javax.swing.JButton howStadiumButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton showBookingButton;
    private javax.swing.JButton showUsersButton;
    // End of variables declaration//GEN-END:variables
}
