import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {
    private PartitionLabels systemUnderTest;
    private Random random = new Random();
    private char[] allLowercaseLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    @BeforeEach
    void setUp() {
        systemUnderTest = new PartitionLabels();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test_partitionLabels_null_string() {
        List<Integer> actualResult = systemUnderTest.partitionLabels(null);
        assertTrue(actualResult.isEmpty());
    }

    @Test
    public void test_partitionLabels_empty_string() {
        List<Integer> actualResult = systemUnderTest.partitionLabels("");
        assertTrue(actualResult.isEmpty());
    }

    @Test
    public void test_partitionLabels_string_of_length_1() {
        List<Integer> actualResult = systemUnderTest.partitionLabels(String.valueOf(getRandomLowercaseLetter()));
        assertEquals(1, actualResult.size());
        assertEquals(1, actualResult.get(0));
    }

    @Test
    public void test_partitionLabels_hardcoded_input_1() {
        List<Integer> actualResult = systemUnderTest.partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(List.of(9, 7, 8), actualResult);
    }

    @Test
    public void test_partitionLabels_hardcoded_input_2() {
        List<Integer> actualResult = systemUnderTest.partitionLabels("eccbbbbdec");
        assertEquals(List.of(10), actualResult);
    }

    @Test
    public void test_partitionLabels_hardcoded_input_3() {
        List<Integer> actualResult = systemUnderTest.partitionLabels("ntswuqqbidunnixxpoxxuuupotaatwdainsotwvpxpsdvdbwvbtdiptwtxnnbtqbdvnbowqitudutpsxsbbsvtipibqpvpnivottsxvoqqaqdxiviidivndvdtbvadnxboiqivpusuxaaqnqaobutdbpiosuitdnopoboivopaapadvqwwnnwvxndpxbapixaspwxxxvppoptqxitsvaaawxwaxtbxuixsoxoqdtopqqivaitnpvutzchkygjjgjkcfzjzrkmyerhgkglcyffezmehjcllmlrjghhfkfylkgyhyjfmljkzglkklykrjgrmzjyeyzrrkymccefggczrjflykclfhrjjckjlmglrmgfzlkkhffkjrkyfhegyykrzgjzcgjhkzzmzyejycfrkkekmhzjgggrmchkeclljlyhjkchmhjlehhejjyccyegzrcrerfzczfelzrlfylzleefgefgmzzlggmejjjygehmrczmkrc");
        assertEquals(List.of(246, 254), actualResult);
    }

    private char getRandomLowercaseLetter() {
        return allLowercaseLetters[random.nextInt(allLowercaseLetters.length)];
    }
}