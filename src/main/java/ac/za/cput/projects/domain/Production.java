package ac.za.cput.projects.domain;

public class Production {


    private String production_id, production_type;

    Production(){
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

}
