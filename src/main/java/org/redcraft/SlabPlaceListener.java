package org.redcraft;

import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.Slab.Type;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class SlabPlaceListener implements Listener {

    @EventHandler
    void onBlockPlace(BlockPlaceEvent event) {

        Player blockPlacer = event.getPlayer();

        // Player can cancel the slab shift bottom to top by sneaking.
        if (blockPlacer.isSneaking())
            return;

        Block blockPlaced = event.getBlock();
        BlockData blockPlacedData = blockPlaced.getBlockData();

        if (!(blockPlacedData instanceof Slab))
            return;

        Slab slab = (Slab) blockPlacedData;

        if (slab.getType() == Slab.Type.BOTTOM) {
            slab.setType(Slab.Type.TOP);

            event.getBlock().setBlockData(slab);
        }
    }

}
