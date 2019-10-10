package io.belleme.business.service;

import io.belleme.business.model.Company;

import java.util.Optional;

public interface CompanyService {
    Company create(Company company);

    Optional<Company> find(String name);

    Company delete(String name);

    double computeTaxes(String name);
}
