package ac.za.cput.projects.domain.Persons;

public class Talent {

    private String category, eyeColor;
    private int talent_id = 1;
    Persons persons;

    private Talent(){
    }

    private Talent(Builder builder) {
        this.persons = builder.persons;
        this.talent_id = builder.talent_id;
        this.category = builder.category;
        this.eyeColor = builder.eyeColor;
        talent_id++;
    }

    public int gettalent_id() {
        return talent_id;
    }

    public String getcategory() {
        return category;
    }

    public String geteyeColor() {
        return eyeColor;
    }

    public static class Builder {

        private String category, eyeColor;
        private int talent_id = 1;
        Persons persons;

        public Talent.Builder persons(Persons persons){
            this.persons = persons;
            return this;
        }

        public Talent.Builder talent_Id(int talent_id) {
            this.talent_id = talent_id;
            talent_id++;
            return this;
        }

        public Talent.Builder category(String category) {
            this.category = category;
            return this;
        }

        public Talent.Builder eyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Talent build() {
            return new Talent(this);
        }

    }

}
