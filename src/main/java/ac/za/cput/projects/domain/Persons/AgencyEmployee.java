package ac.za.cput.projects.domain.Persons;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class AgencyEmployee {

    private String position;
    private String emp_id;
    private Persons persons;

    private String name;
    private String surname;
    private String type;

    private AgencyEmployee(){}

    private AgencyEmployee(AgencyEmployee.Builder builder) {
        this.emp_id = builder.emp_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.position = builder.position;
    }

    public String getposition() { return position; }
    public String getEmp_id(){
        return emp_id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {

        private String position;
        private String emp_id;
        private Persons persons;
        private String name;
        private String surname;

        public Builder emp_id(String emp_id){
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

        public Builder position( String position) {
            this.position = position;
            return this;
        }

        public Builder copy(AgencyEmployee agencyEmployee){
            this.emp_id = agencyEmployee.emp_id;
            this.name = agencyEmployee.name;
            this.surname = agencyEmployee.surname;

            return this;
        }

        public AgencyEmployee build() {
            return new AgencyEmployee(this);
        }

    }

    @Override
    public String toString() {
        return "AgencyEmployee{" +
                "position='" + position + '\'' +
                ", emp_id=" + emp_id +
                ", persons=" + persons +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgencyEmployee that = (AgencyEmployee) o;
        return emp_id == that.emp_id &&
                Objects.equals(position, that.position) &&
                Objects.equals(persons, that.persons) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, emp_id, persons, name, surname, type);
    }
}
