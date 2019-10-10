package io.belleme.business.persistence;

import io.belleme.business.model.Company;

import java.util.Optional;

public interface CompanyDao {

    Company save(Company company);

    Optional<Company> find(String name);

    Company delete(String name);

    boolean exists(String name);
}
