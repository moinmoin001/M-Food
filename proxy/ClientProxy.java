package com.mofood.proxy;

import com.mofood.mofood;
import com.mofood.blocks.blockBarrel;
import com.mofood.blocks.blockGrill;
import com.mofood.items.BarleyBread;
import com.mofood.items.Basilikum;
import com.mofood.items.BigBurger;
import com.mofood.items.BigBurger1;
import com.mofood.items.BigBurger2;
import com.mofood.items.BigBurger3;
import com.mofood.items.BigBurger4;
import com.mofood.items.Burger;
import com.mofood.items.Birne;
import com.mofood.items.Butterkecks;
import com.mofood.items.Karamell;
import com.mofood.items.Karrottensuppen;
import com.mofood.items.Kartoffelsuppe;
import com.mofood.items.KirschMarmelade;
import com.mofood.items.Chilli;
import com.mofood.items.Doener;
import com.mofood.items.Erbse;
import com.mofood.items.ErbsenSeed;
import com.mofood.items.ErdbeerMarmelade;
import com.mofood.items.Erdnussbutter;
import com.mofood.items.SchokoSosse;
import com.mofood.items.GersteMehl;
import com.mofood.items.Gurke;
import com.mofood.items.HotDog;
import com.mofood.items.HotDogKetchup;
import com.mofood.items.HotDogSenf;
import com.mofood.items.Kaese;
import com.mofood.items.Ketchup;
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

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends ServerProxy {

	
	public void registerItemRender() {
		registerItemMesh(RinderHack.RinderHack);
		registerItemMesh(SchweineHack.SchweineHack);
		registerItemMesh(barleySeed.barleySeed);
		registerItemMesh(barley.barley);
		registerItemMesh(ryeSeed.ryeSeed);
		registerItemMesh(rye.rye);
		registerItemMesh(speltSeed.speltSeed);
		registerItemMesh(spelt.spelt);
		registerItemMesh(WeizenMehl.WeizenMehl);
		registerItemMesh(SpeltMehl.SpeltMehl);
		registerItemMesh(GersteMehl.GersteMehl);
		registerItemMesh(TeigrohlingWeizen.TeigrohlingWeizen);
		registerItemMesh(TeigrohlingSpelt.TeigrohlingSpelt);
		registerItemMesh(TeigrohlingRye.TeigrohlingRye);
		registerItemMesh(TeigrohlingBarley.TeigrohlingBarley);
		registerItemMesh(BarleyBread.BarleyBread);
		registerItemMesh(SpeltBread.SpeltBread);
		registerItemMesh(RyeMehl.RyeMehl);
		registerItemMesh(RyeBread.RyeBread);
		registerItemMesh(Rape.Rape);
		registerItemMesh(rapeSeed.rapeSeed);
		registerItemMesh(tomatenSeed.tomatenSeed);
		registerItemMesh(Tomate.Tomate);
		registerItemMesh(gurkenSeed.gurkenSeed);
		registerItemMesh(Gurke.Gurke);
		registerItemMesh(chilliSeed.chilliSeed);
		registerItemMesh(Chilli.Chilli);
		registerItemMesh(basilikumSeed.basilikumSeed);
		registerItemMesh(Basilikum.Basilikum);
		registerItemMesh(Salat.Salat);
		registerItemMesh(SalatSeed.SalatSeed);
		registerItemMesh(Burger.Burger);
		registerItemMesh(BigBurger4.BigBurger4);
		registerItemMesh(BigBurger3.BigBurger3);
		registerItemMesh(BigBurger2.BigBurger2);
		registerItemMesh(BigBurger1.BigBurger1);
		registerItemMesh(BigBurger.BigBurger);
		registerItemMesh(Knife.Knife);
		registerItemMesh(HotDogSenf.HotDogSenf);
		registerItemMesh(HotDogKetchup.HotDogKetchup);
		registerItemMesh(HotDog.HotDog);
		registerItemMesh(Ketchup.Ketchup);
		registerItemMesh(Pommes.Pommes);
		registerItemMesh(Doener.Doener);
		registerItemMesh(Senf.Senf);
		registerItemMesh(PizzaThunfisch.PizzaThunfisch);
		registerItemMesh(PizzaMargarita.PizzaMargarita);
		registerItemMesh(PizzaSalamie.PizzaSalamie);
		registerItemMesh(PizzaHawaii.PizzaHawaii);
		registerItemMesh(Wurst.Wurst);
		registerItemMesh(Kaese.Kaese);
		registerItemMesh(Salamie.Salamie);
		registerItemMesh(ReisSeed.ReisSeed);
		registerItemMesh(Reis.Reis);
		registerItemMesh(ErbsenSeed.ErbsenSeed);
		registerItemMesh(Erbse.Erbse);
		registerItemMesh(moerser.moerser);
		registerItemMesh(ErbsenSeed.ErbsenSeed);
		registerItemMesh(RinderHack.RinderHack);
		registerItemMesh(SchweineHack.SchweineHack);
		registerItemMesh(Tasse.Tasse);
		registerItemMesh(Punsch.Punsch);
		registerItemMesh(SchokoMan.SchokoMan);
		registerItemMesh(Schokolade.Schokolade);
		registerItemMesh(KuerbisSuppe.KuerbisSuppe);
		registerItemMesh(ZombieFleischEintopf.ZombieFleischEintopf);
		
		registerItemMesh(NougatCreme.NougatCreme);
		registerItemMesh(Karamell.Karamell);
		registerItemMesh(LollyPop.LollyPop);
		registerItemMesh(Toast.Toast);
		registerItemMesh(SchokoSosse.SchokoSosse);
		registerItemMesh(Butterkecks.Butterkecks);
		registerItemMesh(Erdnussbutter.Erdnussbutter);
		registerItemMesh(KirschMarmelade.KirschMarmelade);
		registerItemMesh(ErdbeerMarmelade.ErdbeerMarmelade);
		registerItemMesh(Birne.Birne);
		registerItemMesh(MashedPotatos.MashedPotatos);
		registerItemMesh(ToastNugat.ToastNugat);
		registerItemMesh(Kartoffelsuppe.Kartoffelsuppe);
		registerItemMesh(Karrottensuppen.Karrottensuppen);
		registerItemMesh(WeckGlass.WeckGlass);
		registerItemMesh(blockBarrel.blockBarrel);
		registerItemMesh(blockGrill.blockGrill);

	
	
	
	
	}
	public void registerItemMesh(Block block){
		  String Name = block.getUnlocalizedName().toString().substring(block.getUnlocalizedName().toString().indexOf(".") + 1, block.getUnlocalizedName().toString().length());
		  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0, new ModelResourceLocation(mofood.MODID + ":" + Name ,"inventory"));
	}
		 
	public void registerItemMesh(Item item){
		  String Name = item.getUnlocalizedName().toString().substring(item.getUnlocalizedName().toString().indexOf(".") + 1, item.getUnlocalizedName().toString().length());
		  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(mofood.MODID + ":" + Name ,"inventory"));
	}
}
