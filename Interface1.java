    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymous1;

/**
 *
 * @author Admin
 */
public interface Interface1{    
            void m1();
            void m2();
        }

class Anonymous1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface1 obj=new Interface1(){
            @Override
            public void m1(){
                System.out.println("M1");
            }
            @Override
            public void m2(){
                System.out.println("M2");
            }
        };
        obj.m1();
        obj.m2();
    }
}