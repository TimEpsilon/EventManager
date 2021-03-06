package com.github.timepsilon.comet.mobs;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.scoreboard.Team;

public abstract class CometMobs {

    protected LivingEntity entity;


    public CometMobs(LivingEntity e, int health) {
        this.entity = e;
        this.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(health);
        this.entity.setHealth(health);

        this.entity.addScoreboardTag("Comet");
        Team scarlet;
        //team
        if (Bukkit.getScoreboardManager().getMainScoreboard().getTeam("Scarlet") == null) {
            scarlet = Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("Scarlet");
            scarlet.color(NamedTextColor.DARK_RED);
        } else {
            scarlet = Bukkit.getScoreboardManager().getMainScoreboard().getTeam("Scarlet");
        }

        scarlet.addEntry(this.entity.getUniqueId().toString());


    }

    public LivingEntity getEntity() {
        return this.entity;
    }
}
