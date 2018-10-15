package com.chaosbuffalo.spartanbm.init;

import com.chaosbuffalo.spartanbm.CreativeTabSpartanBM;
import com.chaosbuffalo.spartanbm.SpartanBM;
import com.chaosbuffalo.spartanbm.item.*;
import com.chaosbuffalo.spartanbm.utils;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
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
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.MITHRIL));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.OBSIDIAN));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.INVAR));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.COPPER));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.ADAMANTINE));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.BRONZE));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.BRASS));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.AQUARIUM));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.COLDIRON));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.ELECTRUM));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.NICKEL));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.LEAD));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.PLATINUM));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.SILVER));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.STARSTEEL));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.STEEL));
        MATERIALS_TO_REGISTER.add(Materials.getMaterialByName(MaterialNames.TIN));
    }


    public ItemRegistrySBM() {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {
        Set<Item> item_set = new HashSet<>();
        for (MMDMaterial mat : MATERIALS_TO_REGISTER){
            ItemSpartanBMKatana katana = new ItemSpartanBMKatana("katana_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(katana, katana.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(katana);
            ItemSpartanBMGreatsword greatsword = new ItemSpartanBMGreatsword("greatsword_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(greatsword, greatsword.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(greatsword);
            ItemSpartanBMLongsword longsword = new ItemSpartanBMLongsword("longsword_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(longsword, longsword.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(longsword);
            ItemSpartanBMSaber saber = new ItemSpartanBMSaber("saber_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(saber, saber.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(saber);
            ItemSpartanBMRapier rapier = new ItemSpartanBMRapier("rapier_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(rapier, rapier.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(rapier);
            ItemSpartanBMDagger dagger = new ItemSpartanBMDagger("dagger_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(dagger, dagger.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(dagger);
            ItemSpartanBMSpear spear = new ItemSpartanBMSpear("spear_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(spear, spear.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(spear);
            ItemSpartanBMPike pike = new ItemSpartanBMPike("pike_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(pike, pike.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(pike);
            ItemSpartanBMLance lance = new ItemSpartanBMLance("lance_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(lance, lance.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(lance);
            ItemSpartanBMHalberd halberd = new ItemSpartanBMHalberd("halberd_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(halberd, halberd.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(halberd);
            ItemSpartanBMWarhammer warhammer = new ItemSpartanBMWarhammer("warhammer_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(warhammer, warhammer.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(warhammer);
            ItemSpartanBMHammer hammer = new ItemSpartanBMHammer("hammer_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(hammer, hammer.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(hammer);
            ItemSpartanBMThrowingAxe throwing_axe = new ItemSpartanBMThrowingAxe("throwing_axe_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(throwing_axe, throwing_axe.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(throwing_axe);
            ItemSpartanBMThrowingKnife throwing_knife = new ItemSpartanBMThrowingKnife("throwing_knife_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(throwing_knife, throwing_knife.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(throwing_knife);
            ItemSpartanBMLongbow longbow = new ItemSpartanBMLongbow("longbow_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(longbow, longbow.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(longbow);
            ItemSpartanBMCrossbow crossbow = new ItemSpartanBMCrossbow("crossbow_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(crossbow, crossbow.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(crossbow);
            ItemSpartanBMJavelin javelin = new ItemSpartanBMJavelin("javelin_" + mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(javelin, javelin.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(javelin);
            ItemSpartanBMBattleAxe battle_axe = new ItemSpartanBMBattleAxe("battle_axe_"+ mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(battle_axe, battle_axe.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(battle_axe);
            ItemSpartanBMBoomerang boomerang = new ItemSpartanBMBoomerang("boomerang_"+ mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(boomerang, boomerang.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(boomerang);
            ItemSpartanBMMace mace = new ItemSpartanBMMace("mace_"+ mat.getName(), mat);
            ModelRenderRegistry.addItemToRegistry(mace, mace.getRegistryName(), utils.spartanMatFromMMDMat(mat));
            item_set.add(mace);



        }
        for (Item it : item_set){
            it.setCreativeTab(SpartanBM.creativeTab);
            ev.getRegistry().register(it);
        }
    }
}
