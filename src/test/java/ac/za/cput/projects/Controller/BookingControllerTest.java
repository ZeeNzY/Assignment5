package ac.za.cput.projects.Controller;

import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.factory.Production.BookingFactory;
import ac.za.cput.projects.repository.BookingRepository;
import ac.za.cput.projects.repository.impl.BookingRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.Set;

import static org.junit.Assert.*;

public class BookingControllerTest {

    private BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepoImp.getRepository();
        this.booking = BookingFactory.getBooking("21/05/2019","Extra");
    }

   /* @Test
    public Booking getService() {
        return this.repository.getAll().iterator().next();
         } */

    private Booking getAgencies() {
        Set<Booking> bookingSet = this.repository.getAll();
        return bookingSet.iterator().next();
    }

    @Test
    public void create() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);

    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
    }
}