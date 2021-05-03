package Entities;

public class Campaing {
    private int id;
    private String campaingName;
    private double campaingRate;
    private String explanation;

    public  Campaing()
    {

    }

    public Campaing(int id, String campaingName, double campaingRate, String explanation) {
        this.setId(id);
        this.setCampaingName(campaingName);
        this.setCampaingRate(campaingRate);
        this.setExplanation(explanation);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaingName() {
        return campaingName;
    }

    public void setCampaingName(String campaingName) {
        this.campaingName = campaingName;
    }

    public double getCampaingRate() {
        return campaingRate;
    }

    public void setCampaingRate(double campaingRate) {
        this.campaingRate = campaingRate;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
