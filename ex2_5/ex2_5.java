import java.util.Scanner;
import java.util.Random;
public class ex2_5{
  public static void main(String []args){ 
    Scanner sn = new Scanner(System.in);
    Random rn = new Random();
    System.out.print("scissor(0),rock(1),paper(2) : ");
    int answer = sn.nextInt();
    int opponent = rn.nextInt(2);
    if(answer == 0){
      switch(opponent){
      case 0 : System.out.println("The Computer is scissor.You are scissor.Draw.");
      break;
      case 1 :System.out.println("The Computer is rock.You are scissor.You lost.");
      break;
      case 2 :System.out.println("The Computer is paper.You are scissor.You won.");
      }
    }else if (answer == 1){
      switch(opponent){
        case 0 : System.out.println("The Computer is scissor.You are rock.You won.");
        break;
        case 1 : System.out.println("The Computer is rock.You are rock.Draw.");
        break;
        case 2 : System.out.println("The Computer is paper.You are rock.You lost.");
        break;
      }
    }else if(answer == 2){
      switch(opponent){
        case 0 : System.out.println("The Computer is scissor.You are paper.You lost.");
        break;
        case 1 : System.out.println("The Computer is rock.You are paper.You won.");
        break;
        case 2 : System.out.println("The Computer is paper.You are paper.Draw.");
        break;
      }
    }
    sn.close();
  }
}