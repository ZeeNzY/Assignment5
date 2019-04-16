package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Actors;

public class ActorFactory {

    public static Actors getActors(String actors_id, String actor_Name, String actor_lastName,String actor_EyeColor, int age) {
        return new Actors.Builder().age(age)
                .actorsId(actors_id)
                .actorsFirstName(actor_Name)
                .actorsLastName(actor_lastName)
                .actorEyeColor(actor_EyeColor)
                .build();
    }
}