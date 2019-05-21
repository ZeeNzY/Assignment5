package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.EmpPosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpPositionFactoryTest {

    String jobposition;
    @Before
    public void setUp() throws Exception {
        this.jobposition = "Manager";
    }

    @Test
    public void getEmpPosition() {
        EmpPosition empPosition = EmpPositionFactory.getEmpPosition(this.jobposition);
        Assert.assertNotNull(empPosition.getjobposition());
        Assert.assertNotNull(empPosition);
    }
}