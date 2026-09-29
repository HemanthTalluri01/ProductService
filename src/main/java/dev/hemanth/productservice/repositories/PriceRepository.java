package dev.hemanth.productservice.repositories;

import dev.hemanth.productservice.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository
extends JpaRepository<Price, Long> {
}
