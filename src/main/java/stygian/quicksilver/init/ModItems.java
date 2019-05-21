package stygian.quicksilver.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModItems {

	public static Item iron_amalgam;
	public static Item gold_amalgam;
	public static Item diamond_amalgam;
	public static Item mercury;
	
	public void init() {
		iron_amalgam = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("IronAmalgam");
		gold_amalgam = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("GoldAmalgam");
		diamond_amalgam = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("DiamondAmalgam");
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(iron_amalgam, gold_amalgam, diamond_amalgam);
	}
}