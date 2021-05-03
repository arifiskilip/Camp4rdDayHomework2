package Concrate;

import Abstract.CampaingService;
import Abstract.Repository;
import Entities.Campaing;

public class CampaingManager implements CampaingService, Repository<Campaing> {
    @Override
    public void add(Campaing campaing) {
        System.out.println("Added to : "+campaing.getCampaingName());
    }

    @Override
    public void delete(Campaing campaing) {
        System.out.println("Deleted to : "+campaing.getCampaingName());
    }

    @Override
    public void update(Campaing campaing) {
        System.out.println("Updated : "+campaing.getCampaingName());
    }
}
