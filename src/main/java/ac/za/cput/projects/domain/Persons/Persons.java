package ac.za.cput.projects.domain.Persons;

import ac.za.cput.projects.domain.payments.Payable;

public class Persons {

    private String name;
    private String surname;
    private String type;

    private Persons(){}

    private Persons(Builder builder) {

        this.name = builder.name;
        this.surname = builder.surname;
        this.type = builder.type;
    }

    public String gettype() {
        return type;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public static class Builder {

        private String name;
        private String surname;
        private String type;

        public Persons.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Persons.Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Persons.Builder type(String type) {
            this.type = type;
            return this;
        }

        public Persons build() {
            return new Persons(this);
        }

    }
}
