package com.infamous.dungeons_gear.items;

import com.infamous.dungeons_gear.DungeonsGear;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ItemTagWrappers {
    public static final Tag<Item> METAL_MELEE_WEAPON_REPAIR_ITEMS = new ItemTags.Wrapper(new ResourceLocation(DungeonsGear.MODID, "metal_weapon_repair_items"));
    public static final Tag<Item> METAL_ARMOR_REPAIR_ITEMS = new ItemTags.Wrapper(new ResourceLocation(DungeonsGear.MODID, "metal_armor_repair_items"));
    public static final Tag<Item> NON_METAL_ARMOR_REPAIR_ITEMS = new ItemTags.Wrapper(new ResourceLocation(DungeonsGear.MODID, "non_metal_armor_repair_items"));
    public static final Tag<Item> ARTIFACT_REPAIR_ITEMS = new ItemTags.Wrapper(new ResourceLocation(DungeonsGear.MODID, "artifact_repair_items"));
}
