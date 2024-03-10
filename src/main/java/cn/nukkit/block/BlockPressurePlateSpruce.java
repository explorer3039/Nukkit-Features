package cn.nukkit.block;

public class BlockPressurePlateSpruce extends BlockPressurePlateWood {
    public BlockPressurePlateSpruce() {
        // Does nothing
    }

    public BlockPressurePlateSpruce(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return SPRUCE_PRESSURE_PLATE;
    }

    @Override
    public String getName() {
        return "Spruce Pressure Plate";
    }

}
