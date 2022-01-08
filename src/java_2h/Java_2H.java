/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_2h;

import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Java_2H {

    public static void main(String[] args) throws SQLException {
    String[] V ={"K01","Gateng Serigala","Romatis","2015","indo","10"};
        configDB praktikum =new configDB();
        System.out.println(praktikum.getValueFieldArray(V));
       
      
    }
    
    
}
