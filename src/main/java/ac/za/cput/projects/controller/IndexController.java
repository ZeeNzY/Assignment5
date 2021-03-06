package ac.za.cput.projects.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = {"/", "/Assignment5/create"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to the Production App!", HttpStatus.OK);
    }
}
