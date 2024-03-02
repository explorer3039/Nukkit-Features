package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperOxidized extends BlockCopper {
    public BlockCopperOxidized() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Oxidized Copper";
    }

    @Override
    public int getId() {
        return OXIDIZED_COPPER;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.HONEYCOMB) {
            this.getLevel().setBlock(this, Block.get(BlockID.WAXED_OXIDIZED_COPPER), true, true);
            return true;
        }
        return false;
    }
}
