package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;

/**
 * @author explorer_3039
 * @since 2024/2/23
 */

public class BlockCopper extends BlockSolid {
    public BlockCopper() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Block of Copper";
    }

    @Override
    public int getId() {
        return COPPER_BLOCK;
    }
    
    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 6;
    }
    
    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM) {
			this.getLevel().setBlock(this, Block.get(BlockID.EXPOSED_COPPER), true, true);
			return 0;
        }
        return 0;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.HONEYCOMB) {
            this.getLevel().setBlock(this, Block.get(BlockID.WAXED_COPPER), true, true);
            return true;
        }
        return false;
    }
}
