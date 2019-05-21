package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.EmpSalary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpSalaryFactoryTest {

    double salary;

    @Before
    public void setUp() throws Exception {
        this.salary = 15000;
    }

    @Test
    public void getEmpSalary() {
        EmpSalary empSalary = EmpSalaryFactory.getEmpSalary(this.salary);
        Assert.assertNotNull(empSalary.getPaymentAmount());
        Assert.assertNotNull(empSalary);
    }
}