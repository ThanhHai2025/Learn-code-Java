/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1.slot11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class VD1Slot11 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 101; i <= 110; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //or using Iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
