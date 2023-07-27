import Retos.Reto1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RetosTest {
    @Test
    public void testFindSubstringsAndSort() {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] expected = {"arp","live","strong"};
        assertArrayEquals(expected, Reto1.findSubstringsAndSort(a1, a2));
    }

    @Test
    public void testFindSubstringsAndSortEmpty() {
        String[] a1 = {"tarp", "mice", "bull"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] expected = {};
        String[] result = Reto1.findSubstringsAndSort(a1, a2);
        assertArrayEquals(expected,result);

    }

}
