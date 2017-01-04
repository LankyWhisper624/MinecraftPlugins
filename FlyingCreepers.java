package flyingcreeperscmd;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Bat;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Entity;
import java.util.List;

public class FlyingCreepersCmd extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("creeper")) {
            if (sender instanceof Player) {
                Player me = (Player)sender;
                Location loc = player.getLocation();
                loc.setY(loc.getY()+5);
                Bat bat = player.getWorld().spawn(loc, Bat.class);
                Creeper creeper = player.getWorld().spawn(loc, Creeper.class);
                bat.setPassenger(creeper);
                PotionEffect invisible = new PotionEffect(
                    PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 1);
                bat.addPotionEffect(invisible);
            }
        }
    }
}
