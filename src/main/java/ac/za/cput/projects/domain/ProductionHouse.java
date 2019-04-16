package ac.za.cput.projects.domain;

public class ProductionHouse {

    private String prodhouseId, prodhouse_Name, prodhouse_Address;

    private ProductionHouse(){}

    private ProductionHouse(ProductionHouse.Builder builder) {
        this.prodhouseId = builder.prodhouseId;
        this.prodhouse_Name = builder.prodhouse_Name;
        this.prodhouse_Address = builder.prodhouse_Address;
    }

    public String getProdhouseId() {
        return prodhouseId;
    }

    public String getProdhouse_Name() {
        return prodhouse_Name;
    }

    public String prodhouse_Address() {
        return prodhouse_Address;
    }

    public static class Builder {

        String prodhouseId, prodhouse_Name, prodhouse_Address;

        public ProductionHouse.Builder prodhouseId(String prodhouseId) {
            this.prodhouseId = prodhouseId;
            return this;
        }

        public ProductionHouse.Builder prodhouse_Name(String prodhouse_Name) {
            this.prodhouse_Name = prodhouse_Name;
            return this;
        }

        public ProductionHouse.Builder prodhouse_Address(String prodhouse_Address) {
            this.prodhouse_Address = prodhouse_Address;
            return this;
        }

        public ProductionHouse build() {
            return new ProductionHouse(this);
        }

    }

    @Override
    public String toString() {
        return "Production House {" +
                "Production House's Id ='" + prodhouseId + '\'' +
                ", Production House's Name ='" + prodhouse_Name + '\'' +
                ", Production's Address ='" + prodhouse_Address +
                '}';
    }
}
