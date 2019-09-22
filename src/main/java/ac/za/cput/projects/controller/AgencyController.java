package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/agency")
public class AgencyController {
/*
  //  @Autowired
   // @Qualifier("ServiceImpl")
    private AgencyService service;

    @PostMapping("/create")
    @ResponseBody
    public Agency create(Agency agency) {
        return service.create(agency);
    }

    @PostMapping("/update")
    @ResponseBody
    public Agency update(Agency agency) {
        return service.update(agency);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Agency read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Agency> getAll() {
        return service.getAll();
    }
*/
}
