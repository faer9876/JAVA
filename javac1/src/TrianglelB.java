import java.util.*;
public class TrianglelB {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");

        do{
            System.out.print("몇단? ");
            n=stdIn.nextInt();
        }while(n<=0);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            System.out.print('*');
            System.out.println();
        }
    }
}
