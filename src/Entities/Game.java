package Entities;

import javax.xml.crypto.Data;
import java.util.Date;

public class Game {
    private int id;
    private String gameName;
    private Date releaseDate;
    private double price;

    public Game() {

    }

    public Game(int id, String gameName, Date releaseDate, double price) {
        this.setId(id);
        this.setGameName(gameName);
        this.setReleaseDate(releaseDate);
        this.setPrice(price);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}


