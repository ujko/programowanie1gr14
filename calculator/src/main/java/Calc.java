public class Calc {

    /**
     *
     * @param a
     * @param b
     * @return a + b
     * @throws IllegalArgumentException
     */
    public int add(int a, int b) throws IllegalArgumentException {
        return Math.addExact(a, b);
    }
}
