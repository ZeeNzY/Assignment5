package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.Persons.Actors;

public interface MainRepository<T, ID>{

        T create(T t);
        T update(T t);
        void delete(ID id);
        T read(ID id);
}
