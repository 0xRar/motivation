package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
        * this is motivation your friend and
        * your motivator
        *
        * every time you run it will give you a random quote
        * about Life, Education, Smile, Learning.
        *
        * By Isa Ebrahim (0xRar)
        * */

        Scanner input = new Scanner(System.in);
        String name, what;

        System.out.print("Whats your name my dear friend: ");
        name = input.nextLine();
        System.out.println("\n Hey "+ name + " im your friend motivation");

        System.out.print("\n Whats bringing you down today ?: ");
        what = input.nextLine();


        String motivation[] = {"Yesterday is not ours to recover, but tomorrow is ours to win or lose.",
                "Once you replace negative thoughts with positive ones, you'll start having positive results.",
                "The person who can bring the spirit of laughter into a room is indeed blessed.",
                "Live life to the fullest, and focus on the positive.",
                "Correction does much, but encouragement does more.",
                "Positive anything is better than negative nothing.",
                "Don't cry because it's over. Smile because it happened.",
                "A smile is a curve that sets everything straight.",
                "If you smile when no one else is around, you really mean it.",
                "Smile, it's free therapy.",
                "A smile is happiness you'll find right under your nose.",
                "Always keep your smile. That's how I explain my long life.",
                "A smile is the universal welcome.",
                "If you haven't seen your wife smile at a traffic cop, you haven't seen her smile her prettiest.",
                "As happy a man as any in the world, for the whole world seems to smile upon me!",
                "Because of your smile, you make life more beautiful.",
                "He who laughs most, learns best.",
                "Change is the end result of all true learning.",
                "Education is the key to unlock the golden door of freedom.",
                "Education is simply the soul of a society as it passes from one generation to another.",
                "Academic qualifications are important and so is financial education. They're both important and schools are forgetting one of them.",
                "Tell me and I forget. Teach me and I remember. Involve me and I learn.",
                "Nothing is impossible, the word itself says I’m possible",
                "None of us is as smart as all of us.",
                "Beauty is power; a smile is its sword.",
                "I don't smile as much as I should, even though I smile inside a lot.",
                "Start every day off with a smile and get it over with",
                "In real life, I'm a really smiley person. I smile when I talk and I laugh.",
                "It takes a man to suffer ignorance and smile.",
                "Always wear a smile because you never know who is watching."};

        Random rand = new Random();
        int rn = rand.nextInt(motivation.length);
        System.out.println("\n \t quote of the day");
        System.out.println("\t \t-------------------------------------------------------------");
        System.out.println("\t \t" + motivation[rn]);
        System.out.println("\t \t-------------------------------------------------------------");
        System.out.println("you should always smile "+ name + " don't let anything bring you down");
    }
}
