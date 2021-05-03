package Concrate;

import Abstract.GameService;
import Abstract.Repository;
import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService, Repository<Game> {
    Campaing campaing;

    @Override
    public void gameSale(Customer customer, Game game) {
        game.setPrice(game.getPrice());
        System.out.println("Game purchased for "+customer.getFirstName()+": "+game.getGameName());
    }

    @Override
    public void add(Game game) {
        System.out.println("Added to : "+game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Deleted to : "+game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Updated : "+game.getGameName());
    }
}
