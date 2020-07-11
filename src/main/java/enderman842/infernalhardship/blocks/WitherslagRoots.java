package enderman842.infernalhardship.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class WitherslagRoots extends GrassBlock {
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D);
	public WitherslagRoots(Properties properties) {
		super(properties);
	}
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      Vec3d vec3d = state.getOffset(worldIn, pos);
	      return SHAPE.withOffset(vec3d.x, vec3d.y, vec3d.z);
	   }
	
}
