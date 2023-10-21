package com.michell.backend.cartapp.backendcartapp.services;

import java.util.List;
import com.michell.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    
    List<Product> findAll();
}
