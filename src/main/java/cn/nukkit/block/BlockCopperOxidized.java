package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperOxidized extends BlockCopperBase {
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
    public boolean isFullyOxidized() {
        return true;
    }
}
