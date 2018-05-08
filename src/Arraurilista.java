import java.util.ArrayList;


public class Arraurilista {

	public static void main(String[] args) {
		ArrayList<String> avioane = new ArrayList();
		 
		String avionBoeing = "Boeing";
		String avionAirbus = "Airbus";
		String avionConcorde = "Concorde";
		String avionIAR = "IAR";
		String avionCessna = "Cessna";
		String avionLockheed = "Lockheed";
		 
		avioane.add(avionBoeing);
		avioane.add(avionAirbus);
		avioane.add(avionConcorde);
		avioane.add(avionIAR);
		avioane.add(avionCessna);
		avioane.add(avionLockheed);
		
		avioane.add("Cumatra");
		System.out.println(avioane);
		System.out.println(avioane.get(4));
		
		int index = avioane.lastIndexOf(avionCessna);
		System.out.println(index);
		index = avioane.indexOf(avionLockheed);
		System.out.println(index);
		avioane.remove(2);
		System.out.println(avioane);
		
		ArrayList<Integer> numImp = new ArrayList();
		numImp.add(2);
		numImp.add(13);
		System.out.println(numImp);
		numImp.set(numImp.size()-1, 33);
		System.out.println(numImp);
		
		int num = 33;
		System.out.println(numImp.contains(num));
	}

}
