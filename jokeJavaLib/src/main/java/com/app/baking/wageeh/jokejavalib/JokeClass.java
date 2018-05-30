package com.app.baking.wageeh.jokejavalib;

import java.util.Random;

public class JokeClass {

        private String[] jokes;
        private Random random = new Random();

        public JokeClass() {
            jokes = new String[5];
            jokes[0] = "he was ignoring me.\n" +
                       "I went through an expensive and painful procedure yesterday," +
                       " having had my spine and both testicles removed. Still, some of the wedding presents were fantastic.\n";
            jokes[1] = "My wife told me she needs more space. I said no problem and locked her out of\n" +
                       "the house.\n";
            jokes[2] = "What to give a man who’s got everything? A woman. She’ll tell him how everything works.\n" +
                       "\n";
            jokes[3] = "\n" +
                       "Marriage is an institution of three rings. Engagement ring, wedding ring and suffering.\n";
            jokes[4] = "Honey, do you think I gained weight?\n" +
                       "-\n" +
                       "No, I think the living room got smaller.\n";

        }
        public String getJoke() {
            int randomIndex = random.nextInt(jokes.length);
            return jokes[randomIndex];
        }
}
