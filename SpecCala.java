/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SpecCala extends Cala {
    int color;

    public SpecCala() {
    }

    public SpecCala(int color) {
        this.color = color;
    }

    public SpecCala(String owner, int price,int color ) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return owner + ", " + price + ", " + color;
    }
    
    public void setData(){
        if(owner.length() >=2){
            owner = owner.substring(0, 1) + "XX" + owner.substring(2);
        }
    }
    
    public int getValue(){
        if(color %2==1){
            return price+3;
        } else{
            return price+7;
        }
    }
}
