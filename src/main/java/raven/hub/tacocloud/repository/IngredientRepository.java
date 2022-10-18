package raven.hub.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raven.hub.tacocloud.models.Ingredient;

@Repository
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
