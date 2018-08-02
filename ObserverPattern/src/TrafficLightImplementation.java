/*
 * TrafficLightsImplementation class is used to test weather the
 * updates are working properly or not. It contains 
 * the main method.
 */
public class TrafficLightImplementation {
	public static void main(String args[]){
		TrafficLights trafficLightsn=new TrafficLights();
		TrafficLights trafficLightss=new TrafficLights();
		TrafficLights trafficLightse=new TrafficLights();
		TrafficLights trafficLightsw=new TrafficLights();

		North north=new North(trafficLightsn);		
		South south=new South(trafficLightss);		
		East east=new East(trafficLightse);		
		West west=new West(trafficLightsw);
		while(true){
			System.out.println("\nCASE_1: North and South STOP\n\tEast and West GO\n");
			trafficLightsn.setValues(true,false,false);
			trafficLightss.setValues(true,false,false);
			trafficLightse.setValues(false,false,true);
			trafficLightsw.setValues(false,false,true);

			System.out.println("\nCASE_2: North and South STOP\n\tEast and West SLOW DOWN\n");
			trafficLightsn.setValues(true,false,false);
			trafficLightss.setValues(true,false,false);
			trafficLightse.setValues(false,true,false);
			trafficLightsw.setValues(false,true,false);

			System.out.println("\nCASE_3: North and South GO\n\tEast and West STOP\n");
			trafficLightsn.setValues(false,false,true);
			trafficLightss.setValues(false,false,true);
			trafficLightse.setValues(true,false,false);
			trafficLightsw.setValues(true,false,false);

			System.out.println("\nCASE_4: North and South SLOW DOWN\n\tEast and West STOP\n");
			trafficLightsn.setValues(false,true,false);
			trafficLightss.setValues(false,true,false);
			trafficLightse.setValues(true,false,false);
			trafficLightsw.setValues(true,false,false);
		}
	}
}