package enderman842.infernalhardship.stuff;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import enderman842.infernalhardship.Main;
import net.minecraft.util.LazyValue;
import java.util.function.Supplier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum IHMaterials implements IArmorMaterial {
	INFERNAL(Main.MOD_ID + ":infernal", 4, new int[]{0,0,0,999999999}, 999999999, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 9.999999999999999E+37F, () ->{
		return null;
	})
	;

	private static final int[] MAX_DAMAGE_ARRAY = new int[] {16,16,16,16};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantibility;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;
	
	private IHMaterials(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantibilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountArrayIn;
		this.enchantibility = enchantibilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
		
		
	}
	
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType arg0) {
		return this.damageReductionAmountArray[arg0.getIndex()];
	}

	@SuppressWarnings("static-access")
	@Override
	public int getDurability(EquipmentSlotType arg0) {
		return this.MAX_DAMAGE_ARRAY[arg0.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
	
}
