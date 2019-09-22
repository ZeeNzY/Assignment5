package ac.za.cput.projects.controller;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.domain.ResponseObj;
import ac.za.cput.projects.factory.Persons.EmployeesFactory;
import ac.za.cput.projects.factory.ResponseObjFactory;
import ac.za.cput.projects.service.EmployeeService;
import ac.za.cput.projects.service.impl.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController
@RequestMapping("/Assignment5/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@RequestBody AgencyEmployee employee) {
        System.out.println(employee);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Employee created!");
        if (employee.getName() == null || employee.getSurname() == null || employee.getposition() == null) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide first and/or last name!");
        }
             else {
                AgencyEmployee savedEmp = saveEmployee(employee);
                responseObj.setResponse(savedEmp);
            }
        return ResponseEntity.ok(responseObj);
    }


    private AgencyEmployee saveEmployee(AgencyEmployee employee) {
        AgencyEmployee emp = EmployeesFactory.getEmployees(employee.getName(), employee.getName(), employee.getposition());
        return employeeService.create(emp);
    }
}
