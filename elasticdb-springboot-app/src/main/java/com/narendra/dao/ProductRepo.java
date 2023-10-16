package com.narendra.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.narendra.entity.Product;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {

}
