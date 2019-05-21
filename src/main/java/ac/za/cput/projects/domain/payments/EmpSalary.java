package ac.za.cput.projects.domain.payments;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class EmpSalary implements Payable{

    private double salary;

    private EmpSalary() {
    }

    private EmpSalary(EmpSalary.Builder builder) {
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


        public EmpSalary build() {
            return new EmpSalary(this);
        }

    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpSalary empSalary = (EmpSalary) o;
        return Double.compare(empSalary.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }
}
