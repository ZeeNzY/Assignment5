package ac.za.cput.projects.domain.production;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Films extends Production {

    private String production_Name, production_Budget;

    private Films(){}

    private Films(Films.Builder builder) {
        this.production_Name = builder.production_Name;
        this.production_Budget = builder.production_Budget;
    }

    public String getproduction_Name() {
        return production_Name;
    }

    public String production_Budget() {
        return production_Budget;
    }

    public static class Builder {

        private String production_Name, production_Budget;

        public Films.Builder production_Name(String production_Name) {
            this.production_Name = production_Name;
            return this;
        }

        public Films.Builder production_Budget(String production_Budget) {
            this.production_Budget = production_Budget;
            return this;
        }

        public Films build() {
            return new Films(this);
        }

    }

    @Override
    public String toString() {
        return "Films{" +
                "production_Name='" + production_Name + '\'' +
                ", production_Budget='" + production_Budget + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Films films = (Films) o;
        return Objects.equals(production_Name, films.production_Name) &&
                Objects.equals(production_Budget, films.production_Budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(production_Name, production_Budget);
    }


}
