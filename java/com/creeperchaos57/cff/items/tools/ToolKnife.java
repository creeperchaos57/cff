package com.creeperchaos57.cff.items.tools;

import com.creeperchaos57.cff.Main;
import com.creeperchaos57.cff.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class ToolKnife extends ItemSword {
	
	public ToolKnife(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.tabCff);
	    this.setMaxStackSize(1);
	    this.setMaxDamage(100);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemstack){
        ItemStack stack = itemstack.copy();
        stack.attemptDamageItem(1, itemRand, null);
        return stack;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack){
		return true;
	}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
