package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCut extends BlockCopperBase {
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
    
}
