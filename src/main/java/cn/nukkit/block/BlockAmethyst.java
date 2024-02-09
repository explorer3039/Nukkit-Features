package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author LoboMetalurgico
 * @since 08/06/2021
 */

public class BlockAmethyst extends BlockSolid {
    public BlockAmethyst() {
    }

    @Override
    public String getName() {
        return "Amethyst Block";
    }

    @Override
    public int getId() {
        return AMETHYST_BLOCK;
    }

    @Override
    public double getHardness() {
        return 1.5;
    }

    @Override
    public double getResistance() {
        return 1.5;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

}
