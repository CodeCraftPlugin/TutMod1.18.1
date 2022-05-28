package net.codecraft.mccourse.enchantment;

import net.codecraft.mccourse.MccourseMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static final Enchantment LIGHTINGSTRICKER=registerEnchantment("lightings_stricker",
            new LightingStrickerEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment registerEnchantment(String name,Enchantment enchantment){
        return Registry.register(Registry.ENCHANTMENT, new Identifier(MccourseMod.MOD_ID, name),enchantment);
        
    }

    public static void registerMccourseEnchantment() {
        System.out.println("registering enchantment");
    }

}
