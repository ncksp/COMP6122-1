package main;

import cor.Mesin;
import cor.Mesin100;
import cor.Mesin20;
import cor.Mesin5;
import cor.Mesin50;
import cor.NullMesin;

public class Main {
	public Main() {
		Mesin m5 = new Mesin5(new NullMesin());
		Mesin m20 = new Mesin20(m5);
		Mesin m50 = new Mesin50(m20);
		Mesin m100 = new Mesin100(m50);

		System.out.println(m100.validate(382));
		System.out.println(m100.validate(385));
		m100.tarik(385);

//		Mesin _m5 = new SuperMesin(new NullMesin(), 5);
//		Mesin _m20 = new SuperMesin(_m5, 20);
//		Mesin _m50 = new SuperMesin(_m20, 50);
//		Mesin _m100 = new SuperMesin(_m50, 100);
//		_m100.tarik(385);
	}

	public static void main(String[] args) {
		new Main();
	}
}
