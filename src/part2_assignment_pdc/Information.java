/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        //CREATE ROOM OBJECTs
    Room LEVEL1_RIGHT = new Room("Floor 1, right room", "101");
    Room LEVEL1_LEFT = new Room("Floor 1, left room", "102");
    Room LEVEL1_MIDDLE = new Room("Floor 1, middle room", "103");
    Room LEVEL2_RIGHT = new Room("Floor 2, right room", "104");
    Room LEVEL2_LEFT = new Room("Floor 2, left room", "105");
    Room LEVEL2_MIDDLE = new Room("Floor 2, middle room", "106");
    Room LEVEL3_ROYALSUIT = new Room("Floor 3, special room", "107");

    Scanner input = new Scanner(System.in);

    // PART 1 : Family of 5
    System.out.println("-----------------------FAMILY OF 5 -----------------------");
    
    // Creating a customer object and adding rooms
    Customer customer1 = new Customer("Anika Kaniz and family",21,"Auckland",3,"1234567");
    customer1.addRoom(LEVEL1_RIGHT);
    customer1.addRoom(LEVEL1_LEFT);
    customer1.addRoom(LEVEL1_MIDDLE);
    customer1.addRoom(LEVEL2_RIGHT);
    customer1.addRoom(LEVEL2_LEFT);
    
    // Printing customer information and rooms
    System.out.println(customer1.toString());
    customer1.printRooms();


     // PART 2: Family of 3
    System.out.println("----------------------- FAMILY OF 3 -----------------------");

    // Adding more rooms to the existing customer
    customer1.addRoom(LEVEL2_MIDDLE);
    customer1.addRoom(LEVEL3_ROYALSUIT);

    // Printing updated customer information and rooms
    System.out.println(customer1.toString());
    customer1.printRooms();



    // PART 3: Second Family of 5
    System.out.println("----------------------- SECOND FAMILY OF 5 -----------------------");
 // Creating a new customer object and adding rooms
    Customer customer2 = new Customer("Juliana and family",24,"Wellington",2.4,"1234765");
    customer2.addRoom(LEVEL1_RIGHT);
    customer2.addRoom(LEVEL1_MIDDLE);
    customer2.addRoom(LEVEL2_RIGHT);
    customer2.addRoom(LEVEL2_LEFT);
    customer2.addRoom(LEVEL2_MIDDLE);

    // Printing customer information and rooms
    System.out.println(customer2.toString());
    customer2.printRooms();

    // PART 4: Family of 4 with permanent booking
    System.out.println("----------------------- Family of 4 with permanent booking -----------------------");
// Creating a permanent reservation object and adding rooms
    PermanentReservation r1 = new PermanentReservation("Robert and family", 30, "Mount Eden");
    
    r1.addRoom(LEVEL1_RIGHT);
    r1.addRoom(LEVEL3_ROYALSUIT);
    r1.addRoom(LEVEL2_MIDDLE);
    r1.addRoom(LEVEL1_LEFT);
// Printing reservation information and rooms
    System.out.println(r1.toString());
    r1.printRooms();

    
    // PART 5: Family of 4 with permanent booking (additional rooms)
    System.out.println("----------------------- Family of 4 with permanent booking -----------------------");

    // Adding more rooms to the permanent reservation
    r1.addRoom(LEVEL1_RIGHT);
    r1.addRoom(LEVEL2_RIGHT);
    r1.addRoom(LEVEL2_LEFT);
    r1.addRoom(LEVEL2_MIDDLE);
    
// Printing updated reservation information and rooms
    System.out.println(r1.toString());
    r1.printRooms();
    
    


    // PART 6: Family of 3 with payment confirmation
    System.out.println("----------------------- Family of 3 with Payment confirmation -----------------------");

    // Creating a sort object (presumably for payment confirmation) and adding rooms
    Sort sortPayment = new Sort("Mariam and family", 28, "TAURANGA");
    sortPayment.addRoom(LEVEL2_LEFT);
    sortPayment.addRoom(LEVEL2_RIGHT);
    sortPayment.addRoom(LEVEL2_MIDDLE);
    
// Printing sort information and rooms
    System.out.println(sortPayment.toString());
    sortPayment.printRooms();

    
    
    
  }
    
}
