package cn.nukkit.block;

public class BlockPressurePlateCrimson extends BlockPressurePlateWood {
    public BlockPressurePlateCrimson() {
        // Does nothing
    }

    public BlockPressurePlateCrimson(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return CRIMSON_PRESSURE_PLATE;
    }

    @Override
    public String getName() {
        return "Crimson Pressure Plate";
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
