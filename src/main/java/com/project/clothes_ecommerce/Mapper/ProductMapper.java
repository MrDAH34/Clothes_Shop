package com.project.clothes_ecommerce.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.project.clothes_ecommerce.DTO.Response.ProductDetailResponse;
import com.project.clothes_ecommerce.DTO.Response.ProductResponse;
import com.project.clothes_ecommerce.Entity.Product;
import com.project.clothes_ecommerce.Entity.ProductItem;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<ProductResponse> toList(List<Product> products);

    @Mapping(target = "name", ignore = true)
    ProductDetailResponse toProductDetailResponse(ProductItem productItem);
}
