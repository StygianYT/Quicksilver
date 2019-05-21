package stygian.quicksilver.init;

import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import stygian.quicksilver.Quicksilver;
import stygian.quicksilver.blocks.BlockBatteryUnit;
import stygian.quicksilver.blocks.BlockMercuryOre;

public class ModBlocks {	
	public static BlockMercuryOre mercuryOre = new BlockMercuryOre();
	//public static BlockAmalgamator amalgamator;
	/*public static BlockIronCable ironCable;
	public static BlockGoldCable goldCable;
	public static BlockDiamondCable diamondCable;
	public static BlockCreativeCable creativeCable;*/
	public static BlockBatteryUnit batteryUnit;
	
	public static class Register {
		@SubscribeEvent
		public static void registerBlock(final RegistryEvent.Register<Block> e) {
			final Block[] blocks = {
				mercuryOre
			};
			
			e.getRegistry().registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlock(final RegistryEvent.Register<Item> e) {
			final ItemBlock[] itemBlocks = {
				new ItemBlock(mercuryOre, new Item.Properties().rarity(EnumRarity.UNCOMMON).group(Quicksilver.tab))
			};
			
			for(final ItemBlock item : itemBlocks) {
				final Block block = item.getBlock();
				final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block has a null registry name", block);
				e.getRegistry().register(item.setRegistryName(registryName));
			}
			registerTileEntities();
		}
		
		private static void registerTileEntities() {
			
		}
	}
}