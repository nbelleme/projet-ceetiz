package io.belleme.business.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SasCompanyTest {

    @Test
    void computeTaxes() {
        Company company = SasCompany.builder().turnover(100).build();
        assertEquals(33, company.computeTaxes());
    }

    @Test
    void computeTaxesNotInitialized() {
        Company company = SasCompany.builder().build();
        assertEquals(0, company.computeTaxes());
    }

}