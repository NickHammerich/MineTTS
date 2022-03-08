package co.nickxwlm.minetts.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

import co.nickxwlm.minetts.item.ItemGimmetacos;
import co.nickxwlm.minetts.ElementsMinettsMod;

@ElementsMinettsMod.ModElement.Tag
public class ProcedureEraseTaco extends ElementsMinettsMod.ModElement {
	public ProcedureEraseTaco(ElementsMinettsMod instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EraseTaco!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGimmetacos.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemGimmetacos.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
