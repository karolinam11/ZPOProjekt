package com.example.maligiganci

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_argentina,
            "Argentyna", "Australia",
            "Armenia", "Austria",1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_brazil,
            "Białoruś", "Belize",
            "Brunei", "Brazylia", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_belgium,
            "Bahamy", "Belgia",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "Francja",
            "Fidżi", "Finlandia",3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_germany,
            "Niemcy", "Gruzja",
            "Grecja", "żaden z tych", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_denmark,
            "Dominika", "Egipt",
            "Dania", "Etiopia",3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_india,
            "Irlandia", "Iran",
            "Węgry", "Indie",4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nowa Zelandia",
            "Tuvalu", "Stany Zjednoczone Ameryki",2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Jaki kraj reprezentuje dana flaga?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwejt", "Jordania",
            "Sudan", "Palestyna", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}