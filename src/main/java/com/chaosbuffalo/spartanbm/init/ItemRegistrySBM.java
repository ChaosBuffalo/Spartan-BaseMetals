package com.chaosbuffalo.spartanbm.init;

import com.chaosbuffalo.spartanbm.CreativeTabSpartanBM;
import com.chaosbuffalo.spartanbm.SpartanBM;
import com.chaosbuffalo.spartanbm.item.*;
import com.chaosbuffalo.spartanbm.utils;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.lib.util.ConfigBase.Options;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jacob on 7/7/2018.
 */
@Mod.EventBusSubscriber
public class ItemRegistrySBM {
    public static final Set<MMDMaterial> MATERIALS_TO_REGISTER = new HashSet<>();

    static {
        if (Options.isMaterialEnabled("mithril")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.MITHRIL));
        }
        if (Options.isMaterialEnabled("obsidian")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.OBSIDIAN));
        }
        if (Options.isMaterialEnabled("invar")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.INVAR));
        }
        if (Options.isMaterialEnabled("copper")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.COPPER));
        }
        if (Options.isMaterialEnabled("adamantine")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.ADAMANTINE));
        }
        if (Options.isMaterialEnabled("bronze")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.BRONZE));
        }
        if (Options.isMaterialEnabled("brass")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.BRASS));
        }
        if (Options.isMaterialEnabled("aquarium")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.AQUARIUM));
        }
        if (Options.isMaterialEnabled("coldiron")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.COLDIRON));
        }
        if (Options.isMaterialEnabled("electrum")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.ELECTRUM));
        }
        if (Options.isMaterialEnabled("nickel")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.NICKEL));
        }
        if (Options.isMaterialEnabled("lead")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.LEAD));
        }
        if (Options.isMaterialEnabled("platinum")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.PLATINUM));
        }
        if (Options.isMaterialEnabled("silver")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.SILVER));
        }
        if (Options.isMaterialEnabled("starsteel")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.STARSTEEL));
        }
        if (Options.isMaterialEnabled("steel")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.STEEL));
        }
        if (Options.isMaterialEnabled("tin")) {
            MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.TIN));
        }
    }


    public ItemRegistrySBM() {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {
        Set<Item> item_set = new HashSet<>();
        for (MMDMaterial mat : MATERIALS_TO_REGISTER){
            if (!ConfigHandler.disableKatana) {
                ItemSpartanBMKatana katana = new ItemSpartanBMKatana("katana_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(katana, new ResourceLocation(SpartanBM.MODID, "katana_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(katana);
            }
            if (!ConfigHandler.disableGreatsword) {
                ItemSpartanBMGreatsword greatsword = new ItemSpartanBMGreatsword("greatsword_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(greatsword, new ResourceLocation(SpartanBM.MODID, "greatsword_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(greatsword);
            }
            if (!ConfigHandler.disableLongsword) {
                ItemSpartanBMLongsword longsword = new ItemSpartanBMLongsword("longsword_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(longsword, new ResourceLocation(SpartanBM.MODID, "longsword_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(longsword);
            }
            if (!ConfigHandler.disableSaber) {
                ItemSpartanBMSaber saber = new ItemSpartanBMSaber("saber_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(saber, new ResourceLocation(SpartanBM.MODID, "saber_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(saber);
            }
            if (!ConfigHandler.disableRapier) {
                ItemSpartanBMRapier rapier = new ItemSpartanBMRapier("rapier_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(rapier, new ResourceLocation(SpartanBM.MODID, "rapier_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(rapier);
            }
            if (!ConfigHandler.disableDagger) {
                ItemSpartanBMDagger dagger = new ItemSpartanBMDagger("dagger_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(dagger, new ResourceLocation(SpartanBM.MODID, "dagger_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(dagger);
            }
            if (!ConfigHandler.disableSpear) {
                ItemSpartanBMSpear spear = new ItemSpartanBMSpear("spear_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(spear, new ResourceLocation(SpartanBM.MODID, "spear_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(spear);
            }
            if (!ConfigHandler.disablePike) {
                ItemSpartanBMPike pike = new ItemSpartanBMPike("pike_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(pike, new ResourceLocation(SpartanBM.MODID, "pike_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(pike);
            }
            if (!ConfigHandler.disableLance) {
                ItemSpartanBMLance lance = new ItemSpartanBMLance("lance_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(lance, new ResourceLocation(SpartanBM.MODID, "lance_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(lance);
            }
            if (!ConfigHandler.disableHalberd) {
                ItemSpartanBMHalberd halberd = new ItemSpartanBMHalberd("halberd_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(halberd, new ResourceLocation(SpartanBM.MODID, "halberd_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(halberd);
            }
            if (!ConfigHandler.disableWarhammer) {
                ItemSpartanBMWarhammer warhammer = new ItemSpartanBMWarhammer("warhammer_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(warhammer, new ResourceLocation(SpartanBM.MODID, "warhammer_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(warhammer);
            }
            if (!ConfigHandler.disableHammer) {
                ItemSpartanBMHammer hammer = new ItemSpartanBMHammer("hammer_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(hammer, new ResourceLocation(SpartanBM.MODID, "hammer_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(hammer);
            }
            if (!ConfigHandler.disableThrowingAxe) {
                ItemSpartanBMThrowingAxe throwing_axe = new ItemSpartanBMThrowingAxe("throwing_axe_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_axe, new ResourceLocation(SpartanBM.MODID, "throwing_axe_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(throwing_axe);
            }
            if (!ConfigHandler.disableThrowingKnife) {
                ItemSpartanBMThrowingKnife throwing_knife = new ItemSpartanBMThrowingKnife("throwing_knife_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_knife, new ResourceLocation(SpartanBM.MODID, "throwing_knife_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(throwing_knife);
            }
            if (!ConfigHandler.disableLongbow) {
                ItemSpartanBMLongbow longbow = new ItemSpartanBMLongbow("longbow_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(longbow, new ResourceLocation(SpartanBM.MODID, "longbow_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(longbow);
            }
            if (!ConfigHandler.disableCrossbow) {
                ItemSpartanBMCrossbow crossbow = new ItemSpartanBMCrossbow("crossbow_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(crossbow, new ResourceLocation(SpartanBM.MODID, "crossbow_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(crossbow);
            }
            if (!ConfigHandler.disableJavelin) {
                ItemSpartanBMJavelin javelin = new ItemSpartanBMJavelin("javelin_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(javelin, new ResourceLocation(SpartanBM.MODID, "javelin_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(javelin);
            }
            if (!ConfigHandler.disableBattleaxe) {
                ItemSpartanBMBattleAxe battle_axe = new ItemSpartanBMBattleAxe("battle_axe_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(battle_axe, new ResourceLocation(SpartanBM.MODID, "battle_axe_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(battle_axe);
            }
            if (!ConfigHandler.disableBoomerang) {
                ItemSpartanBMBoomerang boomerang = new ItemSpartanBMBoomerang("boomerang_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(boomerang, new ResourceLocation(SpartanBM.MODID, "boomerang_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(boomerang);
            }
            if (!ConfigHandler.disableMace) {
                ItemSpartanBMMace mace = new ItemSpartanBMMace("mace_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(mace, new ResourceLocation(SpartanBM.MODID, "mace_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(mace);
            }
//            if (!ConfigHandler.disableParryingDagger){
//                ItemSpartanBMParryingDagger parrying_dagger = new ItemSpartanBMParryingDagger("parrying_dagger_" + mat.getName(), mat);
//                ModelRenderRegistry.addItemToRegistry(parrying_dagger, new ResourceLocation(SpartanBM.MODID, "parrying_dagger_custom"), utils.spartanMatFromMMDMat(mat));
//                item_set.add(parrying_dagger);
//            }
        }
        for (Item it : item_set){
            it.setCreativeTab(SpartanBM.creativeTab);
            ev.getRegistry().register(it);
        }
    }
}
