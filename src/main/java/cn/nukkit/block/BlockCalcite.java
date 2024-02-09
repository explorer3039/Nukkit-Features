package cn.nukkit.block;

import cn.nukkit.item.ItemTool;
import org.jetbrains.annotations.NotNull;

/**
 * @author LoboMetalurgico
 * @since 08/06/2021
 */

public class BlockCalcite extends BlockSolid {
    public BlockCalcite() {
    }

    @Override
    public String getName() {
        return "Calcite";
    }

    @Override
    public int getId() {
        return CALCITE;
    }

    @Override
    public double getHardness() {
        return 0.75;
    }

    @Override
    public double getResistance() {
        return 0.75;
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
