package software.ulpgc.rickandmorty;

import com.google.gson.Gson;

public class CharacterJsonDeserializer implements CharacterDeserializer{
    @Override
    public Object deserializer(String json) {
        return new Gson().fromJson(json, CharacterGetResponse.CharacterData.class);
    }
}
