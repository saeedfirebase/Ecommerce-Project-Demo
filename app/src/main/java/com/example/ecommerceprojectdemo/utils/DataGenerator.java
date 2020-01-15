package com.example.ecommerceprojectdemo.utils;

import com.example.ecommerceprojectdemo.R;
import com.example.ecommerceprojectdemo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Product> getProducts(){
        List<Product>productList = new ArrayList<>();

        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.copffee,"dal"));
        productList.add(new Product(1, R.drawable.maggi,"coffee"));
        productList.add(new Product(1, R.drawable.chanachor,"chanachor"));
        productList.add(new Product(1, R.drawable.rice,"maggi"));
        productList.add(new Product(1, R.drawable.dal,"maggi"));
        productList.add(new Product(1, R.drawable.dal,"maggi"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));
        productList.add(new Product(1, R.drawable.dal,"Rice"));

    return productList;
    }
}
