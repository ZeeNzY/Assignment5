package ac.za.cput.projects.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;
import java.util.Objects;
@EntityScan
public class Agency {

    private String agency_id, agency_Name, agency_address;
    private List talent;
    private String year_established;

    private Agency(){}

    private Agency(Agency.Builder builder) {
        this.agency_id = builder.agency_id;
        this.agency_Name = builder.agency_Name;
        this.agency_address = builder.agency_address;
        this.talent = builder.talent;
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

    public List getTalent() {
        return talent;
    }

    public String getYear_establisheds() {
        return year_established;
    }

    public static class Builder {

        String agency_id, agency_Name, agency_address;
        String year_established;
        private List talent;

        public Agency.Builder agencyId(String agency_id) {
            this.agency_id = agency_id;
            return this;
        }

        public Agency.Builder talentList(List talent){
            this.talent = talent;
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


        public Agency.Builder year(String year_established) {
            this.year_established = year_established;
            return this;
        }

        public Builder copy(Agency agency){
            this.agency_id = agency.agency_id;
            this.agency_Name = agency.agency_Name;

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
                ", talent='" + talent + '\'' +
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
                Objects.equals(talent, agency.talent) &&
                Objects.equals(year_established, agency.year_established);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency_id, agency_Name, agency_address, talent, year_established);
    }
}
