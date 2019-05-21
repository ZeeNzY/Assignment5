package ac.za.cput.projects.domain.payments;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class TalentPayment implements Payable{

    private double salary;

    private TalentPayment(){}

    private TalentPayment(Builder builder) {
        this.salary = builder.salary;
    }

    public double gettalentPayment() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }


    public static class Builder {

        private double salary;

        public TalentPayment.Builder salary(double salary) {
            this.salary = salary;
            return this;
        }


        public TalentPayment build() {
            return new TalentPayment(this);
        }

    }

    @Override
    public String toString() {
        return "TalentPayment{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TalentPayment that = (TalentPayment) o;
        return Double.compare(that.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }
}
