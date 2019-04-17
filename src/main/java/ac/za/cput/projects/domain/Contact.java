package ac.za.cput.projects.domain;

public class Contact {

    private String cellnumber, emailAddress;

    Contact() {}

    private Contact(Contact.Builder builder) {
        this.cellnumber = builder.cellnumber;
        this.emailAddress = builder.emailAddress;
    }

    public String getcellnumber() {
        return cellnumber;
    }
    public String getemailAddress() {
        return emailAddress;
    }


    public static class Builder {

        private String cellnumber, emailAddress;

        public Builder cellnumber( String cellnumber) {
            this.cellnumber = cellnumber;
            return this;
        }

        public Builder emailAddress( String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }


        public Contact build() {
            return new Contact(this);
        }

    }


}
