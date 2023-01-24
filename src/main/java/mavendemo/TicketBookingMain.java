package mavendemo;

import TicketPaymentServiceImplementation;

public class TicketBookingMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        TicketPaymentService paymentService = new TicketPaymentServiceImplementation();
        SeatReservationService seatReservationService = new SeatReservationServiceImplementation();
        TicketService ticketService = new TicketService(paymentService, seatReservationService);

        TicketTypeRequest request = new TicketTypeRequest(1,2,3,4);
        boolean purchaseResult = ticketService.purchaseTickets(request);
        System.out.println("Purchase result: " + purchaseResult);

        if(purchaseResult){
            int accountId = 1;
            int amount = 30;
            boolean paymentResult = paymentService.makePayment(accountId, amount);
            System.out.println("Payment result: " + paymentResult);
            int seatCount = 3;
            boolean seatReservationResult = seatReservationService.reserveSeats(seatCount);
            System.out.println("Reservation result: " + seatReservationResult);
        }
    }
}
