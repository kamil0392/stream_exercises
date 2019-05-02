import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Exercise1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","abc","bcd");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    /**
     * Filters input array and returns only strings that start with c letter case insensitive
     *
     * @param names
     * @return
     */
    public List<String> task1(String[] names) {
        return null;
    }

    /**
     * Finds longest element from input array
     *
     * @param names
     * @return
     */
    public String task2(String[] names) {
        return Arrays.stream(names).max(Comparator.comparingInt(String::length)).get();
    }

    /**
     * Filters names with even length
     *
     * @param names
     * @return
     */
    public List<String> task3(String[] names) {
        return null;
    }


    /**
     * Returns List with each name reverted
     *
     * @param names
     * @return
     */
    public List<String> task4(String[] names) {
        return null;
    }

    /**
     * Computes sum of letters of all names
     *
     * @param names
     * @return
     */
    public int task5(String[] names) {
        return 0;
    }

    /**
     * Computes average length of names
     *
     * @param names
     * @return
     */
    public double task6(String[] names) {
        return 0;
    }

    /**
     * Returns a comma separated string based on a given list of integers.
     * Each element should be preceded by the letter 'e' if the number is even,
     * and preceded by the letter 'o' if the number is odd.
     *
     * @param numbers
     * @return
     */
    public String task7(List<Integer> numbers) {
        return null;
    }

    /**
     * Returns List of Strings created by add '+' sign at the beginning and end of each number
     *
     * @param numbers
     * @return
     */
    public List<String> task8(List<Integer> numbers) {
        return null;
    }
}
