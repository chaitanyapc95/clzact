/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Date;

/**
 *
 * @author 1893716
 */
public class specialorder extends order {
    Date date;
    String number;
    public void confirm()
    {
        System.out.println("confirm");
    }
    public void close()
    {
        System.out.println("close");
    }
     public void dispatch()       
     {
         System.out.println("dispatch");
     } 
     public void receive()
     {
         System.out.println("receive");
     }
}
