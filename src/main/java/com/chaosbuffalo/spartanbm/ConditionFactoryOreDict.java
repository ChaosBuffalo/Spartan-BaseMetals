package com.chaosbuffalo.spartanbm;

import com.google.gson.JsonObject;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.OreDictionary;

import java.util.function.BooleanSupplier;

/**
 * Created by Jacob on 7/7/2018.
 */
public class ConditionFactoryOreDict implements IConditionFactory {
    public ConditionFactoryOreDict() {
    }

    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        String oreDict = json.get("ore_dict").getAsString();
        boolean result = OreDictionary.doesOreNameExist(oreDict);
        return () -> {
            return result;
        };
    }
}
