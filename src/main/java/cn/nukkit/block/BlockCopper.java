package cn.nukkit.block;

import cn.nukkit.event.block.BlockFadeEvent;
import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopper extends BlockSolid {
    public BlockCopper() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Block of Copper";
    }

    @Override
    public int getId() {
        return COPPER_BLOCK;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			BlockFadeEvent event = new BlockFadeEvent(this, get(EXPOSED_COPPER));
			level.getServer().getPluginManager().callEvent(event);
			if (!event.isCancelled()) {
				level.setBlock(this, event.getNewState(), true);
			}
			return Level.BLOCK_UPDATE_RANDOM;
        }
        return 0;
    }
}
