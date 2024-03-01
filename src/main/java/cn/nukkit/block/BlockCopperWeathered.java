package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
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
			this.getLevel().setBlock(this, Block.get(BlockID.OXIDIZED_COPPER));
			return 0;
        }
        return 0;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.HONEYCOMB) {
            this.getLevel().setBlock(this, Block.get(BlockID.WAXED_WEATHERED_COPPER), true, true);
        }
    }
}
