public class Element implements Comparable<Element>{

    private Object element;

    public Element(Object element) {
        this.element = element;
    }

    @Override
    public int compareTo(Element other) {
        if (element.getClass().equals(other.element.getClass())) {

            return ((Comparable<Object>) element).compareTo(other.element);
        } else {

            return element.toString().compareTo(other.element.toString());
        }
    }

}
