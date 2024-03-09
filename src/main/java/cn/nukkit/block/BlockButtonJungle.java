package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author explorer_3039
 */
public class BlockButtonJungle extends BlockButton {

    public BlockButtonJungle() {
        this(0);
    }

    public BlockButtonJungle(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return JUNGLE_BUTTON;
    }

    @Override
    public String getName() {
        return "Jungle Button";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
}
