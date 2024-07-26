package hotel;

public class Room {
    private int roomNumber ;
    boolean isBooked;
    private String customerName;
    public Room(int roomNumber){
        this.roomNumber=roomNumber;
        this.isBooked=false;
        this.customerName=null;
    }
    public void bookRoom(String customerName){
        this.isBooked=true;
        this.customerName=customerName;
    }
    public void roomVacate(){
        this.isBooked=false;
        this.customerName=null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Room" +
                "roomNumber is " + roomNumber +
                " . isBooked = " + isBooked +"."+
                " . customer Name is " + customerName + '\'';
    }
}
