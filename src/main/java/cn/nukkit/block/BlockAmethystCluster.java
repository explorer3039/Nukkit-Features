package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;

public class BlockAmethystCluster extends BlockAmethystBud {

    @Override
    protected String getNamePrefix() {
        return "Cluster";
    }

    @Override
    public int getId() {
        return AMETHYST_CLUSTER;
    }

    @Override
    public int getLightLevel() {
        return 5;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[]{Item.get(ItemID.AMETHYST_SHARD, 0, 2)};
    }
}
