package me.fhoz.globiamachines.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public final class Constants {

    public static final int SERVER_VERSION = Integer.parseInt(Bukkit.getVersion().replaceFirst(".*MC: ", "").replace(
        ")", "").replace(".", ""));

    public static final String SLIMEFUN_VERSION = Slimefun.getVersion();
    public static boolean SLIMEFUN_UPDATED = false;

    public static final Pattern VERSION_PATTERN = Pattern.compile("(DEV - )([0-9]+)");

    public static final boolean isNCPInstalled = Bukkit.getPluginManager().isPluginEnabled("NoCheatPlus");

    public static final List<SlimefunItemStack> dusts = new ArrayList<>(Arrays.asList(
        SlimefunItems.COPPER_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.IRON_DUST,
        SlimefunItems.LEAD_DUST, SlimefunItems.ALUMINUM_DUST, SlimefunItems.ZINC_DUST,
        SlimefunItems.TIN_DUST, SlimefunItems.MAGNESIUM_DUST, SlimefunItems.SILVER_DUST
    ));

    public static final int MAX_STACK_SIZE = 64;

    private Constants() {}

}
