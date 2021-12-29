package for_my_self.for_my_self;

import for_my_self.for_my_self.effects.FlightEffect;
import for_my_self.for_my_self.effects.ModEffect;
import for_my_self.for_my_self.items.ModItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class For_my_selfMod implements ModInitializer {

    public static final String MOD_ID = "for_my_self";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItem.ORB_OF_TEMPORARY_FLIGHT));


    @Override
    public void onInitialize() {
        //ITEMS
        Registry.register(Registry.ITEM,
                new Identifier(MOD_ID, "orb_of_temporary_flight"),
                ModItem.ORB_OF_TEMPORARY_FLIGHT);
        Registry.register(Registry.ITEM,
                new Identifier(MOD_ID, "bibliolith_of_experience"),
                ModItem.BIBLIOLITH_OF_EXPERIENCE);
        //EFFECTS
        Registry.register(Registry.STATUS_EFFECT,new Identifier(MOD_ID, "flight"), ModEffect.FLIGHT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, "exp"), ModEffect.EXP);
    }
}
