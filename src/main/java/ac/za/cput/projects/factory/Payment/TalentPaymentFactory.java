package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.TalentPayment;

public class TalentPaymentFactory {

    public static TalentPayment getActors(double salary) {
        return new TalentPayment.Builder().salary(salary)
                .build();
    }
}
