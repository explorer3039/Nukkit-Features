package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;
import cn.nukkit.level.Level;
import cn.nukkit.math.BlockFace;
import cn.nukkit.math.SimpleAxisAlignedBB;

import java.util.concurrent.ThreadLocalRandom;

public class BlockCandle extends BlockFlowable {

    public BlockCandle() {
        this(0);
    }

    protected BlockCandle(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return CANDLE;
    }

    @Override
    public String getName() {
        return "Candle";
    }

    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_NORMAL){
            Block down = this.down();
            if (!down.isSolid()) {
                this.getLevel().useBreakOn(this);
                return type;
            }
            return type;
        }
        return 0;
    }

    @Override
    public boolean place(Item item, Block block, Block target, BlockFace face, double fx, double fy, double fz, Player player) {
        if ((target.getId() == getId() || target.up().getId() == getId()) && (target.getDamage() & 0b11) < 3) {
            target.setDamage(target.getDamage() + 1);
            this.getLevel().setBlock(target, target, true, true);
            return true;
        }

        if (target.isSolid()){
            this.getLevel().setBlock(block, 0, this, true, true);
            return true;
        }
        return false;
    }

    @Override
    public boolean canBeActivated() {
        return true;
    }

    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.FLINT_AND_STEEL){ //lit
            BlockCandle block = (BlockCandle) this.clone();
            block.setDamage(block.getDamage() | 0b100);
        }
        else if (item.getId() == Item.AIR){ //unlit
            BlockCandle block = (BlockCandle) this.clone();
            block.setDamage(block.getDamage() & ~0b100);
        }
        return false;
    }

    @Override
    public int getWaterloggingLevel() {
        return 1;
    }

    @Override
    public int getLightLevel() {
        return (this.getDamage() + 1) * 3;
    }

    @Override
    public Item toItem() {
        return new ItemBlock(new BlockCandle());
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[]{ new ItemBlock(new BlockCandle(), 0, (this.getDamage() & 0x3) + 1) };
    }
}
