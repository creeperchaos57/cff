package com.creeperchaos57.cff.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;

public class FryerBlock extends BlockBase
{
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public FryerBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(6.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
