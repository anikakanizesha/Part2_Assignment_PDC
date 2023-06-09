/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public abstract class Reservation extends Person {
    
    public Reservation(){
        
    }
    public Reservation(String name, int customerAge, String customerAddress )
    {
        super(name, customerAge, customerAddress);
    }
    
    public abstract void addRoom(Room newRoom);
    public abstract void printRooms();
    public abstract int getNumberOfRooms();
    public abstract double getPayment();
    
     public String toString(){
        return  "name: " + getName() + "\n" +
                "age: " + getCustomerAge() + "\n" +
                "address: " + getCustomerAddress() + "\n";
     }
     
}
