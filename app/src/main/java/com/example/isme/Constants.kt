package com.example.isme

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val CATEGORY: String = "category"


    const val FUN_FACT_RENAISSANCE_ONE: String = "It took 4 years to paint the ceiling of Sixtine Chapel? Michelangelo began painting it in 1508 and completed in 1512. " +
            "It was revealed that the artist was actually forced to do the comission and he did not enjoy his work. "
    const val FUN_FACT_RENAISSANCE_THREE: String="The original version it was modified. Michelangelo's work contained nudity that was covered by another painter, because although it was common to see nudity in the Renaissance art, the Papal Master of Ceremonies considered to be disgraceful"
    const val FUN_FACT_RENAISSANCE_TWO: String= "He supossedly designed God. The stereotypical depiction of God it can be traced back to the ceiling of the chapel.Before him God was usually depicted as a hand coming down from the clouds."
    const val FUN_FACT_RENAISSANCE_FOUR: String = "He was paid 3000 ducats(aproximatelt 78 000 dollars), but his work is worth near a billion dollars in present"
    const val FUN_FACT_RENAISSANCE_FIVE: String = "The Vitruvian Man of Leonardo DaVinci illustrates what he believed to be a divine connection between the human form and the universe? Da Vinci is describing that every part of the human body can fit within another, showing geometrical perfection within the human body."


    const val FUN_FACT_ROCOCO_ONE: String = "1. Rococo began with interior decoration. "+ "The name of the perios comes from the French word 'rocaille'. \" +\n" +
            "            \"It refers to the shell and rock ornamentation used in man-made grottoes." + "and King Louis XV used as as a display of his power"
    const val FUN_FACT_ROCOCO_TWO: String = "2. Frivolity and superficiality are defining characteristic of Rococo. Rococo is infamaous for being the art of the wealthy for the wealthy." +
            " Like its king, it indulged in pleasure while majority of the French population was in poverty."
    const val FUN_FACT_BAROC_THREE: String= "3.Francois Boucher introduced carnal and erotic themes in Rococo."
    const val FUN_FACT_BAROC_FOUR: String= "4. Baroque Art was made for religious propaganda."
    const val FUN_FACT_BAROC_FIVE: String= "5. The baroque style became a symbol of wealth and power."

    const val FUN_FACT_NINETH_ONE: String="1. Monet created a bateau-atelier, or studio boat, from which he painted many of his water-scene works."
    const val FUN_FACT_NINETH_TWO: String="2. Monet not only painted the Water Lilies, he planted them too."
    const val FUN_FACT_NINETH_THREE: String="3. Monet conducted light experiments, capuring the same scene in different light and also in different wheather."
    const val FUN_FACT_NINETH_FOUR: String="4. Renoir had a unique color theory. For him shadows were not black or brown, but multicolored."
    const val FUN_FACT_NINETH_FIVE: String="5. Edgar Degas was best known for his depictions of dancers."

    const val FUN_FACT_MODERNISM_ONE: String="1. Picasso was a co-founder in the movement known as Cubism."
    const val FUN_FACT_MODERNISM_TWO: String="2. The Nazis would not let Picasso display his paintings in Germany"
    const val FUN_FACT_MODERNISM_THREE: String="3.The work of Salvador Dali was greatly influenced by Sigmund Freud's theory on psychoanalysis and sexual repression."
    const val FUN_FACT_MODERNISM_FOUR: String="4. Some historians suggested that Dali's melted clocks were inspired by Albert Einstein's general theory of relativity, but he denied this, citing the recollection of Camambert cheese he had seen melt in the sun"
    const val FUN_FACT_MODERNISM_FIVE: String="5. 'Starry Night' of van Gogh was created in an asylum, where he was diagnosed with acute mania with generalised delirium."



    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1,
            "What is the name and who is the author of this painting?",
            R.drawable.reneissance,
            "The school of Athens, Raffaello",
            "Pieta, ",
            "Bazilica San Pietro",
            "The fall of Man",
            1
        )
        questionsList.add(que1)

        //que2
        val que2 = Question(2,
        "Who is the author of the painting 'The birth of Venus?'",
        R.drawable.venus,
        "Leonardo Da Vinci",
        "Tiziano",
            "Sandro Boticelli",
        "Raffaello",
        3)
        questionsList.add(que2)
        //que3
        val que3 = Question(
            3,
            "In which country began the Renaissance?",
            R.drawable.blank,
            "France",
            "Germany",
            "Spain",
            "Italy",
            4)
        questionsList.add(que3)

        //que4
        val que4 = Question(
            4,
            "What is the title and the author of this painting?",
            R.drawable.monalisa,
            "Gioconda, Da Vinci",
            "Venus of Urbino, Tiziano",
            "Lady with an ermine, Da Vinci",
            "Arnolfini Portrait, Jan Van Eyck",
            1)
        questionsList.add(que4)
        //que5
        val que5 = Question(
            5,
            "In which city did Renaissance debute? ",
            R.drawable.blank,
            "Venice",
            "Milano",
            "Padova",
            "Florence",
            4)
        questionsList.add(que5)
        //que6
        val que6 = Question(
            6,
            "Who is the author of the painting 'Primavera' ?",
            R.drawable.primavera,
            "Boticelli",
            "Tiziano",
            "Raffaello",
            "Donatello",
            1)
        questionsList.add(que6)
        //que7
        val que7 = Question(
            7,
            "What is the title and who is the author of this painting?",
            R.drawable.creation0fadam,
            "The Creation of Adam, Michelangelo Caravaggio",
            "Bachus and Ariadne, Tiziano",
            "The Baptism of Christ, Verrocchio",
            "The Creation of Adam, Michelangelo Buonarroti",
            4)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "In which period of time took place the Renaissance?",
            R.drawable.blank,
            "14th century to the 17th century",
            "13th century to the 16th century",
            "14th century to the 16th century",
            "13th century to the 17th century",
            1)
        questionsList.add(que8)

        //que9
        val que9 = Question(
            9,
            "What is the name of the following painting?",
            R.drawable.sistine,
            "Sistine Madona",
            "Mdonna della Melagrana",
            "Holy family(Doni Tondo)",
            "Madonna Cardellino",
            1)
        questionsList.add(que9)
        val que10 = Question(
            10,
            "What are the main characteristics of the Renaissance?",
            R.drawable.blank,
            "classicism, naturalism, laicism,linear perspective, realism",
            "dadaism, suprarealism, manierism, linear perspective",
            "secesionism, laicism, linear perspective, medievalism",
            "classicism, idealism, naturalism,linear perspective, expresionism",
            1)

        //que10

        questionsList.add(que10)
        questionsList.shuffle()
        return questionsList

    }
    fun getQuestionsRococo(): ArrayList<Question> {
        val questionsListR = ArrayList<Question>()
        val q1 = Question(1, "What is the title and the author of this painting?",
        R.drawable.lasmeninas, "The Education of the Princess", "Judgement of Paris, Peter Paul Rubens",
            "The lady of Shalott, John William Waterhouse","Las Meninas, Diego Velazquez", 4)
        questionsListR.add(q1)

        val q2 = Question(2, "What is the author and the title pf this painting?",
            R.drawable.nightwatch, "Nightwatch, Rembrandt van Riju", "The Calling of St Matthew,Rembrandt Van Riju", "Liberty leading the people, Eugene Delacroix ","The Calling of St Matthew, Carravagio", 1)
        questionsListR.add(q2)

        val q3 = Question(3, "Who is the author of the Abduction of Sabine Woman painting?",
            R.drawable.theabductionofthesabinewoman, "Carravagio", "Rubens", "Jan Brueghel the Younger","Jan Bruegel the Elder", 3)
        questionsListR.add(q3)

        val q4 = Question(4, "Who is the author of The Calling of St Matthew painting?", R.drawable.thecallingofmatthew, "Diego Velazquez", "Friederich Overbeck", "Paul Delaroche", "Carravagio", 4)
        questionsListR.add(q4)
        val q5 = Question(5, "What is the title of this painting created by Peter Paul Rubens?", R.drawable.theeducationoftheprincess, "The Bathers", "Les Demoiselles","The Education of the Princess", "The Wipping Woman", 3)
        questionsListR.add(q5)
        val q6 = Question(6, "What is the title of this painting created by Jan Brueghel The Elder?", R.drawable.theentryoftheanimalsintonoahark, "The entry of the Animals into Noah's Ark", "Landscape with a calm","The Meeting", "The Embarkation for Cythera", 1)
        questionsListR.add(q6)
        val q7 = Question(7, "What is the title and who is the author of the following painting?",R.drawable.judgementofparis,"The Bathers, Jean-Honore Fragonard","Judgement of Paris ","Divan Japonais","Les Demoiselles",1)
        questionsListR.add(q7)
        val q8 = Question(8, "What is the title and who is the author of the following painting", R.drawable.allegoryofwar,"The battle of Amazons, Peter Paul Rubens","Pierrot, Jean-Antoine Watteau","The Meeting, Jean-Honore Fragonard","Allegory of War, Jan Brueghel The Younger",4)
        questionsListR.add(q8)
        val q9 = Question(9,"Who painted 'The Battle of the Amazons'?", R.drawable.thebattleofamazons, "Peter Paul Rubens"," Carravagio","Peter Paul Rubens and Jan Bruegel the Elder","Jan Bruegel the Younger and Jan Brugel the Elder", 3)
        questionsListR.add(q9)
        val q10 = Question(10,"What is the name of this painting?", R.drawable.landscapewithacalm,"Landscape with a Calm"," The Entrance to the Grand Canal", "Soap Bublles", "The hippodrome", 1)

        questionsListR.add(q10)
        val q11 = Question(11, "Who is the author of the painting 'The triumph of Bachus'?", R.drawable.triumfulluibachus, "Diego Velazquez", "Carravagio", "Francois Boucher", "Giovanni Battista Tiepolo", 1)
        questionsListR.add(q11)
        val q12 = Question(12, "What is the title of this painting made by Nicolas Poussin?", R.drawable.apollosimuzele, "Apollo and the muses", "The death of Adonis", "Artemios", "The Meeting", 1)
        questionsListR.add(q12)
        val q13 = Question(13, "Who is the author of the painting 'Peasent's dance'?", R.drawable.danstaranesc, "Jean Simeon Chardin", "Peter Paul Rubens", "Sebastioano del Piombo", "Raphael",2)
        questionsListR.add(q13)
        val q14 = Question(14, "Who is the author of 'The Swing'?", R.drawable.theswing, "Francois Boucher", "Raphael", "Antoine Watteau", "Jean Honore Fragonard", 4)
        questionsListR.add(q14)
        val q15 = Question(15, "What is the title and who painted this painting?", R.drawable.triumphofvenus,"The Embarkation for Cythera, Jean Antoin Watteau", "Triumph of Venus, Francois Boucher", "Venus of Urbino, Tiziano", "The Bathers, Jean Honore Fragonard", 2)
        questionsListR.add(q15)
        val q16 = Question(16, "What is the title and who painted this painting?", R.drawable.portraitofmadameofpompadour, "Divan japonais, Henri Toulouse Loutrec", " Le demoiselles D'Avignon, Picasso", "Portrait of Madame Pompadour, Francois Boucher", "Lady with an ermine, Leonardo Da Vinci", 3)
        questionsListR.add(q16)
        val q17 = Question(17, "What is the title and who is teh author of this painting?", R.drawable.pierrot, "Arnolfi Portrait, Jan Van Eick", "Portrait of young man, Mirza Gadim Irvani", "Snap the whip,  Winslow Homer", "Pierrot, Jean-Antoine Watteau", 4)
        questionsListR.add(q17)
        val q18 = Question(18, "What is the title of this painting created by Jean-Honore Fragonard?", R.drawable.themeeting, "The Meeting", "The triumph of Bachus", "Dejuner sur l'herbe", "Liberty leading people", 1)
        questionsListR.add(q18)
        val q19 = Question(19, "What is the title of this painting created by Giovanni Battisto Tiepolo?", R.drawable.allegoryofplanetsandcontinents, "Allegory of war", " The battle of Amazons","Apollo and the muses", "Allegory of Planets and continents", 4)
        questionsListR.add(q19)
        val q20 = Question(20, "Who is the author of Soap Bubbles painting?",R.drawable.soapbubbles, "Eugene Delacroix", "Jean-Baptise-Simeon Chardin","Jean=Honore Fragonard","Paul Delaroche", 2)
        questionsListR.add(q20)
        val q21 = Question(21,"What is the title and who is the author of this painting",R.drawable.thebathers, "The Bathers, Jean-Honore Fragonard", "Diana bathing, Francois Boucher","Apollo and the muses, Nicolas Poussin","Las Meninas, Diego Velazquez",1)
        questionsListR.add(q21)
        questionsListR.shuffle()
        return questionsListR
    }

    //19th
    fun getQuestionNineteen(): ArrayList<Question>{
        val questionListNineteen = ArrayList<Question>()

        val qu1 = Question(1, "", R.drawable.italyandgermany, "Italy and Germany, Friederich Overbeck","Triumph of Venus, Francois Boucher","Venus of Urbino, Tiziano","Portrait of Madame Pompadour, Francois Bpucher",1)
        questionListNineteen.add(qu1)
        val qu2 = Question(2,"",R.drawable.portraitofyoungman,"Eduard Manet","Mirza Gadim Irvani","Paul Delaroche","",2)
        questionListNineteen.add(qu2)
        val qu3 = Question(3, "",R.drawable.theexecutionofladyjanegrey, "Theodore Gericault","Francois Boucher","Paul Delaroche","David Wilkie",3)
        questionListNineteen.add(qu3)
        val qu4 = Question(4, "What is the title of thhis painting created by Winslow Homer",R.drawable.snapthewhip, "Snap the whip","The Gleaners","Pierrot","Bird",4)
        questionListNineteen.add(qu4)
        val qu5 = Question(5,"Who is the author of 'La grande odalisque?'",R.drawable.legrandeodalisque,"Jean-Auguste-Dominique Ingres","Winslow Homer","Georges Seurat","Georges Braque",1)
        questionListNineteen.add(qu5)
        val qu6 = Question(6, "What is the title and who is the author of this painting?", R.drawable.chelseapensionersreading,"The Waterloo Dispatch, Friederich Overbeck","Chelsea Pensioners Reading, David Wilikie","The Meeting,Jean Honore Fragonard","Snap the whip, Winslow Homer",2)
        questionListNineteen.add(qu6)
        val qu7 = Question(7,"What is the title and who is the author of this painting?",R.drawable.croquetscene, "The Waterloo Dispach, David Wilkie","Chelsea Pensioners Reading, David Wilikie","Croquet Scene, Winslow Homer", "The Meeting,Jean Honore Fragonard",3)
        questionListNineteen.add(qu7)
        val qu8 = Question(8,"What is the title and who is the author of this painting?",R.drawable.womanwithparasol,"Bird, Jackson Pollock","Portrait of Madame Pompadour, Francois Boucher","Liberty leading the people, Eugene Delacroix","Woman with Parasol, Claude Monet",4)
        questionListNineteen.add(qu8)
        val qu9 = Question(9, "What is the title of this painting made by Jean Francois Millet?",R.drawable.libertyleadingthepeople,"Liberty leading the people", "Triumph of Venus", "Allegory of war", "The Battle of the Amazons", 1)
        questionListNineteen.add(qu9)
        val qu10 = Question(10, "", R.drawable.thegleaners, "Dejuner sur l'herbe, Eduard Manet","The Gleaners, Jean-Francois Millet","The Bathers, Jean-Baptiste-Simeon","The Meeting, Jean-Honore Fragonard", 2)
        questionListNineteen.add(qu10)
        val qu11 = Question(11, "Who is the author of 'Dejuner sur l'herbe'?",R.drawable.dejunersurherbe, "John William Waterhouse","Jean-Francois Millet"," Eduard Manet","Eugene Delacrois",3)
        questionListNineteen.add(qu11)
        val qu12 = Question(12,"What is the title of this painting created by John William Waterhouse",R.drawable.theraftofthemedus,"Triumph of Venus","Allegory of war","Judgement of Paris","The raft of the Medus",4)
        questionListNineteen.add(qu12)
        questionListNineteen.shuffle()
        return questionListNineteen
    }

    //Modernism
    fun getQuestionModernism():ArrayList<Question> {
        val questionListM = ArrayList<Question>()

        val ques1 = Question(1, "Who painted 'Starry night'?", R.drawable.starrynight, "Van Gogh", "Pablo Picasso", "Henri Mattise", "Charles Demuth", 1)
        questionListM.add(ques1)
        val ques2 =Question(2, "What is title and who is the author of this painting?",R.drawable.lesdemoisellesdavignon,"Divan Japonais, Toulouse Loutrec","Les demoiselles D'avignon,Pablo Picasso","The wipping woman, Pablo Picasso","Guernica, Pablo Picasso",2)
        questionListM.add(ques2)
        val ques3 =Question(3,"Who is the author of 'Bird'? ",R.drawable.bird,"Fernand Leger","Paul Cezanne","Jackson Pollock","Georges Braque",3)
        questionListM.add(ques3)
        val ques4 =Question(4,"Who painted 'The yellow Christ'",R.drawable.theyellowchrist, "Jan Van Eyck","Henri Toulouse Lautrec","Georges Seurat","Paul Gauguin",4)
        questionListM.add(ques4)
        val ques5 =Question(5, "What is the title and who is the author of this painting?",R.drawable.birthogliquiddesires,"Birth of Liquid Desires,Salvador Dali","Perception of time, Salvador Dali","The soldier drinks, Marc Chagall","Knight Errant, Oskar Kokoschka", 1)
        questionListM.add(ques5)
        val ques6 =Question(6, "What is the title and who is the author of this painting?", R.drawable.divanjaponais,"Les Demoiselles d'Avignon, Pablo Picasso","Diavn Japonais, Toulouse Loutrec","La toilette, Toulouse Loutrec","Wheatfields with crows, Van Gogh", 2)
        questionListM.add(ques6)
        val ques7 =Question(7,"Who is the author of the 'Goldfish'?",R.drawable.goldfish, "Georges Seurat","Paul Klee","Henri Matisse", "Everett Shinn", 3)
        questionListM.add(ques7)
        val ques8 =Question(8,"What is the title and who is the author of this painting?",R.drawable.thehippodrome, "Angelus Novus, Paul Klee","Exodus, Stephen Namara","Frenchton, Charley Harper","The hippodrome,Everet Shinn",4)
        questionListM.add(ques8)
        val ques9 =Question(9,"What is the title of this painting made by Paul Klee?",R.drawable.littlecastleintheair,"Little Castle in the air","Der Goldfish","Red Chimneys","Lancaster",1)

        questionListM.add(ques9)
        questionListM.shuffle()
        return questionListM

    }
}