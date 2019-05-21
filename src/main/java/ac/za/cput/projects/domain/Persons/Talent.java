package ac.za.cput.projects.domain.Persons;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Talent {

    private String category, eyeColor;
    private String talent_id;
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

    }

    public String gettalent_id() {
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
        private String talent_id;
        Persons persons;
        private String name = persons.getName();
        private String surname = persons.getSurname();
        private String type = persons.gettype();


        public Talent.Builder talent_Id(String talent_id) {
            this.talent_id = talent_id;
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

    @Override
    public String toString() {
        return "Talent{" +
                "category='" + category + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", talent_id=" + talent_id +
                ", persons=" + persons +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Talent talent = (Talent) o;
        return talent_id == talent.talent_id &&
                Objects.equals(category, talent.category) &&
                Objects.equals(eyeColor, talent.eyeColor) &&
                Objects.equals(persons, talent.persons) &&
                Objects.equals(name, talent.name) &&
                Objects.equals(surname, talent.surname) &&
                Objects.equals(type, talent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, eyeColor, talent_id, persons, name, surname, type);
    }
}
