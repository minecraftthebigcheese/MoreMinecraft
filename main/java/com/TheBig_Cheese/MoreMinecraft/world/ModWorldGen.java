package com.TheBig_Cheese.MoreMinecraft.world;

import java.util.Random;

import com.TheBig_Cheese.MoreMinecraft.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int ChunkX, int ChunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
	if (world.provider.getDimension() == 0) {
		generateOverworld(random, ChunkX, ChunkZ, world, chunkGenerator, chunkProvider);
	}
	}
	
	private void generateOverworld(Random random, int ChunkX, int ChunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, ChunkX * 16, ChunkZ * 16, /*= min x coordinate*/ 16, /*max x coordiate */ 64, random.nextInt(/*max vein amount*/ 7) + /*min amount*/ 4, /*rarity diamond=16*/ 18);
}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++) {
BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
WorldGenMinable generator = new WorldGenMinable(ore, size);
	generator.generate(world, random, pos);
		}
	}
}

