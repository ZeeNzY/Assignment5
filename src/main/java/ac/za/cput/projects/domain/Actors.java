package ac.za.cput.projects.domain;

import java.util.Set;

public class Actors {

    private String actors_idNum, actor_Name, actor_LastName, actor_EyeColor;
    private int age;


    private Actors(){}

    private Actors(Builder builder) {
        this.actors_idNum = builder.actors_idNum;
        this.age = builder.age;
        this.actor_Name = builder.actor_Name;
        this.actor_LastName = builder.actor_LastName;
        this.actor_EyeColor = builder.actor_EyeColor;
    }

    public String getActorsId() {
        return actors_idNum;
    }

    public String getActorFirstName() {
        return actor_Name;
    }

    public String getActorLastName() {
        return actor_LastName;
    }

    public String getActor_EyeColor() {
        return actor_EyeColor;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String actors_idNum, actor_Name, actor_LastName, actor_EyeColor;
        private int age;
        private Set<Actors> productions;

        public Builder actorsId( String actors_idNum) {
            this.actors_idNum = actors_idNum;
            return this;
        }

        public Builder actorsFirstName( String actor_Name) {
            this.actor_Name = actor_Name;
            return this;
        }

        public Builder actorsLastName( String actor_LastName) {
            this.actor_LastName = actor_LastName;
            return this;
        }

        public Builder actorEyeColor(String actor_EyeColor) {
            this.actor_EyeColor = actor_EyeColor;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Actors build() {
            return new Actors(this);
        }

    }

    @Override
    public String toString() {
        return "Actor {" +
                "Actor's Id ='" + actors_idNum + '\'' +
                ", Actor's Name ='" + actor_Name + '\'' +
                ", Actor's LastName ='" + actor_LastName + '\'' +
                ", Actor's Eye Color ='" + actor_EyeColor + '\'' +
                ", age =" + age +
                '}';
    }
}
