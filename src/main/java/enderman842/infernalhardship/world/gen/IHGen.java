package enderman842.infernalhardship.world.gen;

import enderman842.infernalhardship.IHBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class IHGen {
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			if(biome == Biomes.NETHER) {
				@SuppressWarnings("rawtypes")
				ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 126, 252));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, IHBlocks.flaked_netherrack.getDefaultState(), 45)).withPlacement(customConfig));
			}
		}
	}
}
