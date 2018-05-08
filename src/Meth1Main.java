import java.util.Arrays;

public class Meth1Main {

	public static void main(String[] args) {
		int v = 22;
		System.out.println("Inainte:" + v);

		increment(v);
		System.out.println("Dupa:" + v);
		
		int[] varr = {1};
		System.out.println("Arr Inainte:" + Arrays.toString(varr));
		increment(varr);
		System.out.println("Arr dupa:" + Arrays.toString(varr));
		
		byte b1 = 1;
		increment(b1);
		System.out.println("Dupa b1:" + b1);

		long l1 = 1;
		increment((int)l1);
	
	}

	// Semnatura "increment(int)"
	static void increment(int pValue) {
		System.out.println("in increment:" + pValue);
		pValue = pValue + 1;
		System.out.println("in increment dupa:" + pValue);
		takeAPeek("increment(int)");

	}
	
	static void takeAPeek(String pos) {
		try {
			throw new RuntimeException(pos);
		} catch(Throwable th) {
			th.printStackTrace();
		}
	}

	// Semnatura "increment(int[])"
	static void increment(int[] pValue) {
		System.out.println("in increment[]:" + Arrays.toString(pValue));
		pValue[0] = pValue[0] + 1;
		if(true) {
			return;
		}
		System.out.println("dupa increment[]:" + Arrays.toString(pValue));
		takeAPeek("increment(int[])");

	}
	
	static final int DEFAULT_HTTP_PORT = 80;
	
	// Overload si parametri default
	static void openConnection(String host) {
		openConnection(host, DEFAULT_HTTP_PORT);
	}
	
	static void openConnection(String host,int port) {
		System.out.println("Aici este actiunea");
	}

}
