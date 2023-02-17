package net.violencity.more_end.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MORE_END = new CreativeModeTab("more_end") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PURIFIED_ENDERITE.get());
        }
    };

}
