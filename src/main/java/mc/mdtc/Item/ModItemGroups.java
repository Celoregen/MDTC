package mc.mdtc.Item;

import mc.mdtc.Mdtc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MATERIAL = Registry.register(Registries.ITEM_GROUP, Identifier.of(Mdtc.MOD_ID, "materials"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.materials"))
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALUMINUM_INGOT);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.ZINC_INGOT);

                        entries.add(ModItems.URANIUM_235);
                        entries.add(ModItems.URANIUM_238);
                        entries.add(ModItems.RAW_URANIUM);

                        entries.add(ModItems.RAW_ALUMINUM);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.RAW_ZINC);
                    }).build());
    public static void regesterItemGroups(){
        Mdtc.LOGGER.info("物品栏注册");
    }
}