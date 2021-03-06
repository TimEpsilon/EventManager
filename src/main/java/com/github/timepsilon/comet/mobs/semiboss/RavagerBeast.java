package com.github.timepsilon.comet.mobs.semiboss;

import com.github.timepsilon.comet.mobs.CometMobs;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RavagerBeast extends CometMobs {

    public RavagerBeast(Location loc) {
        super((LivingEntity)loc.getWorld().spawnEntity(loc, EntityType.RAVAGER),120);

        this.entity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.6);
        this.entity.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(5);

        this.entity.addScoreboardTag("SemiBoss");

        this.entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,2000000,1,true,true));
    }
}