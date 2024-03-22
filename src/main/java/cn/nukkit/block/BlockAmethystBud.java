package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.math.BlockFace;


public abstract class BlockAmethystBud extends BlockTransparentMeta {
    @Override
    public String getName() {
        return getNamePrefix() + " Amethyst Bud";
    }
    
    private static final short[] faces = new short[]{
            0,
            0,
            2,
            2,
            1,
            1
    };

    protected abstract String getNamePrefix();

    @Override
    public abstract int getId();

    @Override
    public int getWaterloggingLevel() {
        return 1;
    }

    @Override
    public double getHardness() {
        return 1.5;
    }

    @Override
    public double getResistance() {
        return 1.5;
    }

    @Override
    public abstract int getLightLevel();

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_IRON;
    }

    @Override
    public Item[] getDrops(Item item) {
        return Item.EMPTY_ARRAY;
    }

    @Override
    public boolean isSolid() {
        return false;
    }
    
    @Override
    public Item toItem() {
        return new ItemBlock(this, 0);
    }

    @Override
    public boolean place(Item item, Block block, Block target, BlockFace face, double fx, double fy, double fz, Player player) {
        if (!target.isSolid())
            return false;
        this.setDamage(faces[face.getIndex()]);
        this.level.setBlock(block, this, true, true);
        return true;
    }
}
