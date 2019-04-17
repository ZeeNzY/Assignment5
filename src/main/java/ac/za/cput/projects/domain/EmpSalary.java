package ac.za.cput.projects.domain;

public class EmpSalary {

    private double salary;

    private EmpSalary() {
    }

    private EmpSalary(EmpSalary.Builder builder) {
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


        public EmpSalary build() {
            return new EmpSalary(this);
        }

    }
}
