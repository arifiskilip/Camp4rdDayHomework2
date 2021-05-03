import Abstract.CampaingService;
import Adapters.MernisServiceAdapter;
import Concrate.CampaingManager;
import Concrate.CustomerManager;
import Concrate.GameManager;
import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        Game cs = new Game();
        cs.setId(1);
        cs.setGameName("Counter Strike");
        cs.setPrice(160);
        cs.setReleaseDate(new Date(2000,1,1));

        Game lol = new Game();
        lol.setId(2);
        lol.setGameName("Legue of Legends");
        lol.setPrice(200);
        lol.setReleaseDate(new Date(2014,1,1)); // oyunları yükledik

        CampaingManager campaingManager = new CampaingManager();
        Campaing campaing = new Campaing();
        campaing.setId(1);
        campaing.setCampaingName("%15");
        campaing.setCampaingRate(15);
        campaing.setExplanation("%15 Discount!!!!");
        campaingManager.add(campaing); //kampanyanın eklenmesi

        Customer arif = new Customer();
        arif.setId(1);
        arif.setFirstName("Arif");
        arif.setLastName("İskilip");
        arif.setNationalityId("11111111111");
        arif.setDateOfBirth(new Date(2000,2,1));
        CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
        customerManager.add(arif); //kullanıcı ekledik
        GameManager gameManager = new GameManager();
        gameManager.gameSale(arif,lol);
    }

}
