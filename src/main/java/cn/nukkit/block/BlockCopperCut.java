package cn.nukkit.block;

import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCut extends BlockSolid {
    public BlockCopperCut() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Cut Copper";
    }

    @Override
    public int getId() {
        return CUT_COPPER;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			level.setBlock(this, Block.get(BlockID.EXPOSED_CUT_COPPER), true);
			return Level.BLOCK_UPDATE_RANDOM;
        }
        return 0;
    }

}
