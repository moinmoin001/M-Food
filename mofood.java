package com.mofood;

import com.mofood.blocks.blockBarley;
import com.mofood.blocks.blockBarrel;
import com.mofood.blocks.blockBasilikum;
import com.mofood.blocks.blockChilli;
import com.mofood.blocks.blockErbse;
import com.mofood.blocks.blockGrill;
import com.mofood.blocks.blockGurke;
import com.mofood.blocks.blockRape;
import com.mofood.blocks.blockReis;
import com.mofood.blocks.blockRye;
import com.mofood.blocks.blockSalat;
import com.mofood.blocks.blockSpelt;
import com.mofood.blocks.blockTomate;
import com.mofood.gui.TileEntityBarrel;
import com.mofood.items.BarleyBread;
import com.mofood.items.Basilikum;
import com.mofood.items.BigBurger;
import com.mofood.items.Birne;
import com.mofood.items.Butterkecks;
import com.mofood.items.Chilli;
import com.mofood.items.Doener;
import com.mofood.items.Erbse;
import com.mofood.items.ErbsenSeed;
import com.mofood.items.ErdbeerMarmelade;
import com.mofood.items.Erdnussbutter;
import com.mofood.items.GersteMehl;
import com.mofood.items.Gurke;
import com.mofood.items.HotDog;
import com.mofood.items.HotDogKetchup;
import com.mofood.items.HotDogSenf;
import com.mofood.items.Kaese;
import com.mofood.items.Karamell;
import com.mofood.items.Karrottensuppen;
import com.mofood.items.Kartoffelsuppe;
import com.mofood.items.Ketchup;
import com.mofood.items.KirschMarmelade;
import com.mofood.items.Knife;
import com.mofood.items.KuerbisSuppe;
import com.mofood.items.LollyPop;
import com.mofood.items.MashedPotatos;
import com.mofood.items.NougatCreme;
import com.mofood.items.PizzaHawaii;
import com.mofood.items.PizzaMargarita;
import com.mofood.items.PizzaSalamie;
import com.mofood.items.PizzaThunfisch;
import com.mofood.items.Pommes;
import com.mofood.items.Punsch;
import com.mofood.items.Rape;
import com.mofood.items.Reis;
import com.mofood.items.ReisSeed;
import com.mofood.items.RinderHack;
import com.mofood.items.RyeBread;
import com.mofood.items.RyeMehl;
import com.mofood.items.Salamie;
import com.mofood.items.Salat;
import com.mofood.items.SalatSeed;
import com.mofood.items.SchokoMan;
import com.mofood.items.SchokoSosse;
import com.mofood.items.Schokolade;
import com.mofood.items.SchweineHack;
import com.mofood.items.Senf;
import com.mofood.items.SpeltBread;
import com.mofood.items.SpeltMehl;
import com.mofood.items.Tasse;
import com.mofood.items.TeigrohlingBarley;
import com.mofood.items.TeigrohlingRye;
import com.mofood.items.TeigrohlingSpelt;
import com.mofood.items.TeigrohlingWeizen;
import com.mofood.items.Toast;
import com.mofood.items.ToastNugat;
import com.mofood.items.Tomate;
import com.mofood.items.WeckGlass;
import com.mofood.items.WeizenMehl;
import com.mofood.items.Wurst;
import com.mofood.items.ZombieFleischEintopf;
import com.mofood.items.barley;
import com.mofood.items.barleySeed;
import com.mofood.items.basilikumSeed;
import com.mofood.items.chilliSeed;
import com.mofood.items.gurkenSeed;
import com.mofood.items.moerser;
import com.mofood.items.rapeSeed;
import com.mofood.items.rye;
import com.mofood.items.ryeSeed;
import com.mofood.items.spelt;
import com.mofood.items.speltSeed;
import com.mofood.items.tomatenSeed;
import com.mofood.proxy.ServerProxy;
import com.mofood.util.Events;
import com.mofood.util.GuiHandler;
import com.mofood.util.Update_Checker;

import net.drpcore.main.CraftingManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = mofood.MODID, version = mofood.VERSION)
public class mofood {

	public static final String MODID = "mofood";
	public static final String VERSION = "0.11";
	
	
	public static final int GUI_BARREL = 0;
	
	@SidedProxy(serverSide = "com.mofood.proxy.ServerProxy", clientSide = "com.mofood.proxy.ClientProxy")
		
	public static ServerProxy proxy;

	public static Item mofooditem;

	@Instance
	public static mofood instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Update_Checker.checkForUpdates();
		
