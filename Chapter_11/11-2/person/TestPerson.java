/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class TestPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Person
        String name;
        String address;
        long phone;
        String email;
        
        // Student or Employee
        String studentOrEmployee;
        // If Student
        String status;
        //If Employee
        String office;
        int salary;
        int year;
        int month;
        int day;
        
        // Faculty or Staff
        String facultyOrStaff;
        // If Faculty
        int officeHours;
        String rank;
        
        // If Staff
        String title;
             
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        
        System.out.println("Please enter your address: ");
        address = input.nextLine();
        
        
        
        System.out.println("Please enter your phone number: (format: 3333333333)");
        phone = input.nextLong();
        
        System.out.println("Please enter your email");
        email = input.next();
        
        Person person = new Person(name, address, phone, email);
        
        System.out.println("--------------------------");
        System.out.println(person.toString());
        
        System.out.println("Are you a student or employee?");
        studentOrEmployee = input.next();
        input.nextLine();
               
        switch(studentOrEmployee) {
            case "student":
                System.out.println("What Grade Status are you? Freshman, Sophomore, " +
                        "Junior, or Senior?");
                status = input.next();
                
                Student student = new Student(status);
                System.out.println("--------------------------");
                System.out.println(student.toString());               
                break;
                
            case "employee":
                System.out.println("What offices do you work at?");
                office = input.nextLine();
                
                System.out.println("What is your annual salary?");
                salary = input.nextInt();
                input.nextLine();
                
                System.out.println("Date Hired?");
                System.out.println("Year: ");
                year = input.nextInt();
                input.nextLine();
                
                System.out.println("Month: ");
                month = input.nextInt();
                input.nextLine();
                
                System.out.println("Day: ");
                day = input.nextInt();
                input.nextLine();
                
                MyDate dateHired = new MyDate(year, month, day);
                Employee employee = new Employee(office, salary, dateHired);
                System.out.println("--------------------------");
                System.out.println(employee.toString());
                
                System.out.println("Are you faculty or staff?");
                facultyOrStaff = input.next();
                input.nextLine();
                
                switch(facultyOrStaff) {
                    case "faculty":
                        System.out.println("How many hours a week in the office?");
                        officeHours = input.nextInt();
                        input.nextLine();
                        
                        System.out.println("What is your faculty rank?");
                        rank = input.nextLine();
                        
                        Faculty faculty = new Faculty(officeHours, rank);
                        System.out.println("--------------------------");
                        System.out.println(faculty.toString());
                        break;
                     
                    case "staff":
                        System.out.println("What is your staff title?");
                        title = input.nextLine();
                        
                        Staff staff = new Staff(title);
                        System.out.println("--------------------------");
                        System.out.println(staff.toString());
                        break;
                }               
        }
    }
}
