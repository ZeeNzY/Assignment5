package ac.za.cput.projects.factory.Production;

import ac.za.cput.projects.domain.Agency;

public class AgencyFactory {

    public static Agency getAgency(String agency_id, String agency_Name, String agency_address,  String actors, String extras) {
        return new Agency.Builder().agencyId(agency_id)
                .agencyName(agency_Name)
                .agencyAddress(agency_address)
                .actors(actors)
                .extras(extras)
                .build();
    }

}
