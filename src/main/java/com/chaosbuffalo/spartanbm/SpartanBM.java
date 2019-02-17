package com.chaosbuffalo.spartanbm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SpartanBM.MODID, name = SpartanBM.NAME, version = SpartanBM.VERSION,
        dependencies="required-after:basemetals;required-after:spartanweaponry")
public class SpartanBM
{
    public static final String MODID = "spartanbm";
    public static final String NAME = "SpartanWeaponry-BaseMetals";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    public static final CreativeTabs creativeTab = new CreativeTabSpartanBM(MODID);
}
