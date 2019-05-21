package ac.za.cput.projects.Controller;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.factory.Production.AgencyFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AgencyControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/agency";
    private Agency agency;
    private List talent = agency.getTalent();

    @Test
    public void testGetAllStudents() {
       /* HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());*/
    }

    @Ignore
    public void testGetStudentById() {
        Agency agency = restTemplate.getForObject(baseURL + "/agency/1", Agency.class);
        System.out.println(agency.getAgencyId());
        assertNotNull(agency);
    }

    @Ignore
    public void testCreateStudent() {
        Agency agency = AgencyFactory.getAgency("111"," DLC", talent,"2013");

        ResponseEntity<Agency> postResponse = restTemplate.postForEntity(baseURL + "/create", agency, Agency.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStudent() {
        int id = 1;
        Agency agency = restTemplate.getForObject(baseURL + "/agency/" + id, Agency.class);

        restTemplate.put(baseURL + "/agency/" + id, agency);
        Agency updatedAgency = restTemplate.getForObject(baseURL + "/agency/" + id, Agency.class);
        assertNotNull(updatedAgency);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Agency agency = restTemplate.getForObject(baseURL + "/agency/" + id, Agency.class);
        assertNotNull(agency);
        restTemplate.delete(baseURL + "/agency/" + id);
        try {
            agency = restTemplate.getForObject(baseURL + "/agency/" + id, Agency.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}