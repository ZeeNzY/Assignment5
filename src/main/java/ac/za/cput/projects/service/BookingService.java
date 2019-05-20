package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.production.Booking;

import java.util.Set;

public interface BookingService extends IService<Booking, String> {
    Set<Booking> getAll();
}
