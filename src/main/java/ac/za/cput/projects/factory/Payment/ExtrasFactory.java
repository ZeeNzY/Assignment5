package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.Extras;


public class ExtrasFactory {

    public static Extras getExtras(double daily_rate) {
        return new Extras.Builder().daily_rate(daily_rate)
                .build();
    }
}
