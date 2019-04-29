package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.repository.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepoImpTest {

    private EmployeeRepository repository;
    private AgencyEmployee employee;

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
        assertEquals(repository.create(employee),repository.create(employee));
    }

    @Test
    public void read() {
        assertEquals(repository.read(String.valueOf(employee.getEmp_id())),repository.read(String.valueOf(employee.getEmp_id())));
    }

    @Test
    public void delete() {
        repository.delete(String.valueOf(employee.getEmp_id()));
    }

    @Test
    public void update() {
        assertEquals(repository.update(employee),repository.update(employee));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }

}