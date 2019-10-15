package io.belleme.business.model;

public class SasCompany extends Company {

    private String address;

    private SasCompany() {

    }

    @Override
    public String toString() {
        return "Siret='" + siret + '\'' +
                ", Name='" + name + '\'' +
                ", Turnover=" + turnover +
                ", Address='" + address + '\'';
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public double computeTaxes() {
        return turnover * 0.33;
    }


    public static final class Builder {
        private String siret;
        private String name;
        private double turnover;
        private String address;

        private Builder() {
        }


        public Builder siret(String siret) {
            this.siret = siret;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder turnover(double turnover) {
            this.turnover = turnover;
            return this;
        }

        public SasCompany build() {
            SasCompany sasCompany = new SasCompany();
            sasCompany.siret = this.siret;
            sasCompany.name = this.name;
            sasCompany.address = this.address;
            sasCompany.turnover = this.turnover;
            return sasCompany;
        }
    }
}
