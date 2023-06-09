/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public class Room {
    
    private String nameOfFloor; // Name of the floor where the room is located
    private String roomNumber; // Room number
    
    public Room() {
        // Default constructor
    }

    public Room(String nameOfFloor, String roomNumber) {
        this.nameOfFloor = nameOfFloor; // Initialize the name of the floor
        this.roomNumber = roomNumber; // Initialize the room number
    }

    public String getNameOfFloor() {
        return this.nameOfFloor; // Retrieve the name of the floor
    }

    public void setNameOfFloor(String nameOfFloor) {
        this.nameOfFloor = nameOfFloor; // Set the name of the floor
    }

    public String getRoomNumber() {
        return this.roomNumber; // Retrieve the room number
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber; // Set the room number
    }

    @Override
    public String toString() {
        return "Name: " + getNameOfFloor() + "\n" +
               "Room number: " + getRoomNumber() + "\n"; // Return a string representation of the room object
    }

}
