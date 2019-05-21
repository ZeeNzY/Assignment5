package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.repository.BookingRepository;
import ac.za.cput.projects.repository.impl.BookingRepoImp;
import ac.za.cput.projects.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class BookingServiceImp implements BookingService {

    private BookingRepository repository;
    private static BookingServiceImp service = null;

    private BookingServiceImp(){
        this.repository = BookingRepoImp.getRepository();
    }

    public static BookingServiceImp getService(){
        if (service == null) service = new BookingServiceImp();
        return service;
    }

    @Override
    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return repository.update(booking);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Booking read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }
}
