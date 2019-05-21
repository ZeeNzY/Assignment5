package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.Actors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActorFactoryTest {

    double salary;

    @Before
    public void setUp() throws Exception {
        this.salary = 12000;
    }

    @Test
    public void getActors() {
        Actors actors = ActorFactory.getActors(this.salary);
        Assert.assertNotNull(actors.getPaymentAmount());
        Assert.assertNotNull(actors);
    }
}