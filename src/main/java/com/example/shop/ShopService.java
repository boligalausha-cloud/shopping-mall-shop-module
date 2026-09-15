package com.example.shop;

import java.util.List;

@Service
public class ShopService {
    @Autowired ShopRepository repo;
    public Shop save(Shop shop) { return repo.save(shop); }
    public List<Shop> getAll() { return repo.findAll(); }
    public Shop getById(Long id) { return repo.findById(id).orElse(null); }
}
