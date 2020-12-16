package natsumi;

//2から100までの素数を表示
public class ForNest {
	public static void main(String[] args) {
		for(int i=2; i<=100; i++){
			for(int j=2; (i%j!=0 && j<i)||j==i; j++){
				if(j==i){
					System.out.println(i);
				}
			}
		}
	}
}
