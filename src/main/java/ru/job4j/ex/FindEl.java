package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Key " + key + " not found in value " + value);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"String", "null", "boss"}, "Four");
        } catch (ElementNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}