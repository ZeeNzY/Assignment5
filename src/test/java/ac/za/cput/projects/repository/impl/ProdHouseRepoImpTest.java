package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.repository.ProdHouseRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProdHouseRepoImpTest {

    private ProdHouseRepository repository;
    private ProductionHouse productionHouse;

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
        assertEquals(repository.create(productionHouse),repository.create(productionHouse));
    }

    @Test
    public void read() {
        assertEquals(repository.read(productionHouse.getProdhouseId()),repository.read(productionHouse.getProdhouseId()));
    }

    @Test
    public void delete() {
        repository.delete(productionHouse.getProdhouseId());
    }

    @Test
    public void update() {
        assertEquals(repository.update(productionHouse),repository.update(productionHouse));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }

}