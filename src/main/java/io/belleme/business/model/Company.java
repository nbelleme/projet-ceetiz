package io.belleme.business.model;

public abstract class Company {

    protected String siret;
    protected String name;
    protected double turnover;

    public abstract double computeTaxes() ;

    public String getSiret() {
        return siret;
    }

    public String getName() {
        return name;
    }

    public double getTurnover() {
        return turnover;
    }
}
