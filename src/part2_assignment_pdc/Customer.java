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


    public double getDaysStaying() {
        return this.daysStaying;
    }

    public void setDaysStaying(double daysStaying) {
        this.daysStaying = daysStaying;
    }

    public String getReservationCode() {
        return this.reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void addRoom(Room newRoom){
        if(numberOfRooms<rooms.length){
            rooms[numberOfRooms] = newRoom;
            numberOfRooms++;
        }else{
            System.out.println("You are not allowed to book more than " + rooms.length + " rooms \n");
        }
        
    }

    public void printRooms(){
        for (int i = 0; i < numberOfRooms; i++) {
             System.out.print(rooms[i].toString());
        }
        System.out.println();
    }




    @Override
    public String toString(){
        return super.toString() + 
                "Days staying: " + getDaysStaying() + "\n" +
                "Reservation Code: " + getReservationCode() + "\n";
    }

}

