

import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList <String> oldPeople = new ArrayList();


    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList <String> list){

        int newPeople = 0;
        for(String name : list){
            if(!oldPeople.contains(name.toLowerCase())){
                oldPeople.add(name.toLowerCase());
                newPeople++;
            }
        }
        return newPeople;
    }



}




