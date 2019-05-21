package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.util.Misc;

public class ProductionFactory {

    public static Production getProduction(String production_type) {
        return new Production.Builder().production_id(Misc.generateId())
                .production_type(production_type)
                .build();
    }
}
