package group.trtimc.trailway;

// import mtr.data.Station;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
// import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Trailway implements ModInitializer {
    // public static final Item METROBLOCK_CAN = new Item(new FabricItemSettings()); // Guangzhou Metro Station name pole
    public static final Block METROBLOCK_CAN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final ItemGroup TRAILWAY = FabricItemGroupBuilder.build(
            new Identifier("trailway", "general"),
            () -> new ItemStack(Trailway.METROBLOCK_CAN_BLOCK)
    );

    @Override
    public void onInitialize() {
        System.out.println(" [TRailway] Hello World Love from XINTANG RAIL TRANSIT GROUP CO.LTD");
        Registry.register(Registry.BLOCK, new Identifier("trailway", "metroblock_can"), METROBLOCK_CAN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("trailway", "metroblock_can"), new BlockItem(METROBLOCK_CAN_BLOCK, new Item.Settings().group(Trailway.TRAILWAY)));
    }
}
