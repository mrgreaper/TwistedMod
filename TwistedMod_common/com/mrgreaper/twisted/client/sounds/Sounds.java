package com.mrgreaper.twisted.client.sounds;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public enum Sounds {
	BUNNY_RELEASE("bunnyRelease"),
	BUNNY_OWW("bunnyOww"),
	BUNNY_LITTLE("LittleBunny"),
	BUNNY_RESSISTANCE("bunnyResistance"),
	BUNNY_EXP("bunnyExp"),
	BUNNY_ELECTRIC("bunnyElectricfy"),
	BUNNY_GROWL("growl"),
	BUNNYBEG_A("bunnyBegA"),
	BUNNYBEG_B("bunnyBegB"),
	BUNNYBEG_C("bunnyBegC"),
	BUNNYBEG_D("bunnyBegD"),
	BUNNYBEG_E("bunnyBegE"),
	EVIL_LAUGHB("laughb"),
	SHAKEA("shakea"),
	SHAKEB("shakeb"),
	SHAKEC("shakec"),
	SHAKED("shaked"),
	SHAKEE("shakee"),
	SHAKEF("shakef"),
	SHAKEG("shakeg"),
	SHAKEH("shakeh"),
	SHAKEI("shakei"),
	SHAKEJ("shakej"),
	SHAKEK("shakek"),
	SHAKEL("shakel"),
	SHAKEM("shakem"),
	SHAKEN("shaken"),
	SHAKEO("shakeo"),
	SHAKEP("shakep"),
	SHAKEQ("shakeq"),
	SHAKER("shaker"),
	SHAKES("shakes"),
	SHAKET("shaket"),
	SHAKEU("shakeu"),
	SHAKEV("shakev"),
	EVIL_LAUGH("laugh"),
	DEATH_ORB_LAUNCH("deathOrbLaunch"),
	ALARM_AIRRAIDA("alarm-airraidA"),
	ALARM_AIRRAIDB("alarm-airraidB"),
	ALARM_GENERICA("alarm-genericA"),
	ALARM_GENERICB("alarm-genericB"),
	ALARM_GENERICC("alarm-genericC"),
	ALARM_GENERICD("alarm-genericD"),
	ALARM_GENERICE("alarm-genericE"),
	ALARM_GENERICF("alarm-genericF"),
	ALARM_KLAXONA("alarm-klaxonA"),
	ALARM_KLAXONB("alarm-klaxonB"),
	ALARM_SCIFIA("alarm-scifiA"),
	ALARM_SCIFIB("alarm-scifiB"),
	ALARM_SCIFIC("alarm-scifiC"),
	ALARM_SCIFID("alarm-scifiD"),
	CREATED_MONSTER("monster"),
	SKULL_GIVESTICK("skull-givestick"),
	SKULL_MAD("skull-mad"),
	SKULL_TEAPOT("skull-teapot"),
	SKULL_TAKE("skull_take"),
	SKULL_PITY("skull-pity"),
	SKULL_STING("skull-sting"),
	SKULL_RULEWORLD("skull-ruleworld"),
	EXP_TRAIL("exp_trail");
	
	
	public static final String SOUNDS_LOCATION = "twisted";
	private String name;
	
	Sounds(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void play(double x, double y, double z, float volume, float pitch){
		Minecraft.getMinecraft().sndManager.playSound(SOUNDS_LOCATION + ":" + name, (float)x, (float)y, (float)z, volume, pitch);
	}
    //bellow should of been a helper for playing sounds on entity but it failed no idea why!
		public void onEntityPlay(World world,Entity entityName,float volume ,float pitch){
			world.playSoundAtEntity(entityName,(SOUNDS_LOCATION + ":" + name), (float)volume,(float) pitch);
		}

}
