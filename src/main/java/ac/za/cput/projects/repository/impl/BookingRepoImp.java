package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.repository.BookingRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("InMemoryB")
public class BookingRepoImp implements BookingRepository {

    private static BookingRepoImp repository = null;
    private Map<String,Booking> booking;

    private BookingRepoImp() {
        this.booking = new HashMap<>();
    }

    public static BookingRepository getRepository(){
        if(repository == null) repository = new BookingRepoImp();
        return repository;
    }

    public Booking create(Booking booking){
        this.booking.put(booking.getbooking_id(),booking);
        return booking;
    }

    public Booking read(String bookingId){
        return this.booking.get(bookingId);
    }

    public Booking update(Booking booking) {
        this.booking.replace(booking.getbooking_id(),booking);
        return this.booking.get(booking.getbooking_id());
    }

    public void delete(String bookingId) {
        this.booking.remove(booking);
    }

    public Set<Booking> getAll(){
        Collection<Booking> bookingCollection = this.booking.values();
        Set<Booking> set = new HashSet<>();
        set.addAll(bookingCollection);
        return set;
    }

}
