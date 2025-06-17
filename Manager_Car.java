/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager_car;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager_Car {

    /**
     * @param args the command line arguments
     */
    Car[] arrays;
    Scanner sc = new Scanner(System.in);
    int n;
    int id;
    String Name;
    String Color;

    void inputMany() {
        System.out.println("n = ");
        n = sc.nextInt();
        arrays = new Car[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.println("id = ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name = ");
            Name = sc.nextLine();
            System.out.println("Color = ");
            Color = sc.nextLine();
            arrays[i] = new Car(id,Name,Color);
        }
    }

    void outputMany() {
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arrays[i]);
        }
    }

    void findByName() {
        sc.nextLine();
        System.out.println("enter name find: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if (arrays[i].getName().equalsIgnoreCase(name)) {
                System.out.println("name is found: " + arrays[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong thay" + name);
        }
    }

    void SortbyName() {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i].getName().compareToIgnoreCase(arrays[j].getName()) > 0) {
                    Car temp = arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=temp;
                }
            }
            for (Car car : arrays) {
                System.out.println(car);
            }
        }
    }

    public static void main(String[] args) {
        Manager_Car run=new Manager_Car();
        run.inputMany();
        run.findByName();
        run.SortbyName();
        run.outputMany();
    }
}
