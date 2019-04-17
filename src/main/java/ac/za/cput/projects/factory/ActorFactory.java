package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Actors;

public class ActorFactory {

    public static Actors getActors(double salary) {
        return new Actors.Builder().salary(salary)
                .build();
    }
}