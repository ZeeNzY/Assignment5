package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.production.Adverts;


public class AdvertFactory {

    public static Adverts getAdverts(String production_Name, String production_Budget, String ad_title) {
        return new Adverts.Builder().production_Name(production_Name)
                .build();
    }

}
