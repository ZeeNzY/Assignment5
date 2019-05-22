package ac.za.cput.projects.service.impl;

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

public class BookingServiceImpTest {

    private BookingRepository repository;
    private Booking booking;

    private Booking getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepoImp.getRepository();
        this.booking = BookingFactory.getBooking("21/05/2019","Extra");
    }

    @Test
    public void a_create() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void c_update() {
        String talentType = "Extra";
        Booking updated = new Booking.Builder().copy(getSaved()).talentType(talentType).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(talentType, updated.getTalent_Type());
    }

    @Test
    public void e_delete() {
        Booking saved = getSaved();
        this.repository.delete(saved.getbooking_id());
       // getAll();
    }

    @Test
    public void b_read() {
        Booking saved = getSaved();
        Booking read = this.repository.read(saved.getbooking_id());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Booking> courses = this.repository.getAll();
        System.out.println("In getall, all = " + booking);
    }
}