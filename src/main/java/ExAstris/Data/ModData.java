package ExAstris.Data;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.ModMetadata;

public class ModData {
	public static final String ID = "exastris";
	public static final String NAME = "Ex Astris";
	public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:Forge@[10.13.0.1180,);required-after:exnihilo;after:ThermalExpansion;after:Thaumcraft;after:TConstruct;after:TSteelworks;after:RedstoneArsenal;after:RotaryCraft;after:Metallurgy;after:ThermalFoundation;after:EnderIO;after:chisel";
    
    public static void setMetadata(ModMetadata data)
	{
		data.autogenerated = false;		
		data.url = "http://mc.loveholy.kr";
		data.credits = "...";
		//data.authorList.add("LoveHoly");
		data.description = "Ex Nihilo Addon, Thaumcraft, ThermalExpansion, etc..";
		data.logoFile = "";
		data.updateUrl = "";
		data.parent = "";
	}
    
    public static final String TEXTURE_LOCATION = ID;
    
    public static String CATEGORY_OPTIONS = "options";
    
    //Categories
    public static String categoryThaumcraft="Thaumcraft";
    public static String categoryMagicBees="MagicBees";
    public static String categoryExAstris="ExAstris";
    public static String categoryRedstoneArsenal="RedstoneArsenal";
    public static String categoryMFR="MineFactoryReloaded";
    public static String categoryTiCon="TinkersConstruct";
    public static String categorySteelworks="TinkersSteelworks";
    public static String categoryThermalExpansion="ThermalExpansion";
    public static String categoryRotaryCraft="RotaryCraft";
    public static String categoryMetallurgy="Metallurgy";
    public static String categoryBloodMagic="BloodMagic";
    public static String categoryNatura="natura";
    public static String categoryBotania="Botania";
    public static String categoryChisel="Chisel";
    
    //BLOCKS
    public static String allowThaumiumBarrelKey = "thaumiumBarrel";
	public static boolean allowThaumiumbarrel = true;
	
	public static String allowBeeTrapInfusedKey = "infusedArtificialHive";
	public static boolean allowBeeTrapInfused = true;

	public static String allowEndCakeKey = "endCake";
	public static boolean allowEndCake = true;
	
	public static String allowSieveAutomaticKey = "autoSieve";
	public static boolean allowSieveAutomatic = true;
	public static String sieveAutomaticBaseEnergyKey = "autoSieveEnergy";
	public static int sieveAutomaticBaseEnergy;
	public static String sieveFortuneChanceKey = "autoSieveFortuneChance";
	public static int sieveFortuneChance;
	public static String sieveFortuneRFIncreaseKey = "autoSieveRFIncrease";
	public static int sieveFortuneRFIncrease;
	public static String sieveFortuneExtraRollsKey = "autoSieveFortuneExtraRolls";
	public static boolean sieveFortuneExtraRolls;
	public static String sieveFortuneExtraDropsKey = "autoSieveFortuneExtraDrops";
	public static boolean sieveFortuneExtraDrops;
	public static boolean allowUpgrades;
	public static String allowUpgradesKey = "allowUpgradesKey";
	public static boolean allowHammerAutomatic;
	public static String allowHammerAutomaticKey = "autoHammer";
	public static boolean enableTERecipes;
	public static String enableTERecipesKey = "enableTERecipes";
	public static boolean enableEIORecipes;
	public static String enableEIORecipesKey = "enableEIORecipes";
	
	
	public static int hammerAutomaticBaseEnergy;
	public static String hammerAutomaticBaseEnergyKey = "hammerAutomaticBaseEnergy";
	
	//ITEMS
	public static String allowDollFreezingKey = "freezingDoll";
	public static boolean allowDollFreezing = true;
	
	public static String allowDollThaumicKey = "thaumicDoll";
	public static boolean allowDollThaumic = true;

	public static String allowHammerRFKey = "fluxHammer";
	public static boolean allowHammerRF = true;
	
	public static String allowCrookRFKey = "fluxCrook";
	public static boolean allowCrookRF = true;
	public static String crookEnergyUsagePoweredKey = "fluxCrookEnergyUsagePowered";
	public static int crookEnergyUsagePowered = 1200;
	public static String crookEnergyUsageUnpoweredKey = "fluxCrookEnergyUsageUnpowered";
	public static int crookEnergyUsageUnpowered = 400;

	public static String allowHammerThaumiumKey = "thaumiumHammer";
	public static boolean allowHammerThaumium = true;
	
	public static String allowUnchargedNetherstarKey = "unchargedNetherStar";
	public static boolean allowUnchargedNetherstar = true;
	
	//BRIDGES
	public static String allowMFRCompostKey = "MFRCompost";
	public static boolean allowMFRCompost = true;
	
	public static String allowMFRSeedFromSiftingKey="MFRSeed";
	public static boolean allowMFRSeedFromSifting;
	
	public static String allowAddTConstructNetherOreKey = "tinkersOresFromSifting";
	public static boolean allowAddTConstructNetherOre = true;
	
