package com.creeperchaos57.cff.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GrinderBlock extends BlockBase
{

	public GrinderBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(6.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
