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
public class GeneralSeat extends javax.swing.JFrame {

    /**
     * Creates new form PlatinumSeat
     */
    String str="";
    boolean avail[]=new boolean[101];
    
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
            for(int i=0;i<100;i++)
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
    public GeneralSeat() {
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
         check(jCheckBox51);
        check(jCheckBox52);
        check(jCheckBox53);
        check(jCheckBox54);
        check(jCheckBox55);
        check(jCheckBox56);
        check(jCheckBox57);
        check(jCheckBox58);
        check(jCheckBox59);
        check(jCheckBox60);
        check(jCheckBox61);
        check(jCheckBox62);
        check(jCheckBox63);
        check(jCheckBox64);
        check(jCheckBox65);
        check(jCheckBox66);
        check(jCheckBox67);
        check(jCheckBox68);
        check(jCheckBox69);
        check(jCheckBox70);
        check(jCheckBox71);
        check(jCheckBox72);
        check(jCheckBox73);
        check(jCheckBox74);
        check(jCheckBox75);
        check(jCheckBox76);
        check(jCheckBox77);
        check(jCheckBox78);
        check(jCheckBox79);
        check(jCheckBox80);        
        check(jCheckBox81);
        check(jCheckBox82);
        check(jCheckBox83);
        check(jCheckBox84);
        check(jCheckBox85);
        check(jCheckBox86);
        check(jCheckBox87);
        check(jCheckBox88);
        check(jCheckBox89);
        check(jCheckBox90);
        check(jCheckBox91);
        check(jCheckBox92);
        check(jCheckBox93);
        check(jCheckBox94);
        check(jCheckBox95);
        check(jCheckBox96);
        check(jCheckBox97);
        check(jCheckBox98);
        check(jCheckBox99);
        check(jCheckBox100);
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
        jCheckBox51.addActionListener(Caction);
        jCheckBox52.addActionListener(Caction);
        jCheckBox53.addActionListener(Caction);
        jCheckBox54.addActionListener(Caction);
        jCheckBox55.addActionListener(Caction);
        jCheckBox56.addActionListener(Caction);
        jCheckBox57.addActionListener(Caction);
        jCheckBox58.addActionListener(Caction);
        jCheckBox59.addActionListener(Caction);
        jCheckBox60.addActionListener(Caction);
        jCheckBox61.addActionListener(Caction);
        jCheckBox62.addActionListener(Caction);
        jCheckBox63.addActionListener(Caction);
        jCheckBox64.addActionListener(Caction);
        jCheckBox65.addActionListener(Caction);
        jCheckBox66.addActionListener(Caction);
        jCheckBox67.addActionListener(Caction);
        jCheckBox68.addActionListener(Caction);
        jCheckBox69.addActionListener(Caction);
        jCheckBox70.addActionListener(Caction);
        jCheckBox71.addActionListener(Caction);
        jCheckBox72.addActionListener(Caction);
        jCheckBox73.addActionListener(Caction);
        jCheckBox74.addActionListener(Caction);
        jCheckBox75.addActionListener(Caction);
        jCheckBox76.addActionListener(Caction);
        jCheckBox77.addActionListener(Caction);
        jCheckBox78.addActionListener(Caction);
        jCheckBox79.addActionListener(Caction);
        jCheckBox80.addActionListener(Caction);
        jCheckBox81.addActionListener(Caction);
        jCheckBox82.addActionListener(Caction);
        jCheckBox83.addActionListener(Caction);
        jCheckBox84.addActionListener(Caction);
        jCheckBox85.addActionListener(Caction);
        jCheckBox86.addActionListener(Caction);
        jCheckBox87.addActionListener(Caction);
        jCheckBox88.addActionListener(Caction);
        jCheckBox89.addActionListener(Caction);
        jCheckBox90.addActionListener(Caction);
        jCheckBox91.addActionListener(Caction);
        jCheckBox92.addActionListener(Caction);
        jCheckBox93.addActionListener(Caction);
        jCheckBox94.addActionListener(Caction);
        jCheckBox95.addActionListener(Caction);
        jCheckBox96.addActionListener(Caction);
        jCheckBox97.addActionListener(Caction);
        jCheckBox98.addActionListener(Caction);
        jCheckBox99.addActionListener(Caction);
        jCheckBox100.addActionListener(Caction);
        
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
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox82 = new javax.swing.JCheckBox();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jCheckBox85 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        jCheckBox87 = new javax.swing.JCheckBox();
        jCheckBox88 = new javax.swing.JCheckBox();
        jCheckBox89 = new javax.swing.JCheckBox();
        jCheckBox90 = new javax.swing.JCheckBox();
        jCheckBox91 = new javax.swing.JCheckBox();
        jCheckBox92 = new javax.swing.JCheckBox();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox94 = new javax.swing.JCheckBox();
        jCheckBox95 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox98 = new javax.swing.JCheckBox();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
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

        jCheckBox51.setText("58");

        jCheckBox52.setText("60");

        jCheckBox53.setText("55");

        jCheckBox54.setText("57");

        jCheckBox55.setText("51");

        jCheckBox56.setText("53");

        jCheckBox57.setText("56");

        jCheckBox58.setText("59");

        jCheckBox59.setText("52");

        jCheckBox60.setText("54");

        jCheckBox61.setText("66");

        jCheckBox62.setText("65");

        jCheckBox63.setText("67");

        jCheckBox64.setText("64");

        jCheckBox65.setText("70");

        jCheckBox66.setText("61");

        jCheckBox67.setText("68");

        jCheckBox68.setText("69");

        jCheckBox69.setText("63");

        jCheckBox70.setText("62");

        jCheckBox71.setText("78");

        jCheckBox72.setText("80");

        jCheckBox73.setText("75");

        jCheckBox74.setText("77");

        jCheckBox75.setText("71");

        jCheckBox76.setText("73");

        jCheckBox77.setText("76");

        jCheckBox78.setText("79");

        jCheckBox79.setText("72");

        jCheckBox80.setText("74");

        jCheckBox81.setText("88");

        jCheckBox82.setText("90");

        jCheckBox83.setText("85");

        jCheckBox84.setText("87");

        jCheckBox85.setText("81");

        jCheckBox86.setText("83");

        jCheckBox87.setText("86");

        jCheckBox88.setText("89");

        jCheckBox89.setText("82");

        jCheckBox90.setText("84");

        jCheckBox91.setText("98");

        jCheckBox92.setText("100");

        jCheckBox93.setText("95");

        jCheckBox94.setText("97");

        jCheckBox95.setText("91");

        jCheckBox96.setText("93");

        jCheckBox97.setText("96");

        jCheckBox98.setText("99");

        jCheckBox99.setText("92");

        jCheckBox100.setText("94");

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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox11))
                        .addGap(35, 35, 35)
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
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox27)
                                .addComponent(jCheckBox29))
                            .addComponent(jCheckBox26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox30, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox32)
                                .addComponent(jCheckBox34))
                            .addComponent(jCheckBox31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox42)
                                .addComponent(jCheckBox44))
                            .addComponent(jCheckBox41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox43, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox45, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox37)
                                .addComponent(jCheckBox40))
                            .addComponent(jCheckBox36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox39, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox47)
                                .addComponent(jCheckBox50))
                            .addComponent(jCheckBox46, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox48, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox49, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox59)
                        .addComponent(jCheckBox55)
                        .addComponent(jCheckBox56)
                        .addComponent(jCheckBox60)
                        .addComponent(jCheckBox53))
                    .addComponent(jCheckBox51)
                    .addComponent(jCheckBox52)
                    .addComponent(jCheckBox57)
                    .addComponent(jCheckBox58)
                    .addComponent(jCheckBox54))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox62)
                        .addComponent(jCheckBox64)
                        .addComponent(jCheckBox66)
                        .addComponent(jCheckBox69)
                        .addComponent(jCheckBox70))
                    .addComponent(jCheckBox61)
                    .addComponent(jCheckBox63)
                    .addComponent(jCheckBox65)
                    .addComponent(jCheckBox67)
                    .addComponent(jCheckBox68))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox79)
                        .addComponent(jCheckBox75)
                        .addComponent(jCheckBox76)
                        .addComponent(jCheckBox80)
                        .addComponent(jCheckBox73))
                    .addComponent(jCheckBox71)
                    .addComponent(jCheckBox72)
                    .addComponent(jCheckBox77)
                    .addComponent(jCheckBox78)
                    .addComponent(jCheckBox74))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox89)
                        .addComponent(jCheckBox85)
                        .addComponent(jCheckBox86)
                        .addComponent(jCheckBox90)
                        .addComponent(jCheckBox83))
                    .addComponent(jCheckBox81)
                    .addComponent(jCheckBox82)
                    .addComponent(jCheckBox87)
                    .addComponent(jCheckBox88)
                    .addComponent(jCheckBox84))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox99)
                        .addComponent(jCheckBox95)
                        .addComponent(jCheckBox96)
                        .addComponent(jCheckBox100)
                        .addComponent(jCheckBox93))
                    .addComponent(jCheckBox91)
                    .addComponent(jCheckBox92)
                    .addComponent(jCheckBox97)
                    .addComponent(jCheckBox98)
                    .addComponent(jCheckBox94))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox95)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox99)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox96)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox100)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox93)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox97)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox94)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox91)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox98)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox92))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCheckBox85)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox89)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox86)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox90)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox83)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox87)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox84)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox81)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox88)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox82))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox75)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox79)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox76)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox80)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox73)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox77)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox74)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox71)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox78)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox72))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox66)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox70)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox69)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox64)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox62)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox61)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox63)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox67)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox68)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox65))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox55)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox59)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox56)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox60)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox53)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox57)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox54)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox51)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox58)
                                    .addGap(20, 20, 20)
                                    .addComponent(jCheckBox52))
                                .addGroup(jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(jCheckBox10))
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
                                            .addComponent(jCheckBox37))))))))
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emptyLabel)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(GeneralSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralSeat().setVisible(true);
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
    private javax.swing.JCheckBox jCheckBox100;
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
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
