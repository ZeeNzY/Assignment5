package ac.za.cput.projects.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Agency {

    private String agency_id, agency_Name, agency_address,  actors, extras;
    private String year_established;

    private Agency(){}

    private Agency(Agency.Builder builder) {
        this.agency_id = builder.agency_id;
        this.agency_Name = builder.agency_Name;
        this.agency_address = builder.agency_address;
        this.actors = builder.actors;
        this.extras = builder.extras;
        this.year_established = builder.year_established;
    }

    public String getAgencyId() {
        return agency_id;
    }

    public String getAgency_Name() {
        return agency_Name;
    }

    public String getAgency_address() {
        return agency_address;
    }

    public String getActors() {
        return actors;
    }

    public String getExtras() {
        return extras;
    }

    public String getYear_establisheds() {
        return extras;
    }

    public static class Builder {

        String agency_id, agency_Name, agency_address,  actors, extras;
        String year_established;

        public Agency.Builder agencyId(String agency_id) {
            this.agency_id = agency_id;
            return this;
        }

        public Agency.Builder agencyName(String agency_Name) {
            this.agency_Name = agency_Name;
            return this;
        }

        public Agency.Builder agencyAddress(String agency_address) {
            this.agency_address = agency_address;
            return this;
        }

        public Agency.Builder actors(String actors) {
            this.actors = actors;
            return this;
        }

        public Agency.Builder extras(String extras) {
            this.extras = extras;
            return this;
            }

        public Agency build() {
            return new Agency(this);
        }

    }

    @Override
    public String toString() {
        return "Agency{" +
                "agency_id='" + agency_id + '\'' +
                ", agency_Name='" + agency_Name + '\'' +
                ", agency_address='" + agency_address + '\'' +
                ", actors='" + actors + '\'' +
                ", extras='" + extras + '\'' +
                ", year_established='" + year_established + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency agency = (Agency) o;
        return Objects.equals(agency_id, agency.agency_id) &&
                Objects.equals(agency_Name, agency.agency_Name) &&
                Objects.equals(agency_address, agency.agency_address) &&
                Objects.equals(actors, agency.actors) &&
                Objects.equals(extras, agency.extras) &&
                Objects.equals(year_established, agency.year_established);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency_id, agency_Name, agency_address, actors, extras, year_established);
    }
}
