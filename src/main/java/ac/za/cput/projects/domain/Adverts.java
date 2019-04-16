package ac.za.cput.projects.domain;

public class Adverts extends Production{

    private String production_Name, production_Budget, ad_company;

    Adverts(){}

    private Adverts(Adverts.Builder builder) {
        this.production_Name = builder.production_Name;
        this.production_Budget = builder.production_Budget;
        this.ad_company = builder.ad_company;
    }

    public String getproduction_Name() {
        return production_Name;
    }

    public String getproduction_Budget() {
        return production_Budget;
    }

    public String getad_companyt() {
        return production_Budget;
    }

    public static class Builder {

        private String production_Name, production_Budget, ad_company;

        public Adverts.Builder production_Name(String production_Name) {
            this.production_Name = production_Name;
            return this;
        }

        public Adverts.Builder production_Budget(String production_Budget) {
            this.production_Budget = production_Budget;
            return this;
        }

        public Adverts.Builder ad_company(String ad_company) {
            this.ad_company = ad_company;
            return this;
        }

        public Adverts build() {
            return new Adverts(this);
        }

    }
}
