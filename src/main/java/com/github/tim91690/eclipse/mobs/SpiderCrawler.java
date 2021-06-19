package com.github.tim91690.eclipse.mobs;

import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntitySpider;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpiderCrawler extends EntitySpider {

    public SpiderCrawler(Location loc) {
        super(EntityTypes.aI,((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());

        ((LivingEntity) this.getBukkitEntity()).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(35);
        ((LivingEntity) this.getBukkitEntity()).getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(40);
        ((LivingEntity) this.getBukkitEntity()).getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.5);

        this.setHealth(35);

        ((LivingEntity) this.getBukkitEntity()).addScoreboardTag("Eclipse");

        ((LivingEntity) this.getBukkitEntity()).addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING,2000000,2,true,true));
        ((LivingEntity) this.getBukkitEntity()).addPotionEffect(new PotionEffect(PotionEffectType.JUMP,2000000,3,true,true));

    }
}