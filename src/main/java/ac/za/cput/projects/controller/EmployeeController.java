package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
  //  @Qualifier("ServiceImpl")
    private EmployeeService service;

    @PostMapping("/create")
    @ResponseBody
    public AgencyEmployee create(AgencyEmployee agencyEmployee) {
        return service.create(agencyEmployee);
    }

    @PostMapping("/update")
    @ResponseBody
    public AgencyEmployee update(AgencyEmployee agencyEmployee) {
        return service.update(agencyEmployee);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public AgencyEmployee read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<AgencyEmployee> getAll() {
        return service.getAll();
    }
}
