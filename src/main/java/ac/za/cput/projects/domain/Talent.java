package ac.za.cput.projects.domain;

public class Talent {

    private String talent_id, category, eyeColor;

    private Talent(){
    }

    private Talent(Talent.Builder builder) {
        this.talent_id = builder.talent_id;
        this.category = builder.category;
        this.eyeColor = builder.eyeColor;
    }

    public String gettalent_id() {
        return talent_id;
    }

    public String getcategory() {
        return category;
    }

    public String geteyeColor() {
        return eyeColor;
    }

    public static class Builder {

        private String talent_id, category, eyeColor;

        public Talent.Builder talent_Id(String talent_id) {
            this.talent_id = talent_id;
            return this;
        }

        public Talent.Builder category(String category) {
            this.category = category;
            return this;
        }

        public Talent.Builder eyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Talent build() {
            return new Talent(this);
        }

    }

}
