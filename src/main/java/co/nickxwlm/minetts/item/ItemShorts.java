
package co.nickxwlm.minetts.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Map;
import java.util.HashMap;

import co.nickxwlm.minetts.procedure.ProcedureSamdisappear;
import co.nickxwlm.minetts.creativetab.TabTtsmodTab;
import co.nickxwlm.minetts.ElementsMinettsMod;

@ElementsMinettsMod.ModElement.Tag
public class ItemShorts extends ElementsMinettsMod.ModElement {
	@GameRegistry.ObjectHolder("minetts:shortshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("minetts:shortsbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("minetts:shortslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("minetts:shortsboots")
	public static final Item boots = null;
	public ItemShorts(ElementsMinettsMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SHORTS", "minetts:shortstxr", 0, new int[]{2, 0, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureSamdisappear.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("shortslegs").setRegistryName("shortslegs").setCreativeTab(TabTtsmodTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("minetts:shortslegs", "inventory"));
	}
}
