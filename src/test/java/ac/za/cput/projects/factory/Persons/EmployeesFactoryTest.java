package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesFactoryTest {

    String name, surname, position;
    @Before
    public void setUp() throws Exception {
        this.name = "Zinzi";
        this.surname = "Gulwa";
        this.position = "Manager";
    }

    @Test
    public void getEmployees() {
        AgencyEmployee agencyEmployee = EmployeesFactory.getEmployees(this.name,this.surname,this.position);
        Assert.assertNotNull(agencyEmployee.getEmp_id());
        Assert.assertNotNull(agencyEmployee);
    }
}