package net.lightningmines.mod.datagen;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.block.ModBlocks;
import net.lightningmines.mod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> BENITOITE_SMELTABLES = List.of(
            ModItems.RAW_BENITOITE.get(),
            ModBlocks.BENITOITE_ORE.get()
    );

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        // Smelting and blasting recipes
        oreSmelting(writer, BENITOITE_SMELTABLES, RecipeCategory.MISC, ModItems.BENITOITE.get(), 0.25f, 200, "benitoite");
        oreBlasting(writer, BENITOITE_SMELTABLES, RecipeCategory.MISC, ModItems.BENITOITE.get(), 0.25f, 100, "benitoite");

        // Blocks and raw block conversion
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BENITOITE_BLOCK.get())
                .pattern("AAA").pattern("AAA").pattern("AAA")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BENITOITE.get(), 9)
                .requires(ModBlocks.BENITOITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BENITOITE_BLOCK.get()), has(ModBlocks.BENITOITE_BLOCK.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BENITOITE_BLOCK.get())
                .pattern("AAA").pattern("AAA").pattern("AAA")
                .define('A', ModItems.RAW_BENITOITE.get())
                .unlockedBy(getHasName(ModItems.RAW_BENITOITE.get()), has(ModItems.RAW_BENITOITE.get()))
                .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BENITOITE.get(), 9)
                .requires(ModBlocks.RAW_BENITOITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BENITOITE_BLOCK.get()), has(ModBlocks.RAW_BENITOITE_BLOCK.get()))
                .save(writer);

        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_SWORD.get())
                .pattern("A").pattern("A").pattern("B")
                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_PICKAXE.get())
                .pattern("AAA").pattern(" B ").pattern(" B ")
                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

//        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_HAMMER.get())
//                .pattern("AAA").pattern("AAA").pattern(" B ")
//                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
//                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
//                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_AXE.get())
                .pattern("AA").pattern("AB").pattern(" B")
                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_SHOVEL.get())
                .pattern("A").pattern("B").pattern("B")
                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_HOE.get())
                .pattern("AA").pattern(" B").pattern(" B")
                .define('A', ModItems.BENITOITE.get()).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_HELMET.get())
                .pattern("AAA").pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_CHESTPLATE.get())
                .pattern("A A").pattern("AAA").pattern("AAA")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_LEGGINGS.get())
                .pattern("AAA").pattern("A A").pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_BOOTS.get())
                .pattern("A A").pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get()))
                .save(writer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> consumer, List<ItemLike> ingredients, RecipeCategory category,
                                      ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, ingredients, category, result,
                experience, cookingTime, group, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> consumer, List<ItemLike> ingredients, RecipeCategory category,
                                      ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, ingredients, category, result,
                experience, cookingTime, group, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> consumer,
                                     RecipeSerializer<? extends AbstractCookingRecipe> serializer,
                                     List<ItemLike> ingredients, RecipeCategory category, ItemLike result,
                                     float experience, int cookingTime, String group, String suffix) {
        for (ItemLike ing : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(ing), category, result,
                            experience, cookingTime, serializer)
                    .group(group)
                    .unlockedBy(getHasName(ing), has(ing))
                    .save(consumer, BenitoiteMod.MOD_ID + ":" + getItemName(result) + suffix + "_" + getItemName(ing));
        }
    }
}
