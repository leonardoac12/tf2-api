package com.github.leonardoac12.tf2_api.repository;

import com.github.leonardoac12.tf2_api.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWeaponRepository extends JpaRepository<Weapon, Long> {

}
