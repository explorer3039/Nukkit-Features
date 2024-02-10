package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCut extends BlockSoild {
    public BlockCopperCut() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Cut Copper";
    }

    @Override
    public int getId() {
        return CUT_COPPER;
    }

}
