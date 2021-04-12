package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception{
        var legoset=new LegoSet();
        legoset.setName("Imperial Tie Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setPackaging(Packaging.BOX);

        var tags=new HashSet<String>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoset.setTags(tags);

        var minifigs=new ArrayList<Minifig>();
        minifigs.add(new Minifig("Imperial Mudtrooper",2));
        minifigs.add(new Minifig("Imperial Pilot",1));
        minifigs.add(new Minifig("Mimban Stormtrooper ",1));
        legoset.setMinifigs(minifigs);

        legoset.setRatings(new Rating(468,4.4));

        legoset.setNumber("75211");
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
    }
}
