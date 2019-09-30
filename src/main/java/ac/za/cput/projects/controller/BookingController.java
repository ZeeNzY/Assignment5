package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.domain.production.Booking;
import ac.za.cput.projects.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/booking")
public class BookingController {

    @Autowired
  //  @Qualifier("ServiceImpl")
    private BookingService service;

    @PostMapping("/create")
    @ResponseBody
    public Booking create(Booking booking) {
        return service.create(booking);
    }

    @PostMapping("/update")
    @ResponseBody
    public Booking update(Booking booking) {
        return service.update(booking);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Booking read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Booking> getAll() {
        return service.getAll();
    }
}
