package ac.za.cput.projects.domain.Persons;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Demographics {

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

    @Override
    public String toString() {
        return "Demographics{" +
                "race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demographics that = (Demographics) o;
        return Objects.equals(race, that.race) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(race, gender, dateOfBirth);
    }
}
