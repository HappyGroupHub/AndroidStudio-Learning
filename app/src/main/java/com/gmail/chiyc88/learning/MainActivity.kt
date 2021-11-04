package com.gmail.chiyc88.learning

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterName = findViewById<EditText>(R.id.enterName_hint)
        val enterName_desc = findViewById<TextView>(R.id.enterName_desc)
        val statGame = findViewById<Button>(R.id.startGame)
        val scissors = findViewById<RadioButton>(R.id.scissors)
        val rock = findViewById<RadioButton>(R.id.rock)
        val paper = findViewById<RadioButton>(R.id.paper)
        val playerNameShow = findViewById<TextView>(R.id.playerNameShow)
        val playerPlay = findViewById<TextView>(R.id.playerPlay)
        val comPlay = findViewById<TextView>(R.id.comPlay)
        val winner = findViewById<TextView>(R.id.winner)
        statGame.setOnClickListener {
            if (enterName.length() < 1) {
                enterName_desc.text = "請輸入玩家姓名喔!"
                return@setOnClickListener
            }
            if (!(rock.isChecked || paper.isChecked || scissors.isChecked)) {
                enterName_desc.text = "大哥! 你要出拳阿"
                return@setOnClickListener
            }
            val playerName = enterName.text
            playerNameShow.text = "玩家: $playerName"
            val playerPlayText = when {
                scissors.isChecked -> "剪刀"
                rock.isChecked -> "石頭"
                paper.isChecked -> "布"
                else -> "ERROR"
            }
            playerPlay.text = "我方出拳: $playerPlayText"
            val randomNum = (1..3).random()
            val comPlayText = when {
                randomNum.equals(1) -> "剪刀"
                randomNum.equals(2) -> "石頭"
                randomNum.equals(3) -> "布"
                else -> "ERROR"
            }
            comPlay.text = "電腦出拳: $comPlayText"
            if (playerPlayText.equals(comPlayText)) {
                winner.text = "獲勝者: 雙方"
                enterName_desc.text = "這局是個平手!"
            } else if (rock.isChecked && randomNum == 1
                || paper.isChecked && randomNum == 2
                || scissors.isChecked && randomNum == 3
            ) {
                winner.text = "獲勝者: $playerName"
                enterName_desc.text = "你贏了! 太水了啦"
            } else {
                winner.text = "獲勝者: 電腦"
                enterName_desc.text = "你輸了): 請再接再厲"
            }
        }
    }
}