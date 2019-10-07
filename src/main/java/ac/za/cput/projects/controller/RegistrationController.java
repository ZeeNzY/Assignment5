package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.factory.Persons.EmployeesFactory;
import ac.za.cput.projects.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/registration")
    public ResponseEntity<AgencyEmployee> register(@RequestBody AgencyEmployee registration){
        AgencyEmployee  customer= employeeService.create(mapCustomerData(registration));
        return new ResponseEntity<AgencyEmployee>(customer, HttpStatus.OK);
    }

    protected EmployeesFactory mapCustomerData(EmployeesFactory registration) {
        EmployeesFactory employee = new EmployeesFactory();
        return employee;
        }
    }
