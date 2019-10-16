package io.belleme.business.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonoCompanyTest {

    @Test
    void computeTaxes() {
        Company company = MonoCompany.builder().turnover(100).build();
        assertEquals(25, company.computeTaxes());
    }

    @Test
    void computeTaxesNotInitialized() {
        Company company = MonoCompany.builder().build();
        assertEquals(0, company.computeTaxes());
    }
}