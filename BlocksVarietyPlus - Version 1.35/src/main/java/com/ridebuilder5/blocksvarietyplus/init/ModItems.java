package com.ridebuilder5.blocksvarietyplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.blocksvarietyplus.items.ItemBase;
import com.ridebuilder5.blocksvarietyplus.items.ItemHatchet;
import com.ridebuilder5.blocksvarietyplus.items.armor.ArmorBase;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolAxe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolHatchet;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolHoe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolPickaxe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolSpade;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolSword;
import com.ridebuilder5.blocksvarietyplus.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* MATERIALS (harvestLevel, maxUses, efficiency, damage, enchantability
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	//Materials (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 0, 30, 1.0F, 0.0F, 10);
	public static final ToolMaterial MATERIAL_ELM = EnumHelper.addToolMaterial("material_elm", 0, 90, 3.0F, 0.3F, 17);
	public static final ToolMaterial MATERIAL_CHERRY = EnumHelper.addToolMaterial("material_cherry", 0, 90, 3.0F, 0.6F, 17);
	public static final ToolMaterial MATERIAL_MARBLE = EnumHelper.addToolMaterial("material_marble", 1, 145, 4.5F, 1.8F, 13);
	public static final ToolMaterial MATERIAL_GAD = EnumHelper.addToolMaterial("material_gad", 1, 138, 4.3F, 1.4F, 8);
	public static final ToolMaterial MATERIAL_KATANA = EnumHelper.addToolMaterial("material_katana", 2, 500, 7.0F, 4.0F, 15);
	
	public static final ToolMaterial MATERIAL_SANDSTONE = EnumHelper.addToolMaterial("material_sandstone", 1, 59, 5.0F, 1.5F, 15);
	public static final ToolMaterial MATERIAL_NETHERRACK = EnumHelper.addToolMaterial("material_netherrack", 1, 10, 9.0F, 1.0F, 10);
	
	public static final ToolMaterial MATERIAL_ZINC = EnumHelper.addToolMaterial("material_zinc", 1, 151, 4.25F, 1.2F, 10);
	public static final ToolMaterial MATERIAL_TIN = EnumHelper.addToolMaterial("material_tin", 1, 181, 4.75F, 1.4F, 10);
	public static final ToolMaterial MATERIAL_ALUMINUM = EnumHelper.addToolMaterial("material_aluminum", 1, 211, 5.0F, 1.6F, 10);
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 231, 5.5F, 1.8F, 10);
	public static final ToolMaterial MATERIAL_LEAD = EnumHelper.addToolMaterial("material_lead", 2, 350, 6.5F, 2.3F, 15);
	public static final ToolMaterial MATERIAL_OSMIUM = EnumHelper.addToolMaterial("material_osmium", 2, 500, 7.0F, 2.5F, 15);
	public static final ToolMaterial MATERIAL_ELECTRUM = EnumHelper.addToolMaterial("material_electrum", 2, 800, 7.5F, 2.7F, 15);
	public static final ToolMaterial MATERIAL_URANIUM = EnumHelper.addToolMaterial("material_uranium", 3, 2061, 8.5F, 4.0F, 12);
	
	/* ARMOR MATERIALS (name, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness
	 * LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 */
	//Armor Materials (name, textureName, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness
	public static final ArmorMaterial ARMOR_MATERIAL_OAK = EnumHelper.addArmorMaterial("armor_material_oak", Reference.MOD_ID + ":oak", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SPRUCE = EnumHelper.addArmorMaterial("armor_material_spruce", Reference.MOD_ID + ":spruce", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BIRCH = EnumHelper.addArmorMaterial("armor_material_birch", Reference.MOD_ID + ":birch", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_JUNGLE = EnumHelper.addArmorMaterial("armor_material_jungle", Reference.MOD_ID + ":jungle", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ACACIA = EnumHelper.addArmorMaterial("armor_material_acacia", Reference.MOD_ID + ":acacia", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_DARKOAK = EnumHelper.addArmorMaterial("armor_material_darkoak", Reference.MOD_ID + ":darkoak", 8, new int[] {1, 1, 1, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_STONE = EnumHelper.addArmorMaterial("armor_material_stone", Reference.MOD_ID + ":stone", 13, new int[] {2, 3, 2, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_GRANITE = EnumHelper.addArmorMaterial("armor_material_granite", Reference.MOD_ID + ":granite", 13, new int[] {2, 3, 2, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ANDESITE = EnumHelper.addArmorMaterial("armor_material_andesite", Reference.MOD_ID + ":andesite", 13, new int[] {2, 3, 2, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_DIORITE = EnumHelper.addArmorMaterial("armor_material_diorite", Reference.MOD_ID + ":diorite", 13, new int[] {2, 3, 2, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	
	//Items
	public static final Item ELM_STICK = new ItemBase("elm_stick");
	public static final Item CHERRY_STICK = new ItemBase("cherry_stick");
	
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item ELECTRUM_INGOT = new ItemBase("electrum_ingot");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item OSMIUM_INGOT = new ItemBase("osmium_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
	public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");
	
	//Tools
	public static final ItemHatchet FLINT_HATCHET = new ToolHatchet("flint_hatchet", MATERIAL_FLINT);
	
	public static final ItemSword ELM_SWORD = new ToolSword("elm_sword", MATERIAL_ELM);
	public static final ItemSpade ELM_SHOVEL = new ToolSpade("elm_shovel", MATERIAL_ELM);
	public static final ItemPickaxe ELM_PICKAXE = new ToolPickaxe("elm_pickaxe", MATERIAL_ELM);
	public static final ItemAxe ELM_AXE = new ToolAxe("elm_axe", MATERIAL_ELM);
	public static final ItemHoe ELM_HOE = new ToolHoe("elm_hoe", MATERIAL_ELM);
	public static final ItemSword ELM_KATANA = new ToolSword("elm_katana", MATERIAL_KATANA);
	
	public static final ItemSword CHERRY_SWORD = new ToolSword("cherry_sword", MATERIAL_CHERRY);
	public static final ItemSpade CHERRY_SHOVEL = new ToolSpade("cherry_shovel", MATERIAL_CHERRY);
	public static final ItemPickaxe CHERRY_PICKAXE = new ToolPickaxe("cherry_pickaxe", MATERIAL_CHERRY);
	public static final ItemAxe CHERRY_AXE = new ToolAxe("cherry_axe", MATERIAL_CHERRY);
	public static final ItemHoe CHERRY_HOE = new ToolHoe("cherry_hoe", MATERIAL_CHERRY);
	public static final ItemSword CHERRY_KATANA = new ToolSword("cherry_katana", MATERIAL_KATANA);
	
	public static final ItemSword MARBLE_SWORD = new ToolSword("marble_sword", MATERIAL_MARBLE);
	public static final ItemSpade MARBLE_SHOVEL = new ToolSpade("marble_shovel", MATERIAL_MARBLE);
	public static final ItemPickaxe MARBLE_PICKAXE = new ToolPickaxe("marble_pickaxe", MATERIAL_MARBLE);
	public static final ItemAxe MARBLE_AXE = new ToolAxe("marble_axe", MATERIAL_MARBLE);
	public static final ItemHoe MARBLE_HOE = new ToolHoe("marble_hoe", MATERIAL_MARBLE);
	
	public static final ItemSword GRANITE_SWORD = new ToolSword("granite_sword", MATERIAL_GAD);
	public static final ItemSpade GRANITE_SHOVEL = new ToolSpade("granite_shovel", MATERIAL_GAD);
	public static final ItemPickaxe GRANITE_PICKAXE = new ToolPickaxe("granite_pickaxe", MATERIAL_GAD);
	public static final ItemAxe GRANITE_AXE = new ToolAxe("granite_axe", MATERIAL_GAD);
	public static final ItemHoe GRANITE_HOE = new ToolHoe("granite_hoe", MATERIAL_GAD);
	
	public static final ItemSword ANDESITE_SWORD = new ToolSword("andesite_sword", MATERIAL_GAD);
	public static final ItemSpade ANDESITE_SHOVEL = new ToolSpade("andesite_shovel", MATERIAL_GAD);
	public static final ItemPickaxe ANDESITE_PICKAXE = new ToolPickaxe("andesite_pickaxe", MATERIAL_GAD);
	public static final ItemAxe ANDESITE_AXE = new ToolAxe("andesite_axe", MATERIAL_GAD);
	public static final ItemHoe ANDESITE_HOE = new ToolHoe("andesite_hoe", MATERIAL_GAD);
	
	public static final ItemSword DIORITE_SWORD = new ToolSword("diorite_sword", MATERIAL_GAD);
	public static final ItemSpade DIORITE_SHOVEL = new ToolSpade("diorite_shovel", MATERIAL_GAD);
	public static final ItemPickaxe DIORITE_PICKAXE = new ToolPickaxe("diorite_pickaxe", MATERIAL_GAD);
	public static final ItemAxe DIORITE_AXE = new ToolAxe("diorite_axe", MATERIAL_GAD);
	public static final ItemHoe DIORITE_HOE = new ToolHoe("diorite_hoe", MATERIAL_GAD);
	
	public static final ItemPickaxe SANDSTONE_PICKAXE = new ToolPickaxe("sandstone_pickaxe", MATERIAL_SANDSTONE);
	public static final ItemPickaxe NETHERRACK_PICKAXE = new ToolPickaxe("netherrack_pickaxe", MATERIAL_NETHERRACK);
	
	public static final ItemPickaxe ZINC_PICKAXE = new ToolPickaxe("zinc_pickaxe", MATERIAL_ZINC);
	public static final ItemPickaxe TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", MATERIAL_TIN);
	public static final ItemPickaxe ALUMINUM_PICKAXE = new ToolPickaxe("aluminum_pickaxe", MATERIAL_ALUMINUM);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemPickaxe LEAD_PICKAXE = new ToolPickaxe("lead_pickaxe", MATERIAL_LEAD);
	public static final ItemPickaxe OSMIUM_PICKAXE = new ToolPickaxe("osmium_pickaxe", MATERIAL_OSMIUM);
	public static final ItemPickaxe ELECTRUM_PICKAXE = new ToolPickaxe("electrum_pickaxe", MATERIAL_ELECTRUM);
	public static final ItemPickaxe URANIUM_PICKAXE = new ToolPickaxe("uranium_pickaxe", MATERIAL_URANIUM);
	
	//Armor
	public static final Item OAK_HELMET = new ArmorBase("oak_helmet", ARMOR_MATERIAL_OAK, 1, EntityEquipmentSlot.HEAD);
	public static final Item OAK_CHESTPLATE = new ArmorBase("oak_chestplate", ARMOR_MATERIAL_OAK, 1, EntityEquipmentSlot.CHEST);
	public static final Item OAK_LEGGINGS = new ArmorBase("oak_leggings", ARMOR_MATERIAL_OAK, 2, EntityEquipmentSlot.LEGS);
	public static final Item OAK_BOOTS = new ArmorBase("oak_boots", ARMOR_MATERIAL_OAK, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SPRUCE_HELMET = new ArmorBase("spruce_helmet", ARMOR_MATERIAL_SPRUCE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPRUCE_CHESTPLATE = new ArmorBase("spruce_chestplate", ARMOR_MATERIAL_SPRUCE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPRUCE_LEGGINGS = new ArmorBase("spruce_leggings", ARMOR_MATERIAL_SPRUCE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPRUCE_BOOTS = new ArmorBase("spruce_boots", ARMOR_MATERIAL_SPRUCE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item BIRCH_HELMET = new ArmorBase("birch_helmet", ARMOR_MATERIAL_BIRCH, 1, EntityEquipmentSlot.HEAD);
	public static final Item BIRCH_CHESTPLATE = new ArmorBase("birch_chestplate", ARMOR_MATERIAL_BIRCH, 1, EntityEquipmentSlot.CHEST);
	public static final Item BIRCH_LEGGINGS = new ArmorBase("birch_leggings", ARMOR_MATERIAL_BIRCH, 2, EntityEquipmentSlot.LEGS);
	public static final Item BIRCH_BOOTS = new ArmorBase("birch_boots", ARMOR_MATERIAL_BIRCH, 1, EntityEquipmentSlot.FEET);
	
	public static final Item JUNGLE_HELMET = new ArmorBase("jungle_helmet", ARMOR_MATERIAL_JUNGLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item JUNGLE_CHESTPLATE = new ArmorBase("jungle_chestplate", ARMOR_MATERIAL_JUNGLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item JUNGLE_LEGGINGS = new ArmorBase("jungle_leggings", ARMOR_MATERIAL_JUNGLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item JUNGLE_BOOTS = new ArmorBase("jungle_boots", ARMOR_MATERIAL_JUNGLE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ACACIA_HELMET = new ArmorBase("acacia_helmet", ARMOR_MATERIAL_ACACIA, 1, EntityEquipmentSlot.HEAD);
	public static final Item ACACIA_CHESTPLATE = new ArmorBase("acacia_chestplate", ARMOR_MATERIAL_ACACIA, 1, EntityEquipmentSlot.CHEST);
	public static final Item ACACIA_LEGGINGS = new ArmorBase("acacia_leggings", ARMOR_MATERIAL_ACACIA, 2, EntityEquipmentSlot.LEGS);
	public static final Item ACACIA_BOOTS = new ArmorBase("acacia_boots", ARMOR_MATERIAL_ACACIA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item DARKOAK_HELMET = new ArmorBase("darkoak_helmet", ARMOR_MATERIAL_DARKOAK, 1, EntityEquipmentSlot.HEAD);
	public static final Item DARKOAK_CHESTPLATE = new ArmorBase("darkoak_chestplate", ARMOR_MATERIAL_DARKOAK, 1, EntityEquipmentSlot.CHEST);
	public static final Item DARKOAK_LEGGINGS = new ArmorBase("darkoak_leggings", ARMOR_MATERIAL_DARKOAK, 2, EntityEquipmentSlot.LEGS);
	public static final Item DARKOAK_BOOTS = new ArmorBase("darkoak_boots", ARMOR_MATERIAL_DARKOAK, 1, EntityEquipmentSlot.FEET);
	
	public static final Item STONE_HELMET = new ArmorBase("stone_helmet", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item STONE_CHESTPLATE = new ArmorBase("stone_chestplate", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item STONE_LEGGINGS = new ArmorBase("stone_leggings", ARMOR_MATERIAL_STONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item STONE_BOOTS = new ArmorBase("stone_boots", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item GRANITE_HELMET = new ArmorBase("granite_helmet", ARMOR_MATERIAL_GRANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item GRANITE_CHESTPLATE = new ArmorBase("granite_chestplate", ARMOR_MATERIAL_GRANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item GRANITE_LEGGINGS = new ArmorBase("granite_leggings", ARMOR_MATERIAL_GRANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item GRANITE_BOOTS = new ArmorBase("granite_boots", ARMOR_MATERIAL_GRANITE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ANDESITE_HELMET = new ArmorBase("andesite_helmet", ARMOR_MATERIAL_ANDESITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ANDESITE_CHESTPLATE = new ArmorBase("andesite_chestplate", ARMOR_MATERIAL_ANDESITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ANDESITE_LEGGINGS = new ArmorBase("andesite_leggings", ARMOR_MATERIAL_ANDESITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ANDESITE_BOOTS = new ArmorBase("andesite_boots", ARMOR_MATERIAL_ANDESITE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item DIORITE_HELMET = new ArmorBase("diorite_helmet", ARMOR_MATERIAL_DIORITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item DIORITE_CHESTPLATE = new ArmorBase("diorite_chestplate", ARMOR_MATERIAL_DIORITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item DIORITE_LEGGINGS = new ArmorBase("diorite_leggings", ARMOR_MATERIAL_DIORITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item DIORITE_BOOTS = new ArmorBase("diorite_boots", ARMOR_MATERIAL_DIORITE, 1, EntityEquipmentSlot.FEET);
}
