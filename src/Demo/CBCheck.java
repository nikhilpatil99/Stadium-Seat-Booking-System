/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

/**
 *
 * @author Chinmay
 */
public class CBCheck implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
   
        if(e.getStateChange()==ItemEvent.SELECTED)
        {              
              if(User.seatCount<5)
              {
              JCheckBox a = (JCheckBox) e.getSource();
              int x=Integer.parseInt(a.getText());
              System.out.println("seatcount:"+User.seatCount+" Seat:"+x);
              //User.seat[User.seatCount]=x;  
              User.seatCount++;              
              }
              else
              {                                               
              JOptionPane.showMessageDialog(null,"You have selected more than your available seats.");           
              }
        }
        else
        {   
            try
            {
            //User.seat[User.seatCount]=0; 
            User.seatCount--;
            }
            catch(Exception a)
            {
            }
        }
       // Arrays.sort(User.seat);               
    }                  
}
