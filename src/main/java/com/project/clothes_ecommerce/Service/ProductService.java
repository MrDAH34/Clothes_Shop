package com.project.clothes_ecommerce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.clothes_ecommerce.DTO.Response.ProductDetailResponse;
import com.project.clothes_ecommerce.DTO.Response.ProductResponse;
import com.project.clothes_ecommerce.Entity.Product;
import com.project.clothes_ecommerce.Entity.ProductItem;
import com.project.clothes_ecommerce.Exception.AppException;
import com.project.clothes_ecommerce.Exception.ErrorCode;
import com.project.clothes_ecommerce.Mapper.ProductMapper;
import com.project.clothes_ecommerce.Repository.ProductItemRepository;
import com.project.clothes_ecommerce.Repository.ProductRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductService {
    ProductRepository productRepository;
    ProductItemRepository productItemRepository;
    ProductMapper productMapper;

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.toList(products);
    }

    public ProductDetailResponse getProductDetail(Long id) {
        ProductItem productItem = productItemRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.PRODUCT_NOT_FOUND));
        ProductDetailResponse productDetailResponse = productMapper.toProductDetailResponse(productItem);
        productDetailResponse.setName(productItem.getProduct().getName());
        return productDetailResponse;
    }
}
