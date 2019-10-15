package io.belleme.business.model;

public abstract class Company {

    String siret;
    String name;
    double turnover;

    public abstract double computeTaxes() ;

}
