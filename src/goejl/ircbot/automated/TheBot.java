package goejl.ircbot.automated;

public class TheBot {

  private String hostname;
  private String port;
  private String nickname;
  private String[] channels;
  private String identpw;

  public TheBot() {
    readXmlConfig();
  }

  public String getHostname() {
    return hostname;
  }

  public String getPort() {
    return port;
  }

  public String getNickname() {
    return nickname;
  }

  public String[] getChannels() {
    return channels;
  }

  public String getIdentpw() {
    return identpw;
  }

  public void readXmlConfig() {
    nickname = "ThebotboY_Bot";

  }

}
