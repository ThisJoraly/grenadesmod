package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> KOFFA
            = ITEMS.register("koffa", () -> new KoffaItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16)));

    public static final RegistryObject<Item> GRENADEV1
            = ITEMS.register("grenadev1", () -> new GrenadeV1Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(3)));
    public static final RegistryObject<Item> GRENADEV2
            = ITEMS.register("grenadev2", () -> new GrenadeV2Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(3)));
    public static final RegistryObject<Item> GRENADEV3
            = ITEMS.register("grenadev3", () -> new GrenadeV3Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(3)));
    public static final RegistryObject<Item> GRENADEV4
            = ITEMS.register("grenadev4", () -> new GrenadeV4Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(3)));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}