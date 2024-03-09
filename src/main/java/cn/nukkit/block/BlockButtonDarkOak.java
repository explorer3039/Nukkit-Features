package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonDarkOak extends BlockButton {

    public BlockButtonDarkOak() {
        this(0);
    }

    public BlockButtonDarkOak(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return DARK_OAK_BUTTON;
    }

    @Override
    public String getName() {
        return "Dark Oak Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
}
