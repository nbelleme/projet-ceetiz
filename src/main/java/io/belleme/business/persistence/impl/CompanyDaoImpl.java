package io.belleme.business.persistence.impl;

import io.belleme.business.model.Company;
import io.belleme.business.persistence.CompanyDao;

import java.util.Map;
import java.util.Optional;

public class CompanyDaoImpl implements CompanyDao {

    private static Map<String, Company> db;

    @Override
    public Company save(Company company) {
        return db.put(company.getName(), company);
    }

    @Override
    public Optional<Company> find(String name) {
        return db.values()
                 .stream()
                 .filter(company -> company.getName().equals(name))
                 .findFirst();
    }

    @Override
    public Company delete(String name) {
        return db.remove(name);
    }

    @Override
    public boolean exists(String name) {
        return db.containsKey(name);
    }
}
