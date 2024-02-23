package cn.nukkit.block;

import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperWeathered extends BlockCopper {
    public BlockCopperWeathered() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Weathered Copper";
    }

    @Override
    public int getId() {
        return WEATHERED_COPPER;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			level.setBlock(this, Block.get(BlockID.OXIDIZED_COPPER), true);
			return Level.BLOCK_UPDATE_RANDOM;
        }
        return 0;
    }
}
