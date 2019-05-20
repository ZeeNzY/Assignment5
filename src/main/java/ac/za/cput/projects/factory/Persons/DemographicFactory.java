package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.Demographics;


public class DemographicFactory {

    public static Demographics getDemographics(String race, String gender, String dateOfBirth) {
        return new Demographics.Builder().race(race)
                .gender(gender)
                .dateOfBirth(dateOfBirth)
                .build();
    }
}
