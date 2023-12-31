package me.fhoz.globiamachines.utils;

import org.bukkit.Material;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.fhoz.globiamachines.machines.BudgetDustFabricator;

/**
 * Specifies all plugin items
 */
public class GlobiaItems {

    private GlobiaItems() {
    }

    public static final SlimefunItemStack GLOBIAITEMS_BUDGET_DUST_FABRICATOR = new SlimefunItemStack("GLOBIAITEMS_BUDGET_DUST_FABRICATOR",
            Material.SMOKER,
            "&c预算粉尘泵",
            "",
            "&7一台集研磨、淘金、淘洗于一体的机器",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerBuffer(BudgetDustFabricator.CAPACITY),
            LoreBuilderDynamic.powerPerTick(BudgetDustFabricator.ENERGY_CONSUMPTION)
    );
}
