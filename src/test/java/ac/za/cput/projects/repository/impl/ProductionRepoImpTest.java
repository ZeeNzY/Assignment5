package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.factory.Production.ProductionFactory;
import ac.za.cput.projects.repository.ProductionRepository;
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
public class ProductionRepoImpTest {

    private ProductionRepository repository;
    private Production production;


    private Production getProduction() {
        Set<Production> productionSet = this.repository.getAll();
        return productionSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ProductionRepoImp.getRepository();
        this.production = ProductionFactory.getProduction("Film");
    }

    @Test
    public void create() {
        Production created = this.repository.create(this.production);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.production);
    }

    @Test
    public void read() {
//       Production booking = getProduction();
        System.out.println("In read, production_id = "+ production.getProduction_id());
        Production read = this.repository.read(production.getProduction_id());
        System.out.println("In read, read = " + read);
        getAll();
   //     Assert.assertEquals(production, read);
    }

    @Test
    public void delete() {
        Production production = getProduction();
        this.repository.delete(production.getProduction_id());
        getAll();
    }

    @Test
    public void update() {
        String prodType = "Film";
//       Production production = new Production.Builder().copy(getProduction()).production_type(prodType).build();
        System.out.println("In update, about_to_updated = " + production);
        Production updated = this.repository.update(production);
        System.out.println("In update, updated = " + updated);
   //     Assert.assertSame(prodType, updated.getProduction_type());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Production> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}