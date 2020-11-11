package com.infamous.dungeons_gear.items;

import com.infamous.dungeons_gear.init.DeferredItemInit;
import com.infamous.dungeons_gear.ranged.crossbows.*;
import com.infamous.dungeons_gear.utilties.RangedAttackHelper;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;

public class CrossbowItemModelsProperties {

	public CrossbowItemModelsProperties() {
		// CROSSBOW
		/*
		ItemModelsProperties.func_239418_a_(Items.CROSSBOW, new ResourceLocation("pull"),
				(stack, clientWorld, livingEntity) -> {
					if (livingEntity == null) {
						return 0.0F;
					} else {
						return CrossbowItem.isCharged(stack) ? 0.0F
								: (float) (stack.getUseDuration() - livingEntity.getItemInUseCount())
								/ (float) DungeonsHooks.getCrossbowChargeTime(stack);
					}
				});
		ItemModelsProperties.func_239418_a_(Items.CROSSBOW, new ResourceLocation("pulling"),
				(stack, clientWorld, livingEntity) -> {
					return livingEntity != null && livingEntity.isHandActive()
							&& livingEntity.getActiveItemStack() == stack && !CrossbowItem.isCharged(stack)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(Items.CROSSBOW, new ResourceLocation("charged"),
				(stack, clientWorld, livingEntity) -> {
					return livingEntity != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F;
				});
		 */


		// AUTO CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AUTO_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return RapidCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
										/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AUTO_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !RapidCrossbowItem.isCharged(p_239426_0_)
									? 1.0F
									: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AUTO_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && RapidCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// AZURE SEEKER
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AZURE_SEEKER.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return DungeonsCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AZURE_SEEKER.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !DungeonsCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.AZURE_SEEKER.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && DungeonsCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// BUTTERFLY CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BUTTERFLY_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return RapidCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BUTTERFLY_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !RapidCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BUTTERFLY_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && RapidCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// DOOM CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DOOM_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return HeavyCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DOOM_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !HeavyCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DOOM_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && HeavyCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// FERAL SOUL CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FERAL_SOUL_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return SoulCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FERAL_SOUL_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !SoulCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FERAL_SOUL_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && SoulCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// FIREBOLT THROWER
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FIREBOLT_THROWER.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ExplodingCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FIREBOLT_THROWER.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ExplodingCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.FIREBOLT_THROWER.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ExplodingCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// HARP CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HARP_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ScatterCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HARP_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ScatterCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HARP_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ScatterCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// LIGHTNING HARP CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.LIGHTNING_HARP_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ScatterCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.LIGHTNING_HARP_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ScatterCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.LIGHTNING_HARP_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ScatterCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// SLAYER CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SLAYER_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return HeavyCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SLAYER_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !HeavyCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SLAYER_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && HeavyCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// THE SLICER
		ItemModelsProperties.func_239418_a_(DeferredItemInit.THE_SLICER.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return DungeonsCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.THE_SLICER.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !DungeonsCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.THE_SLICER.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && DungeonsCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// VOIDCALLER
		ItemModelsProperties.func_239418_a_(DeferredItemInit.VOIDCALLER.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return SoulCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.VOIDCALLER.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !SoulCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.VOIDCALLER.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && SoulCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// EXPLODING CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.EXPLODING_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ExplodingCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.EXPLODING_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ExplodingCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.EXPLODING_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ExplodingCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// HEAVY CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HEAVY_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return HeavyCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HEAVY_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !HeavyCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.HEAVY_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && HeavyCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// RAPID CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.RAPID_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return RapidCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.RAPID_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !RapidCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.RAPID_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && RapidCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// SCATTER CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SCATTER_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ScatterCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SCATTER_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ScatterCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SCATTER_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ScatterCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// SOUL CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return SoulCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !SoulCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && SoulCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// IMPLODING CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.IMPLODING_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return ExplodingCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.IMPLODING_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !ExplodingCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.IMPLODING_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && ExplodingCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// BABY CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BABY_CROSSBOW.get(), new ResourceLocation("pull"),
				(stack, clientWorld, livingEntity) -> {
					if (livingEntity == null) {
						return 0.0F;
					} else {
						return DualCrossbowItem.isCharged(stack) ? 0.0F
								: (float) (stack.getUseDuration() - livingEntity.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(stack);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BABY_CROSSBOW.get(), new ResourceLocation("pulling"),
				(stack, clientWorld, livingEntity) -> {
					return (
							(livingEntity != null
							&& livingEntity.isHandActive()
							&& livingEntity.getActiveItemStack() == stack
							&& !DualCrossbowItem.isCharged(stack))

							|| ((livingEntity != null
							&& livingEntity.isHandActive()
									&& livingEntity.getActiveHand() == Hand.MAIN_HAND
							&& livingEntity.getActiveItemStack().getItem() instanceof DualCrossbowItem
							&& livingEntity.getHeldItemOffhand().getItem() instanceof DualCrossbowItem
							&& !DualCrossbowItem.isCharged(stack))))

							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BABY_CROSSBOW.get(), new ResourceLocation("charged"),
				(stack, clientWorld, livingEntity) -> {
					return livingEntity != null && DualCrossbowItem.isCharged(stack) ? 1.0F : 0.0F;
				});

		// DUAL CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DUAL_CROSSBOW.get(), new ResourceLocation("pull"),
				(stack, clientWorld, livingEntity) -> {
					if (livingEntity == null) {
						return 0.0F;
					} else {
						return DualCrossbowItem.isCharged(stack) ? 0.0F
								: (float) (stack.getUseDuration() - livingEntity.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(stack);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DUAL_CROSSBOW.get(), new ResourceLocation("pulling"),
				(stack, clientWorld, livingEntity) -> {
					return (
							(livingEntity != null
									&& livingEntity.isHandActive()
									&& livingEntity.getActiveItemStack() == stack
									&& !DualCrossbowItem.isCharged(stack))

									|| ((livingEntity != null
									&& livingEntity.isHandActive()
									&& livingEntity.getActiveHand() == Hand.MAIN_HAND
									&& livingEntity.getActiveItemStack().getItem() instanceof DualCrossbowItem
									&& livingEntity.getHeldItemOffhand().getItem() instanceof DualCrossbowItem
									&& !DualCrossbowItem.isCharged(stack))))

							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.DUAL_CROSSBOW.get(), new ResourceLocation("charged"),
				(stack, clientWorld, livingEntity) -> {
					return livingEntity != null && DualCrossbowItem.isCharged(stack) ? 1.0F : 0.0F;
				});

		/*
		// BURST CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BURST_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return BurstCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BURST_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !BurstCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.BURST_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && BurstCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		// SOUL HUNTER CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_HUNTER_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return BurstCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_HUNTER_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !BurstCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.SOUL_HUNTER_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && BurstCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});
		// CORRUPTED CROSSBOW
		ItemModelsProperties.func_239418_a_(DeferredItemInit.CORRUPTED_CROSSBOW.get(), new ResourceLocation("pull"),
				(p_239427_0_, p_239427_1_, p_239427_2_) -> {
					if (p_239427_2_ == null) {
						return 0.0F;
					} else {
						return BurstCrossbowItem.isCharged(p_239427_0_) ? 0.0F
								: (float) (p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount())
								/ (float) RangedAttackHelper.getModdedCrossbowChargeTime(p_239427_0_);
					}
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.CORRUPTED_CROSSBOW.get(), new ResourceLocation("pulling"),
				(p_239426_0_, p_239426_1_, p_239426_2_) -> {
					return p_239426_2_ != null && p_239426_2_.isHandActive()
							&& p_239426_2_.getActiveItemStack() == p_239426_0_ && !BurstCrossbowItem.isCharged(p_239426_0_)
							? 1.0F
							: 0.0F;
				});
		ItemModelsProperties.func_239418_a_(DeferredItemInit.CORRUPTED_CROSSBOW.get(), new ResourceLocation("charged"),
				(p_239425_0_, p_239425_1_, p_239425_2_) -> {
					return p_239425_2_ != null && BurstCrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
				});

		 */
	}
}