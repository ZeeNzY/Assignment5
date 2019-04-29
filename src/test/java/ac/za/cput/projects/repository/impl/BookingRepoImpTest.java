package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.repository.AgencyRepository;
import ac.za.cput.projects.repository.BookingRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingRepoImpTest {

    private BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        assertEquals(repository.create(booking),repository.create(booking));
    }

    @Test
    public void read() {
        assertEquals(repository.read(booking.getbooking_id()),repository.read(booking.getbooking_id()));
    }

    @Test
    public void delete() {
        repository.delete(booking.getbooking_id());
    }

    @Test
    public void update() {
        assertEquals(repository.update(booking),repository.update(booking));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }

}