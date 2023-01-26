package edu.westminstercollege.cmpt355.hw2;

import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;
public class GingerMain {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);

        while (true) {
            String user_input = in.nextLine();

            if (user_input.isBlank()) {
                break;
            }

            var lexer = new GingerLexer(CharStreams.fromString(user_input));

            while (true) {
                var token = lexer.nextToken();
                if (token.getType() == GingerLexer.EOF)
                    break;
                if (token.getType() == GingerLexer.GINGER)
                    System.out.println("GINGER");
                if (token.getType() == GingerLexer.BLAH)
                    System.out.println("blah");
                if (token.getType() == GingerLexer.WHITESPACE)
                    System.out.println(" ");
            }
        }
    }
}
