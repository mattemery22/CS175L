
public class RoachPopulation {

	private double roachPopulation;
	private double sprayPct;

	public RoachPopulation (double sP)
	{
			roachPopulation=sP;
		
	}
	
	public void breed(){
		roachPopulation = roachPopulation*2;
	}
	public void spray(int spray)
	{
		sprayPct=spray*.01;
		roachPopulation = roachPopulation-(roachPopulation*sprayPct);
	}
	public double getRoachPopulation() {
		return roachPopulation;
	}
	


}
