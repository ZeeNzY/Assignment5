package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.Persons;
import ac.za.cput.projects.domain.Persons.Talent;

public class TalentFactory {

    Persons persons;

    public static Talent getTalent(int talent_id,String name, String surname, String type, String category, String eyeColor) {
        return new Talent.Builder().talent_Id(talent_id)
                .name(name)
                .surname(surname)
                .type(type)
                .category(category)
                .eyeColor(eyeColor)
                .build();

    }
}
