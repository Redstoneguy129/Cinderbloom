package enderman842.infernalhardship.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EnlightenedSoulsand extends SoulSandBlock {
	public EnlightenedSoulsand(Properties properties) {
		super(properties);
	}
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
		
	}
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
	      entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.10F, 0.25D));
	   }
}
