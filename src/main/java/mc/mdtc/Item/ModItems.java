package mc.mdtc.Item;

import mc.mdtc.Mdtc;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LEAD_INGOT = registerItems("lead_ingot" , new Item(new Item.Settings()));


    public static Item registerItems(String id , Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Mdtc.MOD_ID , id)), item);
    }

    public static void registerModItems(){
        Mdtc.LOGGER.info("物品注册");
    }
}
