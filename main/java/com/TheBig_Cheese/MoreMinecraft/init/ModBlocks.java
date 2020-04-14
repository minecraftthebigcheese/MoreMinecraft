package com.TheBig_Cheese.MoreMinecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.TheBig_Cheese.MoreMinecraft.blocks.BlockBase;
import com.TheBig_Cheese.MoreMinecraft.blocks.RubyBlock;
import com.TheBig_Cheese.MoreMinecraft.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
public static final List<Block> BLOCKS = new ArrayList<Block>();

//Blocks
public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
}
