package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Production;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionFactoryTest {

    String production_type;

    @Before
    public void setUp() throws Exception {
        this.production_type = "Film";
    }

    @Test
    public void getProduction() {
        Production production = ProductionFactory.getProduction(this.production_type);
        Assert.assertNotNull(production.getProduction_id());
        Assert.assertNotNull(production);
    }
}