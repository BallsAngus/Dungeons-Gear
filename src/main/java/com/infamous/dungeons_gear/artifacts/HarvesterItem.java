package com.infamous.dungeons_gear.artifacts;

import com.infamous.dungeons_gear.interfaces.ISoulGatherer;
import com.infamous.dungeons_gear.utilties.AOECloudHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

import static com.infamous.dungeons_gear.utilties.AreaOfEffectHelper.causeMagicExplosionAttack;

public class HarvesterItem extends ArtifactItem implements ISoulGatherer {
    public HarvesterItem(Properties properties) {
        super(properties);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if(playerIn.experienceTotal >= 40 || playerIn.isCreative()){
            if(!playerIn.isCreative()){
                playerIn.giveExperiencePoints(-40);
            }
            playerIn.world.playSound((PlayerEntity) null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 64.0F, 1.0F);
            AOECloudHelper.spawnExplosionCloud(playerIn, playerIn, 3.0F);
            causeMagicExplosionAttack(playerIn,playerIn, 15, 3.0F);

            if(!playerIn.isCreative()){
                itemstack.damageItem(1, playerIn, (entity) -> {
                    entity.sendBreakAnimation(handIn);
                });
            }


            ArtifactItem.setArtifactCooldown(playerIn, itemstack.getItem(), 20);
        }

        return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        super.addInformation(stack, world, list, flag);

            list.add(new StringTextComponent(TextFormatting.WHITE + "" + TextFormatting.ITALIC +
                    "The Harvester siphons the souls of the dead, before releasing them into a cluster hex of power."));
            list.add(new StringTextComponent(TextFormatting.GREEN +
                    "When used, the Harvester releases souls in an explosion."));
            list.add(new StringTextComponent(TextFormatting.LIGHT_PURPLE +
                    "+1 XP Gathering"));
            list.add(new StringTextComponent(TextFormatting.BLUE +
                    "Requires 40 XP"));
            list.add(new StringTextComponent(TextFormatting.BLUE +
                    "1 Second Cooldown"));
    }

    @Override
    public int getGatherAmount(ItemStack stack) {
        return 1;
    }
}
