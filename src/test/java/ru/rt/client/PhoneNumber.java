package ru.rt.client;

public class PhoneNumber {
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;

    public PhoneNumber(String home, String mobile, String work, String fax) {
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }
}
