
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(Cala c : t ){
            String owner=c.getOwner();
            if(owner.length() >=2 && Character.isDigit(owner.charAt(1))){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        if(t.size() < 2) return;
        int maxPrice=Integer.MIN_VALUE;
        for(Cala character : t){
            if(character.getPrice() > maxPrice){
                maxPrice = character.getPrice();
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                return o1.getOwner().charAt(1)-o2.getOwner().charAt(1);
            }
        });
    }
    
}
