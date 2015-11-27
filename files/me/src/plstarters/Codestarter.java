public class Codestarter extends JavaPlugin {
  public final Logger logger = Logger.getLogger("Minecraft");
  
  public void onEnable() {
  // old fashion way :)
  PluginDescriptionFile pdfFile = this.getDescription();
  this.logger.info(pdfFile.getname() + " version " + pdfFile.getVersion() + " has been enabled!);
  
    }
    public void onDisable() {
    PluginDescriptionFile pdfFile = this.getDescription();
    this.logger.info(pdfFile.getName() + " has been disabled ");
      }
    }  
  
  
  //Starts COC Plugin
