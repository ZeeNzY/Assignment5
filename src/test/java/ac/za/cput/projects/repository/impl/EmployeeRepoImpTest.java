package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.factory.Persons.EmployeesFactory;
import ac.za.cput.projects.repository.EmployeeRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepoImpTest {

    private EmployeeRepository repository;
    private AgencyEmployee employee;

    private AgencyEmployee getEmployee() {
        Set<AgencyEmployee> employeeSet = this.repository.getAll();
        return employeeSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepoImp.getEmployeeRepository();
        this.employee = EmployeesFactory.getEmployees("Zinzi","Gulwa","Manager");
    }

    @Test
    public void create() {
        AgencyEmployee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void read() {
  //      AgencyEmployee employee = getEmployee();
        System.out.println("In read, emp_id = "+ employee.getEmp_id());
        AgencyEmployee read = this.repository.read(employee.getEmp_id());
        System.out.println("In read, read = " + read);
        getAll();
//        Assert.assertEquals(employee, read);
    }

    @Test
    public void delete() {
        AgencyEmployee employee = getEmployee();
        this.repository.delete(employee.getEmp_id());
        getAll();
    }

    @Test
    public void update() {
        String newname = "Zinzi";
     //   AgencyEmployee employee = new AgencyEmployee.Builder().copy(getEmployee()).name(newname).build();
        System.out.println("In update, about_to_updated = " + employee);
        AgencyEmployee updated = this.repository.update(employee);
        System.out.println("In update, updated = " + updated);
       // Assert.assertSame(newname, updated.getName());
        getAll();

    }

    @Test
    public void getAll() {
        Set<AgencyEmployee> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}