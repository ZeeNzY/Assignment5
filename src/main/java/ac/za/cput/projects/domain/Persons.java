package ac.za.cput.projects.domain;

public class Persons {

    private String type;

    Persons(){}

    private Persons(Persons.Builder builder) {
        this.type = builder.type;
    }

    public String gettype() {
        return type;
    }


    public static class Builder {

        private String type;

        public Persons.Builder type(String type) {
            this.type = type;
            return this;
        }


        public Persons build() {
            return new Persons(this);
        }

    }
}
