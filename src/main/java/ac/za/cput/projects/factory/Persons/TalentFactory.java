package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.Persons;
import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.util.Misc;

public class TalentFactory {

    Persons persons;

    public static Talent getTalent(String name, String surname, String category, String eyeColor) {
        return new Talent.Builder().talent_Id(Misc.generateId())
                .name(name)
                .surname(surname)
                .category(category)
                .eyeColor(eyeColor)
                .build();

    }
}
