package com.bidahochi.BlockMod.blocks.aggregates;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockfiberGlass extends ItemBlockWithMetadata{

    public ItemBlockfiberGlass(Block block) {
        super(block, block);
    }

    public String getUnlocalizedName( ItemStack item){
        return this.getUnlocalizedName() + "_" + item.getItemDamage();
    }
}

