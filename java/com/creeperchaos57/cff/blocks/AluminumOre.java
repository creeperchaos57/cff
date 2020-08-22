package com.creeperchaos57.cff.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AluminumOre extends BlockBase
{
	public AluminumOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
}
