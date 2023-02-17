package net.violencity.more_end.block.wood;

import net.minecraft.world.level.block.state.properties.WoodType;

public class EndWoodType {
    public static final WoodType AMETHYST;
    public static final WoodType CURSED;
    public static final WoodType ADESTINE;
    public static final WoodType YOSMITE;
    public static final WoodType SERDIC;
    public static final WoodType XENICIA;

    static {
        AMETHYST = WoodType.create("more_end:amethyst");
        CURSED = WoodType.create("more_end:cursed");
        ADESTINE = WoodType.create("more_end:adestine");
        YOSMITE = WoodType.create("more_end:yosmite");
        SERDIC = WoodType.create("more_end:serdic");
        XENICIA = WoodType.create("more_end:xenicia");
    }

}
