/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Edgar Santana
 */
public class Faculty extends Employee {
    int officeHours;
    String rank;
    
    public Faculty(int officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public int getOfficeHours() {
        return officeHours;
    }
    
    public void setOfficeHourse(int officeHours) {
        this.officeHours = officeHours;
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return "You work " + officeHours + " hours a week and your faculty rank is " + 
                rank;
    }
}
