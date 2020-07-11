package enderman842.infernalhardship.blocks;

import enderman842.infernalhardship.IHBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GildedRose extends FlowerBlock {

	public GildedRose(Properties builder) {
		super(Effects.GLOWING, 1, builder);
		
	}
	@Override
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.SOUL_SAND || block == IHBlocks.enlightened_soulsand;
	}
	
}
