package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonWarped extends BlockButton {

    public BlockButtonWarped() {
        this(0);
    }

    public BlockButtonWarped(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WARPED_BUTTON;
    }

    @Override
    public String getName() {
        return "Warped Button";
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
