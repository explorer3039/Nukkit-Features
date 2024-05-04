package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;

public class BlockMangroveLeaves extends BlockLeaves {

    public static final int UPDATE_BIT = 0b1;
    public static final int PERSISTENT_BIT = 0b10;

    @Override
    public String getName() {
        return "Mangrove Leaves";
    }

    @Override
    public int getId() {
        return MANGROVE_LEAVES;
    }

    @Override
    protected Item getSapling() {
        return new ItemBlock(Block.get(MANGROVE_PROPAGULE));
    }

    @Override
    protected boolean canDropApple() {
        return false;
    }
}
