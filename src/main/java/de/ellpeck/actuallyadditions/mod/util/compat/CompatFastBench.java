package de.ellpeck.actuallyadditions.mod.util.compat;

import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import shadows.fastbench.gui.ContainerFastBench;
import shadows.fastbench.gui.GuiFastBench;

public class CompatFastBench {

	public static Container getFastBenchContainer(EntityPlayer p, World world, int x, int y, int z) {
		return new ContainerFastBench(p, world, x, y, z) {
			@Override
			public boolean canInteractWith(EntityPlayer playerIn) {
				return true;
			}
		};
	}

	@SideOnly(Side.CLIENT)
	public static Gui getFastBenchGui(EntityPlayer p, World world, int x, int y, int z) {
		return new GuiFastBench(p.inventory, world, new BlockPos(x, y, z));
	}

}
