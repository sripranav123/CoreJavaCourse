package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Customer> customers;
    public Hotel(int numOfRooms){
        rooms=new ArrayList<>();
        customers=new ArrayList<>();
        for(int i=1 ; i<=numOfRooms ; i++){
            rooms.add(new Room(i));
        }
    }
    public boolean bookRoom(Customer customer){
        Room availableRoom = findAvailableRoom();
        if(availableRoom!=null){
            availableRoom.bookRoom(customer.getName());
            customer.setBookedRoom(availableRoom);
            customers.add(customer);
            return true;
        }
        return false;
    }
    public Room findAvailableRoom(){
        for(Room room : rooms){
            if(!room.isBooked()){
                return room;
            }
        }
        return null;
    }
    public Customer findcustomerbyname(String name){
        for(Customer customer:customers){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    public void vacateRoom(Customer customer){
        Room room=customer.getBookedRoom();
        if(room!=null){
            room.roomVacate();
            customer.setBookedRoom(null);
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
