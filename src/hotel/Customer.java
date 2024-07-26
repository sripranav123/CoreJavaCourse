package hotel;

public class Customer {
    private String name;
    private Room bookedRoom;

    public Customer(String name) {
        this.name=name;
        this.bookedRoom=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", bookedRoom=" + bookedRoom +
                '}';
    }
}
