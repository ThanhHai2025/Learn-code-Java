/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerBook;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManagerBook {
    StudentBook[] arr;
    Scanner sc=new Scanner(System.in);
    int n;
    int id;
    String name;
    int year;
    
    void inputMany(){
        System.out.println("n = ");
        n=sc.nextInt();
        arr=new StudentBook[n];
        for(int i = 0; i < n-1; i++){
            System.out.println("Id: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            name=sc.nextLine();
            System.out.println("Year: ");
            year=sc.nextInt();
            arr[i]=new StudentBook(id, name, year);
        }
    }
    
    void outputMany(){
        for(int i = 0; i <n-1; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args){
        ManagerBook run=new ManagerBook();
        run.inputMany();
        run.outputMany();
    }
}
