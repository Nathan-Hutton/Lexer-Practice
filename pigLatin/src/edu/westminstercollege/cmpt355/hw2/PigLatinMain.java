package edu.westminstercollege.cmpt355.hw2;

import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;

public class PigLatinMain {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);

        while (true) {
            String user_input = in.nextLine();

            if (user_input.isBlank()) {
                break;
            }

            var lexer = new PigLatinLexer(CharStreams.fromString(user_input));

            while (true) {
                var token = lexer.nextToken();
                if (token.getType() == PigLatinLexer.EOF)
                    break;
                if (token.getType() == PigLatinLexer.VOWELSTART)
                    System.out.print(token.getText() + "ay");
                if (token.getType() == PigLatinLexer.SMALLWORD)
                    System.out.print(token.getText());
                if (token.getType() == PigLatinLexer.COMMENT)
                    System.out.print(token.getText());
                if (token.getType() == PigLatinLexer.PAIRWORD) {
                    String word = token.getText();
                    System.out.print(word.substring(2) + word.substring(0, 2) + "ay");
                }
                if (token.getType() == PigLatinLexer.CONSONANTWORD) {
                    String word = token.getText();
                    int first_vowel_index = 0;
                    for (char letter : word.toCharArray()) {
                        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                            break;
                        }
                        first_vowel_index++;
                    }

                    System.out.print(word.substring(first_vowel_index) + word.substring(0, first_vowel_index) + "ay");
                }
            }
        }
    }
}
