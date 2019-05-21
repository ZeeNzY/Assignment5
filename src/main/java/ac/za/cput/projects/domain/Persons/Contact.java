package ac.za.cput.projects.domain.Persons;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Contact {

    private String cellnumber, emailAddress;

    private Contact() {}

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

    @Override
    public String toString() {
        return "Contact{" +
                "cellnumber='" + cellnumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(cellnumber, contact.cellnumber) &&
                Objects.equals(emailAddress, contact.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellnumber, emailAddress);
    }
}
