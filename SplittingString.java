/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//hãy viết chuong trình để nhập sâu vào bàn phím:
//-đếm số từ trong sâu
//-hãy liệt kê ra các từ trong xâu
//-hiện thị ra các kí tự là chữ in hoa trong xâu kí tự vừa nhập vào
//- đếm xem có bao nhiêu kí tự là số trong sâu kí tự vừa nhập vào
//- kiếm tra xem trong xâu kí tự str có là hàm không
package stringdemo;

import java.util.Scanner;

public class SplittingString {
    public static void main(String[] args) {
       String str;
       Scanner sc=new Scanner(System.in);
        System.out.println("Input a String str=");
        // nhập xâu
        str=sc.nextLine();
        //tách xâu
        String [] strs= str.split("[ ]+");
        // * Đếm số từ trong xâu
        System.out.println("number of string "+strs.length);
        // Hiển thị các từ trong xâu
        for(String s:strs) System.out.println(s);
          //Hiển thị các kí tự là chữ in hoa
        for(int i=0;i<str.length(); i++)
          if(Character.isUpperCase(str.charAt(i)))
                System.out.println(str.charAt(i));
       //* Đếm xe có bao nhiêu kí tự là số
       int count=0;
       for(int i=0;i<str.length();i++)
           if(Character.isDigit (str.charAt(i)))
               count++;
        System.out.println("Number of letter = "+count);
    }
}
