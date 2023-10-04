package com.ra.web.project.model;

public class ProductColor {
    private Product productId;
    private Color colorId;

    public ProductColor() {
    }

    public ProductColor(Product productId, Color colorId) {
        this.productId = productId;
        this.colorId = colorId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Color getColorId() {
        return colorId;
    }

    public void setColorId(Color colorId) {
        this.colorId = colorId;
    }
}
