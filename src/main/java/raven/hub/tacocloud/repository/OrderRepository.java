package raven.hub.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import raven.hub.tacocloud.models.TacoOrder;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

}