		GameRegistry.registerBlock(blockBarley.blockBarley, "blockBarley");
		GameRegistry.registerItem(barleySeed.barleySeed, "barleySeed");
		GameRegistry.registerItem(barley.barley, "barley");
		GameRegistry.registerBlock(blockRye.blockRye, "blockRye");
		GameRegistry.registerItem(ryeSeed.ryeSeed, "ryeSeed");
		GameRegistry.registerItem(rye.rye, "rye");
		GameRegistry.registerBlock(blockSpelt.blockSpelt, "blockSpelt");
		GameRegistry.registerItem(spelt.spelt, "spelt");
		GameRegistry.registerItem(speltSeed.speltSeed, "speltSeed");
		GameRegistry.registerItem(WeizenMehl.WeizenMehl, "WeizenMehl");
		GameRegistry.registerItem(RyeMehl.RyeMehl, "RyeMehl");
		GameRegistry.registerItem(SpeltMehl.SpeltMehl, "SpeltMehl");
		GameRegistry.registerItem(GersteMehl.GersteMehl, "GersteMehl");
		GameRegistry.registerItem(BarleyBread.BarleyBread, "BarleyBread");
		GameRegistry.registerItem(SpeltBread.SpeltBread, "SpeltBread");
		GameRegistry.registerItem(RyeBread.RyeBread, "RyeBread");
		GameRegistry.registerItem(TeigrohlingWeizen.TeigrohlingWeizen, "TeigrohlingWeizen");
		GameRegistry.registerItem(TeigrohlingRye.TeigrohlingRye, "TeigrohlingRye");
		GameRegistry.registerItem(TeigrohlingSpelt.TeigrohlingSpelt, "TeigrohlingSpelt");
		GameRegistry.registerItem(TeigrohlingBarley.TeigrohlingBarley, "TeigrohlingBarley");
		GameRegistry.registerBlock(blockRape.blockRape, "blockRape");
		GameRegistry.registerItem(rapeSeed.rapeSeed, "rapeSeed");
		GameRegistry.registerItem(Rape.Rape, "Rape");
		GameRegistry.registerBlock(blockTomate.blockTomate, "blockTomate");
		GameRegistry.registerItem(Tomate.Tomate, "Tomate");
		GameRegistry.registerItem(tomatenSeed.tomatenSeed, "tomatenSeed");
		GameRegistry.registerBlock(blockGurke.blockGurke, "blockGurke");
		GameRegistry.registerItem(gurkenSeed.gurkenSeed, "gurkenSeed");
		GameRegistry.registerItem(Gurke.Gurke, "Gurke");
		GameRegistry.registerBlock(blockChilli.blockChilli, "blockChilli");
		GameRegistry.registerItem(Chilli.Chilli, "Chilli");
		GameRegistry.registerItem(chilliSeed.chilliSeed, "chilliSeed");
		GameRegistry.registerItem(Basilikum.Basilikum, "Basilikum");
		GameRegistry.registerItem(basilikumSeed.basilikumSeed, "basilikumSeed");
		GameRegistry.registerBlock(blockBasilikum.blockBasilikum, "blockBasilikum");
		GameRegistry.registerBlock(blockSalat.blockSalat, "blockSalat");
		GameRegistry.registerItem(Salat.Salat, "Salat");
		GameRegistry.registerItem(SalatSeed.SalatSeed, "SalatSeed");
		GameRegistry.registerItem(BigBurger.BigBurger, "BigBurger");
		GameRegistry.registerItem(Kaese.Kaese, "Kaese");
		GameRegistry.registerItem(HotDogSenf.HotDogSenf, "HotDogSenf");
		GameRegistry.registerItem(Wurst.Wurst, "Wurst");
		GameRegistry.registerItem(Senf.Senf, "Senf");
		GameRegistry.registerItem(HotDog.HotDog, "HotDog");
		GameRegistry.registerBlock(blockBarrel.blockBarrel, "blockBarrel");
		GameRegistry.registerItem(Knife.Knife, "Knife");
		GameRegistry.registerItem(Ketchup.Ketchup, "Ketchup");
		GameRegistry.registerItem(Pommes.Pommes, "Pommes");
		//GameRegistry.registerItem(HotDogKetchup.HotDogKetchup, "HotDogKetchup");
		GameRegistry.registerItem(Doener.Doener, "Doener");
		GameRegistry.registerItem(PizzaHawaii.PizzaHawaii, "PizzaHawaii");
		GameRegistry.registerItem(PizzaThunfisch.PizzaThunfisch, "PizzaThunfisch");
		GameRegistry.registerItem(PizzaMargarita.PizzaMargarita, "PizzaMargarita");
		GameRegistry.registerItem(PizzaSalamie.PizzaSalamie, "PizzaSalamie");
		GameRegistry.registerItem(Salamie.Salamie, "Salamie.Salamie");
		GameRegistry.registerItem(ReisSeed.ReisSeed, "ReisSeed");
		GameRegistry.registerBlock(blockReis.blockReis, "blockReis");
		GameRegistry.registerBlock(blockErbse.blockErbse, "blockErbse");
		GameRegistry.registerItem(Reis.Reis, "Reis");
		GameRegistry.registerItem(Erbse.Erbse, "Erbse");
		GameRegistry.registerItem(ErbsenSeed.ErbsenSeed, "ErbsenSeed");
		GameRegistry.registerItem(moerser.moerser, "moerser");
		GameRegistry.registerItem(RinderHack.RinderHack, "RinderHack");
		GameRegistry.registerItem(SchweineHack.SchweineHack, "SchweineHack");
		GameRegistry.registerItem(Tasse.Tasse, "Tasse");
		GameRegistry.registerItem(Punsch.Punsch, "Punsch");
		GameRegistry.registerItem(SchokoMan.SchokoMan, "SchokoMan");
		GameRegistry.registerItem(KuerbisSuppe.KuerbisSuppe, "KuerbisSuppe");
		GameRegistry.registerItem(Schokolade.Schokolade, "Schokolade");
		GameRegistry.registerItem(ZombieFleischEintopf.ZombieFleischEintopf, "ZombieFleischEintopf");
		GameRegistry.registerItem(NougatCreme.NougatCreme, "NougatCreme");
		GameRegistry.registerItem(Karamell.Karamell, "Karamell");
		GameRegistry.registerItem(LollyPop.LollyPop, "LollyPop");
		GameRegistry.registerItem(Toast.Toast, "Toast");
		GameRegistry.registerItem(SchokoSosse.SchokoSosse, "SchokoSosse");
		GameRegistry.registerBlock(blockGrill.blockGrill, "blockGrill");
		GameRegistry.registerItem(ToastNugat.ToastNugat, "ToastNugat");
		GameRegistry.registerItem(Butterkecks.Butterkecks, "Butterkecks");
		GameRegistry.registerItem(Erdnussbutter.Erdnussbutter, "Erdnussbutter");
		GameRegistry.registerItem(Karrottensuppen.Karrottensuppen, "Karrottensuppen");
		GameRegistry.registerItem(MashedPotatos.MashedPotatos, "MashedPotatos");
		GameRegistry.registerItem(KirschMarmelade.KirschMarmelade, "KirschMarmelade");
		GameRegistry.registerItem(ErdbeerMarmelade.ErdbeerMarmelade, "ErdbeerMarmelade");
		GameRegistry.registerItem(Birne.Birne, "Birne");
		GameRegistry.registerItem(Kartoffelsuppe.Kartoffelsuppe, "Kartoffelsuppe");
		GameRegistry.registerItem(WeckGlass.WeckGlass, "WeckGlass");

		
/* Smelting */

