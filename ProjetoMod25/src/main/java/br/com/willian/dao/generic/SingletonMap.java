package br.com.willian.dao.generic;

import java.util.HashMap;
import java.util.Map;


public class SingletonMap {

    private static SingletonMap singletonMap;

    // Utiliza todos os registros do Sistema.
    protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }


    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
