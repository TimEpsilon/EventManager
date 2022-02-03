package com.github.tim91690.eclipse.mobs.semiboss;

import com.github.tim91690.eclipse.mobs.EclipseMobs;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Phantom;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PhantomFurries extends EclipseMobs {

    public PhantomFurries(Location loc) {
        super((Monster)loc.getWorld().spawnEntity(loc, EntityType.PHANTOM, CreatureSpawnEvent.SpawnReason.NATURAL),100);

        this.entity.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(3);

        ((Phantom)this.entity).setSize(10);

        this.entity.addScoreboardTag("SemiBoss");

        this.entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,2000000,0,true,true));
    }
}