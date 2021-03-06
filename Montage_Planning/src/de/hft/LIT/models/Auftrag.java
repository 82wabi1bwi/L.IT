package grundgeruest;

public abstract class Auftrag {
	private int auftragsnr;
	private String status;
	private Kunde kunde;
	private boolean zugewiesen;
	private Rechner rechner;
	private double arbeitsaufwand;
	private static final int lieferzeit = 14;
	
	public Auftrag(int pAuftragsnr, String pStatus, Kunde pKunde, boolean pZugewiesen, Rechner pRechner)
	{
		auftragsnr = pAuftragsnr;
		status = pStatus;
		kunde = pKunde;
		zugewiesen = pZugewiesen;
		rechner = pRechner;
	}
	public void setAngelegt()
	{
		status = "angelegt";
	}
	public void disponieren()
	{
		status = "disponiert";
	}
	public void inBearbeitung()
	{
		status = "in Bearbeitung";
	}
	public void erledigt()
	{
		status = "erledigt";
	}
	public void imLager()
	{
		status = "im Lager";
	}
	public void setZugewiesen(boolean pZugewiesen)
	{
		zugewiesen = pZugewiesen;
	}
	public int getAuftragsnr()
	{
		return auftragsnr;
	}
	public String getStatus()
	{
		return status;
	}
	public Kunde getKunde()
	{
		return kunde;
	}
	public boolean getZugewiesen()
	{
		return zugewiesen;
	}
	public double getArbeitsaufwand()
	{
		return arbeitsaufwand;
	}
	public int getLieferzeit()
	{
		return lieferzeit;
	}
}	
