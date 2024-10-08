package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCutOxidized extends BlockCopperBase {
    public BlockCopperCutOxidized() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Cut Oxidized Copper";
    }

    @Override
    public int getId() {
        return OXIDIZED_CUT_COPPER;
    }
    
    @Override
    public boolean isFullyOxidized() {
        return true;
    }
}