	public static String allowTConstructHeatKey = "tinkersHeat";
	public static boolean allowTConstructHeat = true;
	
	//THAUMCRAFT RESEARCH
	public static String allowThaumcraftResearchKey = "research";
	public static boolean allowThaumcraftResearch = true;
	
	public static String allowThaumcraftHeatKey = "thaumHeat";
	public static boolean allowThaumcraftHeat = true;
	
	//Thermal Expansion
	public static String allowThermalExpansionHeatKey = "thermalHeat";
	public static boolean allowThermalExpansionHeat = true;

	public static String allowThermalExpansionHiveKey = "thermalHives";
	public static boolean allowThermalExpansionHive = true;
	
	public static String allowSteelworksMeltingKey = "steelworksMelting";
	public static boolean allowSteelworksMelting = true;
	
	public static String allowTConstructModifiersKey = "modifiers";
	public static boolean allowTConstructModifiers = true;
	
	public static String allowTConstructBushesKey = "oreberryBushes";
	public static boolean allowTConstructBushes;
	
	public static String allowStronglyCompressedStoneKey = "stronglyCompressedStone";
	public static boolean allowStronglyCompressedStone = true;

	public static String allowMetallurgyOresKey = "metallurgySifting";
	public static boolean allowMetallurgyOres = true;
	
	public static String allowNaturaPlantsKey = "naturaSifting";
	public static boolean allowNaturaPlants = true;
	
	public static String allowBotaniaCompostingKey = "botaniaComposting";
	public static boolean allowBotaniaComposting = true;
	
	public static String allowChiselBlocksFromSiftingKey = "chiselBlocksFromSifting";
	public static boolean allowChiselBlocksFromSifting = true;
	
	public static String[] oreType = { "Gravel","Sand","Dust" };
	
