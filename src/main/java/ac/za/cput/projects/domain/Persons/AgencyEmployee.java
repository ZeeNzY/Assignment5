package ac.za.cput.projects.domain.Persons;

public class AgencyEmployee {

    private String position;
    private int emp_id;
    private Persons persons;

    private String name = persons.getName();
    private String surname = persons.getSurname();
    private String type = persons.gettype();

    private AgencyEmployee(){}

    private AgencyEmployee(AgencyEmployee.Builder builder) {
        this.emp_id = builder.emp_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.type = builder.type;
        this.position = builder.position;
    }

    public String getposition() { return position; }
    public int getEmp_id(){
        return emp_id;
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

    public static class Builder {

        private String position;
        private int emp_id;
        private Persons persons;
        private String name = persons.getName();
        private String surname = persons.getSurname();
        private String type = persons.gettype();

        public Builder emp_id(int emp_id){
            this.emp_id = emp_id;
            return this;
        }

        public AgencyEmployee.Builder name(String name) {
            this.name = name;
            return this;
        }

        public AgencyEmployee.Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public AgencyEmployee.Builder type(String type) {
            this.type = type;
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
