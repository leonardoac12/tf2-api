package com.github.leonardoac12.tf2_api.controller;

import com.github.leonardoac12.tf2_api.model.Cosmetic;
import com.github.leonardoac12.tf2_api.model.Weapon;
import com.github.leonardoac12.tf2_api.repository.ICosmeticRepository;
import com.github.leonardoac12.tf2_api.service.ICosmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tf2-api/cosmetics")
public class CosmeticController {

    @Autowired
    private ICosmeticService cosmeticService;

    @PostMapping("/create")
    public String createCosmetic(@RequestBody Cosmetic cosmetic) {
        cosmeticService.saveCosmetic(cosmetic);
        return "";
    }
}
