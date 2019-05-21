package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.domain.payments.Actors;
import ac.za.cput.projects.factory.Production.AgencyFactory;
import ac.za.cput.projects.repository.AgencyRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AgencyRepoImpTest {

    private AgencyRepository repository;
    private Agency agency;
    List talent;

    private Agency getAgencies() {
        Set<Agency> agencySet = this.repository.getAll();
        return agencySet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AgencyRepoImp.getRepository();
        this.agency = AgencyFactory.getAgency("DLC","HelloStreet", talent, "2013");
    }

    @Test
    public void create() {
        Agency created = this.repository.create(this.agency);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.agency);
    }

    @Test
    public void read() {
//        Agency agency = getAgencies();
        System.out.println("In read, courseId = "+ agency.getAgencyId());
        Agency read = this.repository.read(agency.getAgencyId());
        System.out.println("In read, read = " + read);
        getAll();
    //    Assert.assertEquals(agency, read);
    }

    @Test
    public void delete() {
        Agency agency = getAgencies();
        this.repository.delete(agency.getAgencyId());
        getAll();
    }

    @Test
    public void update() {
        String newname = "New Test Course Name";
//        Agency agency = new Agency.Builder().copy(getAgencies()).agencyName(newname).build();
        System.out.println("In update, about_to_updated = " + agency);
        Agency updated = this.repository.update(agency);
        System.out.println("In update, updated = " + updated);
     //   Assert.assertSame(newname, updated.getAgency_Name());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Agency> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}