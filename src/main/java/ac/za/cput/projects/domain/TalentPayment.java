package ac.za.cput.projects.domain;

public class TalentPayment {

    private double salary;

    private TalentPayment(){}

    private TalentPayment(Builder builder) {
        this.salary = builder.salary;
    }

    public double gettalentPayment() {
        return salary;
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
}
