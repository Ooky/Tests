package GenericClass;

public class GenericClass<T> {

    private T store;

    public void save(final T object) {
        this.store = object;
    }
    
    public T get() {
        return this.store;
    }
    
}
