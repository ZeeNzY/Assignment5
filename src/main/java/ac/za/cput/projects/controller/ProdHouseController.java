package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.service.ProdHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/productionHouse")
public class ProdHouseController {
/*
    @Autowired
   // @Qualifier("ServiceImpl")
    private ProdHouseService service;

    @PostMapping("/create")
    @ResponseBody
    public ProductionHouse create(ProductionHouse productionHouse) {
        return service.create(productionHouse);
    }

    @PostMapping("/update")
    @ResponseBody
    public ProductionHouse update(ProductionHouse productionHouse) {
        return service.update(productionHouse);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProductionHouse read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProductionHouse> getAll() {
        return service.getAll();
    }*/

}
