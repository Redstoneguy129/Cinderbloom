package enderman842.infernalhardship;

import enderman842.infernalhardship.entities.BloodyCrab;
import enderman842.infernalhardship.entities.MagmaCrab;
import enderman842.infernalhardship.entities.NetherCrab;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;

public class ItemsNStuffRegistry {
	//Items
	public static Item stone_spear;
	public static Item iron_spear;
	public static Item golden_spear;
	public static Item diamond_spear;
	public static Item netherite_spear;
	public static Item scorched_egg;
	public static Item nether_crab_egg;
	public static Item magma_crab_egg;
	
	//BlockItems
	public static BlockItem enlightened_soulsand;
	public static BlockItem bloodstone;
	
	//Potions
	public static Potion lava_sight_potion;
	
	//PotionEffects
	public static Effect lava_sight_effect;
	
	//Entities
	//the scorched are an absolute NIGHTMARE to get working (still not working)
	@SuppressWarnings("unchecked")
	public static EntityType<NetherCrab> nether_crab = (EntityType<NetherCrab>) EntityType.Builder.create(NetherCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":nether_crab").setRegistryName(Main.location("nether_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<MagmaCrab> magma_crab = (EntityType<MagmaCrab>) EntityType.Builder.create(MagmaCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":magma_crab").setRegistryName(Main.location("magma_crab"));
	@SuppressWarnings("unchecked")
	public static EntityType<BloodyCrab> bloody_crab = (EntityType<BloodyCrab>) EntityType.Builder.create(BloodyCrab::new, EntityClassification.CREATURE).build(Main.MOD_ID + ":bloody_crab").setRegistryName(Main.location("bloody_crab"));
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int primaryColor, int secondaryColor, String name) {
		SpawnEggItem item = new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(Main.location(name));
		return item;
	}
	
	public static class LavaSightEffect extends Effect {
		public LavaSightEffect(EffectType typeIn, int liquidColorIn) {
			super(typeIn, liquidColorIn);
		}
		
	}
}
