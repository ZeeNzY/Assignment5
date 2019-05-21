package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.util.Misc;


public class BookingFactory {

    public static Booking getBooking(String dateOfbooking, String talent_Type) {
        return new Booking.Builder().booking_id(Misc.generateId())
                .talent_id(Misc.generateId())
                .agency_id(Misc.generateId())
                .dateOfbooking(dateOfbooking)
                .talentType(talent_Type)
                .build();
    }
}
