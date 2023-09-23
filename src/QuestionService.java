import java.util.Scanner;

public class QuestionService {
    Question[] questions= new Question[5];
    String[] ans = new String[5];
    public QuestionService(){
        questions[0]= new Question(1,"size int", "1","2", "4","8","4");
        questions[1]= new Question(2,"size double", "2","6", "4","8","8");
        questions[2]= new Question(3,"size char", "1","2", "4","8","2");
        questions[3]= new Question(4,"size long", "1","2", "4","8","8");
        questions[4]= new Question(5,"size boolean", "1","2", "4","8","1");
    }
    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question Number :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            ans[i] = sc.nextLine();
            i++;
        }
        for(String s:ans){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que= questions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=ans[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score "+score);
    }
}
