package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.TalentPayment;

public class TalentPaymentFactory {

    public static TalentPayment getActors(double salary) {
        return new TalentPayment.Builder().salary(salary)
                .build();
    }
}
