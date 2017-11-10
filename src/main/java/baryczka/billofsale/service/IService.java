package baryczka.billofsale.service;

import java.util.List;

public interface IService < T > {
    String save ( T t );

    String delete ( T t );

    T findOne ( Long id );

    List< T > getAll ();
}