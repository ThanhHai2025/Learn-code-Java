/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerBook;

/**
 *
 * @author Admin
 */
public class StudentBook {
    int id;
    String Name;
    int year;
    StudentBook (int id, String Name, int year){
    this.id=id;
    this.Name=Name;
    this.year=year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString(){
        return id +"\t"+ Name +"\t"+ year;
    }
}
