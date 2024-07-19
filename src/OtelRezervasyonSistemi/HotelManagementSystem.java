package OtelRezervasyonSistemi;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public HotelManagementSystem(){
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void makeReservation(String guestName, Room room, String checkInDate, String checkOutDate){
        Reservation reservation = new Reservation(guestName,room,checkInDate,checkOutDate);
        reservations.add(reservation);
        room.setAvailable(false);
    }

    public void listRooms(){
        System.out.println("Hotel Rooms:");
        for (Room room : rooms){
            System.out.println(room);
        }
    }

    public void listReservations(){
        System.out.println("Hotel Reservations:");
        for (Reservation reservation : reservations){
            System.out.println(reservation);
        }
    }

    public void cancelReservation(Reservation reservation){
        reservations.remove(reservation);
        reservation.getRoom().setAvailable(true);
    }

    public static void main(String[] args) {
        HotelManagementSystem hotel = new HotelManagementSystem();

        Room room1 = new Room(101, "Single", true);
        Room room2 = new Room(102, "Double", true);

        hotel.addRoom(room1);
        hotel.addRoom(room2);

        hotel.makeReservation("John Doe", room1, "2024-06-20", "2024-06-25");
        hotel.makeReservation("Jane Doe", room2, "2024-07-01", "2024-07-05");

        hotel.listRooms();
        hotel.listReservations();

        hotel.cancelReservation(hotel.reservations.get(0));
        hotel.listReservations();
        hotel.listRooms();

    }

}
