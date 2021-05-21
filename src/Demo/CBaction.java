/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Chinmay
 */
public class CBaction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox a = (JCheckBox) e.getSource();
        int x=Integer.parseInt(a.getText()); 
        if(a.isSelected())
        {
              if(User.seatCount<5)
              {                                         
              User.seat.add(x);  
              User.seatCount++;              
              }
              else
              {   
              a.setSelected(false);              
              JOptionPane.showMessageDialog(null,"You have selected more than your available seats!\nPlease do not select any more seats.");           
              }
        }
        else
        {
           for(int i=0;i<5;i++)
              {
                  User.seat.remove((Integer)x);
              }           
            User.seatCount--;            
            if(User.seatCount==-1)
                User.seatCount=0;
        }
        Collections.sort(User.seat);
    }    
}
