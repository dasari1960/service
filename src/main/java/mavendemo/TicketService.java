package mavendemo;
import TicketPaymentServiceImplementation;
import mavendemo.*;
public class TicketService {
    private final TicketPaymentService paymentService;
    private final SeatReservationService seatReservationService;

    public TicketService(TicketPaymentService paymentService, SeatReservationService seatReservationService) {
        this.paymentService = paymentService;
        this.seatReservationService = seatReservationService;
    }

    public boolean purchaseTickets(TicketTypeRequest request) {
        int accountId = request.getAccountId();
        int amount = request.getTotalCount() * 10; // assuming each ticket costs 10
        if (paymentService.makePayment(accountId, amount) && seatReservationService.reserveSeats(request.getTotalCount())) {
            return true;
        } else {
            return false;
        }
    }
}

