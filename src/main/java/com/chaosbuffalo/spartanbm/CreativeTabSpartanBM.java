package com.chaosbuffalo.spartanbm;

import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.data.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabSpartanBM extends CreativeTabs {
    public CreativeTabSpartanBM(String label) {super(label);}

    @Override
    public ItemStack getTabIconItem(){return new ItemStack(Materials.getMaterialByName(MaterialNames.COPPER).getItem(Names.AXE));}

}
