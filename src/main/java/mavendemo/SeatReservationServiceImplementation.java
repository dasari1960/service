package mavendemo;

public class SeatReservationServiceImplementation implements SeatReservationService {
    private int availableSeats;

    public SeatReservationServiceImplementation() {
        this.availableSeats = 100; // initialize available seats to 100
    }

    @Override
    public boolean reserveSeats(int seatCount) {
        if (seatCount > availableSeats) {
            return false;
        } else {
            availableSeats -= seatCount;
            return true;
        }
    }
}
