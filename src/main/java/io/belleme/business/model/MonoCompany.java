package io.belleme.business.model;

public class MonoCompany extends Company {

    @Override
    public double computeTaxes() {
        return turnover * 0.25;
    }

    private MonoCompany(){

    }

    public static Builder builder(){
        return new Builder();
    }


    public static final class Builder {
        private String siret;
        private String name;
        private double turnover;

        private Builder() {
        }

        public Builder siret(String siret) {
            this.siret = siret;
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

        public MonoCompany build() {
            MonoCompany monoCompany = new MonoCompany();
            monoCompany.siret = this.siret;
            monoCompany.turnover = this.turnover;
            monoCompany.name = this.name;
            return monoCompany;
        }
    }
}
