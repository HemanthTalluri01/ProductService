package dev.hemanth.productservice.services;

import dev.hemanth.productservice.dtos.GenericProductDto;
import dev.hemanth.productservice.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);

    GenericProductDto getProductById(Long id) throws NotFoundException;

    List<GenericProductDto> getAllProducts();

   GenericProductDto deleteProduct(Long id);
}
