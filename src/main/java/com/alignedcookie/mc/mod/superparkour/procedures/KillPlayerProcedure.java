package com.alignedcookie.mc.mod.superparkour.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.alignedcookie.mc.mod.superparkour.AcspModElements;

@AcspModElements.ModElement.Tag
public class KillPlayerProcedure extends AcspModElements.ModElement {
	public KillPlayerProcedure(AcspModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KillPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		DamageSource ParkourDeath = new DamageSource("parkour_death").setDamageBypassesArmor();
		entity.attackEntityFrom(ParkourDeath,100);
	}
}
