package ac.za.cput.projects.domain.production;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Production {


    private String production_id, production_type;

    public Production(){
    }

    private Production(Production.Builder builder) {
        this.production_type = builder.production_type;
        this.production_id = builder.production_id;
    }

    public String getProduction_type() {
        return production_type;
    }

    public String getProduction_id() {
        return production_id;
    }

    public static class Builder {

        private String production_id, production_type;

        public Production.Builder production_type(String production_type) {
            this.production_type = production_type;
            return this;
        }

        public Production.Builder production_id(String production_id) {
            this.production_id = production_id;
            return this;
        }

        public Production build() {
            return new Production(this);
        }
    }

    @Override
    public String toString() {
        return "Production{" +
                "production_id='" + production_id + '\'' +
                ", production_type='" + production_type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Production that = (Production) o;
        return Objects.equals(production_id, that.production_id) &&
                Objects.equals(production_type, that.production_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(production_id, production_type);
    }
}
