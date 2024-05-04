package cn.nukkit.block;

public class BlockMangroveLog extends BlockWood {

    public BlockMangroveLog() {
        this(0);
    }

    public BlockMangroveLog(int meta) {
        super(meta);
    }

    @Override
    public double getHardness() {
        return 2;
    }

    @Override
    public double getResistance() {
        return 2;
    }

    @Override
    public int getBurnChance() {
        return 5;
    }

    @Override
    public int getBurnAbility() {
        return 10;
    }

    @Override
    public String getName() {
        return "Mangrove log";
    }

    @Override
    public int getId() {
        return MANGROVE_LOG;
    }

    @Override
    protected int getStrippedId() {
        return STRIPPED_MANGROVE_LOG;
    }
    
    @Override
    protected int getStrippedDamage() {
        return this.getDamage() & ~0x3;
    }
}
