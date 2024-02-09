package cn.nukkit.block;


import cn.nukkit.Player;
import cn.nukkit.item.Item;
//import cn.nukkit.item.ItemChain;
import cn.nukkit.item.ItemTool;
import cn.nukkit.math.BlockFace;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class BlockChain extends BlockTransparent {
    
    public BlockChain() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Chain";
    }

    @Override
    public int getId() {
        return CHAIN_BLOCK;
    }

    @Override
    public double getHardness() {
        return 5;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public double getMinX() {
        return x + 7/16.0;
    }

    @Override
    public double getMaxX() {
        return x + 9/16.0;
    }

    @Override
    public double getMinZ() {
        return z + 7/16.0;
    }

    @Override
    public double getMaxZ() {
        return z + 9/16.0;
    }

    //@Override
    //public Item toItem() {
    //    return new ItemChain();
    //}

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
}
