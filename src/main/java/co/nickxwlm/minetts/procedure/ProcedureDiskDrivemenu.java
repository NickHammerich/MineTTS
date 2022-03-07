package co.nickxwlm.minetts.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import co.nickxwlm.minetts.gui.GuiDiskDriveslot;
import co.nickxwlm.minetts.MinettsMod;
import co.nickxwlm.minetts.ElementsMinettsMod;

@ElementsMinettsMod.ModElement.Tag
public class ProcedureDiskDrivemenu extends ElementsMinettsMod.ModElement {
	public ProcedureDiskDrivemenu(ElementsMinettsMod instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DiskDrivemenu!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DiskDrivemenu!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DiskDrivemenu!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DiskDrivemenu!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DiskDrivemenu!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(MinettsMod.instance, GuiDiskDriveslot.GUIID, world, x, y, z);
	}
}
