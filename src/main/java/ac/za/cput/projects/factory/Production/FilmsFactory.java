package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Films;

public class FilmsFactory {

    public static Films getFilms(String production_Name, String production_Budget) {
        return new Films.Builder().production_Name(production_Name)
                .production_Budget(production_Budget)
                .build();
    }

}
