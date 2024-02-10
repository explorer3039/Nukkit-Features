package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCutWeathered extends BlockCopperCut {
    public BlockCopperCutWeathered() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Weathered Cut Copper";
    }

    @Override
    public int getId() {
        return WEATHERED_CUT_COPPER;
    }
}
