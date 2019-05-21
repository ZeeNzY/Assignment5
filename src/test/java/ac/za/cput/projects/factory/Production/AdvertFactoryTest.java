package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Adverts;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdvertFactoryTest {


    String production_Name,production_Budget,ad_title;

    @Before
    public void setUp() throws Exception {
        this.production_Name = "TheDonCreations";
        this.production_Budget = "50000";
        this.ad_title = "Nandos";

    }
    @Test
    public void getAdverts() {
        Adverts adverts = AdvertFactory.getAdverts(this.production_Name,this.production_Budget,this.ad_title);
        Assert.assertNotNull(adverts.getproduction_Name());
        Assert.assertNotNull(adverts);
    }
}