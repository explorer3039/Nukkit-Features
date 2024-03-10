package cn.nukkit.block;

/**
 * @author explorer_3039
 */
public class BlockStairsCrimson extends BlockStairsWood {

    public BlockStairsCrimson() {
        this(0);
    }

    public BlockStairsCrimson(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return CRIMSON_STAIRS;
    }

    @Override
    public String getName() {
        return "Crimson Stairs";
    }
    
    @Override
    public int getBurnChance() {
        return 0;
    }

    @Override
    public int getBurnAbility() {
        return 0;
    }
}
