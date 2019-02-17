package com.chaosbuffalo.spartanbm.item;

import com.chaosbuffalo.spartanbm.SpartanBM;
import com.chaosbuffalo.spartanbm.utils;
import com.mcmoddev.basemetals.items.MMDToolEffects;
import com.mcmoddev.lib.item.MMDItemHelper;
import com.mcmoddev.lib.material.MMDMaterial;
import com.oblivioussp.spartanweaponry.item.ItemRapier;
import com.oblivioussp.spartanweaponry.api.DamageHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Jacob on 7/7/2018.
 */
public class ItemSpartanBMRapier extends ItemRapier {
    private final MMDMaterial mmd_mat;

    public ItemSpartanBMRapier(String unlocName, MMDMaterial material) {
        super(unlocName, SpartanBM.MODID, utils.spartanMatFromMMDMat(material),
                DamageHelper.getDamage(DamageHelper.WeaponType.RAPIER, material.getBaseAttackDamage()));
        mmd_mat = material;

    }

    @Override
    public boolean hitEntity(ItemStack item, EntityLivingBase target, EntityLivingBase attacker) {
        super.hitEntity(item, target, attacker);
        MMDToolEffects.extraEffectsOnAttack(this.mmd_mat, item, target, attacker);
        return true;
    }


    @Override
    public void onCreated(ItemStack item, World world, EntityPlayer crafter) {
        super.onCreated(item, world, crafter);
        MMDToolEffects.extraEffectsOnCrafting(this.mmd_mat, item, world, crafter);
    }

    @Override
    public void onUpdate(ItemStack item, World world, Entity player, int inventoryIndex, boolean isHeld) {
        super.onUpdate(item, world, player, inventoryIndex, isHeld);
        MMDItemHelper.doRegeneration(item, world, isHeld, this.mmd_mat.regenerates());
    }


    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        MMDToolEffects.addToolSpecialPropertiesToolTip(this.mmd_mat.getName(), tooltip);
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
