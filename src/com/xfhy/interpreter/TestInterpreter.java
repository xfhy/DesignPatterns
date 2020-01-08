package com.xfhy.interpreter;

/**
 * Created by xfhy on 2020/1/8 13:43
 * Description :
 */
class TestInterpreter {

    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        System.out.println("上海滩");
        playContext.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 E 0.5 G 3 ");
        Expression expression = null;

        while (playContext.getText().length() > 0) {
            String str = playContext.getText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
            }
            expression.interpret(playContext);
        }
    }

}
