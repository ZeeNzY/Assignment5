package ac.za.cput.projects.factory;

import Actors;

public class ActorFactory {

    public static Actors getActors(double salary) {
        return new Actors.Builder().salary(salary)
                .build();
    }
}