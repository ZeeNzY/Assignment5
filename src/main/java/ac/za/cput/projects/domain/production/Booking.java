package ac.za.cput.projects.domain.production;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Booking {

    private String booking_id, talent_id, agency_id, dateOfbooking, talent_Type;

    private Booking(){}

    private Booking(Builder builder) {
        this.booking_id = builder.booking_id;
        this.talent_id = builder.talent_id;
        this.agency_id = builder.agency_id;
        this.talent_Type = builder.talent_Type;
        this.dateOfbooking = builder.dateOfbooking;
    }

    public String getbooking_id() {
        return booking_id;
    }

    public String gettalent_id() {
        return talent_id;
    }

    public String getagency_id() {
        return agency_id;
    }

    public String getdateOfbooking() {
        return dateOfbooking;
    }

    public String getTalent_Type() {
        return talent_Type;
    }

    public static class Builder {

        private String booking_id, talent_id, agency_id, dateOfbooking, talent_Type;

        public Booking.Builder booking_id(String booking_id) {
            this.booking_id = booking_id;
            return this;
        }

        public Booking.Builder talent_id(String talent_id) {
            this.talent_id = talent_id;
            return this;
        }

        public Booking.Builder agency_id(String agency_id) {
            this.agency_id = agency_id;
            return this;
        }

        public Booking.Builder dateOfbooking(String dateOfbooking) {
            this.dateOfbooking = dateOfbooking;
            return this;
        }

        public Booking.Builder talentType(String talent_Type) {
            this.talent_Type = talent_Type;
            return this;
        }

        public Builder copy(Booking booking){
            this.agency_id = booking.booking_id;
            this.dateOfbooking = booking.getdateOfbooking();

            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id='" + booking_id + '\'' +
                ", talent_id='" + talent_id + '\'' +
                ", agency_id='" + agency_id + '\'' +
                ", dateOfbooking='" + dateOfbooking + '\'' +
                ", talent_Type='" + talent_Type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(booking_id, booking.booking_id) &&
                Objects.equals(talent_id, booking.talent_id) &&
                Objects.equals(agency_id, booking.agency_id) &&
                Objects.equals(dateOfbooking, booking.dateOfbooking) &&
                Objects.equals(talent_Type, booking.talent_Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booking_id, talent_id, agency_id, dateOfbooking, talent_Type);
    }
}
