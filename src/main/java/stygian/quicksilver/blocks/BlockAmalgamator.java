package stygian.quicksilver.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import stygian.quicksilver.blockentities.TileEntityAmalgamator;

public class BlockAmalgamator extends BlockContainer {

	public BlockAmalgamator(Properties properties) {
		super(properties);
	}
	
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return new TileEntityAmalgamator(null);
	}
}
