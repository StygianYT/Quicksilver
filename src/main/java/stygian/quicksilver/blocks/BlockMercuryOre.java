package stygian.quicksilver.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.common.ToolType;
import stygian.quicksilver.Reference;

public class BlockMercuryOre extends Block {

	public BlockMercuryOre() {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 15));
		this.setRegistryName(Reference.MODID, "MercuryOre");
	}
	
	@Override
	public int getHarvestLevel(IBlockState state) {
		return 1;
	}
	
	@Override
	public ToolType getHarvestTool(IBlockState state) {
		return ToolType.PICKAXE;
	}
}