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
        for (Product p: allMarketProducts){
            System.out.println(p.getCode());
        }
        for (Shop shop: shops) {
            for (int i = 0; i < shop.getProducts().size(); i++){
                System.out.println(shop.getProducts().get(i));
            }
            allMarketProducts.retainAll(shop.getProducts());
            System.out.println(allMarketProducts.size());
        }
        return allMarketProducts;
    }


    public Set<Product> existAtListInOne() {
        Set<Product> oneMarketProducts = new HashSet<>();
        oneMarketProducts.addAll(products);
        return oneMarketProducts;
    }

    public Set<Product> notExistInShops() {
        Set<Product> noMarketProducts = new HashSet<>();
        noMarketProducts.removeAll(products);
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
        System.out.println(mainObj.existInAll());
    }
}
