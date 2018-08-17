package com.paulbriar.funfacts;

import java.util.Random;

public class FactBook {
    //Fields or Member variables - Properties about the object
    //Array of random facts
    private String[] facts = {
            "Nipple stimulation is the only scientifically proven method of legitimately bringing on labour.",
            "The longest known pregnancy lasted for a year and 10 days.",
            "Babies can taste the food their mothers eat in the womb.",
            "There are more twins born in Central Africa than in anywhere else in the developing world.",
            "It's possible to fall pregnant through oral sex. In fact, one woman conceived after oral sex and a knife fight.",
            "From the second trimester onwards, babies pee in the uterus. Then they drink it. Then they pee again. Then they drink it. You get the picture.",
            "In fact, amniotic fluid is mostly sterile urine.",
            "A baby starts making its first poo, called meconium, at around 21 weeks' gestation. However, it won’t pass it until after its birth.",
            "Pregnant woman and new mothers can lactate automatically when they hear a baby crying (even if it’s not their own).",
            "Baby girls are born with all the eggs they will ever use, but boys don't develop sperm until puberty.",
            "Rabbits, dogs, pigs, whales, and humans all start as eggs roughly the same size (around 0.2mm).",
            "The old wives’ tale is true: Pregnant women who suffer with heartburn ARE more likely to give birth to babies with full heads of hair.",
            "For every 2,000 babies, one is born with a tooth.",
            "Having a baby boy can increase the mother's risk of autoimmune diseases, and make her whatsitcalled worse. Forgetfulness, that's the word.",
            "Babies cry in the womb.",
            "A woman's uterus expands to more than 500 times its normal size over the course of a pregnancy.",
            "When a pregnant woman is full term, her placenta will produce more oestrogen in a day than a non-pregnant woman would produce in three years.",
            "In addition to her uterus, a woman's feet and heart increase in size during pregnancy.",
            "A baby's fingerprints are set within the first three months of pregnancy.",
            "Orgasms can cause contractions.",
    };

    //Methods = Actions the object can take
    public String getFact() {

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
