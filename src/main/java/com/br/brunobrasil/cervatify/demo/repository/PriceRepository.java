package com.br.brunobrasil.cervatify.demo.repository;

import com.br.brunobrasil.cervatify.demo.model.Price;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "price", path = "price")
public interface PriceRepository extends PagingAndSortingRepository<Price, Integer> {

}
