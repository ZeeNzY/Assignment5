package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.Production;

public class ProductionFactory {

    public static Production getProduction(String production_id, String production_type) {
        return new Production.Builder().production_id(production_id)
                .production_type(production_type)
                .build();
    }
}
