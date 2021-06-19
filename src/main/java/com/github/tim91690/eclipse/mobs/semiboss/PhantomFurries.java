package com.github.tim91690.eclipse.mobs.semiboss;

import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityPhantom;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PhantomFurries extends EntityPhantom {

    public PhantomFurries(Location loc) {
        super(EntityTypes.am,((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getWorld().getHighestBlockYAt(loc)+30, loc.getZ());

        ((LivingEntity) this.getBukkitEntity()).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(100);
        ((LivingEntity) this.getBukkitEntity()).getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(3);

        this.setSize(10);

        this.setHealth(100);
        ((LivingEntity) this.getBukkitEntity()).addScoreboardTag("Eclipse");
        ((LivingEntity) this.getBukkitEntity()).addScoreboardTag("SemiBoss");

        ((LivingEntity) this.getBukkitEntity()).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,2000000,0,true,true));

    }
}