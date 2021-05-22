package com.example.consoletextanalyzer;

import java.io.*;
public class Text {

    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\ericn\\IdeaProjects\\console-text-analyzer\\src\\main\\resources\\text");/*C:\Users\ericn\OneDrive\Desktop*/
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters
        int countWord = 0;
        int characterCount = 0;
        int startingWithUppercase = 0;
        int characterCount1 = 0;
        int whitespaceCount = 0;

        // Reading line by line from the
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                //paragraphCount++;
            } else {


                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                characterCount += line.length();
                countWord += wordList.length;
                whitespaceCount += countWord -1;
                 //[!?.:]+ is the sentence delimiter in java
                /*String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;*/

                for (int k = 0; k < line.length(); k++) {
                    // Check for uppercase letters.
                    if (Character.isUpperCase(line.charAt(k))) startingWithUppercase++;
                }
            }

        }

        System.out.println(" => " + countWord + " word/s");
        System.out.println("-C => " + countWord + " word/s "  + (characterCount - whitespaceCount) + " symbols");
        System.out.println("-L => " + startingWithUppercase  + " word/s " + characterCount1 + " symbols");
    }
}

