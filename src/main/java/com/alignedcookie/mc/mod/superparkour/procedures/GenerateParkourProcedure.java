package com.alignedcookie.mc.mod.superparkour.procedures;

import java.util.Map;

import com.alignedcookie.mc.mod.superparkour.AcspModElements;

@AcspModElements.ModElement.Tag
public class GenerateParkourProcedure extends AcspModElements.ModElement {
	public GenerateParkourProcedure(AcspModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenerateParkour!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenerateParkour!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenerateParkour!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double blocks = 0;
		double xpos = 0;
		double ypos = 0;
		double zpos = 0;
		xpos = (double) x;
		ypos = (double) y;
		zpos = (double) z;
		blocks = (double) ((Math.random() + 10) * 40);
		System.out.println((("Building parkour course at ") + "" + ((xpos)) + "" + (", ") + "" + ((ypos)) + "" + (", ") + "" + ((zpos)) + ""
				+ (" with ") + "" + ((blocks)) + "" + (" platforms")));
	}
}
