package main.java.originalGame.janken;

public class Judge {
	//じゃんけんの結果のテキストを取得するメソッド
	static String getResultText(int playerHand, int computerHand) {
		//じゃんけんの結果のテキストを代入する変数を初期化
		String resultText = "";
		//じゃんけんの結果を出すための計算
		int result = (playerHand - computerHand + 3) % 3;
		//あいこのとき
		if (result == 0) {
			resultText = "あいこ！";
		}
		//プレイヤーの負けのとき
		else if (result == 1) {
			resultText = "負け～";
		}
		//プレイヤーが勝ちのとき
		else if (result == 2) {
			resultText = "勝ち！";
		}
		//結果のテキストを返す
		return resultText;
	}
}
