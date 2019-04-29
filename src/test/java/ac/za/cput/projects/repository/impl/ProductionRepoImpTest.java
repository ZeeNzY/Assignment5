package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.repository.ProductionRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionRepoImpTest {

    private ProductionRepository repository;
    private Production production;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        assertEquals(repository.create(production),repository.create(production));
    }

    @Test
    public void read() {
        assertEquals(repository.read(production.getProduction_id()),repository.read(production.getProduction_id()));
    }

    @Test
    public void delete() {
        repository.delete(production.getProduction_id());
    }

    @Test
    public void update() {
        assertEquals(repository.update(production),repository.update(production));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }

}