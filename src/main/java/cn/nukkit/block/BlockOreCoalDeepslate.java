package cn.nukkit.block;

import cn.nukkit.item.ItemID;
import cn.nukkit.utils.BlockColor;
import cn.nukkit.utils.Utils;

public class BlockOreCoalDeepslate extends BlockOreCoal {

    public BlockOreCoalDeepslate() {
    }

    @Override
    public int getId() {
        return DEEPSLATE_COAL_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Coal Ore";
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.DEEPSLATE_BLOCK_COLOR;
    }
}
