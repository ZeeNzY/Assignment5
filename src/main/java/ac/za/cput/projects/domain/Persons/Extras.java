package ac.za.cput.projects.domain.Persons;

public class Extras {

    private double daily_rate;


    private Extras(){}

    private Extras(Extras.Builder builder) {
        this.daily_rate = builder.daily_rate;
    }

    public double getdaily_rate() {
        return daily_rate;
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
}
