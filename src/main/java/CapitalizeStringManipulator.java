public class CapitalizeStringManipulator implements StringManipulator {

    @Override
    public String modify(String s) {
        return s.toUpperCase();
    }
}
