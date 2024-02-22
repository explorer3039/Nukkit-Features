package cn.nukkit.item;

/**
 * @author explorer_3039
 */
public class ItemRecoveryCompass extends Item {

    public ItemRecoveryCompass() {
        this(0, 1);
    }

    public ItemRecoveryCompass(Integer meta) {
        this(meta, 1);
    }

    public ItemRecoveryCompass(Integer meta, int count) {
        super(RECOVERY_COMPASS, 0, count, "Recovery Compass");
    }
}
