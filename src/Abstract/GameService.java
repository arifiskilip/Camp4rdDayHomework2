package Abstract;

import Entities.Customer;
import Entities.Game;

public interface GameService {
    void gameSale(Customer customer, Game game);
}
