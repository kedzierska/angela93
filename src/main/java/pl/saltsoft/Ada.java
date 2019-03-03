package pl.saltsoft;

import com.google.gson.Gson;

import java.io.*;

public class Ada {


    public void psy(Dog obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);

        System.out.println(json);
    }

    public Dog unpsy(String splaszczonyPies){
        Gson superAngine=new Gson();
        Dog szczeniaczek=superAngine.fromJson(splaszczonyPies,Dog.class);
        return szczeniaczek;
    }
}
