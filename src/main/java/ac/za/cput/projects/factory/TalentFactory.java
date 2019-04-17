package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Talent;

public class TalentFactory {

    public static Talent getTalent(String talent_id, String category, String eyeColor) {
        return new Talent.Builder().talent_Id(talent_id)
                .category(category)
                .eyeColor(eyeColor)
                .build();
    }
}
