package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockFenceWarped extends BlockFence {

    public BlockFenceWarped() {
        this(0);
    }

    public BlockFenceWarped(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Warped Fence";
    }

    @Override
    public int getId() {
        return WARPED_FENCE;
    }

    @Override
    public Item[] getDrops(Item item) {
		return new Item[]{
				toItem()
		};
    }

    @Override
    public int getBurnChance() {
        return 0;
    }

    @Override
    public int getBurnAbility() {
        return 0;
    }
}
