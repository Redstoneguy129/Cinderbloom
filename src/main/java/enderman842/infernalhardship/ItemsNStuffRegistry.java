package enderman842.infernalhardship;

import enderman842.infernalhardship.entities.BloodyCrab;
import enderman842.infernalhardship.entities.Charred;
import enderman842.infernalhardship.entities.CrimsonFungiCrab;
import enderman842.infernalhardship.entities.MagmaCrab;
import enderman842.infernalhardship.entities.NetherCrab;
import enderman842.infernalhardship.entities.Scorched;
import enderman842.infernalhardship.entities.WarpedFungiCrab;
import enderman842.infernalhardship.entities.WitherslagCrab;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.tags.FluidTags;

public class ItemsNStuffRegistry {
	//Items
	public static Item stone_spear;
	public static Item iron_spear;
	public static Item golden_spear;
	public static Item diamond_spear;
	public static Item netherite_spear;
	public static Item basalt_shard;
	public static Item fungal_stew;
	public static Item withersalt;
	public static Item scorched_crab_leg;
	public static Item infernal_helmet;
	public static Item molten_gold_ingot;
	public static Item lanula_aurum;
	
	//Spawn eggs
	public static Item scorched_egg;
	public static Item nether_crab_egg;
	public static Item magma_crab_egg;
	public static Item warped_fungi_crab_egg;
	
	//BlockItems
	public static BlockItem enlightened_soulsand;
	public static BlockItem bloodstone;
	public static BlockItem flaked_netherrack;
	public static BlockItem withered_campfire;
	public static BlockItem gilded_rose;
	public static BlockItem flaked_magma;
	public static BlockItem withered_lantern;
	public static BlockItem withered_torch;
	public static BlockItem witherslag;
	public static BlockItem witherslag_stem;
	public static BlockItem witherslag_planks;
	public static BlockItem witherslag_roots;
	public static BlockItem witherslag_fungus;
	public static BlockItem witherslag_sign;
	public static BlockItem witherslag_door;
	public static BlockItem witherslag_trapdoor;
	public static BlockItem stripped_witherslag_stem;
	public static BlockItem stripped_witherslag_wood;
	public static BlockItem witherwart_block;
	public static BlockItem witherslag_wood;
	public static BlockItem blackstone_forge;
	public static BlockItem geyser;
	
	
	//Potions
	public static Potion lava_sight_potion;
	
	//PotionEffects
	public static Effect lava_sight_effect;
	
	//Entities
	@SuppressWarnings("unchecked")
	public static EntityType<NetherCrab> nether_crab = (EntityType<NetherCrab>) EntityType.Builder.create(NetherCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":nether_crab").setRegistryName(Main.location("nether_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<MagmaCrab> magma_crab = (EntityType<MagmaCrab>) EntityType.Builder.create(MagmaCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":magma_crab").setRegistryName(Main.location("magma_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<BloodyCrab> bloody_crab = (EntityType<BloodyCrab>) EntityType.Builder.create(BloodyCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":bloody_crab").setRegistryName(Main.location("bloody_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<Scorched> scorched = (EntityType<Scorched>) EntityType.Builder.create(Scorched::new, EntityClassification.MONSTER).build(Main.MOD_ID + ":scorched").setRegistryName(Main.location("scorched"));
	@SuppressWarnings("unchecked")
	public static EntityType<WarpedFungiCrab> warped_fungi_crab = (EntityType<WarpedFungiCrab>) EntityType.Builder.create(WarpedFungiCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":warped_fungi_crab").setRegistryName(Main.location("warped_fungi_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<CrimsonFungiCrab> crimson_fungi_crab = (EntityType<CrimsonFungiCrab>) EntityType.Builder.create(CrimsonFungiCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":crimson_fungi_crab").setRegistryName(Main.location("crimson_fungi_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<Charred> charred = (EntityType<Charred>) EntityType.Builder.create(Charred::new, EntityClassification.MONSTER).build(Main.MOD_ID + ":charred").setRegistryName(Main.location("charred"));
	@SuppressWarnings("unchecked")
	public static EntityType<WitherslagCrab> witherslag_crab = (EntityType<WitherslagCrab>) EntityType.Builder.create(WitherslagCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":witherslag_crab").setRegistryName(Main.location("witherslag_crab"));
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int primaryColor, int secondaryColor, String name) {
		SpawnEggItem item = new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(Main.location(name));
		return item;
	}
	
	public static class LavaSightEffect extends Effect {
		public LavaSightEffect(EffectType typeIn, int liquidColorIn) {
			super(typeIn, liquidColorIn);
			/*ClientPlayerEntity player = Minecraft.getInstance().player;
			EntityViewRenderEvent.FogDensity event = null;
			EntityViewRenderEvent.FogDensity*/
	}

	    public static boolean canApply(PlayerEntity player) {
	        return player.areEyesInFluid(FluidTags.LAVA) && player.isPotionActive(Effects.FIRE_RESISTANCE);
	    }
	}
}
