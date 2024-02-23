package cn.nukkit.block;

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
			level.setBlock(this, Block.get(BlockID.EXPOSED_COPPER), true);
			return Level.BLOCK_UPDATE_RANDOM;
        }
        return 0;
    }
}
