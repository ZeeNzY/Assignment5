package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.repository.BookingRepository;

import java.util.HashSet;
import java.util.Set;

public class BookingRepoImp implements BookingRepository {

    private static BookingRepoImp repository = null;
    private Set<Booking> booking;

    private BookingRepoImp() {
        this.booking = new HashSet<>();
    }

    public static BookingRepository getRepository(){
        if(repository == null) repository = new BookingRepoImp();
        return repository;
    }

    public Booking create(Booking booking){
        this.booking.add(booking);
        return booking;
    }

    public Booking read(String bookingId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Booking update(Booking booking) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String bookingId) {
        //find the student and delete it if it exists

    }

    public Set<Booking> getAll(){
        return this.booking;
    }

}
