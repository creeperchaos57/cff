package com.creeperchaos57.cff.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.RAWPATTY, new ItemStack(ModItems.PATTY, 1), 30f);
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ModItems.CHEESE, 1), 20f);
	}
}
