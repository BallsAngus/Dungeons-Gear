package com.infamous.dungeons_gear.enchantments.armor;

import com.infamous.dungeons_gear.enchantments.ModEnchantmentTypes;
import com.infamous.dungeons_gear.enchantments.lists.ArmorEnchantmentList;
import com.infamous.dungeons_gear.enchantments.types.DungeonsEnchantment;
import com.infamous.dungeons_gear.utilties.ModEnchantmentHelper;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

import static com.infamous.dungeons_gear.DungeonsGear.MODID;

@Mod.EventBusSubscriber(modid = MODID)
public class RecklessEnchantment extends DungeonsEnchantment {
    private static final UUID RECKLESS = UUID.fromString("c131aecf-3b88-43c9-9df3-16f791077d41");

    public RecklessEnchantment() {
        super(Rarity.COMMON, ModEnchantmentTypes.ARMOR, ModEnchantmentTypes.ARMOR_SLOT);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        if (player == null) return;
        if (event.phase == TickEvent.Phase.START) return;
        if (player.isAlive()) {
            player.getAttribute(Attributes.MAX_HEALTH).removeModifier(RECKLESS);
            player.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(RECKLESS);
            int recklessLevel = EnchantmentHelper.getMaxEnchantmentLevel(ArmorEnchantmentList.RECKLESS, player);
            if (recklessLevel > 0) {
                player.getAttribute(Attributes.MAX_HEALTH).applyNonPersistentModifier(new AttributeModifier(RECKLESS, "reckless multiplier", -0.6, AttributeModifier.Operation.MULTIPLY_TOTAL));
                player.getAttribute(Attributes.ATTACK_DAMAGE).applyNonPersistentModifier(new AttributeModifier(RECKLESS, "reckless multiplier", 0.2 + (0.2 * recklessLevel), AttributeModifier.Operation.MULTIPLY_TOTAL));
            }
        }
    }
}
