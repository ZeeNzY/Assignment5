package ac.za.cput.projects.domain.production;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Adverts extends Production {

    private String production_Name, production_Budget, ad_title;

    private Adverts(){}

    private Adverts(Adverts.Builder builder) {
        this.production_Name = builder.production_Name;
        this.production_Budget = builder.production_Budget;
        this.ad_title = builder.ad_title;
    }

    public String getproduction_Name() {
        return production_Name;
    }

    public String getproduction_Budget() {
        return production_Budget;
    }

    public String getAd_title() {
        return production_Budget;
    }

    public static class Builder {

        private String production_Name, production_Budget, ad_title;

        public Builder production_Name(String production_Name) {
            this.production_Name = production_Name;
            return this;
        }

        public Builder production_Budget(String production_Budget) {
            this.production_Budget = production_Budget;
            return this;
        }

        public Builder ad_title(String ad_title) {
            this.ad_title = ad_title;
            return this;
        }

        public Adverts build() {
            return new Adverts(this);
        }

    }

    @Override
    public String toString() {
        return "Adverts{" +
                "production_Name='" + production_Name + '\'' +
                ", production_Budget='" + production_Budget + '\'' +
                ", ad_title='" + ad_title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adverts adverts = (Adverts) o;
        return Objects.equals(production_Name, adverts.production_Name) &&
                Objects.equals(production_Budget, adverts.production_Budget) &&
                Objects.equals(ad_title, adverts.ad_title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(production_Name, production_Budget, ad_title);
    }
}
