package com.example.shop;

import jakarta.persistence.*;

@Entity
@Table(name="shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shopName;
    private String category;
    private String location;
    private Long mallId;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public Long getMallId() { return mallId; }
    public void setMallId(Long mallId) { this.mallId = mallId; }
}
