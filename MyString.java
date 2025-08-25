/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String[] w = str.split(" ");
        int count = 0;
        for(String word : w){
            for (char c: word.toCharArray()){
                if(Character.isDigit(c) && (c - '0') %2==1){
                count++;
                break;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] w = str.split(" ");
        for (int i = 0; i < w.length; i++) {
        if (isPalindrome(w[i])) {
            w[i] = "XX";
            break;
        }
    }
    return String.join(" ", w);
    }

    private boolean isPalindrome(String w) {
        int l = 0; 
        int r = w.length() - 1;
        while(l < r){
            if(w.charAt(l) !=w.charAt(r)) {
            return false;
            }
            l++; r--;
        }
        return true;
    }
}
