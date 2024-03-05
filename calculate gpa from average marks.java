
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("How many courses you had this semester");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        
        double[] n = new double[x];
        double sum=0;
            
        for(int i=0;i<n.length;i++){
            System.out.println("Enter your average marks for course "+(i+1)+":");
            n[i]=sc.nextDouble();
        }
        
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        double avg=sum/n.length;
        
        if(avg>90){
            System.out.println("you have A Grade");
        }else if(90>avg && avg>80) {
            System.out.println("You have B Garde");
    }else if(80>avg && avg>70) {
            System.out.println("You have C Garde");
    }else if(70>avg && avg>60) {
            System.out.println("You have D Garde");
    }else if(avg<60) {
            System.out.println("You have Failed");
    }else{
        System.out.println("please try again");
    }
}
}
