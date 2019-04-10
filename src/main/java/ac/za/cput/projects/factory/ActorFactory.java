package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Actors;

public class ActorFactory {

    public static Actors getActors(String actors_id, String actor_Name, String actor_lastName, int age) {
        return new Actors.Builder().age(age)
                .actorsId(actors_id)
                .actorsFirstName(actor_Name)
                .actorsLastName(actor_lastName)
                .build();
    }
}