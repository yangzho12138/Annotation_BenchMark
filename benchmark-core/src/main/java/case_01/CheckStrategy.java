package case_01;

public interface CheckStrategy<T, U, V> {
    boolean checkIsConflict(T importEntity, U existEntity, V conflictInfo);
}
