package week3;

import org.junit.jupiter.api.*;
import week3.labTask.FileUtils;
import week3.labTask.IPAddress;
import week3.labTask.IPSearch;

import static org.junit.jupiter.api.Assertions.*;

public class IPSearchTest {
    // IMPORTANT: DO NOT commit the entire CSV file; add it to .gitignore or keep it outside the repository.
    public static String filePath = "replace with path to your CSV";
    public static IPAddress[] ipAddresses;

    @BeforeAll
    public static void setUp() {
        ipAddresses = FileUtils.readFile(filePath);
    }

    @Test
    public void testValidIps() {
        assertEquals(ipAddresses.length, 4637053 );
        assertNotNull(ipAddresses[0]);
        assertNotNull(ipAddresses[4637052]);

        IPAddress ip = IPSearch.search(ipAddresses, "199.103.106.121");
        assert ip != null;
        assertEquals(3345443328L, ip.getStartIp());
        assertEquals(3345443583L, ip.getEndIp());
        assertEquals("CH", ip.getCountryCode());
        assertEquals("SWITZERLAND", ip.getCountry());
        assertEquals("BERN", ip.getRegion());
        assertEquals("BERN", ip.getCity());

        ip = IPSearch.search(ipAddresses, "201.116.231.242");
        assert ip != null;
        assertEquals(3379879936L, ip.getStartIp());
        assertEquals(3379884543L, ip.getEndIp());
        assertEquals("MX", ip.getCountryCode());
        assertEquals("MEXICO", ip.getCountry());
        assertEquals("DISTRITO FEDERAL", ip.getRegion());
        assertEquals("MEXICO CITY", ip.getCity());

        ip = IPSearch.search(ipAddresses, "189.2.141.102");
        assert ip != null;
        assertEquals(3171061088L, ip.getStartIp());
        assertEquals(3171061103L, ip.getEndIp());
        assertEquals("BR", ip.getCountryCode());
        assertEquals("BRAZIL", ip.getCountry());
        assertEquals("RIO DE JANEIRO", ip.getRegion());
        assertEquals("RIO DE JANEIRO", ip.getCity());

        ip = IPSearch.search(ipAddresses, "221.107.165.82");
        assert ip != null;
        assertEquals(3714534912L, ip.getStartIp());
        assertEquals(3714839295L, ip.getEndIp());
        assertEquals("JP", ip.getCountryCode());
        assertEquals("JAPAN", ip.getCountry());
        assertEquals("TOKYO", ip.getRegion());
        assertEquals("TOKYO", ip.getCity());

        ip = IPSearch.search(ipAddresses, "213.33.83.106");
        assert ip != null;
        assertEquals(3575730432L, ip.getStartIp());
        assertEquals(3575731455L, ip.getEndIp());
        assertEquals("AT", ip.getCountryCode());
        assertEquals("AUSTRIA", ip.getCountry());
        assertEquals("WIEN", ip.getRegion());
        assertEquals("VIENNA", ip.getCity());

        ip = IPSearch.search(ipAddresses, "85.239.1.253");
        assert ip != null;
        assertEquals(1441726464L, ip.getStartIp());
        assertEquals(1441729023L, ip.getEndIp());
        assertEquals("KW", ip.getCountryCode());
        assertEquals("KUWAIT", ip.getCountry());
        assertEquals("AL ASIMAH", ip.getRegion());
        assertEquals("KUWAIT", ip.getCity());

        ip = IPSearch.search(ipAddresses, "112.72.24.183");
        assert ip != null;
        assertEquals(1883770880L, ip.getStartIp());
        assertEquals(1883783167L, ip.getEndIp());
        assertEquals("KR", ip.getCountryCode());
        assertEquals("KOREA, REPUBLIC OF", ip.getCountry());
        assertEquals("KYONGGI-DO", ip.getRegion());
        assertEquals("SUWON", ip.getCity());

        ip = IPSearch.search(ipAddresses, "28.144.226.114");
        assert ip != null;
        assertEquals(469762048L, ip.getStartIp());
        assertEquals(520093695L, ip.getEndIp());
        assertEquals("US", ip.getCountryCode());
        assertEquals("UNITED STATES", ip.getCountry());
        assertEquals("OHIO", ip.getRegion());
        assertEquals("COLUMBUS", ip.getCity());

        ip = IPSearch.search(ipAddresses, "9.117.114.203");
        assert ip != null;
        assertEquals(156626432L, ip.getStartIp());
        assertEquals(159386111L, ip.getEndIp());
        assertEquals("US", ip.getCountryCode());
        assertEquals("UNITED STATES", ip.getCountry());
        assertEquals("NEW YORK", ip.getRegion());
        assertEquals("ARMONK", ip.getCity());

        ip = IPSearch.search(ipAddresses, "127.0.0.1");
        assert ip != null;
        assertEquals(2130706432L, ip.getStartIp());
        assertEquals(2147483647L, ip.getEndIp());
        assertEquals("-", ip.getCountryCode());
        assertEquals("-", ip.getCountry());
        assertEquals("-", ip.getRegion());
        assertEquals("-", ip.getCity());
    }

    @Test
    public void testInvalidIps() {
        assertEquals(ipAddresses.length, 4637053);
        assertNotNull(ipAddresses[0]);
        assertNotNull(ipAddresses[4637052]);

        IPAddress ip = IPSearch.search(ipAddresses, "255.255.255.260");
        assertNull(ip);

        ip = IPSearch.search(ipAddresses, "435.352.234.566");
        assertNull(ip);
    }

}