		GameRegistry.addSmelting(TeigrohlingSpelt.TeigrohlingSpelt, new ItemStack(SpeltBread.SpeltBread), 10);
	}

	{
		GameRegistry.addSmelting(TeigrohlingRye.TeigrohlingRye, new ItemStack(RyeBread.RyeBread), 10);
	}

	{
		GameRegistry.addSmelting(TeigrohlingBarley.TeigrohlingBarley, new ItemStack(BarleyBread.BarleyBread), 10);
	}

	{
		GameRegistry.addSmelting(TeigrohlingWeizen.TeigrohlingWeizen, new ItemStack(Items.bread), 10);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerItemRender();

		MinecraftForge.addGrassSeed(new ItemStack(barleySeed.barleySeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ryeSeed.ryeSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(rapeSeed.rapeSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(speltSeed.speltSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(tomatenSeed.tomatenSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(gurkenSeed.gurkenSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(SalatSeed.SalatSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(chilliSeed.chilliSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(basilikumSeed.basilikumSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ReisSeed.ReisSeed), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ErbsenSeed.ErbsenSeed), 15);

		FMLCommonHandler.instance().bus().register(new Events());
		//MinecraftForge.EVENT_BUS.register(new Events());
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		GameRegistry.registerTileEntity(TileEntityBarrel.class, "TileEntityBarrel");
		
		/*ChestGen*/
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,new WeightedRandomChestContent(new ItemStack(Kaese.Kaese), 6, 12, 10));
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
	
		/*DRP Crafting*/
		
/*Mehl*/
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(RyeMehl.RyeMehl, 8 ), new ItemStack(rye.rye, 3), new ItemStack(moerser.moerser), blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(SpeltMehl.SpeltMehl, 8 ), new ItemStack(spelt.spelt, 3), new ItemStack(moerser.moerser), blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(GersteMehl.GersteMehl, 8 ), new ItemStack(barley.barley, 3), new ItemStack(moerser.moerser), blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(WeizenMehl.WeizenMehl, 8 ), new ItemStack(Items.wheat, 3), new ItemStack(moerser.moerser),blockGrill.blockGrill, 0);
/*Teig*/	
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(TeigrohlingRye.TeigrohlingRye, 8 ), new ItemStack(Items.egg, 3), new ItemStack(Items.water_bucket),new ItemStack(RyeMehl.RyeMehl),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(TeigrohlingSpelt.TeigrohlingSpelt, 8 ), new ItemStack(Items.egg, 3), new ItemStack(Items.water_bucket),new ItemStack(SpeltMehl.SpeltMehl),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(TeigrohlingBarley.TeigrohlingBarley, 8 ), new ItemStack(Items.egg, 3), new ItemStack(Items.water_bucket),new ItemStack(GersteMehl.GersteMehl),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Backwaren", new ItemStack(TeigrohlingWeizen.TeigrohlingWeizen, 8 ), new ItemStack(Items.egg, 3), new ItemStack(Items.water_bucket),new ItemStack(WeizenMehl.WeizenMehl),blockGrill.blockGrill, 0);
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Doener.Doener), new ItemStack(Tomate.Tomate), new ItemStack(Gurke.Gurke), new ItemStack(Items.bread), new ItemStack(Items.cooked_chicken),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Doener.Doener), new ItemStack(Tomate.Tomate), new ItemStack(Gurke.Gurke), new ItemStack(RyeBread.RyeBread),new ItemStack(Items.cooked_chicken),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Doener.Doener), new ItemStack(Tomate.Tomate), new ItemStack(Gurke.Gurke), new ItemStack(SpeltBread.SpeltBread), new ItemStack(Items.cooked_chicken),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Doener.Doener), new ItemStack(Tomate.Tomate), new ItemStack(Gurke.Gurke), new ItemStack(BarleyBread.BarleyBread), new ItemStack(Items.cooked_chicken),blockGrill.blockGrill, 0);
		
