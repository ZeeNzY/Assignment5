package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.Agency;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AgencyFactoryTest {


    private String agency_Name,agency_address, year_established;
    private List talent;
    @Before
    public void setUp() throws Exception {
        this.agency_Name = "DLC";
        this.agency_address = "HelloStreet";
        this.year_established = "2013";
        this.talent = talent;
    }

    @Test
    public void getAgency() {
        Agency agency = AgencyFactory.getAgency(this.agency_Name,this.agency_address,this.talent,this.year_established);
        Assert.assertNotNull(agency.getAgencyId());
        Assert.assertNotNull(agency);
    }
}