package ac.za.cput.projects.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
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

    @Override
    public String toString() {
        return "EmpPosition{" +
                "jobposition='" + jobposition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpPosition that = (EmpPosition) o;
        return Objects.equals(jobposition, that.jobposition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobposition);
    }
}
