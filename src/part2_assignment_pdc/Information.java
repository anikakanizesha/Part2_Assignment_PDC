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
    Room LEVEL1_RIGHT = new Room("Floor 1, level 1", "101");
    Room LEVEL1_LEFT = new Room("Floor 2, level 2", "102");
    Room LEVEL1_MIDDLE = new Room("Floor 3, level 3", "103");
    Room LEVEL2_RIGHT = new Room("Floor 4, level 4", "104");
    Room LEVEL2_LEFT = new Room("Floor 5, level 5", "105");
    Room LEVEL2_MIDDLE = new Room("Floor 6, level 6", "106");
    Room LEVEL3_ROYALSUIT = new Room("Floor 7, level 7", "107");

    Scanner input = new Scanner(System.in);

    // PART 1
    System.out.println("-----------------------FAMILY OF 5 -----------------------");
    
    Customer customer1 = new Customer("Anika Kaniz and family",21,"Auckland",3,"1234567");
    customer1.addRoom(LEVEL1_RIGHT);
    customer1.addRoom(LEVEL1_LEFT);
    customer1.addRoom(LEVEL1_MIDDLE);
    customer1.addRoom(LEVEL2_RIGHT);
    customer1.addRoom(LEVEL2_LEFT);
    
    System.out.println(customer1.toString());
    customer1.printRooms();


    //PART 2
    System.out.println("----------------------- FAMILY OF 3 -----------------------");

    customer1.addRoom(LEVEL2_MIDDLE);
    customer1.addRoom(LEVEL3_ROYALSUIT);

    System.out.println(customer1.toString());
    customer1.printRooms();



    //Task 3
    System.out.println("----------------------- SECOND FAMILY OF 5 -----------------------");

    Customer customer2 = new Customer("Juliana and family",24,"Wellington",2.4,"1234765");
    customer2.addRoom(LEVEL1_RIGHT);
    customer2.addRoom(LEVEL1_MIDDLE);
    customer2.addRoom(LEVEL2_RIGHT);
    customer2.addRoom(LEVEL2_LEFT);
    customer2.addRoom(LEVEL2_MIDDLE);

    System.out.println(customer2.toString());
    customer2.printRooms();

    
    
    


    //Task 6
    System.out.println("----------------------- Task 6 -----------------------");

    Sort sortPayment = new Sort("Mariam", 28, "TAURANGA");
    sortPayment.addRoom(LEVEL2_LEFT);
    sortPayment.addRoom(LEVEL2_RIGHT);
    sortPayment.addRoom(LEVEL2_MIDDLE);

    System.out.println(sortPayment.toString());
    sortPayment.printRooms();

    
    
    
  }
}
