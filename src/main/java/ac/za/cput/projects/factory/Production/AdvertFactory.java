package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Adverts;
import ac.za.cput.projects.util.Misc;


public class AdvertFactory {

    public static Adverts getAdverts(String production_Name, String production_Budget, String ad_title) {
        return new Adverts.Builder().production_Name(Misc.generateId())
                .production_Name(production_Name)
                .production_Budget(production_Budget)
                .ad_title(ad_title)
                .build();
    }

}
