package ac.za.cput.projects.factory;

import ac.za.cput.projects.domain.EmpPosition;


public class EmpPositionFactory {

    public static EmpPosition getEmpPosition(String jobposition) {
        return new EmpPosition.Builder().jobposition(jobposition)
                .build();
    }
}
