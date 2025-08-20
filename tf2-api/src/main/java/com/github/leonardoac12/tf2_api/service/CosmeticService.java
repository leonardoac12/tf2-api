package com.github.leonardoac12.tf2_api.service;

import com.github.leonardoac12.tf2_api.model.Cosmetic;
import com.github.leonardoac12.tf2_api.repository.ICosmeticRepository;
import org.springframework.stereotype.Service;

@Service
public class CosmeticService implements ICosmeticService {

    ICosmeticRepository cosmeticRepository;

    @Override
    public void saveCosmetic(Cosmetic cosmetic) {
        cosmeticRepository.save(cosmetic);
    }
}
