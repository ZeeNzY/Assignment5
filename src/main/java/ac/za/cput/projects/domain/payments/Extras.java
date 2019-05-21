package ac.za.cput.projects.domain.payments;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Extras implements Payable{

    private double daily_rate;


    private Extras(){}

    private Extras(Extras.Builder builder) {
        this.daily_rate = builder.daily_rate;
    }

    public double getdaily_rate() {
        return daily_rate;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }


    public static class Builder {

        private double daily_rate;

        public Extras.Builder daily_rate(double daily_rate) {
            this.daily_rate = daily_rate;
            return this;
        }


        public Extras build() {
            return new Extras(this);
        }

    }

    @Override
    public String toString() {
        return "Extras{" +
                "daily_rate=" + daily_rate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extras extras = (Extras) o;
        return Double.compare(extras.daily_rate, daily_rate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(daily_rate);
    }
}
