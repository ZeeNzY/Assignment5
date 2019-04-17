package ac.za.cput.projects.domain;

public class EmpPosition {

    private String jobposition;

    private EmpPosition(){

    }

    private EmpPosition(EmpPosition.Builder builder) {
        this.jobposition = builder.jobposition;
    }

    public String getjobposition() {
        return jobposition;
    }


    public static class Builder {

        private String jobposition;

        public Builder jobposition( String jobposition) {
            this.jobposition = jobposition;
            return this;
        }


        public EmpPosition build() {
            return new EmpPosition(this);
        }

    }
}
