public class task9{
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A'},
                {'C', 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E'},
                {'A', 'B', 'D', 'C', 'C', 'C', 'D', 'E', 'A'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A'},

        };


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A'};


        for (int i = 0; i < answers.length; i++) {

            int correctAnswers = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctAnswers++;
                }
            }
            System.out.println("Student " + (i + 1) + "'s correct count is " + correctAnswers);
        }
    }
    }
