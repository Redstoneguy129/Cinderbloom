package enderman842.infernalhardship.blocks;

import enderman842.infernalhardship.IHBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class WitherslagFungus extends FlowerBlock {

	public WitherslagFungus(Properties properties) {
		super(Effects.SATURATION, 20, properties);
	}
	@Override
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == IHBlocks.witherslag;
	}

}
