package Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class AdminLogin extends javax.swing.JFrame {
    public AdminLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        IconLabel = new javax.swing.JLabel();
        LoginPanel2 = new javax.swing.JPanel();
        adminname = new javax.swing.JTextField();
        adminloginbtn = new javax.swing.JButton();
        passwordLabel2 = new javax.swing.JLabel();
        adminpass = new javax.swing.JPasswordField();
        usernameLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adminLoginButton = new javax.swing.JButton();
        userLoginButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Stadium Seat Booking System");
        setBackground(java.awt.SystemColor.window);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 720));

        TitlePanel.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel.setPreferredSize(new java.awt.Dimension(1045, 120));

        TitleLabel.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setLabelFor(TitlePanel);
        TitleLabel.setText("Stadium Seat Booking System");
        TitleLabel.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
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

        IconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiumlogo1.png"))); // NOI18N

        LoginPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        LoginPanel2.setOpaque(false);

        adminloginbtn.setText("AdminLogin");
        adminloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginbtnActionPerformed(evt);
            }
        });

        passwordLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel2.setText("Admin Password");

        usernameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabel2.setText("Admin Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Admin Login ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avataradmin.png"))); // NOI18N

        javax.swing.GroupLayout LoginPanel2Layout = new javax.swing.GroupLayout(LoginPanel2);
        LoginPanel2.setLayout(LoginPanel2Layout);
        LoginPanel2Layout.setHorizontalGroup(
            LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminloginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(adminname)
                        .addComponent(adminpass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        LoginPanel2Layout.setVerticalGroup(
            LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminpass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(adminloginbtn)
                .addGap(34, 34, 34))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        adminLoginButton.setText("AdminLogin");
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });

        userLoginButton.setText("UserLogin");
        userLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginButtonActionPerformed(evt);
            }
        });

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(homeButton)
                .addGap(75, 75, 75)
                .addComponent(userLoginButton)
                .addGap(75, 75, 75)
                .addComponent(adminLoginButton)
                .addGap(75, 75, 75)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(userLoginButton)
                    .addComponent(adminLoginButton)
                    .addComponent(registerButton))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(LoginPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void adminloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginbtnActionPerformed
      try {
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            String str="select * from admin where admin_name=? and admin_pass=?";
            PreparedStatement pstmt = con.prepareStatement(str);
            String user=adminname.getText();
            String pass=adminpass.getText();
            pstmt.setObject(1,user);
            pstmt.setObject(2,pass);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                Admin.name=user;
                JOptionPane.showMessageDialog(null,"Login Successfull");
                this.dispose();
                AdminHome adminHome = new AdminHome();
                adminHome.setVisible(true);                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Login Unsuccessfull");
                adminname.setText("");
                adminpass.setText("");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminloginbtnActionPerformed

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        JOptionPane.showMessageDialog(null,"You are already at admin login page!");
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void userLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginButtonActionPerformed
        UserLogin user = new UserLogin();
        this.dispose();
        user.setVisible(true);
    }//GEN-LAST:event_userLoginButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Register r = new Register();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed
    
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminLogin().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconLabel;
    private javax.swing.JPanel LoginPanel2;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JButton adminloginbtn;
    private javax.swing.JTextField adminname;
    private javax.swing.JPasswordField adminpass;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton userLoginButton;
    private javax.swing.JLabel usernameLabel2;
    // End of variables declaration//GEN-END:variables

   
}
