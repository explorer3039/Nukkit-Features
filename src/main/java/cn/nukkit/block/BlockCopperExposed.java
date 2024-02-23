package cn.nukkit.block;

import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperExposed extends BlockCopper {
    public BlockCopperExposed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Exposed Copper";
    }

    @Override
    public int getId() {
        return EXPOSED_COPPER;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			level.setBlock(this, Block.get(BlockID.WEATHERED_COPPER), true);
			return Level.BLOCK_UPDATE_RANDOM;
        }
        return 0;
    }
}
