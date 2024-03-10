package cn.nukkit.block;

public class BlockPressurePlateBirch extends BlockPressurePlateWood {
    public BlockPressurePlateBirch() {
        // Does nothing
    }

    public BlockPressurePlateBirch(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return BIRCH_PRESSURE_PLATE;
    }

    @Override
    public String getName() {
        return "Birch Pressure Plate";
    }

}
