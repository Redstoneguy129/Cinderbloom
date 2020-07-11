package enderman842.infernalhardship;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CinderTab extends ItemGroup {
	public CinderTab() {
		super("cindertab");
	}
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemsNStuffRegistry.infernal_helmet);
	}
}
