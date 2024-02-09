package cn.nukkit.block;

import cn.nukkit.item.Item;
import org.jetbrains.annotations.NotNull;

public class BlockAzaleaLeaves extends BlockLeaves {

    public BlockAzaleaLeaves() {
        this(0);
    }

    public BlockAzaleaLeaves(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return AZALEA_LEAVES;
    }

    @Override
    public String getName() {
        return "Azalea Leaves";
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    //@Override
    //protected Item getSapling() {
    //    return Block.get(AZALEA).toItem();
    //}
}
