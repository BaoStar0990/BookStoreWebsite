package naoki.business;

import java.io.Serializable;

public class Address implements Serializable {
    private int id;
    private String street;
    private String province;
    private String ward;
    private String district;

    //private Customer customer;

    public Address (String street, String province, String ward, String district) {
        this.street = street;
        this.province = province;
        this.ward = ward;
        this.district = district;
    }

    public Address() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getWard() {
        return ward;
    }
    public void setWard(String ward) {
        this.ward = ward;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

}
