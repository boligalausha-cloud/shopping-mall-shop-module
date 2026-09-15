package com.example.shop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired ShopService service;
    @PostMapping
    public Shop addShop(@RequestBody Shop shop) { return service.save(shop); }
    @GetMapping
    public List<Shop> getAllShops() { return service.getAll(); }
    @GetMapping("/{id}")
    public Shop getById(@PathVariable Long id) { return service.getById(id); }
}
