package net.lightningmines.mod.datagen;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.block.ModBlocks;
import net.lightningmines.mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> BENITOITE_SMELTABLES = List.of(ModItems.RAW_BENITOITE.get(),
                ModBlocks.BENITOITE_ORE.get(), ModBlocks.BENITOITE_DEEPSLATE_ORE.get());

        oreSmelting(pRecipeOutput, BENITOITE_SMELTABLES, RecipeCategory.MISC, ModItems.BENITOITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pRecipeOutput, BENITOITE_SMELTABLES, RecipeCategory.MISC, ModItems.BENITOITE.get(), 0.25f, 100, "alexandrite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BENITOITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BENITOITE.get(), 9)
                .requires(ModBlocks.BENITOITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BENITOITE_BLOCK.get()), has(ModBlocks.BENITOITE_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BENITOITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_BENITOITE.get())
                .unlockedBy(getHasName(ModItems.RAW_BENITOITE.get()), has(ModItems.RAW_BENITOITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BENITOITE.get(), 9)
                .requires(ModBlocks.RAW_BENITOITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BENITOITE_BLOCK.get()), has(ModBlocks.RAW_BENITOITE_BLOCK.get())).save(pRecipeOutput);



        //Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" B ")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_AXE.get())
                .pattern("AA")
                .pattern("AB")
                .pattern(" B")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_SHOVEL.get())
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BENITOITE_HOE.get())
                .pattern("AA")
                .pattern(" B")
                .pattern(" B")
                .define('A', ModItems.BENITOITE.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);


        //Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BENITOITE_BOOTS.get())
                .pattern("  A")
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.BENITOITE.get())
                .unlockedBy(getHasName(ModItems.BENITOITE.get()), has(ModItems.BENITOITE.get())).save(pRecipeOutput);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, BenitoiteMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
