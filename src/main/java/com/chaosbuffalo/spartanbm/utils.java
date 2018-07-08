package com.chaosbuffalo.spartanbm;

import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.lib.util.Oredicts;
import com.oblivioussp.spartanweaponry.util.ToolMaterialEx;

import javax.annotation.Nonnull;

/**
 * Created by Jacob on 7/6/2018.
 */
public class utils {

    public static ToolMaterialEx spartanMatFromMMDMat(MMDMaterial material){
        return new ToolMaterialEx(
                material.getName(),
                Oredicts.INGOT + material.getCapitalizedName(),
                SpartanBM.MODID,
                getSecondaryColor(material.getName()),
                material.getTintColor(),
                material.getToolHarvestLevel(),
                material.getToolDurability(),
                material.getToolEfficiency(),
                material.getBaseAttackDamage(),
                material.getEnchantability());
    }

    public static int getSecondaryColor(@Nonnull final String name) {
        switch (name) {
            case MaterialNames.ADAMANTINE:
                return 0xFF53393F;
            case MaterialNames.ANTIMONY:
                return 0xFFD8E3DE;
            case MaterialNames.AQUARIUM:
                return 0xFF0000FF;
            case MaterialNames.BISMUTH:
                return 0xFFDDD7CB;
            case MaterialNames.BRASS:
                return 0xFFFFE374;
            case MaterialNames.BRONZE:
                return 13407798;
            case MaterialNames.COLDIRON:
                return 0xFFC7CEF0;
            case MaterialNames.COPPER:
                return 16760986;
            case MaterialNames.CUPRONICKEL:
                return 0xFFC8AB6F;
            case MaterialNames.ELECTRUM:
                return 16777109;
            case MaterialNames.INVAR:
                return 14607328;
            case MaterialNames.LEAD:
                return 9150162;
            case MaterialNames.MERCURY:
                return 0xFFE2E2E2;
            case MaterialNames.MITHRIL:
                return 0xfff4ffff;
            case MaterialNames.NICKEL:
                return 16250827;
            case MaterialNames.PEWTER:
                return 0xFF92969F;
            case MaterialNames.PLATINUM:
                return 11200511;
            case MaterialNames.SILVER:
                return 16777215;
            case MaterialNames.STARSTEEL:
                return 0xFF53393F;
            case MaterialNames.STEEL:
                return 12500670;
            case MaterialNames.TIN:
                return 13816575;
            case MaterialNames.ZINC:
                return 0xFFBCBCBC;
            default:
                return 0x00000000;
        }
    }
}
