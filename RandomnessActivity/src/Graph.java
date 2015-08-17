public class Graph {
private int guessnum;

public void output(int guessnum){
if(guessnum==1){
System.out.println("AA ## ##");
System.out.println("1 2 3");
}else if(guessnum==2){
System.out.println("## AA ##");
System.out.println("1 2 3");
}else if(guessnum==3){
System.out.println("## ## AA");
System.out.println("1 2 3");
}
}
}