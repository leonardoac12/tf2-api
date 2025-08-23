package com.github.leonardoac12.tf2_api.controller;

import com.github.leonardoac12.tf2_api.model.Weapon;
import com.github.leonardoac12.tf2_api.service.IWeaponService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeaponController {

    private IWeaponService weaponService;

    @PostMapping("/weapon/create")
    public String createWeapon(@RequestBody Weapon weapon) {
        weaponService.saveWeapon(weapon);
        return "";
    }
}
