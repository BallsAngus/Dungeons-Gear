package com.infamous.dungeons_gear.ranged.crossbows;

import com.infamous.dungeons_gear.init.DeferredItemInit;
import com.infamous.dungeons_gear.interfaces.ISoulGatherer;
import com.infamous.dungeons_gear.utilties.RangedAttackHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

import static com.infamous.dungeons_gear.items.RangedWeaponList.*;

public class SoulCrossbowItem extends AbstractDungeonsCrossbowItem implements ISoulGatherer {

    public SoulCrossbowItem(Properties builder, int defaultChargeTimeIn, boolean isUniqueIn) {
        super(builder, defaultChargeTimeIn, isUniqueIn);
        this.addPropertyOverride(new ResourceLocation("pull"), (itemStack, world, livingEntity) -> {
            if (livingEntity != null && itemStack.getItem() == this) {
                return isCharged(itemStack) ? 0.0F : (float)(itemStack.getUseDuration() - livingEntity.getItemInUseCount()) / (float) RangedAttackHelper.getModdedCrossbowChargeTime(itemStack);
            } else {
                return 0.0F;
            }
        });
        this.addPropertyOverride(new ResourceLocation("pulling"),
                (itemStack, world, livingEntity) -> livingEntity != null && livingEntity.isHandActive() && livingEntity.getActiveItemStack() == itemStack && !isCharged(itemStack) ? 1.0F : 0.0F);
        this.addPropertyOverride(new ResourceLocation("charged"),
                (itemStack, world, livingEntity) -> livingEntity != null && isCharged(itemStack) ? 1.0F : 0.0F);
        this.addPropertyOverride(new ResourceLocation("firework"),
                (itemStack, world, livingEntity) -> livingEntity != null && isCharged(itemStack) && RangedAttackHelper.hasChargedProjectile(itemStack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
    }

    @Override
    public boolean gathersSouls(ItemStack stack) {
        return true;
    }

    @Override
    public boolean hasEnigmaResonatorBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.FERAL_SOUL_CROSSBOW.get();
    }

    @Override
    public boolean hasGravityBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.VOIDCALLER.get();
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(stack, world, list, flag);

        if (stack.getItem() == DeferredItemInit.FERAL_SOUL_CROSSBOW.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "If you listen closely you can hear the souls inside the crossbow, usually ridiculing you."));

            list.add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "Souls Critical Boost (Enigma Resonator I)"));
            list.add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "+2 XP Gathering"));
        }
        if (stack.getItem() == DeferredItemInit.VOIDCALLER.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "This weapon calls out to souls that are trapped between this world and the next."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Pulls Enemies In (Gravity I)"));
            list.add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "+2 XP Gathering"));
        }
        if (stack.getItem() == DeferredItemInit.SOUL_CROSSBOW.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "The Soul Crossbow was crafted by the mysterious Evokers and Enchanters of the Woodland Mansions."));

            list.add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "+2 XP Gathering"));
        }
    }

    @Override
    public int getGatherAmount(ItemStack stack) {
        return 2;
    }
}
