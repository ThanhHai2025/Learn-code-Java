/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd2_slot11;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class VD2_Slot11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        TreeSet myset = new TreeSet();
        for(int i = 0; i < 10; i++){
            int number=r.nextInt(100);
            myset.add(number);
        }
        
        //using Iterator
        Iterator iter=myset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
