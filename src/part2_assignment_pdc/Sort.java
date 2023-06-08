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
    private final double BASIC_PAYMENT = 400;
    private Room[] rooms;
    private int numberOfRooms = 0;

    public Sort(){
        rooms = new Room[3];
    }

    public Sort(String name, int age, String address){
        super(name, age, address);
        rooms = new Room[3];
    }

    public void addRoom(Room newRoom) {
        if(numberOfRooms < rooms.length){
            rooms[numberOfRooms] = newRoom;
            numberOfRooms++;
        }else{
            System.out.println("You have crossed room booking limit\n");
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
        double rent = BASIC_PAYMENT + (numberOfRooms)*(BASIC_PAYMENT*0.20);
        return rent;
    }

    
    @Override
    public String toString(){
        return  super.toString() +
                "Rent: " + getPayment() + "\n";
    }
    
}

