package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockStairsCopperCut extends BlockStairs {
    public BlockStairsCopperCut() {
        this(0);
    }

    public BlockStairsCopperCut(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Cut Copper Stairs";
    }

    @Override
    public int getId() {
        return CUT_COPPER_STAIRS;
    }
}
