package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.factory.Production.AgencyFactory;
import ac.za.cput.projects.factory.Production.BookingFactory;
import ac.za.cput.projects.repository.AgencyRepository;
import ac.za.cput.projects.repository.BookingRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingRepoImpTest {

    private BookingRepository repository;
    private Booking booking;

    private Booking getBooking() {
        Set<Booking> bookingSet = this.repository.getAll();
        return bookingSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepoImp.getRepository();
        this.booking = BookingFactory.getBooking("21/05/2019","Extra");
    }

    @Test
    public void create() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void read() {
        Booking booking = getBooking();
        System.out.println("In read, booking_id = "+ booking.getbooking_id());
        Booking read = this.repository.read(booking.getbooking_id());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(booking, read);
    }

    @Test
    public void delete() {
        Booking booking = getBooking();
        this.repository.delete(booking.getbooking_id());
        getAll();
    }

    @Test
    public void update() {
        String talentType = "Extra";
        Booking booking = new Booking.Builder().copy(getBooking()).booking_id(talentType).build();
        System.out.println("In update, about_to_updated = " + booking);
        Booking updated = this.repository.update(booking);
        System.out.println("In update, updated = " + updated);
        //Assert.assertSame(talentType, updated.getTalent_Type());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Booking> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}