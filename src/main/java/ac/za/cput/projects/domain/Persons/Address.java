package ac.za.cput.projects.domain.Persons;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Address {

    private String homeAddress,postalAddress,postalCode;

    private Address(){}

    private Address(Builder builder) {
        this.homeAddress = builder.homeAddress;
        this.postalAddress = builder.postalAddress;
        this.postalCode = builder.postalCode;
    }

    public String gethomeAddress() {
        return homeAddress;
    }

    public String getpostalAddress() {
        return postalAddress;
    }

    public String getpostalCode() {
        return postalCode;
    }


    public static class Builder {

        private String homeAddress,postalAddress,postalCode;

        public Builder homeAddress( String homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public Builder postalAddress( String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Builder postalCode( String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "homeAddress='" + homeAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(homeAddress, address.homeAddress) &&
                Objects.equals(postalAddress, address.postalAddress) &&
                Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeAddress, postalAddress, postalCode);
    }
}
