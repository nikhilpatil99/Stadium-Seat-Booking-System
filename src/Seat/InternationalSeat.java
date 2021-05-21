/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seat;

import Demo.CheckOut;
import Demo.User;
import Demo.UserLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import Demo.CBaction;
import Demo.StadiumSeatPlan;
import java.awt.event.ActionListener;

/**
 *
 * @author Chinmay
 */
public class InternationalSeat extends javax.swing.JFrame {

    /**
     * Creates new form PlatinumSeat
     */
    String str="";
    boolean avail[]=new boolean[51];
    
    private void getAvail()
    {        
        try {            
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Stadiumdb","postgres","admin");
            switch (User.eventindex) {
                case 1:
                    str="select seat_num,statusofevent1 from "+User.seatname+" order by seat_num";
                    break;
                case 2:
                    str="select seat_num,statusofevent2 from "+User.seatname+" order by seat_num";
                    break;
                case 3:
                    str="select seat_num,statusofevent3 from "+User.seatname+" order by seat_num";
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"No Event Selected");
                    break;
                default:
                    break;
            }
            PreparedStatement pstmt = con.prepareStatement(str);             
            ResultSet rs = pstmt.executeQuery();
            JTable table = new JTable();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            for(int i=0;i<50;i++)
            {
                avail[i+1]=(Boolean)table.getModel().getValueAt(i,1);
            }
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void check(JCheckBox a)
        {
            int n=Integer.parseInt(a.getText());
            if(avail[n]==false)
            {
                a.setSelected(true);
                a.setEnabled(false);
            }
        }
    public InternationalSeat() {
        initComponents();  
        jLabel3.setText(User.tseat);
        getAvail(); 
         check(jCheckBox1);
        check(jCheckBox2);
        check(jCheckBox3);
        check(jCheckBox4);
        check(jCheckBox5);
        check(jCheckBox6);
        check(jCheckBox7);
        check(jCheckBox8);
        check(jCheckBox9);
        check(jCheckBox10);
        check(jCheckBox11);
        check(jCheckBox12);
        check(jCheckBox13);
        check(jCheckBox14);
        check(jCheckBox15);
        check(jCheckBox16);
        check(jCheckBox17);
        check(jCheckBox18);
        check(jCheckBox19);
        check(jCheckBox20);
        check(jCheckBox21);
        check(jCheckBox22);
        check(jCheckBox23);
        check(jCheckBox24);
        check(jCheckBox25);
        check(jCheckBox26);
        check(jCheckBox27);
        check(jCheckBox28);
        check(jCheckBox29);
        check(jCheckBox30);        
        check(jCheckBox31);
        check(jCheckBox32);
        check(jCheckBox33);
        check(jCheckBox34);
        check(jCheckBox35);
        check(jCheckBox36);
        check(jCheckBox37);
        check(jCheckBox38);
        check(jCheckBox39);
        check(jCheckBox40);
        check(jCheckBox41);
        check(jCheckBox42);
        check(jCheckBox43);
        check(jCheckBox44);
        check(jCheckBox45);
        check(jCheckBox46);
        check(jCheckBox47);
        check(jCheckBox48);
        check(jCheckBox49);
        check(jCheckBox50);
        ActionListener Caction = new CBaction();            
        jCheckBox1.addActionListener(Caction);
        jCheckBox2.addActionListener(Caction);
        jCheckBox3.addActionListener(Caction);
        jCheckBox4.addActionListener(Caction);
        jCheckBox5.addActionListener(Caction);
        jCheckBox6.addActionListener(Caction);
        jCheckBox7.addActionListener(Caction);
        jCheckBox8.addActionListener(Caction);
        jCheckBox9.addActionListener(Caction);
        jCheckBox10.addActionListener(Caction);
        jCheckBox11.addActionListener(Caction);
        jCheckBox12.addActionListener(Caction);
        jCheckBox13.addActionListener(Caction);
        jCheckBox14.addActionListener(Caction);
        jCheckBox15.addActionListener(Caction);
        jCheckBox16.addActionListener(Caction);
        jCheckBox17.addActionListener(Caction);
        jCheckBox18.addActionListener(Caction);
        jCheckBox19.addActionListener(Caction);
        jCheckBox20.addActionListener(Caction);
        jCheckBox21.addActionListener(Caction);
        jCheckBox22.addActionListener(Caction);
        jCheckBox23.addActionListener(Caction);
        jCheckBox24.addActionListener(Caction);
        jCheckBox25.addActionListener(Caction);
        jCheckBox26.addActionListener(Caction);
        jCheckBox27.addActionListener(Caction);
        jCheckBox28.addActionListener(Caction);
        jCheckBox29.addActionListener(Caction);
        jCheckBox30.addActionListener(Caction);
        jCheckBox31.addActionListener(Caction);
        jCheckBox32.addActionListener(Caction);
        jCheckBox33.addActionListener(Caction);
        jCheckBox34.addActionListener(Caction);
        jCheckBox35.addActionListener(Caction);
        jCheckBox36.addActionListener(Caction);
        jCheckBox37.addActionListener(Caction);
        jCheckBox39.addActionListener(Caction);
        jCheckBox40.addActionListener(Caction);
        jCheckBox41.addActionListener(Caction);
        jCheckBox42.addActionListener(Caction);
        jCheckBox43.addActionListener(Caction);
        jCheckBox43.addActionListener(Caction);
        jCheckBox45.addActionListener(Caction);
        jCheckBox46.addActionListener(Caction);
        jCheckBox47.addActionListener(Caction);
        jCheckBox48.addActionListener(Caction);
        jCheckBox49.addActionListener(Caction);
        jCheckBox50.addActionListener(Caction);        
        
        emptyLabel.setVisible(false);
         
        EventjLabel.setText(User.event+">>"+User.tseat+">>Select seats of your preference");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emptyLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        EventjLabel = new javax.swing.JLabel();

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

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCheckBox25.setText("25");

        jCheckBox8.setText("8");

        jCheckBox11.setText("11");

        jCheckBox19.setText("19");

        jCheckBox10.setText("10");

        jCheckBox17.setText("17");

        jCheckBox18.setText("18");

        jCheckBox5.setText("5");

        jCheckBox7.setText("7");

        jCheckBox21.setText("21");

        jCheckBox24.setText("24");

        jCheckBox1.setText("1");

        jCheckBox12.setText("12");

        jCheckBox15.setText("15");

        jCheckBox3.setText("3");

        jCheckBox22.setText("22");

        jCheckBox6.setText("6");

        jCheckBox13.setText("13");

        jCheckBox9.setText("9");

        jCheckBox20.setText("20");

        jCheckBox2.setText("2");

        jCheckBox16.setText("16");

        jCheckBox23.setText("23");

        jCheckBox4.setText("4");

        jCheckBox14.setText("14");

        jCheckBox26.setText("26");

        jCheckBox27.setText("29");

        jCheckBox28.setText("28");

        jCheckBox29.setText("30");

        jCheckBox30.setText("27");

        jCheckBox31.setText("32");

        jCheckBox32.setText("35");

        jCheckBox33.setText("31");

        jCheckBox34.setText("34");

        jCheckBox35.setText("33");

        jCheckBox36.setText("37");

        jCheckBox37.setText("40");

        jCheckBox38.setText("36");

        jCheckBox39.setText("38");

        jCheckBox40.setText("39");

        jCheckBox41.setText("42");

        jCheckBox42.setText("45");

        jCheckBox43.setText("41");

        jCheckBox44.setText("44");

        jCheckBox45.setText("43");

        jCheckBox46.setText("47");

        jCheckBox47.setText("50");

        jCheckBox48.setText("46");

        jCheckBox49.setText("48");

        jCheckBox50.setText("49");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox1)
                        .addComponent(jCheckBox3)
                        .addComponent(jCheckBox4)
                        .addComponent(jCheckBox5))
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox7))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox11))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox24)
                                .addComponent(jCheckBox25))
                            .addComponent(jCheckBox22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox20))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox27)
                                .addComponent(jCheckBox29))
                            .addComponent(jCheckBox26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox32)
                                .addComponent(jCheckBox34))
                            .addComponent(jCheckBox31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox42)
                                .addComponent(jCheckBox44))
                            .addComponent(jCheckBox41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox43, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox45, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox37)
                                .addComponent(jCheckBox40))
                            .addComponent(jCheckBox36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox39, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox47)
                                .addComponent(jCheckBox50))
                            .addComponent(jCheckBox46, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox48, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox49, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox2)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox3)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox4)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox11)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox12)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox13)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox14)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox43)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox41)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox45)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox44)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox21)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox22)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox23)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox24)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox33)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox31)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox35)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox34)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox32)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox48)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox46)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox49)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox50)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox38)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox36)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox39)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox40)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox26)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox30)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox28)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox27)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox16)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox17)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox18)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox19)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox7)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox8)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox9)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Procced");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select From available Seats");

        emptyLabel.setText("No seats are selected");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Platinum Seats");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        EventjLabel.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emptyLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(386, 386, 386)
                                    .addComponent(jButton1))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(EventjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(508, 508, 508))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
            User.amount=(User.seatFare*User.seatCount);
            if(User.seatCount==0)
            {
                emptyLabel.setVisible(true);
            }
            else
            {
            
            int res=JOptionPane.showConfirmDialog(null,"You have selected"+User.seat.toString()+"\nDo you want to continue" ,"Confirm Seat",JOptionPane.YES_NO_OPTION);
            if(res==0)
            {
                CheckOut checkOut = new CheckOut();
                checkOut.setVisible(true);
                this.dispose();                
            }
            }            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        User.seat.removeAll(User.seat);              
        User.seatCount=0;
        StadiumSeatPlan stadiumSeatPlan = new StadiumSeatPlan();
        stadiumSeatPlan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InternationalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InternationalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InternationalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InternationalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InternationalSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventjLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emptyLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
