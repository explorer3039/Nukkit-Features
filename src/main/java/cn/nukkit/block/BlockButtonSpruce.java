package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonSpruce extends BlockButton {

    public BlockButtonSpruce() {
        this(0);
    }

    public BlockButtonSpruce(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return SPRUCE_BUTTON;
    }

    @Override
    public String getName() {
        return "Spruce Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
}
