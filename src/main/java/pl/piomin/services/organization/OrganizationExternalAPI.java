package pl.piomin.services.organization;

public interface OrganizationExternalAPI {

    OrganizationDTO findByIdWithEmployees(Long id);
    OrganizationDTO findByIdWithDepartments(Long id);
    OrganizationDTO add(OrganizationDTO organization);

}