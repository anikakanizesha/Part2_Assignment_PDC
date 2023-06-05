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
    
    private String nameOfFloor;
    private String roomNumber;
    
    public Room() {
    }

    public Room(String nameOfFloor, String roomNumber) {
        this.nameOfFloor = nameOfFloor;
        this.roomNumber = roomNumber;
    }

    public String getNameOfFloor() {
        return this.nameOfFloor;
    }

    public void setNameOfFloor(String nameOfFloor) {
        this.nameOfFloor = nameOfFloor;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Name: " + getNameOfFloor() + "\n" +
               "Course Code: " + getRoomNumber() + "\n";
    }

}

    
    
    
}
