package com.github.leonardoac12.tf2_api.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Cosmetic extends Item {

    private String style;
    private String paintColor;

    public Cosmetic(Long itemId, String name, String quality, boolean tradable,
                  boolean marketable, String style, String paintColor) {
        super(itemId, name, quality, tradable, marketable);
        this.style = style;
        this.paintColor = paintColor;
    }
}
