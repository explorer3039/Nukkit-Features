package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperOxidizedWaxed extends BlockCopperBase {
    public BlockCopperOxidizedWaxed() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Waxed Oxidized Copper";
    }

    @Override
    public int getId() {
        return WAXED_OXIDIZED_COPPER;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.isAxe()) {
            this.getLevel().setBlock(this, Block.get(BlockID.OXIDIZED_COPPER), true, true);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean isFullyOxidized() {
        return true;
    }
}
