public interface Comparator<C extends Shape> extends java.util.Comparator<Circle> {
    public int compare(Circle c1, Circle c2);

    @Override
    boolean equals(Object obj);
}
