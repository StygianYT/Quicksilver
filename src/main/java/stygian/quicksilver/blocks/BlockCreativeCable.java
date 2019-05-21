package stygian.quicksilver.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.energy.IEnergyStorage;

public class BlockCreativeCable extends Block implements IEnergyStorage {
	private int maxEnergyStored = Integer.MAX_VALUE;
	private int energyStored = 0;

	public BlockCreativeCable(Properties properties) {
		super(properties);
	}

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		int energyDifference = maxEnergyStored - energyStored;
		energyStored += maxReceive > energyDifference ? energyDifference : maxReceive;
		return (maxReceive > energyDifference)? energyDifference : maxReceive;
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {
		energyStored -= maxExtract > energyStored ? energyStored : maxExtract;
		return (maxExtract > energyStored)? energyStored : maxExtract;
	}

	@Override
	public int getEnergyStored() {
		return energyStored;
	}

	@Override
	public int getMaxEnergyStored() {
		return maxEnergyStored;
	}

	@Override
	public boolean canExtract() {
		return energyStored > 0;
	}

	@Override
	public boolean canReceive() {
		return energyStored < maxEnergyStored;
	}
}
