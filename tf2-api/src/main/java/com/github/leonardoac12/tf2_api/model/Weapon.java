package com.github.leonardoac12.tf2_api.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Weapon extends Item {

    private String weaponType;

    public Weapon(Long itemId, String name, String quality, boolean tradable,
                  boolean marketable, String weaponType) {
        super(itemId, name, quality, tradable, marketable);
        this.weaponType = weaponType;
    }
}
