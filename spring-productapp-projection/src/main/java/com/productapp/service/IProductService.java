package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.*;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);

    Product getById(int productId) throws ProductNotFoundException;

    List<Product> getAll();
    List<Product> getByBrandAndPriceLessThan(String brand,double price) throws ProductNotFoundException;
    List<Product> getByCategory(String category) throws ProductNotFoundException;
    List<Product> getByPriceLessThan(double price) throws ProductNotFoundException;
    List<Product> getByBrandStartingWith(String brand) throws ProductNotFoundException;
    List<Product> getByChoice(String choice);


    List<ProductDTO> getByBrand(String brand);
    List<CategoryDTO> getByCategoryPriceLessThan(String category, double price);

    ProductDetails getByName(String name);

    //view
    List<ProductView> getAllProducts();
//for brandviewrepository
    List<ProductBrandView> getByBrands(String brand);

    //open projection
    List<ProductDetailsEx> findByBrand(String brand);

    //from procedure
    List<Product> showAllProducts();

    List<Product> findAllProducts();

    List<Product> showByBrand(String brand);

    double findTotalCost(String brand);

}
