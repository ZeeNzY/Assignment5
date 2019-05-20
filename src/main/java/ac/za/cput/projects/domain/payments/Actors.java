package ac.za.cput.projects.domain.payments;


public class Actors{

    private double salary;

    private Actors(){}

    private Actors(Builder builder) {
        this.salary = builder.salary;
    }

    public double getsalary() {
        return salary;
    }


    public static class Builder {

        private double salary;

        public Builder salary( double salary) {
            this.salary = salary;
            return this;
        }


        public Actors build() {
            return new Actors(this);
        }

    }

}
