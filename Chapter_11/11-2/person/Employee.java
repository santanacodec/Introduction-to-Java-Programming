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
public class Employee extends Person{
    String office;
    int salary;
    MyDate dateHired = new MyDate();
    
    public Employee(){} 
    
    public Employee(String office, int salary, MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    public String getOffice() {
        return office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public MyDate getDateHired() {
        return dateHired;
    }
    
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    
    @Override
    public String toString() {
        return "You are an employee at " + office + " and make an annual salary of " +
                salary + " and was hired on " + dateHired.getMonth() + "/" + dateHired.getDay() +
                "/" + dateHired.getYear();
    }
}
