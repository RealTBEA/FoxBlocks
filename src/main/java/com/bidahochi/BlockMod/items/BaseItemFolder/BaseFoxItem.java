package com.bidahochi.BlockMod.items.BaseItemFolder;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public abstract class BaseFoxItem extends Item
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    protected int amountOfSubBlocks = 0;

    /**
     *
     * @param unlocalizedName
     * @param creativeTab
     */
    public BaseFoxItem(String unlocalizedName, CreativeTabs creativeTab)
    {
        super();
        setMaxStackSize(64);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(creativeTab);

        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    /**
     *
     * @param unlocalizedName
     * @param stackSize
     * @param creativeTab
     */
    public BaseFoxItem(String unlocalizedName, int stackSize, CreativeTabs creativeTab)
    {
        super();
        setMaxStackSize(stackSize);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(creativeTab);

        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_) {
        int j = MathHelper.clamp_int(p_77617_1_, 0, 15);
        return this.icons[j];
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "_" + i;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        icons = new IIcon[amountOfSubBlocks];

        for(int i = 0; i < amountOfSubBlocks; ++i)
        {
            icons[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + i);
        }

    }
    @SideOnly(Side.CLIENT)
    @Override
    public abstract void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List flavorTextList, boolean par4);
}