	public static boolean allowBarrelsToBeChiselled;
	public static String allowBarrelsToBeChiselledKey = "barrelChiselled";
	public static boolean allowSievesToBeChiselled;
	public static String allowSievesToBeChiselledKey = "sieveChiselled";

	
	public static void load(Configuration config)
	{
		//Thaumcraft
		allowThaumiumbarrel  = config.get(categoryThaumcraft, allowThaumiumBarrelKey, allowThaumiumbarrel, "Enable Thaumium Barrel").getBoolean();
		allowDollThaumic  = config.get(categoryThaumcraft, allowDollThaumicKey, allowDollThaumic, "Enable Thaumic Doll").getBoolean();
		allowHammerThaumium  = config.get(categoryThaumcraft, allowHammerThaumiumKey, allowHammerThaumium, "Enable Thaumium Hammer").getBoolean();
		allowThaumcraftResearch  = config.get(categoryThaumcraft, allowThaumcraftResearchKey, allowThaumcraftResearch, "Enable Thaumcraft Research").getBoolean();
		allowThaumcraftHeat  = config.get(categoryThaumcraft, allowThaumcraftHeatKey, allowThaumcraftHeat, "Add Thaumcraft Items as heat source for Crucible etc").getBoolean();
		
		//Magic Bees
		allowBeeTrapInfused  = config.get(categoryMagicBees, allowBeeTrapInfusedKey, allowBeeTrapInfused, "Enable Mana Infused Hives").getBoolean();
		
		//Ex-Astris
		allowEndCake  = config.get(categoryExAstris, allowEndCakeKey, allowEndCake, "Enable End Cake").getBoolean();
		allowSieveAutomatic  = config.get(categoryExAstris, allowSieveAutomaticKey, allowSieveAutomatic, "Enable Automatic Sieve").getBoolean();
		sieveAutomaticBaseEnergy = config.get(categoryExAstris, sieveAutomaticBaseEnergyKey, 40, "Base RF/t that is consumed by the Automatic Sieve").getInt();
		sieveFortuneChance = config.get(categoryExAstris, sieveFortuneChanceKey, 1, "%ge that each Fortune Upgrade will increase the chance of a drop to double in the Automatic Sieve. Strictly speaking, the chance of the drops being multiplied X times is binomially distributed, with n=64 trials, and probability of success defined here. A value of 1 gives a 22% chance to triple a drop with 64 Fortune Upgrades.").getInt();
		sieveFortuneRFIncrease = config.get(categoryExAstris, sieveFortuneRFIncreaseKey, 10, "Amount of RF that each Fortune Upgrade costs").getInt();
		sieveFortuneExtraRolls = config.get(categoryExAstris, sieveFortuneExtraRollsKey, true, "If true, Fortune upgrades will give extra 'chances' to get each item.").getBoolean();
		sieveFortuneExtraDrops = config.get(categoryExAstris, sieveFortuneExtraDropsKey, true, "If true, Fortune upgrades will give more of each item.").getBoolean();
		hammerAutomaticBaseEnergy = config.get(categoryExAstris, hammerAutomaticBaseEnergyKey, 40, "Base RF/t that is consumed by the Automatic Hammerer").getInt();
		allowUpgrades = config.get(categoryExAstris, allowUpgradesKey, true, "Allow Upgrades for Automatic Sieve/Hammer").getBoolean();
		allowHammerAutomatic = config.get(categoryExAstris, allowHammerAutomaticKey, true, "Allow Automatic Hammerer").getBoolean();
		enableTERecipes = config.get(categoryExAstris, enableTERecipesKey, true, "Enable Thermal Expansion/Foundation Recipes").getBoolean();
		enableEIORecipes = config.get(categoryExAstris, enableEIORecipesKey, true, "Enable EnderIO Recipes").getBoolean();
		
		
		//Redstone Arsenal
		allowHammerRF  = config.get(categoryRedstoneArsenal, allowHammerRFKey, allowHammerRF, "Enable RF Hammer").getBoolean();
		allowDollFreezing  = config.get(categoryRedstoneArsenal, allowDollFreezingKey, allowDollFreezing, "Enable Freezing Doll").getBoolean();
		allowCrookRF = config.get(categoryRedstoneArsenal, allowCrookRFKey, allowCrookRF, "Enable RF Crook").getBoolean();
		crookEnergyUsagePowered = config.get(categoryRedstoneArsenal, crookEnergyUsagePoweredKey, crookEnergyUsagePowered, "RF Consumption per block broken for RF Crook when empowered").getInt();
		crookEnergyUsageUnpowered = config.get(categoryRedstoneArsenal, crookEnergyUsageUnpoweredKey, crookEnergyUsageUnpowered, "RF Consumption per block broken for RF Crook when unpowered").getInt();
		//Blood Magic
		allowUnchargedNetherstar  = config.get(categoryBloodMagic, allowUnchargedNetherstarKey, allowUnchargedNetherstar, "Enable Uncharged Nether Star").getBoolean();
		
		//MFR
		allowMFRCompost  = config.get(categoryMFR, allowMFRCompostKey, true, "Add MFR items to be composted").getBoolean();
		allowMFRSeedFromSifting = config.get(categoryMFR, allowMFRSeedFromSiftingKey, true, "Add Rubber Tree Seed from Dirt").getBoolean();
		
		//TiCon
		allowAddTConstructNetherOre  = config.get(categoryTiCon, allowAddTConstructNetherOreKey, allowAddTConstructNetherOre, "Add Tinkers Nether Ores from sifter").getBoolean();
		allowTConstructHeat  = config.get(categoryTiCon, allowTConstructHeatKey, allowTConstructHeat, "Add Tinkers Items as a heat source for Crucible etc").getBoolean();
		allowTConstructModifiers  = config.get(categoryTiCon, allowTConstructModifiersKey, allowTConstructModifiers, "Add Tinkers Modifiers (Smashing and Crooked").getBoolean();
		allowTConstructBushes = config.get(categoryTiCon, allowTConstructBushesKey, true, "Allow OreBerry bushes to be obtained via sifting").getBoolean();
		
		//Steelworks
		allowSteelworksMelting  = config.get(categorySteelworks, allowSteelworksMeltingKey, allowSteelworksMelting, "Allow Dusts etc to be melted in the High Oven").getBoolean();
			
		//Thermal Expansion
		allowThermalExpansionHeat  = config.get(categoryThermalExpansion, allowThermalExpansionHeatKey, allowThermalExpansionHeat, "Add Thermal Expansion Items and Fluids as heat sources for Crucible etc").getBoolean();
		allowThermalExpansionHive  = config.get(categoryThermalExpansion, allowThermalExpansionHiveKey, allowThermalExpansionHive, "Add Thermal Expansion Hive Recipes").getBoolean();
		
		
		
		//RotaryCraft (NA)
		allowStronglyCompressedStone  = config.get(categoryRotaryCraft, allowStronglyCompressedStoneKey, allowStronglyCompressedStone, "Enable Strongly Compressed Stone").getBoolean();
		
		//Metallurgy
		allowMetallurgyOres  = config.get(categoryMetallurgy, allowMetallurgyOresKey, allowMetallurgyOres, "Enable Metallurgy Ores from Sifting").getBoolean();
		
		//Natura
		allowNaturaPlants = config.get(categoryNatura, allowNaturaPlantsKey, true, "Allow Natura Plants to be obtained via sifting").getBoolean();
		
		//Botania
		allowBotaniaComposting = config.get(categoryBotania, allowBotaniaCompostingKey, true, "Allow Botania Mystical Flowers to be composted").getBoolean();
		
		//Chisel
		allowChiselBlocksFromSifting = config.get(categoryChisel, allowChiselBlocksFromSiftingKey, true, "Allow Marble and Limestone stones to be obtained via sifting").getBoolean();
		allowBarrelsToBeChiselled = config.get(categoryChisel, allowBarrelsToBeChiselledKey , true, "Allow Barrels to be chiselled between types").getBoolean();
		allowSievesToBeChiselled = config.get(categoryChisel, allowSievesToBeChiselledKey, true, "Allow Sieves to be chiselled between types").getBoolean();
	}
	
}
