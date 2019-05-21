package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Films;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilmsFactoryTest {

    String production_Name, production_Budget;

    @Before
    public void setUp() throws Exception {
        this.production_Name = "TheDonCreations";
        this.production_Budget = "95000";
    }

    @Test
    public void getFilms() {
        Films films = FilmsFactory.getFilms(this.production_Name,this.production_Budget);
        Assert.assertNotNull(films.getproduction_Name());
        Assert.assertNotNull(films);
    }
}