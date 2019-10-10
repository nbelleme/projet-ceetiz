package io.belleme.business.exception;

public class NoSuchCompanyException extends RuntimeException {
    public NoSuchCompanyException(String name) {
        System.out.println(String.format("Aucune entreprise du nom de %s.", name));
    }
}
