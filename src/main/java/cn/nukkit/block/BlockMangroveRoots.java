package cn.nukkit.block;

import cn.nukkit.item.Item;

public class BlockMangroveRoots extends BlockTransparentMeta {
    public BlockMangroveRoots() {
        super(0);
    }

    @Override
    public String getName() {
        return "Mangrove Roots";
    }

    @Override
    public int getId() {
        return MANGROVE_ROOTS;
    }

    @Override
    public int getWaterloggingLevel() {
        return 1;
    }

    @Override
    public double getHardness() {
        return 0.7;
    }

    @Override
    public double getResistance() {
        return 0.7;
    }

    @Override
    public int getBurnChance() {
        return 5;
    }
}
