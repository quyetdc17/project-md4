package com.ra.web.project.model;

public class Color {
    private String colorId;
    private String coloName;
    private String code;
    private boolean status;

    public Color() {
    }

    public Color(String colorId, String coloName, String code, boolean status) {
        this.colorId = colorId;
        this.coloName = coloName;
        this.code = code;
        this.status = status;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getColoName() {
        return coloName;
    }

    public void setColoName(String coloName) {
        this.coloName = coloName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
