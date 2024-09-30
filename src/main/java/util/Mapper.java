package util;


public interface Mapper<E, D> {

    E convertToEntity(D dto);

    D convertToDto(E entity);
}
