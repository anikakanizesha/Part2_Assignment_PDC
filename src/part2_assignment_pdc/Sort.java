/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public class Sort extends Reservation{
    private final double BASIC_PAYMENT = 400; // Constant representing the basic payment
    private Room[] rooms; // Array to store rooms
    private int numberOfRooms = 0; // Number of rooms currently added

    public Sort(){
        rooms = new Room[3]; // Initialize the room array with a size of 3
    }

    public Sort(String name, int age, String address){
        super(name, age, address); // Call the constructor of the superclass (Reservation)
        rooms = new Room[3]; // Initialize the room array with a size of 3
    }

    public void addRoom(Room newRoom) {
        if(numberOfRooms < rooms.length){ // Check if there is space in the room array
            rooms[numberOfRooms] = newRoom; // Add the new room to the array
            numberOfRooms++;// Increment the number of rooms
        }else{
            System.out.println("You have crossed room booking limit\n");// Print an error message if the room limit is exceeded
        }
    }

    public void printRooms() {
        for (int i = 0; i < numberOfRooms; i++) {
            System.out.print(rooms[i].toString()); // Print the details of each room
        }
        System.out.println();
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms; // Return the number of rooms

    }

    public double getPayment() {
        double rent = BASIC_PAYMENT + (numberOfRooms)*(BASIC_PAYMENT*0.20);
        return rent; // Return the payment amount
    }

    
    @Override
    public String toString(){
        return  super.toString() +
                "Rent: " + getPayment() + "\n";  // Return a string representation of the object including the rent
    }
    
}

