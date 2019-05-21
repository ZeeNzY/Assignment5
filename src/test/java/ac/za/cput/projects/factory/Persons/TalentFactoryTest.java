package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.Talent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TalentFactoryTest {

    private String testName;
    private String testSurname;
    private String testCategory, testEyeColor;

    @Before
    public void setUp() throws Exception {
        this.testName = "Zinzi";
        this.testSurname = "Gulwa";
        this.testCategory = "Actor";
        this.testEyeColor = "Brown";

    }

    @Test
    public void getTalent() {
        Talent talent = TalentFactory.getTalent(this.testName,this.testSurname,this.testCategory,this.testEyeColor);
        Assert.assertNotNull(talent.gettalent_id());
        Assert.assertNotNull(talent);
    }

}