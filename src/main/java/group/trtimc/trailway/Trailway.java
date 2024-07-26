package group.trtimc.trailway;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Trailway implements ModInitializer {
    public static final Item METROBLOCK = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("trailway", "metroblock"), METROBLOCK);
    }
}
