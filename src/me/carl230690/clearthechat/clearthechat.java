package me.carl230690.clearthechat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class clearthechat extends JavaPlugin
{
	public Logger logger = Logger.getLogger("Minecraft");
	public static clearthechat plugin;
	
	public void onDisable() {
            PluginDescriptionFile pdfFile = this.getDescription();
            this.logger.info(pdfFile.getName() + " Has Been Disabled!");
           
    }
   
    @Override
    public void onEnable() {
            PluginDescriptionFile pdfFile = this.getDescription();
            this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");       
    }
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    Player p = (Player)sender;

    if(commandLabel.equalsIgnoreCase("ctc"))
      if (args.length == 0) {
        if (p.hasPermission("ClearChat.Server")) {

          getServer().broadcastMessage("      ");
          getServer().broadcastMessage("        ");
          getServer().broadcastMessage("    ");
          getServer().broadcastMessage("   ");
          getServer().broadcastMessage("  ");
          getServer().broadcastMessage("          ");
          getServer().broadcastMessage(" ");
          getServer().broadcastMessage("            ");
          getServer().broadcastMessage("              ");
          getServer().broadcastMessage("               ");
          getServer().broadcastMessage("               ");
          getServer().broadcastMessage("  ");
          getServer().broadcastMessage("                 ");
          getServer().broadcastMessage("                   ");
          getServer().broadcastMessage("                      ");
          getServer().broadcastMessage("       ");
          getServer().broadcastMessage("                         ");
          getServer().broadcastMessage("     ");
          getServer().broadcastMessage("                             ");
          getServer().broadcastMessage("          ");
          getServer().broadcastMessage("   ");
          getServer().broadcastMessage("                                 ");
          getServer().broadcastMessage("                           ");
          getServer().broadcastMessage("                    ");
          getServer().broadcastMessage("             ");
          getServer().broadcastMessage("      ");
          getServer().broadcastMessage("                             ");
          getServer().broadcastMessage("                                   ");
          getServer().broadcastMessage("                  ");
          getServer().broadcastMessage("           ");
          getServer().broadcastMessage("    ");
          getServer().broadcastMessage("          ");
          getServer().broadcastMessage("  ");
          getServer().broadcastMessage("                          ");
          getServer().broadcastMessage("                 ");
          getServer().broadcastMessage("                                 ");
          getServer().broadcastMessage("            ");
          getServer().broadcastMessage("                    ");
          getServer().broadcastMessage("                                   ");
          getServer().broadcastMessage("       ");
          getServer().broadcastMessage("  ");
          getServer().broadcastMessage("                 ");
          getServer().broadcastMessage("           ");
          getServer().broadcastMessage("                       ");
          getServer().broadcastMessage("       ");
          getServer().broadcastMessage("                           ");
          getServer().broadcastMessage("                                  ");
          getServer().broadcastMessage("  ");
          getServer().broadcastMessage("           ");
          getServer().broadcastMessage("                  ");
          getServer().broadcastMessage("    ");
          getServer().broadcastMessage("                                ");
          getServer().broadcastMessage("                              ");
          getServer().broadcastMessage("                     ");
          getServer().broadcastMessage("                                  ");
          getServer().broadcastMessage("                                     ");
          getServer().broadcastMessage("       ");
          getServer().broadcastMessage("           ");
          getServer().broadcastMessage("                         ");
          getServer().broadcastMessage("               ");
          getServer().broadcastMessage("                                       ");
          getServer().broadcastMessage("                             ");
          getServer().broadcastMessage("                  ");
          getServer().broadcastMessage("                                            ");
          getServer().broadcastMessage("                          ");
          getServer().broadcastMessage("                        ");
          getServer().broadcastMessage("                            ");
          getServer().broadcastMessage("                 ");
          getServer().broadcastMessage("                     ");
          getServer().broadcastMessage("                ");
          getServer().broadcastMessage("             ");
          getServer().broadcastMessage("                    ");
          getServer().broadcastMessage("                                ");
          getServer().broadcastMessage("                                      ");
          getServer().broadcastMessage("                          ");
          getServer().broadcastMessage("                        ");
          getServer().broadcastMessage("                                          ");
          getServer().broadcastMessage("                              ");
          getServer().broadcastMessage("                      ");
          getServer().broadcastMessage("                                              ");
          getServer().broadcastMessage("                                                 ");
          getServer().broadcastMessage("                                                     ");
          getServer().broadcastMessage("               ");
          getServer().broadcastMessage("      ");
          getServer().broadcastMessage("   ");
          getServer().broadcastMessage("          ");
          getServer().broadcastMessage("                  ");
          getServer().broadcastMessage("                                      ");
          getServer().broadcastMessage("                                 ");
          getServer().broadcastMessage("                        ");
          getServer().broadcastMessage("                                                                         ");
          getServer().broadcastMessage("                                                   ");
          getServer().broadcastMessage("                           ");
          getServer().broadcastMessage("                                                          ");
          getServer().broadcastMessage("                                                                      ");
          getServer().broadcastMessage("               ");
          getServer().broadcastMessage("                       ");
          getServer().broadcastMessage("                                ");
          getServer().broadcastMessage("          ");
          getServer().broadcastMessage("     ");
          getServer().broadcastMessage("                                        ");
          getServer().broadcastMessage("                                               ");
          getServer().broadcastMessage("                                                                         ");
          getServer().broadcastMessage("                                                       ");
          getServer().broadcastMessage("                                                                   ");
          getServer().broadcastMessage("                   ");
          getServer().broadcastMessage("                                                                      ");
          getServer().broadcastMessage("                       ");
          getServer().broadcastMessage("                           ");
          getServer().broadcastMessage("                               ");
          getServer().broadcastMessage("                                     ");
          getServer().broadcastMessage("            ");
          getServer().broadcastMessage("                                                                                      ");
          getServer().broadcastMessage("                                                                                                             ");
          getServer().broadcastMessage("                                            ");
          getServer().broadcastMessage("           ");
          getServer().broadcastMessage("      ");
          getServer().broadcastMessage("                 ");
          getServer().broadcastMessage("                                                  ");
          getServer().broadcastMessage("                           ");
          getServer().broadcastMessage("                   ");
          getServer().broadcastMessage("                                                                         ");
          getServer().broadcastMessage("                                                                                           ");
          getServer().broadcastMessage("                                                            ");
          getServer().broadcastMessage("                                                                                                 ");
          getServer().broadcastMessage("                                                                                                                                             ");
          getServer().broadcastMessage("             ");
          getServer().broadcastMessage("                          ");
          getServer().broadcastMessage("                                    ");
          getServer().broadcastMessage("      ");
          getServer().broadcastMessage("                                              ");
          getServer().broadcastMessage("                  ");
          getServer().broadcastMessage("            ");
          getServer().broadcastMessage("        ");
          getServer().broadcastMessage("                                                        ");
          getServer().broadcastMessage("                                                      ");
          getServer().broadcastMessage("                               ");
          getServer().broadcastMessage("                                                           ");
          getServer().broadcastMessage("                     ");
          getServer().broadcastMessage("                       ");
          getServer().broadcastMessage("                                                                       ");
          getServer().broadcastMessage("                                                                                 ");
          getServer().broadcastMessage("                                                                           ");

          Bukkit.broadcastMessage(ChatColor.AQUA + "Chat has been cleared by " + sender.getName());

          return true;
        }
        return false;
      }

      p.sendMessage(ChatColor.RED + "No Permission!");
      return true;
    }
}