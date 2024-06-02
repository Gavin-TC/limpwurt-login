package com.github.limpwurtlogin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LimpwurtLoginPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LimpwurtLoginPlugin.class);
		RuneLite.main(args);
	}
}