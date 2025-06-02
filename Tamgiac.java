/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamgiac;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tamgiac {
static void Tamgiaccanrong(int n){
    for (int i = 1; i <= n; i++){
        for(int j = 1; j<= n-i; j++){
            System.out.print("  ");
        }
        for (int j=1; j<= 2*i-1; j++){
            if(i == n || j==1 || j == 2*i-1){
            System.out.print("* ");
            }else{
              System.out.print("  ");
                  }
            }
        System.out.println();
    }
}

static int prime(int n ){
    if( n < 2) return 0;   
    for(int i = 2;  i< n; i++){
        if(n %i==0) return 0;
    }
    return 1;
}

static void Tamgiaccanrongprime(int n){
    int a = 2;
    for (int i = 1; i <= n; i++){
        for(int j = 1; j<= n-i; j++){
            System.out.print("  ");
        }
        for (int j=1; j<= 2*i-1; j++){
            if(i == n || j==1 || j == 2*i-1){
            System.out.printf("%d ", a);
            int b = a + 1;
            while(prime(b)==0 ){
              b++;
              }
            a = b;
            } else {
                System.out.print("\t ");
            }
        } 
            System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n =");
        int n = sc.nextInt();
        Tamgiaccanrong(n);
        Tamgiaccanrongprime(n);
    }
}
    