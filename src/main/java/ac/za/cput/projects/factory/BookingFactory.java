package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.production.Booking;


public class BookingFactory {

    public static Booking getBooking(String booking_id, String talent_id, String agency_id, String dateOfbooking) {
        return new Booking.Builder().booking_id(booking_id)
                .talent_id(talent_id)
                .agency_id(agency_id)
                .dateOfbooking(dateOfbooking)
                .build();
    }
}
