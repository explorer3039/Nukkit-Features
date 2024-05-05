package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockFenceCrimson extends BlockFence {

    public BlockFenceCrimson() {
        this(0);
    }

    public BlockFenceCrimson(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Crimson Fence";
    }

    @Override
    public int getId() {
        return CRIMSON_FENCE;
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
