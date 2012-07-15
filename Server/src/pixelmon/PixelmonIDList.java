package pixelmon;

import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.Configuration;

public class PixelmonIDList {
	public static int abraId;
	public static int arbokId;
	public static int blastoiseId;
	public static int bulbasaurId;
	public static int butterfreeId;
	public static int caterpieId;
	public static int charizardId;
	public static int charmanderId;
	public static int charmeleonId;
	public static int diglettId;
	public static int dugtrioId;
	public static int eeveeId;
	public static int ekansId;
	public static int electrodeId;
	public static int flareonId;
	public static int gastlyId;
	public static int geodudeId;
	public static int goldeenId;
	public static int growlitheId;
	public static int gyaradosId;
	public static int horseaId;
	public static int ivysaurId;
	public static int jigglypuffId;
	public static int jolteonId;
	public static int magikarpId;
	public static int magnemiteId;
	public static int mankeyId;
	public static int mewId;
	public static int metapodId;
	public static int miltankId;
	public static int ninetalesId;
	public static int oddishId;
	public static int omanyteId;
	public static int omastarId;
	public static int pidgeyId;
	public static int pidgeottoId;
	public static int pidgeotId;
	public static int pikachuId;
	public static int psyduckId;
	public static int rattataId;
	public static int seakingId;
	public static int snorlaxId;
	public static int sandileId;
	public static int staryuId;
	public static int starmieId;
	public static int krokorokId;
	public static int squirtleId;
	public static int trapinchId;
	public static int venusaurId;
	public static int voltorbId;
	public static int vulpixId;
	public static int wartortleId;
	public static int wigglytuffId;
	public static int zubatId;
	public static int dratiniId;
	public static int vibravaId;
	public static int magnetonId;
	public static int mareepId;
	public static int solrockId;
	public static int lunatoneId;

