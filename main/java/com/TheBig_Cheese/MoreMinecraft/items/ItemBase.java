package com.TheBig_Cheese.MoreMinecraft.items;

import com.TheBig_Cheese.MoreMinecraft.Main;
import com.TheBig_Cheese.MoreMinecraft.init.ModItems;
import com.TheBig_Cheese.MoreMinecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

public ItemBase(String name)
{
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MATERIALS);
	
	ModItems.ITEMS.add(this);
}

	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
