import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch time=new StopWatch();
        while (true){
            System.out.println("MENU \n 1.setStartTime \n 2.setEndTime \n 3.getElapsedTime \n 4.Exit");
            int choose= scanner.nextInt();
            switch (choose){
                case 1:
                    time.setStartTime();
                    break;
                case 2:
                    time.setEndTime();
                    break;

                case 3:
                    System.out.println(time.getElapsedTime());
                    break;
                case 4:
                    System.exit(0);
            }
        }


    }
}
