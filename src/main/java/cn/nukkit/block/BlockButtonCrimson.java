package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonCrimson extends BlockButton {

    public BlockButtonCrimson() {
        this(0);
    }

    public BlockButtonCrimson(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return CRIMSON_BUTTON;
    }

    @Override
    public String getName() {
        return "Crimson Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
    
    @Override
    public int getBurnChance() {
        return 0;
    }

    @Override
    public int getBurnAbility() {
        return 0;
    }
}
