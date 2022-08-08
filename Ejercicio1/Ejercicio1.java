import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio1 {
    public static void main(String args[]) {
        
        ArrayList<String> sitiosWeb = new ArrayList<>(List.of("www.cs.princeton.edu", "128.112.136.12",
				"www.cs.princeton.edu", "128.112.136.11",
				"www.princeton.edu", "128.112.128.15",
				"www.yale.edu", "130.132.143.21",
				"www.simpsons.com", "209.052.165.60",
				"www.apple.com", "17.112.152.32",
				"www.amazon.com", "207.171.182.16",
				"www.ebay.com", "66.135.192.87",
				"www.cnn.com", "64.236.16.20",
				"www.google.com", "216.239.41.99",
				"www.nytimes.com", "199.239.136.200",
				"www.microsoft.com", "207.126.99.140",
				"www.dell.com", "143.166.224.230",
				"www.slashdot.org","66.35.250.151",
				"www.espn.com", "199.181.135.201",
				"www.weather.com", "63.111.66.11"));

        HashMap<String, ArrayList<String>> tabla = new HashMap<String, ArrayList<String>>();
        int iteraciones = sitiosWeb.size()/2;

        for (int i = 0; i < iteraciones; i++) {
            String direccion = sitiosWeb.get(2*i);
            String ip = sitiosWeb.get(2*i + 1);

            if (!tabla.containsKey(direccion))
                tabla.put(direccion, new ArrayList<String>());
            tabla.get(direccion).add(ip);
        }
        /*test1
        System.out.println("www.cs.princeton.edu" + " : " + tabla.get("www.cs.princeton.edu"));
        System.out.println("www.amazon.com" + " : " + tabla.get("www.amazon.com"));
        System.out.println("www.ebay.com" + " : " + tabla.get("www.ebay.com"));
        System.out.println("www.google.com" + " : " + tabla.get("www.cnn.com"));*/

        //test2
        for (String key : tabla.keySet())
            System.out.println(key + " : " + tabla.get(key));
    }
}
