package com.saintlucifer.medievalmod;

import com.saintlucifer.medievalmod.proxy.CommonProxy;
import com.saintlucifer.medievalmod.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInt(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Int(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PostInt(FMLPostInitializationEvent event)
	{
		
	}
}