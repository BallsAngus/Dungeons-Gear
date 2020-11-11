package com.infamous.dungeons_gear.ranged.crossbows;

import com.infamous.dungeons_gear.init.DeferredItemInit;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class HeavyCrossbowItem extends AbstractDungeonsCrossbowItem {

    public HeavyCrossbowItem(Properties builder, int defaultChargeTimeIn, boolean isUniqueIn) {
        super(builder, defaultChargeTimeIn, isUniqueIn);
    }

    @Override
    public boolean shootsHeavyArrows(ItemStack stack) {
        return true;
    }

    @Override
    public boolean hasPunchBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.DOOM_CROSSBOW.get();
    }

    @Override
    public boolean hasRicochetBuiltIn(ItemStack stack) {
        return stack.getItem() == DeferredItemInit.SLAYER_CROSSBOW.get();
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(stack, world, list, flag);

        if (stack.getItem() == DeferredItemInit.DOOM_CROSSBOW.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "Many thought that the Doom Crossbow was just a myth, but this time the rumors turned out to be true."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Powerful Shots"));
            list.add(new StringTextComponent(TextFormatting.GREEN + "Additional Knockback (Punch I)"));
            list.add(new StringTextComponent(TextFormatting.RED + "Slow Firerate"));
        }
        if (stack.getItem() == DeferredItemInit.SLAYER_CROSSBOW.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "The Slayer Crossbow is the treasured heirloom of many legendary hunters."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Powerful Shots"));
            list.add(new StringTextComponent(TextFormatting.GREEN + "Chance To Ricochet (Ricochet I)"));
            list.add(new StringTextComponent(TextFormatting.RED + "Slow Firerate"));
        }
        if (stack.getItem() == DeferredItemInit.HEAVY_CROSSBOW.get()) {
            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC + "The weighted crossbow is a damage-dealing menace and a real threat from a ranged distance."));

            list.add(new StringTextComponent(TextFormatting.GREEN + "Powerful Shots"));
            list.add(new StringTextComponent(TextFormatting.RED + "Slow Firerate"));
        }
    }
}
