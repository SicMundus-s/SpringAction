package raven.hub.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import raven.hub.tacocloud.models.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
