package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.Agency;

import java.util.Set;

public interface AgencyService extends IService<Agency, String> {
    Set<Agency> getAll();
}
