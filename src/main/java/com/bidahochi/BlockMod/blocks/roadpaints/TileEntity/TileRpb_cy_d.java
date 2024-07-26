package com.bidahochi.BlockMod.blocks.roadpaints.TileEntity;


import com.bidahochi.BlockMod.blocks.BaseClassFolder.BaseTileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.AxisAlignedBB;

public class TileRpb_cy_d extends BaseTileEntity
{
    public TileRpb_cy_d(int dir)
    {
        super(dir);
    }

    public TileRpb_cy_d()
    {

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-2, zCoord-1, xCoord+1, yCoord, zCoord+1);
    }
}
