package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockStairsCopperCutWeathered extends BlockStairsCopperCut {
    public BlockStairsCopperCutWeathered() {
        this(0);
    }

    public BlockStairsCopperCutWeathered(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WEATHERED_CUT_COPPER_STAIRS;
    }

}
