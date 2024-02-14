package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

public class BlockWallDeepslatePolished extends BlockWall {

    public BlockWallDeepslatePolished() {
        this(0);
    }

    public BlockWallDeepslatePolished(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Polished Deepslate Wall";
    }

    @Override
    public int getId() {
        return POLISHED_DEEPSLATE_WALL;
    }

    @Override
    public double getHardness() {
        return 3.5;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }
}
