package com.nanaios.CompactMekanismMachinesPlus.common.registries;

import com.nanaios.CompactMekanismMachinesPlus.common.CompactMekanismMachinesPlus;
import com.nanaios.CompactMekanismMachinesPlus.common.tile.TileEntityCompactFusionReactor;
import mekanism.common.inventory.container.tile.EmptyTileContainer;
import mekanism.common.inventory.container.tile.MekanismTileContainer;
import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;

public class CompactPlusContainerTypes {
    public CompactPlusContainerTypes() {}

    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister(CompactMekanismMachinesPlus.MODID);

    public static final ContainerTypeRegistryObject<MekanismTileContainer<TileEntityCompactFusionReactor>> COMPACT_FUSION_REACTOR;
    public static final ContainerTypeRegistryObject<EmptyTileContainer<TileEntityCompactFusionReactor>> COMPACT_FUSION_REACTOR_FUEL;
    public static final ContainerTypeRegistryObject<EmptyTileContainer<TileEntityCompactFusionReactor>> COMPACT_FUSION_REACTOR_HEAT;
    public static final ContainerTypeRegistryObject<EmptyTileContainer<TileEntityCompactFusionReactor>> COMPACT_FUSION_REACTOR_STATS;

    static {
        COMPACT_FUSION_REACTOR = CONTAINER_TYPES.custom(CompactPlusBlocks.COMPACT_FUSION_REACTOR, TileEntityCompactFusionReactor.class).offset(5, 0).build();
        COMPACT_FUSION_REACTOR_FUEL = CONTAINER_TYPES.registerEmpty("compact_fusion_reactor_fuel", TileEntityCompactFusionReactor.class);
        COMPACT_FUSION_REACTOR_HEAT = CONTAINER_TYPES.registerEmpty("compact_fusion_reactor_heat", TileEntityCompactFusionReactor.class);
        COMPACT_FUSION_REACTOR_STATS = CONTAINER_TYPES.registerEmpty("compact_fusion_reactor_stats", TileEntityCompactFusionReactor.class);
    }
}
