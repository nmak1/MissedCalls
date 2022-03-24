public enum Group {
    WORK,
    FRIENDS,
    FAMILY;

    @Override
    public String toString() {
        return super.toString();
    }

    public static <T extends Enum<T>> T valueOf(Class<T> enumClass, String name) {
        return Enum.valueOf(enumClass, name);
    }


}
