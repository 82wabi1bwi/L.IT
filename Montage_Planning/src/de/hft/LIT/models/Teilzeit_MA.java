package de.hft.LIT.models;

public class Teilzeit_MA extends Monteur{
	private static final int arbeitszeit = 4;
	private boolean vormittags;
	
	public Teilzeit_MA(int pPersonalnr, String pName, String pVorname, double pUrlaubstage, int pKrankheitstage, boolean pVormittags)
	{
		super(pPersonalnr, pName, pVorname, pUrlaubstage, pKrankheitstage);
		vormittags = pVormittags;
	}
	public int getArbeitszeit()
	{
		return arbeitszeit;
	}
	public void setVormittags(boolean pVormittags)
	{
		vormittags = pVormittags;
	}
	public boolean getVormittags()
	{
		return vormittags;
	}
}
