package enderman842.infernalhardship;

import enderman842.infernalhardship.blocks.EnlightenedSoulsand;
import enderman842.infernalhardship.blocks.FlakedMagma;
import enderman842.infernalhardship.blocks.GildedRose;
import enderman842.infernalhardship.blocks.WitheredCampfire;
import enderman842.infernalhardship.blocks.WitheredLantern;
import enderman842.infernalhardship.blocks.WitheredTorch;
import enderman842.infernalhardship.blocks.WitherslagFungus;
import enderman842.infernalhardship.blocks.WitherslagRoots;
import enderman842.infernalhardship.blocks.WitherslagStem;
import enderman842.infernalhardship.stuff.IHMaterials;
import enderman842.infernalhardship.stuff.SpearItem;
import enderman842.infernalhardship.world.gen.IHGen;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventRegistry {
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				//items
				ItemsNStuffRegistry.stone_spear = new SpearItem(/*ItemTier.STONE, 0, 0, */new Item.Properties().maxStackSize(1).group(Main.cindertab)).setRegistryName(location("stone_spear")),
				ItemsNStuffRegistry.iron_spear = new SpearItem(/*ItemTier.IRON, 0, 0, */new Item.Properties().maxStackSize(1).group(Main.cindertab)).setRegistryName(location("iron_spear")),
				ItemsNStuffRegistry.golden_spear = new SpearItem(/*ItemTier.GOLD, 0, 0, */new Item.Properties().maxStackSize(1).group(Main.cindertab)).setRegistryName(location("golden_spear")),
				ItemsNStuffRegistry.diamond_spear = new SpearItem(/*ItemTier.DIAMOND, 0, 0, */new Item.Properties().maxStackSize(1).group(Main.cindertab)).setRegistryName(location("diamond_spear")),
				ItemsNStuffRegistry.netherite_spear = new SpearItem(/*ItemTier.DIAMOND, 1, 0, */new Item.Properties().maxStackSize(1).group(Main.cindertab)).setRegistryName(location("netherite_spear")),
				
				//Armor
				ItemsNStuffRegistry.infernal_helmet = new ArmorItem(IHMaterials.INFERNAL, EquipmentSlotType.HEAD, new Item.Properties().maxStackSize(1).group(null)).setRegistryName(Main.location("infernal_helmet")),
				
				//normal items :P
				ItemsNStuffRegistry.basalt_shard = new Item(new Item.Properties().group(null)).setRegistryName(Main.location("basalt_shard")),
				ItemsNStuffRegistry.fungal_stew = new Item(new Item.Properties().group(Main.cindertab).food(new Food.Builder().hunger(10).saturation(10.0F).build())).setRegistryName(Main.location("fungal_stew")),
				ItemsNStuffRegistry.withersalt = new Item(new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("withersalt")),
				ItemsNStuffRegistry.scorched_crab_leg = new Item(new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("scorched_crab_leg")),
				ItemsNStuffRegistry.molten_gold_ingot = new Item(new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("molten_gold_ingot")),
				ItemsNStuffRegistry.lanula_aurum = new Item(new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("lanula_aurum")),
				
				//blockitems
				ItemsNStuffRegistry.enlightened_soulsand = (BlockItem) new BlockItem(IHBlocks.enlightened_soulsand, new Item.Properties().group(Main.cindertab)).setRegistryName(IHBlocks.enlightened_soulsand.getRegistryName()),
				ItemsNStuffRegistry.bloodstone = (BlockItem) new BlockItem(IHBlocks.bloodstone, new Item.Properties().group(Main.cindertab)).setRegistryName(IHBlocks.bloodstone.getRegistryName()),
				ItemsNStuffRegistry.flaked_netherrack = (BlockItem) new BlockItem(IHBlocks.flaked_netherrack, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("flaked_netherrack")),
				ItemsNStuffRegistry.withered_campfire = (BlockItem) new BlockItem(IHBlocks.withered_campfire, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("withered_campfire")),
				ItemsNStuffRegistry.gilded_rose = (BlockItem) new BlockItem(IHBlocks.gilded_rose, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("gilded_rose")),
				ItemsNStuffRegistry.flaked_magma = (BlockItem) new BlockItem(IHBlocks.flaked_magma, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("flaked_magma")),
				ItemsNStuffRegistry.withered_lantern = (BlockItem) new BlockItem(IHBlocks.withered_lantern, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("withered_lantern")),
				ItemsNStuffRegistry.witherslag = (BlockItem) new BlockItem(IHBlocks.witherslag, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag")),
				ItemsNStuffRegistry.witherslag_stem = (BlockItem) new BlockItem(IHBlocks.witherslag_stem, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag_stem")),
				ItemsNStuffRegistry.witherslag_planks = (BlockItem) new BlockItem(IHBlocks.witherslag_planks, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag_planks")),
				ItemsNStuffRegistry.witherslag_wood = (BlockItem) new BlockItem(IHBlocks.witherslag_wood, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag_wood")),
				ItemsNStuffRegistry.stripped_witherslag_stem = (BlockItem) new BlockItem(IHBlocks.stripped_witherslag_stem, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("stripped_witherslag_stem")),
				ItemsNStuffRegistry.stripped_witherslag_wood = (BlockItem) new BlockItem(IHBlocks.stripped_witherslag_wood, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("stripped_witherslag_wood")),
				ItemsNStuffRegistry.witherslag_fungus = (BlockItem) new BlockItem(IHBlocks.witherslag_fungus, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag_fungus")),
				ItemsNStuffRegistry.witherslag_roots = (BlockItem) new BlockItem(IHBlocks.witherslag_roots, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("witherslag_roots")),
				ItemsNStuffRegistry.withered_torch = (BlockItem) new BlockItem(IHBlocks.withered_torch, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("withered_torch")),
				ItemsNStuffRegistry.geyser = (BlockItem) new BlockItem(IHBlocks.geyser, new Item.Properties().group(Main.cindertab)).setRegistryName(Main.location("geyser"))
				
				);
	}
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				//blocks
				IHBlocks.enlightened_soulsand = new EnlightenedSoulsand(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5F, 0.4F).harvestTool(ToolType.SHOVEL).sound(SoundType.SAND)).setRegistryName(location("enlightened_soulsand")),
				IHBlocks.bloodstone = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 2.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("bloodstone")),
				IHBlocks.flaked_netherrack = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F, 0.4F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(Main.location("flaked_netherrack")),
				IHBlocks.withered_campfire = new WitheredCampfire(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).lightValue(15).tickRandomly().notSolid()).setRegistryName(Main.location("withered_campfire")),
				IHBlocks.gilded_rose = new GildedRose(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0F).sound(SoundType.PLANT).notSolid().doesNotBlockMovement()).setRegistryName(Main.location("gilded_rose")),
				IHBlocks.flaked_magma = new FlakedMagma(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F, 0.5F).sound(SoundType.STONE)).setRegistryName(Main.location("flaked_magma")),
				IHBlocks.withered_lantern = new WitheredLantern(Block.Properties.create(Material.IRON).hardnessAndResistance(0F, 0F).sound(SoundType.METAL)).setRegistryName(Main.location("withered_lantern")),
				IHBlocks.witherslag = new Block(Block.Properties.create(Material.GOURD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.GROUND)).setRegistryName(Main.location("witherslag")),
				IHBlocks.witherslag_stem = new WitherslagStem(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)).setRegistryName(Main.location("witherslag_stem")),
				IHBlocks.witherslag_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)).setRegistryName(Main.location("witherslag_planks")),
				IHBlocks.witherslag_wood = new WitherslagStem(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)).setRegistryName(Main.location("witherslag_wood")),
				IHBlocks.stripped_witherslag_stem = new WitherslagStem(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)).setRegistryName(Main.location("stripped_witherslag_stem")),
				IHBlocks.stripped_witherslag_wood = new WitherslagStem(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)).setRegistryName(Main.location("stripped_witherslag_wood")),
				IHBlocks.witherslag_fungus = new WitherslagFungus(Block.Properties.create(Material.ORGANIC).lightValue(8).hardnessAndResistance(0F).sound(SoundType.PLANT).notSolid().doesNotBlockMovement()).setRegistryName(Main.location("witherslag_fungus")),
				IHBlocks.witherslag_roots = new WitherslagRoots(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0F).sound(SoundType.PLANT).notSolid().doesNotBlockMovement()).setRegistryName(Main.location("witherslag_roots")),
				IHBlocks.withered_torch = new WitheredTorch(Block.Properties.create(Material.WOOD).hardnessAndResistance(0F).sound(SoundType.WOOD).lightValue(12).notSolid().doesNotBlockMovement()).setRegistryName(Main.location("withered_torch")),
				IHBlocks.geyser = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5F).sound(SoundType.STONE).lightValue(15)).setRegistryName(Main.location("geyser"))
				);
	}
	
	@SubscribeEvent
	public static void registerPotions(final RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(
				//potions
				ItemsNStuffRegistry.lava_sight_potion = new Potion(new EffectInstance(ItemsNStuffRegistry.lava_sight_effect, 3600)).setRegistryName(location("lava_sight"))
				);
	}
	@SubscribeEvent
	public static void registerEffects(final RegistryEvent.Register<Effect> event) {
		event.getRegistry().registerAll(
				ItemsNStuffRegistry.lava_sight_effect = new ItemsNStuffRegistry.LavaSightEffect(EffectType.BENEFICIAL, 0xFF0000).setRegistryName(location("lava_sight"))
				);
	}
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				ItemsNStuffRegistry.nether_crab_egg = ItemsNStuffRegistry.registerEntitySpawnEgg(ItemsNStuffRegistry.nether_crab, 0xd6320c, 0xeb5d00, "nether_crab_egg"),
				ItemsNStuffRegistry.nether_crab_egg = ItemsNStuffRegistry.registerEntitySpawnEgg(ItemsNStuffRegistry.warped_fungi_crab, 0x000000, 0x000000, "warped_fungi_crab_egg")
				);
	}
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(
				//ItemsNStuffRegistry.scorched,
				ItemsNStuffRegistry.nether_crab,
				ItemsNStuffRegistry.magma_crab,
				ItemsNStuffRegistry.bloody_crab,
				ItemsNStuffRegistry.warped_fungi_crab,
				ItemsNStuffRegistry.crimson_fungi_crab,
				ItemsNStuffRegistry.charred,
				ItemsNStuffRegistry.witherslag_crab
				);
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		IHGen.generateOre();
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Main.MOD_ID, name);
	}
}
