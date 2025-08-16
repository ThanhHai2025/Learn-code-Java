

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Camel {
    String desert;
    int step;

    public Camel() {
    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public String getDesert() {
        return desert.toLowerCase();
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    
}
