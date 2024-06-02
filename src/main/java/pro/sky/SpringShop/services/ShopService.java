package pro.sky.SpringShop.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.SpringShop.exceptions.ShopException;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShopService {
    private List<Integer> shopList = new ArrayList<>();

    public void add(Integer... args) {
        if (args.length==0) {
            throw new ShopException();
        }
        for (Integer arg : args) {
            shopList.add(arg);
        }
    }

    public List<Integer> get() {
        return shopList;
    }
}
