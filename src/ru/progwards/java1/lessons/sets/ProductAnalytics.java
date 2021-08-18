package ru.progwards.java1.lessons.sets;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product> products;

    public ProductAnalytics(List<Product> products, List<Shop> shops) {
        this.products = products;
        this.shops = shops;
    }

    public Set<Product> existInAll() {
        LinkedHashSet<Product> allMarketProducts = new LinkedHashSet<>();
        allMarketProducts.retainAll(products);
        return allMarketProducts;
    }

    public Set<Product> existAtListInOne() {
        LinkedHashSet<Product> oneMarketProducts = new LinkedHashSet<>();
        oneMarketProducts.addAll(products);
        return oneMarketProducts;
    }

    public Set<Product> notExistInShops() {
        LinkedHashSet<Product> noMarketProducts = new LinkedHashSet<>();
        noMarketProducts.removeAll(products);
        return noMarketProducts;
    }

    public Set<Product> existOnlyInOne() {
        LinkedHashSet<Product> onlyOneMarketProducts = new LinkedHashSet<>();
        onlyOneMarketProducts.retainAll(products);
        return onlyOneMarketProducts;
    }
}
