package cn.nukkit.block;

import cn.nukkit.item.Item;

public class BlockMossCarpet extends BlockCarpet {

    @Override
    public int getId() {
        return MOSS_CARPET;
    }

    @Override
    public double getResistance() {
        return 0.1;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[]{toItem()};
    }

    @Override
    public String getName() {
        return "Moss Carpet";
    }
}
