package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.Extras;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtrasFactoryTest {


    private double daily_rate;

    @Before
    public void setUp() throws Exception {
        this.daily_rate = 750;
    }

    @Test
    public void getExtras() {
        Extras extras = ExtrasFactory.getExtras(this.daily_rate);
        Assert.assertNotNull(extras.getPaymentAmount());
        Assert.assertNotNull(extras);
    }



}