package ac.za.cput.projects.domain.payments;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Actors implements Payable{

    private double salary;

    private Actors(){}

    private Actors(Builder builder) {
        this.salary = builder.salary;
    }

    public double getsalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
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

    @Override
    public String toString() {
        return "Actors{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actors actors = (Actors) o;
        return Double.compare(actors.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }
}
