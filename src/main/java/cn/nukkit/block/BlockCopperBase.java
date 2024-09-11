package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;

public abstract class BlockCopperBase extends BlockSolid {
    public BlockCopperBase() {
        // Does nothing
    }
    
    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 6;
    }
    
    public boolean isWaxed() {
        return false;
    }
    
    public boolean isFullyOxidized() {
        return false;
    }
    
    @Override
    public int onUpdate(int type) {
        if (!isFullyOxidized()) {
            if (type == Level.BLOCK_UPDATE_RANDOM) {
                int newblockid = this.getId();
                this.getLevel().setBlock(this, Block.get(newblockid++));
                return 0;
            }
            return 0;
        }
        return 0;
    }
    
    @Override
    public boolean onActivate(Item item, Player player) {
        if (!this.isWaxed()) {
            if (item.getId() == Item.HONEYCOMB) {
                int newblockid = this.getId();
                this.getLevel().setBlock(this, Block.get(newblockid+=4));
                return true;
            }
            return false;
        }
        else {
            if (item.isAxe()) {
                int newblockid = this.getId();
                this.getLevel().setBlock(this, Block.get(newblockid-=4));
                return true;
            }
        }
        return false;
    }
}
