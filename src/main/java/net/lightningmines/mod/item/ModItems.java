package net.lightningmines.mod.item;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, BenitoiteMod.MOD_ID);

        public static final RegistryObject<Item> BENITOITE = ITEMS.register("benitoite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RAW_BENITOITE = ITEMS.register("raw_benitoite",
                () -> new Item(new Item.Properties()));


        public static final RegistryObject<Item> BENITOITE_SWORD = ITEMS.register("benitoite_sword",
                () -> new SwordItem(ModToolTiers.BENITOITE, 4, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_PICKAXE = ITEMS.register("benitoite_pickaxe",
                () -> new PickaxeItem(ModToolTiers.BENITOITE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_AXE = ITEMS.register("benitoite_axe",
                () -> new AxeItem(ModToolTiers.BENITOITE, 5.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_SHOVEL = ITEMS.register("benitoite_shovel",
                () -> new ShovelItem(ModToolTiers.BENITOITE, 1.5F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_HOE = ITEMS.register("benitoite_hoe",
                () -> new HoeItem(ModToolTiers.BENITOITE, -4, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> BENITOITE_HELMET = ITEMS.register("benitoite_helmet",
                () -> new ModArmorItem(ModArmorMaterials.BENITOITE, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_CHESTPLATE = ITEMS.register("benitoite_chestplate",
                () -> new ArmorItem(ModArmorMaterials.BENITOITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_LEGGINGS = ITEMS.register("benitoite_leggings",
                () -> new ArmorItem(ModArmorMaterials.BENITOITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_BOOTS = ITEMS.register("benitoite_boots",
                () -> new ArmorItem(ModArmorMaterials.BENITOITE, ArmorItem.Type.BOOTS, new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
