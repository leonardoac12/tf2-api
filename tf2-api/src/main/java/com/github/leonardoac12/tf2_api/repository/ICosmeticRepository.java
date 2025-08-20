package com.github.leonardoac12.tf2_api.repository;

import com.github.leonardoac12.tf2_api.model.Cosmetic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICosmeticRepository extends JpaRepository<Cosmetic, Long> {
}
