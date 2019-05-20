package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/production")
public class ProductionController {
    @Autowired
    @Qualifier("ServiceImpl")
    private ProductionService service;

    @PostMapping("/create")
    @ResponseBody
    public Production create(Production production) {
        return service.create(production);
    }

    @PostMapping("/update")
    @ResponseBody
    public Production update(Production production) {
        return service.update(production);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Production read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Production> getAll() {
        return service.getAll();
    }
}
