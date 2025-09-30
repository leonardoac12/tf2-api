package com.github.leonardoac12.tf2_api.service;

import com.github.leonardoac12.tf2_api.model.Cosmetic;

public interface ICosmeticService {

    void saveCosmetic(Cosmetic cosmetic);

    Cosmetic getCosmeticById(Long id);
}
