package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.factory.Production.AgencyFactory;
import ac.za.cput.projects.repository.AgencyRepository;
import ac.za.cput.projects.repository.impl.AgencyRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AgencyServiceImpTest {

    private AgencyRepository repository;
    private Agency agency;
    private List talent;

    @Before
    public void setUp() throws Exception {
        this.repository = AgencyRepoImp.getRepository();
        this.agency = AgencyFactory.getAgency("DLC","HelloStreet", talent, "2013");
    }

    private Agency getAgencies() {
        Set<Agency> agencySet = this.repository.getAll();
        return agencySet.iterator().next();
    }

    @Test
    public Agency getService() {
        return this.repository.getAll().iterator().next();
    }

    @Test
    public void create() {
        Agency created = this.repository.create(this.agency);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.agency);
    }

    @Test
    public void update() {
        String name = "DLC";
        Agency updated = new Agency.Builder().copy(getService()).agencyName(name).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(name, updated.getAgency_Name());
    }

    @Test
    public void delete() {
        Agency saved = getService();
        this.repository.delete(saved.getAgencyId());
        getAll();
    }

    @Test
    public void read() {
        Agency saved = getService();
        Agency read = this.repository.read(saved.getAgencyId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void getAll() {
        Set<Agency> agencySet = this.repository.getAll();
        System.out.println("In getall, all = " + agencySet);
    }
}