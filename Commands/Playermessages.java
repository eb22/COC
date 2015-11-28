public class PlayerJoin implements Listener {

  public Commands plugin;
  
  @EventHandler
  public void onPlayerJoin(PlayerJoin event) {
  Player player = event.getPlayer();
  if(player.hasPlayedBefore()) {
    Bukkit.broadcastMessage(ChatColor.YELLOW + ":COC: Welcome back to the Clash of Clans server " + player.getname() "!");
    } else {
    Bukkit.broadcastMessage(ChatColor.RED + ":COC: Welcome to the server " + player.getName() + " your new so have a good time!");
    }
  }
}  
