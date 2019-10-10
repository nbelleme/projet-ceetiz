package io.belleme.business.service.impl;

import io.belleme.business.exception.NoSuchCompanyException;
import io.belleme.business.model.Company;
import io.belleme.business.persistence.CompanyDao;
import io.belleme.business.service.CompanyService;

import java.util.Optional;

public class CompanyServiceCli implements CompanyService {

    private CompanyDao companyDao;

    public CompanyServiceCli(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public Company create(Company company) {
        return companyDao.save(company);
    }

    @Override
    public Optional<Company> find(String name) {
        return companyDao.find(name);
    }

    @Override
    public Company delete(String name) {
        return companyDao.delete(name);
    }

    @Override
    public double computeTaxes(String name) {
        return companyDao.find(name)
                         .orElseThrow(() -> new NoSuchCompanyException(name))
                         .computeTaxes();
    }
}
