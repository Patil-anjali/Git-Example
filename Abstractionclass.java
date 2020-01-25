package Abstraction;

import Abstraction.Bird;
import Abstraction.Honda;
import Abstraction.Kingfissher;
import Abstraction.sparoow;

public class Abstractionclass {
public static void 	main(String[] args){
	 Honda h = new Honda();
	 h.engine();
	 h.body();
	  Bird bird= new Kingfissher();
	  bird.fly();
	  bird= new sparoow();
	  bird.fly();
	  
	
}
}
