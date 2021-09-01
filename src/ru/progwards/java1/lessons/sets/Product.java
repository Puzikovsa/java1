package ru.progwards.java1.lessons.sets;

import java.util.Objects;

public class Product {
        private String code;

    public Product(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "'" + code + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if ((this == obj)) return true;
        if (!(obj instanceof Product)) return false;
        Product product = (Product) obj;
        return code.equals(product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
