
class HelloWorld {
    public static void main(String[] args) {
        String[] data=new String[5];
        data[0]="red";
        data[1]="blue";
        data[2]="green";
        data[3]="black";
        data[4]="yellow";
        
        for(int i=0;i<data.length;i++){
            if(data[i].equals("blue")){
        System.out.println("car number"+" " +i + " "+"is blue");
            }
            else{
                System.out.println("car number"+" " +i + " "+"is Not blue");
            }
        }
    }
}
