package com.TheBig_Cheese.MoreMinecraft.items.tools;

import com.TheBig_Cheese.MoreMinecraft.Main;
import com.TheBig_Cheese.MoreMinecraft.init.ModItems;
import com.TheBig_Cheese.MoreMinecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class ToolAxe extends ItemAxe implements IHasModel{


public ToolAxe(String name, ToolMaterial material)
{

	super(material, 6.0F, -3.2F);
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
