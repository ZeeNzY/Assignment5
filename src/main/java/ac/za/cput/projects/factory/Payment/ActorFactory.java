package ac.za.cput.projects.factory.Payment;

import ac.za.cput.projects.domain.payments.Actors;

public class ActorFactory {

    public static Actors getActors(double salary) {
        return new Actors.Builder().salary(salary)
                .build();
    }
}