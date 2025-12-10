package com.yourname.gtaddon;

import net.minecraftforge.fml.common.Mod;
import org.gtlcore.recipe.Recipe;
import org.gtlcore.recipe.RecipeMaps;

@Mod("gtceum_speedup")
public class GTAddon {

    public GTAddon() {
        System.out.println("[GTCEu SpeedUp] Initializing...");

        RecipeMaps.ALL.forEach(map -> {
            for (Recipe recipe : map.getAllRecipes()) {
                recipe.setDuration(2); // 2 ticks = 0.1 sec
            }
        });

        System.out.println("[GTCEu SpeedUp] All recipes modified.");
    }
}
