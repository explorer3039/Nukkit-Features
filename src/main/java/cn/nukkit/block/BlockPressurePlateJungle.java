package cn.nukkit.block;

public class BlockPressurePlateJungle extends BlockPressurePlateWood {
    public BlockPressurePlateJungle() {
        // Does nothing
    }

    public BlockPressurePlateJungle(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return JUNGLE_PRESSURE_PLATE;
    }

    @Override
    public String getName() {
        return "Jungle Pressure Plate";
    }

}
