package ru.rt.client.model;

public class CompanyDate {
    private final String company;
    private final String address;

    public CompanyDate(String company, String address) {
        this.company = company;
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}
