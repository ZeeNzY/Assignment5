package ac.za.cput.projects.domain;

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
}
