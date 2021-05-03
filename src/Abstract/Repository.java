package Abstract;

public interface Repository<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
}
