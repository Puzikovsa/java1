package ru.progwards.java1.lessons.sets;

import java.util.*;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product> products;

    public ProductAnalytics(List<Product> products, List<Shop> shops) {
        this.products = products;
        this.shops = shops;
    }

    public Set<Product> existInAll() {
        Set<Product> allMarketProducts = new HashSet<>(products);
        for (Shop shop: shops) {
            allMarketProducts.retainAll(shop.getProducts());
        }
        return allMarketProducts;
    }


    public Set<Product> existAtListInOne() {
        Set<Product> oneMarketProducts = new HashSet<>();
        for (Shop shop: shops) {
            oneMarketProducts.addAll(shop.getProducts());
        }
        return oneMarketProducts;
    }

    public Set<Product> notExistInShops() {
        Set<Product> noMarketProducts = new HashSet<>();
        for (Product product: products)
        noMarketProducts.addAll(Collections.singleton(product));
        for (Shop shop: shops) {
            noMarketProducts.removeAll(shop.getProducts());
        }
        return noMarketProducts;
    }

    public Set<Product> existOnlyInOne() {
        Set<Product> onlyOneMarketProducts = new HashSet<>();
        onlyOneMarketProducts.retainAll(products);
        return onlyOneMarketProducts;
    }

    public static void main(String[] args) {
        List<Product> avail_product = new ArrayList<>();
        avail_product.add(new Product("1"));
        avail_product.add(new Product("3"));
        avail_product.add(new Product("5"));
        avail_product.add(new Product("8"));
        avail_product.add(new Product("2"));

        List<Product> pr1 = new ArrayList<>();
        pr1.add(new Product("1"));
        pr1.add(new Product("2"));
        pr1.add(new Product("3"));
        Shop shop1 = new Shop(pr1);

        List<Product> pr2 = new ArrayList<>();
        pr2.add(new Product("5"));
        pr2.add(new Product("2"));
        pr2.add(new Product("3"));
        Shop shop2 = new Shop(pr2);

        List<Shop> shops = new ArrayList<>();
        shops.add(shop1);
        shops.add(shop2);

        ProductAnalytics mainObj = new ProductAnalytics(avail_product, shops);
        System.out.println(avail_product);
        System.out.println(shop1.getProducts());
        System.out.println(shop2.getProducts());
        System.out.println(mainObj.existInAll());
        System.out.println(mainObj.existAtListInOne());
        System.out.println(mainObj.notExistInShops());
    }
}
