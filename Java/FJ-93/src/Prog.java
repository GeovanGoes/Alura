
public class Prog {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Ovo o = new Ovo();
			o.id++;
			o.nome="nome"+i;
			System.out.println(o.id + o.nome);
		}
	}
}
