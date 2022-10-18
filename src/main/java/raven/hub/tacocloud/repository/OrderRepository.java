package raven.hub.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raven.hub.tacocloud.models.TacoOrder;
@Repository
public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

}