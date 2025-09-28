package com.github.leonardoac12.tf2_api.controller;

import com.github.leonardoac12.tf2_api.repository.ICosmeticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cosmetics")
public class CosmeticController {

    @Autowired
    private ICosmeticRepository cosmeticRepository;
}
