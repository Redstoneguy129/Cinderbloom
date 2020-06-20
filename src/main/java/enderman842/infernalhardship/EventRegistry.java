package enderman842.infernalhardship;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventRegistry {
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				//items
				ItemsNStuffRegistry.stone_spear = new SwordItem(ItemTier.STONE, 0, 0, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(location("stone_spear")),
				ItemsNStuffRegistry.iron_spear = new SwordItem(ItemTier.IRON, 0, 0, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(location("iron_spear")),
				ItemsNStuffRegistry.golden_spear = new SwordItem(ItemTier.GOLD, 0, 0, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(location("golden_spear")),
				ItemsNStuffRegistry.diamond_spear = new SwordItem(ItemTier.DIAMOND, 0, 0, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(location("diamond_spear")),
				//ItemTier diamond is temporary (since 1.16 forge isnt out yet)
				ItemsNStuffRegistry.netherite_spear = new SwordItem(ItemTier.DIAMOND, 1, 0, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(location("netherite_spear")),
				
				//blockitems
				ItemsNStuffRegistry.enlightened_soulsand = (BlockItem) new BlockItem(IHBlocks.enlightened_soulsand, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(IHBlocks.enlightened_soulsand.getRegistryName()),
				ItemsNStuffRegistry.bloodstone = (BlockItem) new BlockItem(IHBlocks.bloodstone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(IHBlocks.bloodstone.getRegistryName())
				);
	}
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				//blocks
				IHBlocks.enlightened_soulsand = new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5F, 0.4F).sound(SoundType.SAND)).setRegistryName(location("enlightened_soulsand")),
				IHBlocks.bloodstone = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 2.0F).sound(SoundType.STONE)).setRegistryName(location("bloodstone"))
				);
	}
	
	@SubscribeEvent
	public static void registerPotions(final RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(
				//potions
				//Night Vision is temporary
				ItemsNStuffRegistry.lava_sight_potion = new Potion(new EffectInstance(ItemsNStuffRegistry.lava_sight_effect, 3600)).setRegistryName(location("lava_sight"))
				);
	}
	@SubscribeEvent
	public static void registerEffects(final RegistryEvent.Register<Effect> event) {
		event.getRegistry().registerAll(
				ItemsNStuffRegistry.lava_sight_effect = new ItemsNStuffRegistry.LavaSightEffect(EffectType.NEUTRAL, 0xFF0000).setRegistryName(location("lava_sight"))
				);
	}
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				ItemsNStuffRegistry.nether_crab_egg = ItemsNStuffRegistry.registerEntitySpawnEgg(ItemsNStuffRegistry.nether_crab, 0xd6320c, 0xeb5d00, "nether_crab_egg")
				);
	}
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(
				//ItemsNStuffRegistry.scorched,
				ItemsNStuffRegistry.nether_crab,
				ItemsNStuffRegistry.magma_crab,
				ItemsNStuffRegistry.bloody_crab
				);
	}
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Main.MOD_ID, name);
	}
}
