package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.util.Misc;

public class ProductionHouseFactory {

    public static ProductionHouse getProductionHouse(String prodhouse_Name, String prodhouse_Address) {
        return new ProductionHouse.Builder().prodhouseId(Misc.generateId())
                .prodhouse_Name(prodhouse_Name)
                .prodhouse_Address(prodhouse_Address)
                .build();
    }
}
