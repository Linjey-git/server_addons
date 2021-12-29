package for_my_self.for_my_self.items;

import for_my_self.for_my_self.For_my_selfMod;
import for_my_self.for_my_self.items.custom.BibliolithOfExperienceItem;
import for_my_self.for_my_self.items.custom.OrbOfTemporaryFlightItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ModItem {

    public static final Item ORB_OF_TEMPORARY_FLIGHT = new OrbOfTemporaryFlightItem(new FabricItemSettings().group(For_my_selfMod.ITEM_GROUP).maxCount(1));
    public static final Item BIBLIOLITH_OF_EXPERIENCE = new BibliolithOfExperienceItem(new FabricItemSettings().group(For_my_selfMod.ITEM_GROUP).maxCount(1));
}
