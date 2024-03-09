package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonAcacia extends BlockButton {

    public BlockButtonAcacia() {
        this(0);
    }

    public BlockButtonAcacia(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return ACACIA_BUTTON;
    }

    @Override
    public String getName() {
        return "Acacia Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
}
