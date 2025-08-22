package mc.mdtc.Item;

import mc.mdtc.Mdtc;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    //金属锭
    public static final Item ALUMINUM_INGOT = registerItems("aluminum_ingot" , new Item(new Item.Settings()));       //铝锭
    public static final Item LEAD_INGOT = registerItems("lead_ingot" , new Item(new Item.Settings()));               //铅锭
    public static final Item SILVER_INGOT = registerItems("silver_ingot" , new Item(new Item.Settings()));           //银锭
    public static final Item TIN_INGOT = registerItems("tin_ingot" , new Item(new Item.Settings()));                 //锡锭
    public static final Item TUNGSTEN_INGOT = registerItems("tungsten_ingot" , new Item(new Item.Settings()));       //钨锭
    public static final Item ZINC_INGOT = registerItems("zinc_ingot" , new Item(new Item.Settings()));               //锌锭
    //类锭级产物
    public static final Item URANIUM_235 = registerItems("uranium_235" , new Item(new Item.Settings()));             //U235
    public static final Item URANIUM_238 = registerItems("uranium_238" , new Item(new Item.Settings()));             //U238

    //粗矿石
    public static final Item RAW_ALUMINUM =registerItems("raw_aluminum" , new Item(new Item.Settings()));            //粗铝
    public static final Item RAW_LEAD = registerItems("raw_lead" , new Item(new Item.Settings()));                   //粗铅
    public static final Item RAW_SILVER = registerItems("raw_silver" , new Item(new Item.Settings()));               //粗银
    public static final Item RAW_TIN = registerItems("raw_tin" , new Item(new Item.Settings()));                     //粗锡
    public static final Item RAW_TUNGSTEN = registerItems("raw_tungsten" , new Item(new Item.Settings()));           //粗钨
    public static final Item RAW_URANIUM = registerItems("raw_uranium" , new Item(new Item.Settings()));             //粗铀
    public static final Item RAW_ZINC = registerItems("raw_zinc" , new Item(new Item.Settings()));                   //粗锌

    //方块

    //方法初始化
    public static Item registerItems(String id , Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Mdtc.MOD_ID , id)), item);
    }

    public static void registerModItems(){
        Mdtc.LOGGER.info("物品注册");
    }
}
