package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/talent")
public class TalentController {
    /*    @Autowired
      //  @Qualifier("ServiceImpl")
        private TalentService service;

        @PostMapping("/create")
        @ResponseBody
        public Talent create(Talent talent) {
            return service.create(talent);
        }

        @PostMapping("/update")
        @ResponseBody
        public Talent update(Talent talent) {
            return service.update(talent);
        }

        @GetMapping("/delete/{id}")
        @ResponseBody
        public void delete(@PathVariable String id) {
            service.delete(id);

        }

        @GetMapping("/read/{id}")
        @ResponseBody
        public Talent read(@PathVariable String id) {
            return service.read(id);
        }

        @GetMapping("/read/all")
        @ResponseBody
        public Set<Talent> getAll() {
            return service.getAll();
        }*/
}
