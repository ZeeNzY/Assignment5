package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.util.Misc;

import java.util.List;

public class AgencyFactory {

    public static Agency getAgency(String agency_Name, String agency_address, List talent, String year_established) {
        return new Agency.Builder().agencyId(Misc.generateId())
                .agencyName(agency_Name)
                .agencyAddress(agency_address)
                .talentList(talent)
                .year(year_established)
                .build();
    }

}
