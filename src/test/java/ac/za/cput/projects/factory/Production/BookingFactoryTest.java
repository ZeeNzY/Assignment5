package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Booking;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingFactoryTest {

    String dateOfbooking, talent_Type;

    @Before
    public void setUp() throws Exception {
        this.dateOfbooking = "21/05/2019";
        this.talent_Type = "Extra";
    }

    @Test
    public void getBooking() {
        Booking booking = BookingFactory.getBooking(this.dateOfbooking,this.talent_Type);
        Assert.assertNotNull(booking.getbooking_id());
        Assert.assertNotNull(booking);
    }
}