/*Burger*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Kaese.Kaese), new ItemStack(Items.milk_bucket), blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Wurst.Wurst), new ItemStack(Items.cooked_porkchop), blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Ketchup.Ketchup), new ItemStack(Tomate.Tomate), new ItemStack(moerser.moerser), new ItemStack(Items.glass_bottle),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Salamie.Salamie), new ItemStack(Items.cooked_beef), new ItemStack(Items.cooked_porkchop),blockGrill.blockGrill, 0);

/*Pizzen*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaMargarita.PizzaMargarita), new ItemStack(TeigrohlingBarley.TeigrohlingBarley), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingBarley.TeigrohlingBarley), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Salamie.Salamie),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingBarley.TeigrohlingBarley), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Items.fish),blockGrill.blockGrill, 0);
		
/*Pizzen Weizen*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaMargarita.PizzaMargarita), new ItemStack(TeigrohlingWeizen.TeigrohlingWeizen), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingWeizen.TeigrohlingWeizen), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Salamie.Salamie),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingWeizen.TeigrohlingWeizen), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Items.fish),blockGrill.blockGrill, 0);
		
/*Pizzen Rye*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaMargarita.PizzaMargarita), new ItemStack(TeigrohlingRye.TeigrohlingRye), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingRye.TeigrohlingRye), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Salamie.Salamie),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingRye.TeigrohlingRye), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Items.fish),blockGrill.blockGrill, 0);
		
/*Pizzen Spelt*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaMargarita.PizzaMargarita), new ItemStack(TeigrohlingSpelt.TeigrohlingSpelt), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese),null, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingSpelt.TeigrohlingSpelt), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Salamie.Salamie),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(PizzaSalamie.PizzaSalamie), new ItemStack(TeigrohlingSpelt.TeigrohlingSpelt), new ItemStack(Ketchup.Ketchup), new ItemStack(Kaese.Kaese), new ItemStack(Items.fish),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Knife.Knife), new ItemStack(Items.stick), new ItemStack(Items.iron_ingot),null, 0);

/*Punsch*/
		//CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(HotDogKetchup.HotDogKetchup), new ItemStack(HotDog.HotDog), new ItemStack(Ketchup.Ketchup),blockGrill.blockGrill, 0);
		//CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Punsch.Punsch), new ItemStack(Items.glass_bottle), new ItemStack(Items.water_bucket), new ItemStack(Kirsche.Kirsche),blockGrill.blockGrill, 0);
		//CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Punsch.Punsch), new ItemStack(Items.glass_bottle), new ItemStack(Items.water_bucket), new ItemStack(Erdbeere.Erdbeere),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Pommes.Pommes), new ItemStack(Items.potato), new ItemStack(Knife.Knife),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(ZombieFleischEintopf.ZombieFleischEintopf), new ItemStack(Items.bowl), new ItemStack(Items.rotten_flesh),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(HotDog.HotDog), new ItemStack(Items.bread), new ItemStack(Wurst.Wurst),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(HotDog.HotDog), new ItemStack(SpeltBread.SpeltBread), new ItemStack(Wurst.Wurst),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(HotDog.HotDog), new ItemStack(RyeBread.RyeBread), new ItemStack(Wurst.Wurst),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(HotDog.HotDog), new ItemStack(BarleyBread.BarleyBread), new ItemStack(Wurst.Wurst),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(moerser.moerser), new ItemStack(Blocks.cobblestone),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(blockBarrel.blockBarrel), new ItemStack(Blocks.chest), new ItemStack(Blocks.planks),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Schokolade.Schokolade), new ItemStack(Blocks.cocoa),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(NougatCreme.NougatCreme), new ItemStack(SchokoSosse.SchokoSosse), new ItemStack(WeckGlass.WeckGlass),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Karamell.Karamell), new ItemStack(Items.sugar), new ItemStack(WeckGlass.WeckGlass),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(LollyPop.LollyPop), new ItemStack(Karamell.Karamell), new ItemStack(Items.sugar), new ItemStack(Items.stick),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(ToastNugat.ToastNugat), new ItemStack(Toast.Toast), new ItemStack(NougatCreme.NougatCreme),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Toast.Toast), new ItemStack(Knife.Knife), new ItemStack(Items.bread),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Toast.Toast), new ItemStack(Knife.Knife), new ItemStack(BarleyBread.BarleyBread),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Toast.Toast), new ItemStack(Knife.Knife), new ItemStack(SpeltBread.SpeltBread),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Toast.Toast), new ItemStack(Knife.Knife), new ItemStack(RyeBread.RyeBread),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Butterkecks.Butterkecks), new ItemStack(TeigrohlingBarley.TeigrohlingBarley), new ItemStack(Items.sugar),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Butterkecks.Butterkecks), new ItemStack(TeigrohlingRye.TeigrohlingRye), new ItemStack(Items.sugar),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Butterkecks.Butterkecks), new ItemStack(TeigrohlingSpelt.TeigrohlingSpelt), new ItemStack(Items.sugar),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Butterkecks.Butterkecks), new ItemStack(TeigrohlingWeizen.TeigrohlingWeizen), new ItemStack(Items.sugar),blockGrill.blockGrill, 0);
		
