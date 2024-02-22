package cn.nukkit.item;

/**
 * @author explorer_3039
 */
public class ItemEchoShard extends Item {

    public ItemEchoShard() {
        this(0, 1);
    }

    public ItemEchoShard(Integer meta) {
        this(meta, 1);
    }

    public ItemEchoShard(Integer meta, int count) {
        super(ECHO_SHARD, 0, count, "Echo Shard");
    }
}
