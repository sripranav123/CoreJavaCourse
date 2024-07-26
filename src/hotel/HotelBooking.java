package hotel;

import javax.naming.Name;
import java.util.Scanner;

public class HotelBooking{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Hotel hotel = new Hotel(10);
        while (true){
            System.out.println("\nHotel Booking System");
            System.out.println("1. Book a Room.");
            System.out.println("2. Check Room Availability.");
            System.out.println("3. View Booking Details.");
            System.out.println("4. Vacate Room.");
            System.out.println("5. Exit.");
            System.out.println("Choose an Option.:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Customer Name : ");
                    String name=scanner.nextLine();
                    Customer customer=new Customer(name);
                    if(hotel.bookRoom(customer)){
                        System.out.println("Room Booked Successfully");
                    }
                    else{
                        System.out.println("No Rooms Available");
                    }
                    break;
                case 2:
                    for(Room room: hotel.getRooms()){
                        System.out.println(room);
                        break;
                    }
                case 3:
                    System.out.println("Enter Customer Name: ");
                    name=scanner.nextLine();
                    Customer foundCustomer=hotel.findcustomerbyname(name);
                    if(foundCustomer!=null){
                        System.out.println(foundCustomer);
                    }
                    else{
                        System.out.println("Customer Not Found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Customer Name: ");
                    name=scanner.nextLine();
                    Customer toVacate = hotel.findcustomerbyname(name);
                    if(toVacate!=null){
                        hotel.vacateRoom(toVacate);
                        System.out.println("Vacated Room.");
                    }
                    else{
                        System.out.println("Customer Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option . Plaese Try Again");
            }
        }
    }
}