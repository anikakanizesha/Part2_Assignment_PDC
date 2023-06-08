/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public class Customer extends Person{
    private double daysStaying;
    private String reservationCode;
    private Room[] rooms;
    private int numberOfRooms = 0;

    public Customer(){
        rooms = new Room[6];
    }

    public Customer(String name, int customerAge, String customerAddress, double daysStaying, String reservationCode){
        super(name, customerAge, customerAddress);
        this.daysStaying = daysStaying;
        this.reservationCode = reservationCode;
        if (daysStaying<2) {
            rooms = new Room[4];
        }else{
            rooms = new Room[6];
        }
    }


    public double getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course[] getCourses() {
        return this.courses;
    }

    public int getNumberOfCourses() {
        return this.numberOfCourses;
    }

    public void addCourse(Course newCourse){
        if(numberOfCourses<courses.length){
            courses[numberOfCourses] = newCourse;
            numberOfCourses++;
        }else{
            System.out.println("You are not allowed to take more than " + courses.length + " courses \n");
        }
        
    }

    public void printCourses(){
        for (int i = 0; i < numberOfCourses; i++) {
             System.out.print(courses[i].toString());
        }
        System.out.println();
    }




    @Override
    public String toString(){
        return super.toString() + 
                "cgpa: " + getCgpa() + "\n" +
                "id: " + getId() + "\n";
    }

}