/*Doener*/
	//	CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Erdnussbutter.Erdnussbutter), new ItemStack(Erdnuss.Erdnuss), new ItemStack(Butter.Butter),blockGrill.blockGrill, 0);
		//CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(ErdbeerMarmelade.ErdbeerMarmelade), new ItemStack(WeckGlass.WeckGlass), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket), new ItemStack(Erdbeeren.Erdbeeren)),blockGrill.blockGrill, 0);
		//CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(KirschMarmelade.KirschMarmelade), new ItemStack(WeckGlass.WeckGlass), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket), new ItemStack(Kirschen.Kirschen)),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(WeckGlass.WeckGlass,4), new ItemStack(Blocks.glass,4),blockGrill.blockGrill, 0);
		
/*Doener*/
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(SchokoSosse.SchokoSosse), new ItemStack(Schokolade.Schokolade), new ItemStack(Items.water_bucket),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(MashedPotatos.MashedPotatos), new ItemStack(Items.potato), new ItemStack(moerser.moerser), new ItemStack(Items.bowl),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Kartoffelsuppe.Kartoffelsuppe), new ItemStack(Items.water_bucket), new ItemStack(Items.bowl), new ItemStack(Items.potato),blockGrill.blockGrill, 0);
		CraftingManager.registerRecipe(mofood.MODID, "Fast Food", new ItemStack(Kartoffelsuppe.Kartoffelsuppe), new ItemStack(Items.water_bucket), new ItemStack(Items.bowl), new ItemStack(Items.carrot),blockGrill.blockGrill, 0);


		
		
	}

	private void registerRecipe(String modid2, String string, ItemStack itemStack, ItemStack itemStack2,
			ItemStack itemStack3, Object object, int i) {
		
	}
}
		
		
		