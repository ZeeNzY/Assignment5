package ac.za.cput.projects.domain.Persons;

public class Talent {

    private String category, eyeColor;
    private int talent_id = 1;
    Persons persons;

    private String name = persons.getName();
    private String surname = persons.getSurname();
    private String type = persons.gettype();


    private Talent(){
    }

    private Talent(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.type = builder.type;
        this.talent_id = builder.talent_id;
        this.category = builder.category;
        this.eyeColor = builder.eyeColor;
        talent_id++;
    }

    public int gettalent_id() {
        return talent_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getType(){
        return type;
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
        private String name = persons.getName();
        private String surname = persons.getSurname();
        private String type = persons.gettype();


        public Talent.Builder talent_Id(int talent_id) {
            this.talent_id = talent_id;
            talent_id++;
            return this;
        }

        public Talent.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Talent.Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Talent.Builder type(String type) {
            this.type = type;
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
