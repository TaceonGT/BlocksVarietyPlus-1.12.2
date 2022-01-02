package com.ridebuilder5.blocksvarietyplus.items.tools;

import com.ridebuilder5.blocksvarietyplus.Main;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;
import com.ridebuilder5.blocksvarietyplus.items.ItemHatchet;
import com.ridebuilder5.blocksvarietyplus.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;

public class ToolHatchet extends ItemHatchet implements IHasModel {

	public ToolHatchet(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BLOCKSVARIETYPLUSTOOLSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
