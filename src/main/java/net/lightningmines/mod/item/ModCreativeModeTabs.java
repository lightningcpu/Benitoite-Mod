package net.lightningmines.mod.item;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BenitoiteMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BENITOITE_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("benitoite_items_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BENITOITE.get()))
                            .title(Component.translatable("creativetab.benitoitemod.benitoite_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.BENITOITE.get());
                                output.accept(ModItems.RAW_BENITOITE.get());
                                output.accept(ModBlocks.BENITOITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_BENITOITE_BLOCK.get());
                                output.accept(ModBlocks.BENITOITE_ORE.get());
                                output.accept(ModBlocks.BENITOITE_DEEPSLATE_ORE.get());
                            }).build());

    public static final RegistryObject<CreativeModeTab> BENITOITE_TOOLS_TAB =
            CREATIVE_MODE_TABS.register("benitoite_tools_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BENITOITE_PICKAXE.get()))
                            .withTabsBefore(BENITOITE_ITEMS_TAB.getId())
                            .title(Component.translatable("creativetab.benitoitemod.benitoite_tools"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.BENITOITE_SWORD.get());
                                output.accept(ModItems.BENITOITE_PICKAXE.get());
                                output.accept(ModItems.BENITOITE_AXE.get());
                                output.accept(ModItems.BENITOITE_SHOVEL.get());
                                output.accept(ModItems.BENITOITE_HOE.get());
                                output.accept(ModItems.BENITOITE_HAMMER.get());
                            }).build());

    public static final RegistryObject<CreativeModeTab> BENITOITE_ARMOR_TAB =
            CREATIVE_MODE_TABS.register("benitoite_armor_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BENITOITE_CHESTPLATE.get()))
                            .withTabsBefore(BENITOITE_TOOLS_TAB.getId())
                            .title(Component.translatable("creativetab.benitoitemod.benitoite_armor"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.BENITOITE_HELMET.get());
                                output.accept(ModItems.BENITOITE_CHESTPLATE.get());
                                output.accept(ModItems.BENITOITE_LEGGINGS.get());
                                output.accept(ModItems.BENITOITE_BOOTS.get());
                                output.accept(ModItems.BENITOITE_HORSE_ARMOR.get());
                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
