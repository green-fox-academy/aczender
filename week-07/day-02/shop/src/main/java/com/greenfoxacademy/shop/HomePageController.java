package com.greenfoxacademy.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HomePageController {
    List<ShopItem> shopItems;

    public HomePageController(List shopItem) {
        this.shopItems = new ArrayList<>();
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItems.add(new ShopItem("phone", "you can call numbers with it", 20, 3));
        shopItems.add(new ShopItem("Laptop", "For work and study", 20, 200));
        shopItems.add(new ShopItem("Car", "It has four tyres", 3000, 2));
        shopItems.add(new ShopItem("Table", "Eat on it", 220, 3));
        shopItems.add(new ShopItem("Mug", "for your coffee", 40000, 0));

    }

    @RequestMapping("/webshop")
    public String basic(Model model) {
        model.addAttribute("items", shopItems);
        return "webshop";
    }

    @RequestMapping("/available")
    public String availability(Model model) {
        List<ShopItem> filtered = shopItems.stream().filter(p -> p.getStock() > 0).collect(Collectors.toList());
        model.addAttribute("items", filtered);
        return "webshop";
    }

    @RequestMapping("/cheapest")
    public String price(Model model) {
        List<ShopItem> cheapest = shopItems.stream().sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList());
        model.addAttribute("items", cheapest);
        return "webshop";
    }

    @RequestMapping("/nike")
    public String nike(Model model) {
        List<ShopItem> containsNike = shopItems.stream().filter(p -> p.getName().toLowerCase().contains("nike") || p.getDescription().toLowerCase().contains("nike")).collect(Collectors.toList());
        model.addAttribute("items", containsNike);
        return "webshop";
    }

    @RequestMapping("/stock")
    public String stock(Model model) {
        Double averageStock = shopItems.stream().collect(Collectors.averagingInt(p -> p.getStock()));
        model.addAttribute("average", averageStock);
        return "averageCounter";
    }

    @RequestMapping("/expensive")
    public String expensive(Model model) {
        ShopItem mostExpensive = shopItems.stream().filter(p -> p.getStock() > 0).max(Comparator.comparing(ShopItem::getPrice)).get();
        model.addAttribute("expensiveName", mostExpensive.getName());
        return "mostExpensive";
    }

    @RequestMapping("/search")
    public String searchElements(Model model, @RequestParam String s) {
        List<ShopItem> searchField = shopItems.stream().filter(p -> p.getName().toLowerCase().contains(s.toLowerCase()) || p.getDescription().toLowerCase().contains(s.toLowerCase())).collect(Collectors.toList());
        model.addAttribute("items", searchField);
        return "webshop";
    }


}
