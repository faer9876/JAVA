import java.util.*;
public class recur3 {
    static void recur(int n){
        IntStack s=new IntStack(n);

        while(true){
        if(n>0){
            s.push(n);
            n=n-1;
            continue;
        }
        if(s.isEmpty()!=true){
            n=s.pop();
            System.out.println(n);
            n=n-2;
            continue;
        }
        break;
    }
}
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int x=stdIn.nextInt();

        System.out.println(recur(x));
    }
}
