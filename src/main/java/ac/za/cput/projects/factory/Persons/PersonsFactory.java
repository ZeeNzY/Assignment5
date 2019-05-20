package ac.za.cput.projects.factory.Persons;


import ac.za.cput.projects.domain.Persons.Persons;

public class PersonsFactory {

    public static Persons getPersons(String type) {
        return new Persons.Builder().type(type)
                .build();
    }
}
