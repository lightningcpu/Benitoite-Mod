package net.lightningmines.mod.item;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        BenitoiteMod.MOD_ID);

        public static final RegistryObject<Item> BENITOITE = ITEMS.register("benitoite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_BENITOITE = ITEMS.register("raw_benitoite",
                        () -> new Item(new Item.Properties()));


        // TOOLS
        public static final RegistryObject<Item> BENITOITE_SWORD =
                ITEMS.register("benitoite_sword", () -> new SwordItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                3,
                                -2.4f
                        ))
                ));

        public static final RegistryObject<Item> BENITOITE_SHOVEL =
                ITEMS.register("benitoite_shovel", () -> new ShovelItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                1.5F,
                                -3.0F
                        ))
                ));

        public static final RegistryObject<Item> BENITOITE_PICKAXE =
                ITEMS.register("benitoite_pickaxe", () -> new PickaxeItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                1.0F,
                                -2.8F
                        ))
                ));

        public static final RegistryObject<Item> BENITOITE_AXE =
                ITEMS.register("benitoite_axe", () -> new AxeItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                5.0F,
                                -3.0F
                        ))
                ));

        public static final RegistryObject<Item> BENITOITE_HOE =
                ITEMS.register("benitoite_hoe", () -> new HoeItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                -4.0F,
                                0.0F
                        ))
                ));

        public static final RegistryObject<Item> BENITOITE_HAMMER =
                ITEMS.register("benitoite_hammer", () -> new HammerItem(
                        ModToolTiers.BENITOITE,
                        new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(
                                ModToolTiers.BENITOITE,
                                6.0F,
                                -3.5F
                        ))
                ));


        //Armor
        public static final RegistryObject<Item> BENITOITE_HELMET =
                ITEMS.register("benitoite_helmet", () -> new ArmorItem(
                        ModArmorMaterials.BENITOITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                        new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40))
                ));

        public static final RegistryObject<Item> BENITOITE_CHESTPLATE =
                ITEMS.register("benitoite_chestplate", () -> new ArmorItem(
                        ModArmorMaterials.BENITOITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                        new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))
                ));

        public static final RegistryObject<Item> BENITOITE_LEGGINGS =
                ITEMS.register("benitoite_leggings", () -> new ArmorItem(
                        ModArmorMaterials.BENITOITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                        new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40))
                ));

        public static final RegistryObject<Item> BENITOITE_BOOTS =
                ITEMS.register("benitoite_boots", () -> new ArmorItem(
                        ModArmorMaterials.BENITOITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                        new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40))
                ));

        public static final RegistryObject<Item> BENITOITE_HORSE_ARMOR =
                ITEMS.register("benitoite_horse_armor", () -> new AnimalArmorItem(
                        ModArmorMaterials.BENITOITE_ARMOR_MATERIAL,
                        AnimalArmorItem.BodyType.EQUESTRIAN,
                        false,
                        new Item.Properties().fireResistant().stacksTo(1)
                ));



        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }

}
