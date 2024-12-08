package software.ulpgc.rickandmorty;

public class CharacterApiAdapter implements CharacterAdapter{
    @Override
    public Character adapt(Object response) {
        return adapt((CharacterGetResponse.CharacterData) response);
    }


    private Character adapt(CharacterGetResponse.CharacterData response){
        return new Character(
                response.location(),
                response.image(),
                response.origin(),
                response.gender(),
                response.species(),
                response.status(),
                response.name(),
                response.id()
        );
    }
}
