package com.example

class Tennis {
    private var secondPlayerScoreTimes = 0
    private var firstPlayerScoreTimes = 0
    fun score(): String? {
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 0) {
            return "love all"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 0) {
            return "fifteen love"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 0) {
            return "thirty love"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 0) {
            return "forty love"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 1) {
            return "love fifteen"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 2) {
            return "love thirty"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 3) {
            return "love forty"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 1) {
            return "fifteen all"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 2) {
            return "thirty all"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 3) {
            return "deuce"
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 4) {
            return "deuce"
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 3) {
            return "Joey adv"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 4) {
            return "Tom adv"
        }
        if (firstPlayerScoreTimes == 5 && secondPlayerScoreTimes == 3) {
            return "Joey win"
        }
        return if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 5) {
            "Tom win"
        } else null
    }

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}