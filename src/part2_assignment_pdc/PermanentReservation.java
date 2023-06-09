/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public class PermanentReservation extends Reservation{

    private final double BASIC_RENT = 500; 
    private Room[] rooms;
    private int numberOfRooms = 0; 

    public PermanentReservation(){
        rooms = new Room[7];
    }

    public PermanentReservation(String name, int customerAge, String customerAddress){
        super(name, customerAge, customerAddress);
        rooms = new Room[7];

    }

    public void addRoom(Room newRoom) {
        if(numberOfRooms < rooms.length){
            rooms[numberOfRooms] = newRoom;
            numberOfRooms++;
        }else{
            System.out.println("Room booking limit reached\n");
        }
    }

    public void printRooms() {
        for (int i = 0; i < numberOfRooms; i++) {
            System.out.print(rooms[i].toString());
        }
        System.out.println();
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public double getPayment() {
        double salary = BASIC_RENT + (numberOfRooms)*(BASIC_RENT*0.20);
        return salary;
    }

    @Override
    public String toString(){
        return  super.toString() +
                "salary: " + getPayment() + "\n";

    }

    
}