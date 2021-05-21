/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;

/**
 *
 * @author Chinmay
 */
public class User {
    public static String uname="",event="",tseat="",date="",time="",seatname="",statusname="",dbupdate="";
    public static int uid,book_id,seatFare,eventindex=0,food_order_id=0;
    //public static int seat[]=new int[5];   
    public static ArrayList<Integer> seat = new ArrayList<>(5);
    public static int seatCount=0;
    public static long amount=0;
    public static void setNull()
    {
        User.event=null;        
        User.seat.removeAll(User.seat);      
        User.date=null;
        User.time=null;
        User.seatname=null;
        User.statusname=null;
        User.dbupdate=null;
        User.book_id=0;
        User.seatFare=0;
        User.eventindex=0;
        User.seat.remove(User.seat);
        User.seatCount=0;
        User.amount=0;
    }
}
