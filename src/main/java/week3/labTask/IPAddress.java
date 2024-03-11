package week3.labTask;

public class IPAddress {
    private long startIp;
    private long endIp;
    private String countryCode;
    private String country;
    private String region;
    private String city;

    public IPAddress(long startIp, long endIp, String countryCode, String country, String region, String city) {
        this.startIp = startIp;
        this.endIp = endIp;
        this.countryCode = countryCode;
        this.country = country;
        this.region = region;
        this.city = city;
    }

    public long getStartIp() {
        return startIp;
    }

    public void setStartIp(long startIp) {
        this.startIp = startIp;
    }

    public long getEndIp() {
        return endIp;
    }

    public void setEndIp(long endIp) {
        this.endIp = endIp;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
