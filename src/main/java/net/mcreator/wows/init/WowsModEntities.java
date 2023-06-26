
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.wows.entity.UisEntity;
import net.mcreator.wows.entity.Q2Entity;
import net.mcreator.wows.entity.FbEntity;
import net.mcreator.wows.entity.DragonEntity;
import net.mcreator.wows.entity.BlueslmieEntity;
import net.mcreator.wows.WowsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WowsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WowsMod.MODID);
	public static final RegistryObject<EntityType<UisEntity>> UIS = register("uis",
			EntityType.Builder.<UisEntity>of(UisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UisEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueslmieEntity>> BLUESLMIE = register("blueslmie",
			EntityType.Builder.<BlueslmieEntity>of(BlueslmieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueslmieEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<Q2Entity>> Q_2 = register("projectile_q_2",
			EntityType.Builder.<Q2Entity>of(Q2Entity::new, MobCategory.MISC).setCustomClientFactory(Q2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FbEntity>> FB = register("projectile_fb",
			EntityType.Builder.<FbEntity>of(FbEntity::new, MobCategory.MISC).setCustomClientFactory(FbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DragonEntity>> DRAGON = register("dragon",
			EntityType.Builder.<DragonEntity>of(DragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonEntity::new).fireImmune().sized(10f, 10f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			UisEntity.init();
			BlueslmieEntity.init();
			DragonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(UIS.get(), UisEntity.createAttributes().build());
		event.put(BLUESLMIE.get(), BlueslmieEntity.createAttributes().build());
		event.put(DRAGON.get(), DragonEntity.createAttributes().build());
	}
}
