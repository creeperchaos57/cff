package com.creeperchaos57.cff.init;

import java.util.ArrayList;
import java.util.List;

import com.creeperchaos57.cff.blocks.AluminumOre;
import com.creeperchaos57.cff.blocks.BlockBase;
import com.creeperchaos57.cff.blocks.BlockTomatoPlant;
import com.creeperchaos57.cff.blocks.FryerBlock;
import com.creeperchaos57.cff.blocks.GrinderBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	  public static final Block ALUMINUM_ORE = new AluminumOre("aluminum_ore", Material.ROCK);
	
	//Grinder
	  public static final Block GRINDER = new GrinderBlock("grinder", Material.IRON);
	
	//Fryer
	  public static final Block FRYER = new FryerBlock("fryer", Material.IRON);
	
	//Crops
	
		//Tomato
		  public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
}
