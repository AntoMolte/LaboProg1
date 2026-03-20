package ch.samt.dictionary;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, Entry> vocaboli = new HashMap<>();

    public Dictionary() {
        this.vocaboli = new HashMap<>();
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
