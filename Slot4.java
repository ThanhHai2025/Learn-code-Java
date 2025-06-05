/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot4;

/**
 *
 * @author Admin
 */
public class Slot4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a = new Integer(8);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.TYPE);
        int a1 =5, a2= 6;
        System.out.println(Integer.compare(a1, a2));
        Integer a3 = new Integer(5);
        System.out.println(a3.compareTo(6));
        System.out.println(a3.equals(5));
        System.out.println(Integer.parseInt("123456")+5);
        System.out.println(a3.toString()+6);
        System.out.println(Math.abs(-2));
        System.out.println(Math.sqrt(5));
        Double c=5.6;
        System.out.println(Math.ceil(c));
        System.out.println(Math.floor(c));
        System.out.println(Math.round(c));
        Character ch=new Character('a');
        System.out.println(ch.compareTo('A'));
        System.out.println(Character.isDigit(ch));
        
    }
    
}
