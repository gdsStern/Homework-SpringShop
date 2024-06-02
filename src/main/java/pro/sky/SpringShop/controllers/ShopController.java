package pro.sky.SpringShop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringShop.services.ShopService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }
    @GetMapping("/add")
    public void add(@RequestParam Integer... id) {
        shopService.add(id);
    }


    @GetMapping("/get")
    public Collection<Integer> get() {
        return shopService.get();
    }
}
