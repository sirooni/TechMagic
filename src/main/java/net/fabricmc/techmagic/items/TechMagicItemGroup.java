package net.fabricmc.techmagic.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.techmagic.TechMagic;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TechMagicItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(TechMagic.MOD_ID, "items"),
            () -> new ItemStack(TechMagic.THUNDER_WAND)
    );
}
