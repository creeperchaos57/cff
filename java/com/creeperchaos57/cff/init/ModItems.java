package com.creeperchaos57.cff.init;

import java.util.ArrayList;
import java.util.List;

import com.creeperchaos57.cff.items.ItemBase;
import com.creeperchaos57.cff.items.armor.ArmorBase;
import com.creeperchaos57.cff.items.food.BoxBase;
import com.creeperchaos57.cff.items.food.CanBase;
import com.creeperchaos57.cff.items.food.DrinkBase;
import com.creeperchaos57.cff.items.food.DrinkEffectBase;
import com.creeperchaos57.cff.items.food.FoodBase;
import com.creeperchaos57.cff.items.food.ItemTomato;
import com.creeperchaos57.cff.items.tools.ToolAxe;
import com.creeperchaos57.cff.items.tools.ToolHoe;
import com.creeperchaos57.cff.items.tools.ToolPickaxe;
import com.creeperchaos57.cff.items.tools.ToolSpade;
import com.creeperchaos57.cff.items.tools.ToolSword;
import com.creeperchaos57.cff.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();	
	
	//Materials
	
	public static final ToolMaterial MATERIAL_BACON = EnumHelper.addToolMaterial("material_bacon", 3, 70, 4.0f, 2.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_BACON = EnumHelper.addArmorMaterial("armor_material_bacon", Reference.MODID + ":bacon", 6, new int[] {2, 4, 3, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron", 2, 120, 6.0F, 1.5F, 14);
	
	//Items
	
	public static final Item CARDBOARD = new ItemBase("cardboard");
	public static final Item BOX = new ItemBase("box");
	public static final Item TOMATO_SEED = new ItemTomato("tomato_seed", 1, false);
	public static final Item CAN = new ItemBase("can");
	
	//Ores
	
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
	
	//Tools
	
	public static final ItemSword BACON_SWORD = new ToolSword("bacon_sword", MATERIAL_BACON);
	public static final ItemSpade BACON_SHOVEL = new ToolSpade("bacon_shovel", MATERIAL_BACON);
	public static final ItemPickaxe BACON_PICKAXE = new ToolPickaxe("bacon_pickaxe", MATERIAL_BACON);
	public static final ItemAxe BACON_AXE = new ToolAxe("bacon_axe", MATERIAL_BACON);
	public static final ItemHoe BACON_HOE = new ToolHoe("bacon_hoe", MATERIAL_BACON);
	public static final Item KNIFE = new ItemBase("knife").setContainerItem(ModItems.KNIFE).setMaxStackSize(1);
	
	//Armor
	
	public static final Item BACON_HELMET = new ArmorBase("bacon_helmet", ARMOR_MATERIAL_BACON, 1, EntityEquipmentSlot.HEAD);
	public static final Item BACON_CHESTPLATE = new ArmorBase("bacon_chestplate", ARMOR_MATERIAL_BACON, 1, EntityEquipmentSlot.CHEST);
	public static final Item BACON_LEGGINGS = new ArmorBase("bacon_leggings", ARMOR_MATERIAL_BACON, 2, EntityEquipmentSlot.LEGS);
	public static final Item BACON_BOOTS = new ArmorBase("bacon_boots", ARMOR_MATERIAL_BACON, 1, EntityEquipmentSlot.FEET);
	
	//Food
	
	public static final Item BACON = new FoodBase("bacon", 9, 8.0f, false);
	public static final Item BOX_OF_FRIES = new BoxBase("box_of_fries", 8, 5.0f, false);
	public static final Item FRY = new FoodBase("fry", 1, 2.4f, false);
	public static final Item TOMATO = new FoodBase("tomato", 4, 1.2f, false);
	public static final Item ORANGE = new FoodBase("orange", 4, 2.5f, false);
	public static final Item LETTUCE = new FoodBase("lettuce", 1, 0.6f, false);
	public static final Item BREAD_SLICE = new FoodBase("bread_slice", 1, 2.0f, false);
	public static final Item RAWPATTY = new FoodBase("raw_patty", 3, 1.8f, false);
	public static final Item PATTY = new FoodBase("patty", 8, 13f, false);
	public static final Item CHEESE = new FoodBase("cheese", 2, 1.2f, false);
	public static final Item BURGER = new FoodBase("burger", 13, 14.2f, false);
	public static final Item BUNS = new FoodBase("buns", 5, 6.2f, false);
	public static final Item BLT = new FoodBase("blt", 8, 5.0f, false);
	
	//Drinks
	
	public static final Item ENERGY_DRINK = new CanBase("energy_drink", 0, 18.0f, false, new PotionEffect(MobEffects.SPEED, (60*20), 0));
	
	public static final CreativeTabs tabCff = (new CreativeTabs("tabCff") 
	{
		
		@Override
		
		public ItemStack getTabIconItem() {
			
			return new ItemStack(BOX_OF_FRIES);
		}
	}
	
);
	
}

