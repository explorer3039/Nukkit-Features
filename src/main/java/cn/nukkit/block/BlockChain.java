package cn.nukkit.block;


import cn.nukkit.Player;
import cn.nukkit.item.Item;
//import cn.nukkit.item.ItemChain;
import cn.nukkit.item.ItemTool;
import cn.nukkit.math.BlockFace;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class BlockChain extends BlockRotatedPillar {
    
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
    protected AxisAlignedBB recalculateBoundingBox() {
        switch (getDamage()) {
            default:
            case PILLAR_AXIS_Y:
                return new SimpleAxisAlignedBB(this.x + 6.5 / 16, this.y, this.z + 6.5 / 16, this.x + 1 - 6.5 / 16, this.y + 1, this.z + 1 - 6.5 / 16);
            case PILLAR_AXIS_X:
                return new SimpleAxisAlignedBB(this.x, this.y + 6.5 / 16, this.z + 6.5 / 16, this.x + 1, this.y + 1 - 6.5 / 16, this.z + 1 - 6.5 / 16);
            case PILLAR_AXIS_Z:
                return new SimpleAxisAlignedBB(this.x + 6.5 / 16, this.y + 6.5 / 16, this.z, this.x + 1 - 6.5 / 16, this.y + 1 - 6.5 / 16, this.z + 1);}
    }

    //@Override
    //public Item toItem() {
    //    return new ItemChain();
    //}

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public BlockColor getColor() {
        return BlockColor.AIR_BLOCK_COLOR;
    }
}
