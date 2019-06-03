package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Auftragsverteilung {
	
	/**
	 * Diese Methode listet die Bezeichnung der Teile eines Rechners auf.
	 * @param pSeriennummer Die Seriennummer des Rechners, dessen Teile aufgelistet werden sollen
	 * @throws SQLException
	 */

	public void listTeileAuftrag(int pSeriennummer) throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(
				"SELECT Bezeichnung FROM RechnerTeile, Teile, Rechner WHERE Rechner.idSeriennummer=RechnerTeile.Rechner_idSeriennummer AND RechnerTeile.Teile_idTeilenummer=Teile.idTeilenummer AND idSeriennummer=pSeriennummer");
		while (rs.next()) {
			System.out.println("Teil: " + rs.toString("Bezeichnung"));
//			Wird durch andere Ausgabe ersetzt wenn Frontend steht.
			
		}
	}
	
	/**
	 * Diese Methode prüft ob alle Teile des Rechners im Lager sind (Serviceauftrag). 
	 * @param pSeriennummer Die Seriennummer des Rechners, dessen Lagerbestand aufgerufen werden soll.
	 * @throws SQLException
	 */

	public void lagerbestandPruefen(int pSeriennummer) throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(
				"SELECT Lagerbestand FROM RechnerTeile, Teile, Rechner WHERE Rechner.idSeriennummer=RechnerTeile.Rechner_idSeriennummer AND RechnerTeile.Teile_idTeilenummer=Teile.idTeilenummer AND idSeriennummer=pSeriennummer");
		int teilenichtvorhanden = 0;
		while (rs.next()) {
			if (Lagerbestand == 0) {
				System.out.println("Teil nicht vorhanden");
				teilenichtvorhanden++;
			} else {
				System.out.println("Lagerbestand: " + rs.toString("Lagerbestand"));
			}
		}
		if (teilenichtvorhanden > 0) {
			System.out.println("Es sind nicht alle Teile vorhanden. Auftrag wird an den Einkauf geschickt");
			ResultSet rs2 = stmt.executeQuery(
					"UPDATE Rechner SET Status_idStatus = '7' WHERE idSeriennummer = pSeriennummer");
		}
	}
//	Sysouts werden durch andere Ausgabe ersetzt wenn Frontend steht.
}
