package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.production.Booking;

import java.util.Set;

public interface BookingRepository {

    Set<Booking> getAll();

}
