package com.TheBig_Cheese.MoreMinecraft.items.tools;

import com.TheBig_Cheese.MoreMinecraft.Main;
import com.TheBig_Cheese.MoreMinecraft.init.ModItems;
import com.TheBig_Cheese.MoreMinecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{


public ToolSword(String name, ToolMaterial material)
{

	super(material);
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
