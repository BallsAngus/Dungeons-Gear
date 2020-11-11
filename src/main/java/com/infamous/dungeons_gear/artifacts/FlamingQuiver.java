package com.infamous.dungeons_gear.artifacts;

import com.infamous.dungeons_gear.capabilities.combo.ICombo;
import com.infamous.dungeons_gear.utilties.CapabilityHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class FlamingQuiver extends ArtifactItem {
    public FlamingQuiver(Properties properties) {
        super(properties);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        ICombo comboCap = CapabilityHelper.getComboCapability(playerIn);
        if(comboCap == null) return new ActionResult<>(ActionResultType.FAIL, itemstack);
        comboCap.setFlamingArrowsCount(7);

        if(!playerIn.isCreative()){
            itemstack.damageItem(1, playerIn, (entity) -> {
                entity.sendBreakAnimation(handIn);
            });
        }


        ArtifactItem.setArtifactCooldown(playerIn, itemstack.getItem(), 600);
        return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        super.addInformation(stack, world, list, flag);

            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC +
                    "This quiver is filled with the deadliest of arrows."));
            list.add(new StringTextComponent(TextFormatting.GREEN +
                    "Turns the next 7 arrows you shoot into burning arrows."));
            list.add(new StringTextComponent(TextFormatting.BLUE +
                    "30 Seconds Cooldown"));
    }
}
