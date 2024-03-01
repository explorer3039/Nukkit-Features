package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCutExposed extends BlockCopperCut {
    public BlockCopperCutExposed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Exposed Cut Copper";
    }

    @Override
    public int getId() {
        return EXPOSED_CUT_COPPER;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			this.getLevel().setBlock(this, Block.get(BlockID.WEATHERED_CUT_COPPER));
			return 0;
        }
        return 0;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.HONEYCOMB) {
            this.getLevel().setBlock(this, Block.get(BlockID.WAXED_EXPOSED_CUT_COPPER), true, true);
        }
    }
}
