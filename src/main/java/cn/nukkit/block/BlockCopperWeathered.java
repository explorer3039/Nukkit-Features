package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperWeathered extends BlockCopper {
    public BlockCopperWeathered() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Weathered Copper";
    }

    @Override
    public int getId() {
        return WEATHERED_COPPER;
    }
}
