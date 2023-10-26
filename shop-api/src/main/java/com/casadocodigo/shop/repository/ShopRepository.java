package com.casadocodigo.shop.repository;

import com.casadocodigo.shop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

    Shop findByIdentifier(String identifier);
}