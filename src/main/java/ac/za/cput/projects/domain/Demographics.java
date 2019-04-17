package ac.za.cput.projects.domain;

public class Demographics extends Persons {

    private String race, gender, dateOfBirth;

    private Demographics(){}

    private Demographics(Demographics.Builder builder) {
        this.race = builder.race;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public String getrace() {
        return race;
    }

    public String getgender() {
        return gender;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }


    public static class Builder {

        private String race, gender, dateOfBirth;

        public Builder race(String race) {
            this.race = race;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }


        public Demographics build() {
            return new Demographics(this);
        }

    }
}
