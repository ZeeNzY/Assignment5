package ac.za.cput.projects.domain;

public class Employees extends Persons {

    private String empNum, position;

    private Employees(){}

    private Employees(Employees.Builder builder) {
        this.empNum = builder.empNum;
        this.position = builder.position;
    }

    public String getempNum() {
        return empNum;
    }
    public String getposition() { return position; }


    public static class Builder {

        private String empNum, position;

        public Builder empNum( String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder position( String position) {
            this.position = position;
            return this;
        }

        public Employees build() {
            return new Employees(this);
        }

    }
}
