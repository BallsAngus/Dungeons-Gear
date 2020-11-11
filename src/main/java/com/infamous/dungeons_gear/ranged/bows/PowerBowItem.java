package com.infamous.dungeons_gear.ranged.bows;

import com.infamous.dungeons_gear.init.DeferredItemInit;
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

public class PowerBowItem extends AbstractDungeonsBowItem {

    public PowerBowItem(Properties builder, float defaultChargeTimeIn, boolean isUniqueIn) {
        super(builder, defaultChargeTimeIn, isUniqueIn);
        this.addPropertyOverride(new ResourceLocation("pull"),
                (itemStack, world, livingEntity) -> {
                    if (livingEntity == null) {
                        return 0.0F;
                    } else {
                        return !(livingEntity.getActiveItemStack().getItem() instanceof PowerBowItem) ?
                                0.0F :
                                (float)(itemStack.getUseDuration() - livingEntity.getItemInUseCount()) / RangedAttackHelper.getModdedBowChargeTime(livingEntity.getActiveItemStack());
                    }
                });
        this.addPropertyOverride(new ResourceLocation("pulling"),
                (itemStack, world, livingEntity) -> livingEntity != null && livingEntity.isHandActive() && livingEntity.getActiveItemStack() == itemStack ? 1.0F : 0.0F);
    }

    @Override
    public boolean shootsStrongChargedArrows(ItemStack stack) {
        return true;
    }

    @Override
    public boolean hasPowerBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.ELITE_POWER_BOW.get();
    }

    @Override
    public boolean hasRadianceShotBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.SABREWING.get();
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        super.addInformation(stack, world, list, flag);

        if(stack.getItem() == DeferredItemInit.ELITE_POWER_BOW.get()){
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "The secrets of the Elite Power Bow's construction have been lost without a trace."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Strong Charged Attacks"));
            list.add(new StringTextComponent(TextFormatting.GREEN + "Greater Damage (Power I)"));
        }
        if(stack.getItem() == DeferredItemInit.SABREWING.get()){
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "This bow, built for a long-lost champion, feels right in the hands of those who seek justice."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Strong Charged Attacks"));
            list.add(new StringTextComponent(TextFormatting.GREEN + "Heals Allies In Area (Radiance Shot I)"));
        }
        if(stack.getItem() == DeferredItemInit.POWER_BOW.get()){
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "The question of what makes the Power Bow so powerful has puzzled the minds of learned folk for ages."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Strong Charged Attacks"));
        }
    }
}
