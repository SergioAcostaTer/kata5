package software.ulpgc.rickandmorty;

public class Main {
    public static void main(String[] args) {
        CharacterLoader loader = new CharacterLoader(
                new CharacterApiReader(),
                new CharacterJsonDeserializer(),
                new CharacterApiAdapter()
        );


        for (int i = 0; i < 10; i++){
            System.out.println(loader.get());
        }

    }
}
