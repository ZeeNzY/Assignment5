package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.factory.Production.ProductionHouseFactory;
import ac.za.cput.projects.repository.ProdHouseRepository;
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
public class ProdHouseRepoImpTest {

    private ProdHouseRepository repository;
    private ProductionHouse productionHouse;


    private ProductionHouse getProductionHouse() {
        Set<ProductionHouse> phSet = this.repository.getAll();
        return phSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ProdHouseRepoImp.getRepository();
        this.productionHouse = ProductionHouseFactory.getProductionHouse("TheDonCreations", "101 Street");
    }

    @Test
    public void create() {
        ProductionHouse created = this.repository.create(this.productionHouse);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.productionHouse);
    }

    @Test
    public void read() {
        ProductionHouse booking = getProductionHouse();
        System.out.println("In read, productionHouse_id = "+ booking.getProdhouseId());
        ProductionHouse read = this.repository.read(booking.getProdhouseId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertNotEquals(productionHouse, read);
    }

    @Test
    public void delete() {
        ProductionHouse booking = getProductionHouse();
        this.repository.delete(productionHouse.getProdhouseId());
        getAll();
    }

    @Test
    public void update() {
        String name = "TheDonCreations";
        ProductionHouse productionHouse = new ProductionHouse.Builder().copy(getProductionHouse()).prodhouse_Name(name).build();
        System.out.println("In update, about_to_updated = " + productionHouse);
        ProductionHouse updated = this.repository.update(productionHouse);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(name, updated.getProdhouse_Name());
        getAll();
    }

    @Test
    public void getAll() {
        Set<ProductionHouse> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}