	public static int i=0;
	public static void load(Configuration configuration) {
		abraId = Integer.parseInt(configuration.getOrCreateIntProperty("Abra", "pokemon", i++).value);
		arbokId = Integer.parseInt(configuration.getOrCreateIntProperty("Arbok", "pokemon", i++).value);
		blastoiseId = Integer.parseInt(configuration.getOrCreateIntProperty("Blastoise", "pokemon", i++).value);
		bulbasaurId = Integer.parseInt(configuration.getOrCreateIntProperty("Bulbasaur", "pokemon", i++).value);
		butterfreeId = Integer.parseInt(configuration.getOrCreateIntProperty("Butterfree", "pokemon", i++).value);
		caterpieId = Integer.parseInt(configuration.getOrCreateIntProperty("Caterpie", "pokemon", i++).value);
		charizardId = Integer.parseInt(configuration.getOrCreateIntProperty("Charizard", "pokemon", i++).value);
		charmanderId = Integer.parseInt(configuration.getOrCreateIntProperty("Charmander", "pokemon", i++).value);
		charmeleonId = Integer.parseInt(configuration.getOrCreateIntProperty("Charmeleon", "pokemon", i++).value);
		diglettId = Integer.parseInt(configuration.getOrCreateIntProperty("Diglett", "pokemon", i++).value);
		dugtrioId = Integer.parseInt(configuration.getOrCreateIntProperty("Dugtrio", "pokemon", i++).value);
		eeveeId = Integer.parseInt(configuration.getOrCreateIntProperty("Eevee", "pokemon", i++).value);
		ekansId = Integer.parseInt(configuration.getOrCreateIntProperty("Ekans", "pokemon", i++).value);
		flareonId = Integer.parseInt(configuration.getOrCreateIntProperty("Flareon", "pokemon", i++).value);
		gastlyId = Integer.parseInt(configuration.getOrCreateIntProperty("Gastly", "pokemon", i++).value);
		geodudeId = Integer.parseInt(configuration.getOrCreateIntProperty("Geodude", "pokemon", i++).value);
		goldeenId = Integer.parseInt(configuration.getOrCreateIntProperty("Goldeen", "pokemon", i++).value);
		growlitheId = Integer.parseInt(configuration.getOrCreateIntProperty("Growlithe", "pokemon", i++).value);
		gyaradosId = Integer.parseInt(configuration.getOrCreateIntProperty("Gyarados", "pokemon", i++).value);
		horseaId = Integer.parseInt(configuration.getOrCreateIntProperty("Horsea", "pokemon", i++).value);
		ivysaurId = Integer.parseInt(configuration.getOrCreateIntProperty("Ivysaur", "pokemon", i++).value);
		jigglypuffId = Integer.parseInt(configuration.getOrCreateIntProperty("Jigglypuff", "pokemon", i++).value);
		jolteonId = Integer.parseInt(configuration.getOrCreateIntProperty("Jolteon", "pokemon", i++).value);
		sandileId = Integer.parseInt(configuration.getOrCreateIntProperty("Sandile", "pokemon", i++).value);
		krokorokId = Integer.parseInt(configuration.getOrCreateIntProperty("Krokorok", "pokemon", i++).value);
		magikarpId = Integer.parseInt(configuration.getOrCreateIntProperty("Magikarp", "pokemon", i++).value);
		magnemiteId = Integer.parseInt(configuration.getOrCreateIntProperty("Magnemite", "pokemon", i++).value);
		mankeyId = Integer.parseInt(configuration.getOrCreateIntProperty("Mankey", "pokemon", i++).value);
		metapodId = Integer.parseInt(configuration.getOrCreateIntProperty("Metapod", "pokemon", i++).value);
		mewId = Integer.parseInt(configuration.getOrCreateIntProperty("Mew", "pokemon", i++).value);
		miltankId = Integer.parseInt(configuration.getOrCreateIntProperty("Miltank", "pokemon", i++).value);
		pidgeyId = Integer.parseInt(configuration.getOrCreateIntProperty("Pidgey", "pokemon", i++).value);
		pikachuId = Integer.parseInt(configuration.getOrCreateIntProperty("Pikachu", "pokemon", i++).value);
		pidgeottoId = Integer.parseInt(configuration.getOrCreateIntProperty("Pidgeotto", "pokemon", i++).value);
		pidgeotId = Integer.parseInt(configuration.getOrCreateIntProperty("Pidgeot", "pokemon", i++).value);
		ninetalesId = Integer.parseInt(configuration.getOrCreateIntProperty("Ninetales", "pokemon", i++).value);
		oddishId = Integer.parseInt(configuration.getOrCreateIntProperty("Oddish", "pokemon", i++).value);
		omanyteId = Integer.parseInt(configuration.getOrCreateIntProperty("Omanyte", "pokemon", i++).value);
		omastarId = Integer.parseInt(configuration.getOrCreateIntProperty("Omastar", "pokemon", i++).value);
		psyduckId = Integer.parseInt(configuration.getOrCreateIntProperty("Psyduck", "pokemon", i++).value);
		rattataId = Integer.parseInt(configuration.getOrCreateIntProperty("Rattata", "pokemon", i++).value);
		seakingId = Integer.parseInt(configuration.getOrCreateIntProperty("Seaking", "pokemon", i++).value);
		snorlaxId = Integer.parseInt(configuration.getOrCreateIntProperty("Snorlax", "pokemon", i++).value);
		squirtleId = Integer.parseInt(configuration.getOrCreateIntProperty("Squirtle", "pokemon", i++).value);
		staryuId = Integer.parseInt(configuration.getOrCreateIntProperty("Staryu", "pokemon", i++).value);
		starmieId = Integer.parseInt(configuration.getOrCreateIntProperty("Starmie", "pokemon", i++).value);
		trapinchId = Integer.parseInt(configuration.getOrCreateIntProperty("Trapinch", "pokemon", i++).value);
		venusaurId = Integer.parseInt(configuration.getOrCreateIntProperty("Venusaur", "pokemon", i++).value);
		voltorbId = Integer.parseInt(configuration.getOrCreateIntProperty("Voltorb", "pokemon", i++).value);
		vulpixId = Integer.parseInt(configuration.getOrCreateIntProperty("Vulpix", "pokemon", i++).value);
		wartortleId = Integer.parseInt(configuration.getOrCreateIntProperty("Wartortle", "pokemon", i++).value);
		wigglytuffId = Integer.parseInt(configuration.getOrCreateIntProperty("Wigglytuff", "pokemon", i++).value);
		zubatId = Integer.parseInt(configuration.getOrCreateIntProperty("Zubat", "pokemon", i++).value);
		pikachuId = Integer.parseInt(configuration.getOrCreateIntProperty("Pikachu", "pokemon", i++).value);
		dratiniId = Integer.parseInt(configuration.getOrCreateIntProperty("Dratini", "pokemon", i++).value);
		magnetonId = Integer.parseInt(configuration.getOrCreateIntProperty("Magneton", "pokemon", i++).value);
		vibravaId = Integer.parseInt(configuration.getOrCreateIntProperty("Vibrava", "pokemon", i++).value);
		mareepId = Integer.parseInt(configuration.getOrCreateIntProperty("Mareep", "pokemon", i++).value);
		dratiniId = Integer.parseInt(configuration.getOrCreateIntProperty("Dratini", "pokemon", i++).value);
		solrockId = Integer.parseInt(configuration.getOrCreateIntProperty("Solrock", "pokemon", i++).value);
		
	}
}
