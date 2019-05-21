package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.ProductionHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionHouseFactoryTest {

    private String prodhouse_Name, prodhouse_Address;

    @Before
    public void setUp() throws Exception {
        this.prodhouse_Name = "TheDonCreations";
        this.prodhouse_Address = "101 Street";
    }

    @Test
    public void getProductionHouse() {
        ProductionHouse productionHouse = ProductionHouseFactory.getProductionHouse(this.prodhouse_Name,this.prodhouse_Address);
        Assert.assertNotNull(productionHouse.getProdhouseId());
        Assert.assertNotNull(productionHouse);
    }
}