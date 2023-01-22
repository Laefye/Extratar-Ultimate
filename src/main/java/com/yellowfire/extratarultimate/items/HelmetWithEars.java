package com.yellowfire.extratarultimate.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class HelmetWithEars extends ArmorItem {
    public HelmetWithEars(ArmorMaterial material, Settings settings) {
        super(material, EquipmentSlot.HEAD, settings);
    }
}
