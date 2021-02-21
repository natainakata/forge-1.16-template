package net.natai.modtemplate.datagen.common.recipes;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class ModFurnaceRecipeProvider extends RecipeProvider {
    public ModFurnaceRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

    }
}
