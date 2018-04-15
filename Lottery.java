//6-from-49 lotto
//generates six randomly chosen numbers from 1 to 49 without duplicates
public class Lottery {
	
	private int [] field;
	
	public Lottery () {
		field = new int [6];
	}
	
	public boolean isUnique (int [] field) {
		for (int i=0; i<field.length; i++) {
			for (int j=0; j<i; j++) {
				if (field[i]==field[j]) return false;
			}
		}
		return true;
	}
	
	public void print (int [] field) {
		for (int i=0; i<field.length; i++) {
			System.out.print (field[i]+" ");
		}
	}
	
	public void draw () {
		while (!isUnique(field)) {
			for (int i=0; i<field.length; i++) {
				field[i]=1+(int)(Math.random()*49);
			}
		}		
		sort(field);
		print(field);		
	}
	
	public void sort (int [] field) {
		for (int i=1; i<field.length; i++) {
			for (int j=0; j<field.length-i; j++) {
				if (field[j+1]<field[j]) {
					int temp = field[j];
					field[j]=field[j+1];
					field[j+1]=temp;
				}
			}
		}
	}
	
	
	
	public static void main (String [] args) {		
		Lottery game = new Lottery();
		game.draw();		
		
	}	
	
	
}
