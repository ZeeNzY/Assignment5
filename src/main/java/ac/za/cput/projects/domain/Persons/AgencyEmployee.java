package ac.za.cput.projects.domain.Persons;

public class AgencyEmployee {

    private String empNum, position;
    private int emp_id;
    private Persons persons;

    private AgencyEmployee(){}

    private AgencyEmployee(AgencyEmployee.Builder builder) {
        this.persons = builder.persons;
        this.empNum = builder.empNum;
        this.emp_id = builder.emp_id;
        this.position = builder.position;
    }

    public String getempNum() {
        return empNum;
    }
    public String getposition() { return position; }
    public int getEmp_id(){
        return emp_id;
    }


    public static class Builder {

        private String empNum, position;
        private int emp_id;
        private Persons persons;

        public Builder persons(Persons persons){
            this.persons = persons;
            return this;
        }

        public Builder emp_id(int emp_id){
            this.emp_id = emp_id;
            return this;
        }

        public Builder empNum( String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder position( String position) {
            this.position = position;
            return this;
        }

        public AgencyEmployee build() {
            return new AgencyEmployee(this);
        }

    }
}
