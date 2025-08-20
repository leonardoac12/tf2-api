package com.github.leonardoac12.tf2_api.service;

import com.github.leonardoac12.tf2_api.model.Weapon;
import com.github.leonardoac12.tf2_api.repository.IWeaponRepository;
import org.springframework.stereotype.Service;

@Service
public class WeaponService implements IWeaponService {

    private IWeaponRepository weaponRepository;

    @Override
    public void saveWeapon(Weapon weapon) {
        weaponRepository.save(weapon);
    }
}
