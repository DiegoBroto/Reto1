package Retos;

import java.util.*;

public class Reto1 {

    /*public static void main(String[] args) {
    //public void CualesEstanDentro(String[] args) {

    //    String[] a1 = {"arp", "live", "strong"};
    //    String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] a1 = {"tarp", "mice", "bull"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        StringBuilder sBuilder = new StringBuilder();

        for (int i = 0; i < a2.length; i++) {
            sBuilder.append(a2[i] + " ");
        }
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < a1.length; i++) {
            if (sBuilder.indexOf(a1[i]) != -1)
                l.add(a1[i]);
        }

        System.out.println(Arrays.toString(l.toArray()));

    }
*/
    public static String[] findSubstringsAndSort(String[] a1, String[] a2) {
        StringBuilder sBuilder = new StringBuilder();

        for (int i = 0; i < a2.length; i++) {
            sBuilder.append(a2[i] + " ");
        }
        List<String> l = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            if (sBuilder.indexOf(a1[i]) != -1)
                l.add(a1[i]);
        }
        String arr[] = l.toArray(new String[l.size()]);
        System.out.println(Arrays.toString(l.toArray()));
        return arr;
    }
}