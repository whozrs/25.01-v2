import java.util.*;


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2022
 * @author 
 */

public class Nutzer {
  
  // Anfang Attribute
  public String Nutzername;                     
  public String Nachname;
  public String Vorname;
  public String Passwort;
  public String EMail;
  public String Abteilung;
  public String Registrierungszeitpunkt;
  // Ende Attribute
  
  // Anfang Methoden
  public String getNutzername() {
    return Nutzername;
  }  
  public void setNutzername(String NutzernameNeu) {
    Nutzername = NutzernameNeu;
    
  }
  public String getNachname() {
    return Nachname;
  }

  public void setNachname(String NachnameNeu) {
    Nachname = NachnameNeu;
  }

  public String getVorname() {
    return Vorname;
  }

  public void setVorname(String VornameNeu) {
    Vorname = VornameNeu;
  }

  public String getPasswort() {
    return Passwort;
  }

  public void setPasswort(String PasswortNeu) {
    Passwort = PasswortNeu;
  }

  public String getEMail() {
    return EMail;
  }

  public void setEMail(String EMailNeu) {
    EMail = EMailNeu;
  }

  public String getAbteilung() {
    return Abteilung;
  }

  public void setAbteilung(String AbteilungNeu) {
    Abteilung = AbteilungNeu;
  }

  public String getRegistrierungszeitpunkt() {
    return Registrierungszeitpunkt;
  }

  public void setRegistrierungszeitpunkt(String RegistrierungszeitpunktNeu) {
    Registrierungszeitpunkt = RegistrierungszeitpunktNeu;
  }

  // Ende Methoden
} // end of Nutzerdaten
