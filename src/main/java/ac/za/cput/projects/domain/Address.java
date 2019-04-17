package ac.za.cput.projects.domain;

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
}
