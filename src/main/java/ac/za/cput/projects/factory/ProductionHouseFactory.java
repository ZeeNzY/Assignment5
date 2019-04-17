package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.ProductionHouse;

public class ProductionHouseFactory {

    public static ProductionHouse getProductionHouse(String prodhouseId, String prodhouse_Name, String prodhouse_Address) {
        return new ProductionHouse.Builder().prodhouseId(prodhouseId)
                .prodhouse_Name(prodhouse_Name)
                .prodhouse_Address(prodhouse_Address)
                .build();
    }
}
