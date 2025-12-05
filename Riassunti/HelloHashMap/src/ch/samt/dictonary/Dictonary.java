package ch.samt.dictonary;

import java.util.HashMap;

public class Dictonary {
    private HashMap<String, Entry> vocaboli;

    public Dictonary() {
        vocaboli = new HashMap<>();
    }

    public void aggiungi(Entry e){
        vocaboli.put(e.getParolaItaliano(), e);
    }

    public Entry cerca(String parolaItaliano){
        return vocaboli.get(parolaItaliano);
    }

    public void stampaTutto(){
        for (Entry e : vocaboli.values()) {
            System.out.println(e.toString());
        }
    }
}
