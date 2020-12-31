package com.bidahochi.BlockMod.core.handler;

/********************
 *
 *  blockHander  by -hariesh
 *
 *  This file allows you to register your blocks to MINECRAFT without cluttering up Foxblocks.java
 *  MAKE SURE YOU REGISTER THEM TO FOXBLOCKS IN BlockIDs.java  in com.bidahochi.BlockMod.core.handler;
 *
 *  This file is ONLY for registering blocks to the mod. Do not try to add properties like hardness here
 *
 *  You can set hardness and other properties in the block class file directly. just do set### under the main class in the block file
 *
 *  Use Format:
 *      BlockIDs.blockname.block = new BlockName(materialOfBlock);
 *
 *  Any Questions feel free to DM me or Ping Me in discord!
 *
 *  -hariesh
 *
 ********************/



import com.bidahochi.BlockMod.FoxBlocks;
import com.bidahochi.BlockMod.blocks.metals.*;
import com.bidahochi.BlockMod.blocks.essentiallymemes.*;
import com.bidahochi.BlockMod.blocks.aggregates.*;
import com.bidahochi.BlockMod.blocks.stones.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;

public class blockHandler {
    public static CreativeTabs foxBlocksCreativeTab;

    public static void initBlockRegister(){

        FoxBlocks.blockLogger.info("BlockRegister Pre Init at com.bidahochi.BlockMod.core.handler.blockHandler");

        BlockIDs.bauxiteOre.block = new BauxiteOre(Material.rock);
        BlockIDs.rawConcrete.block = new RawConcrete(Material.rock);
        BlockIDs.peagravel_snow.block = new SnowyPeaGravel(Material.sand);
        BlockIDs.peagravel.block = new PeaGravel(Material.sand);
        BlockIDs.although.block = new Although(Material.clay);
        BlockIDs.metalSiding_White.block = new MetalSiding_White(Material.iron);
        BlockIDs.metalSiding_LightGrey.block = new MetalSiding_LightGrey(Material.iron);
        BlockIDs.metalSiding_Grey.block = new MetalSiding_Grey(Material.iron);
        BlockIDs.metalSiding_Black.block = new MetalSiding_Black(Material.iron);
        BlockIDs.testblock.block = new testBlock(Material.iron);
        BlockIDs.dryWall.block = new dryWall(Material.clay);
        BlockIDs.brownTile.block = new BrownTile(Material.rock);
        BlockIDs.fiberGlass.block = new fiberGlass(Material.glass);

        for (BlockIDs block : BlockIDs.values()) {
            if (block.hasItemBlock == false) {
                GameRegistry.registerBlock(block.block, block.blockName);
                block.block.setCreativeTab(FoxBlocks.foxBlocksCreativeTab);
            } else {
                GameRegistry.registerBlock(block.block, block.itemBlockClass, block.blockName);
                block.block.setCreativeTab(FoxBlocks.foxBlocksCreativeTab);

            }
        }

        FoxBlocks.blockLogger.info("BlockRegister Post Init at com.bidahochi.BlockMod.core.handler.blockHandler");

    }
}
