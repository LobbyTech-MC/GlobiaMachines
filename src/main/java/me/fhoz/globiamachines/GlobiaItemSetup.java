package me.fhoz.globiamachines;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.fhoz.globiamachines.machines.BudgetDustFabricator;
import me.fhoz.globiamachines.utils.GlobiaItems;

public final class GlobiaItemSetup {

    // ItemGroup
    private static final ItemGroup globiamachines = new ItemGroup(
            new NamespacedKey(GlobiaMachines.getInstance(), "globiaslimefun"),
            new CustomItemStack(Material.SMOKER, "&6全球机器")
    );


    private GlobiaItemSetup() {
    }

    public static void setup(@Nonnull GlobiaMachines plugin) {
        new BudgetDustFabricator(globiamachines, GlobiaItems.BUDGET_DUST_FABRICATOR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GRINDSTONE), new ItemStack(Material.GRINDSTONE),
                new ItemStack(Material.GRINDSTONE),
                SlimefunItems.GOLD_PAN, new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_PAN,
                SlimefunItems.MAGNET, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.MAGNET
        }).register(plugin);
    }

}
