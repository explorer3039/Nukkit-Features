package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonBirch extends BlockButton {

    public BlockButtonBirch() {
        this(0);
    }

    public BlockButtonBirch(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return BIRCH_BUTTON;
    }

    @Override
    public String getName() {
        return "Birch Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
}
