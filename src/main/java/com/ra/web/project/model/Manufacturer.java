package com.ra.web.project.model;

public class Manufacturer {
    private String manufacturerId;
    private String name;
    private String image;
    private boolean status;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerId, String name, String image, boolean status) {
        this.manufacturerId = manufacturerId;
        this.name = name;
        this.image = image;
        this.status = status;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
