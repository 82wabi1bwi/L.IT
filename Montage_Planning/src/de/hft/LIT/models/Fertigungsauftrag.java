package de.hft.LIT.models;

public class Fertigungsauftrag extends Auftrag{
	
	public Fertigungsauftrag(int pAuftragsnr, String pStatus, Kunde pKunde, boolean pZugewiesen, Rechner pRechner)
	{
		super(pAuftragsnr, pStatus, pKunde, pZugewiesen, pRechner);
	}
}
