/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager_car;

/**
 *
 * @author Admin
 */
public class Car {
    int id;
    String Name;
    String Color;
    Car(int id, String Name, String Color){
        this.id=id;
        this.Name=Name;
        this.Color=Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    @Override
    public String toString() {
        return id + "\t" + Name + "\t" + Color;
    }  
}
