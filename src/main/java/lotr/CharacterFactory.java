package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCaracter() {
        Character[] possible_characters = {new Hobbit(), new Elf(), new King(), new Knight()};
        int a = new Random().nextInt(possible_characters.length);
        return possible_characters[a];
    }
}